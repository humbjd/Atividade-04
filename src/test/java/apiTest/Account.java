// Pacotes
package apiTest;
//Bibliotecas

import com.google.gson.Gson;
import entities.AccountEntity;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

// Classes
public class Account {
    // Atributos

    // Instanciar Classes Externas
    Gson gson = new Gson(); // Instancia o objeto de conversao classe para json

    // Metodos e Funcoes

    // Metodo 01 - Criar Usuario
    @Test
    public void testCreateUser(){
        // Arrange - Configura
        // Dados do usuario
        AccountEntity account = new AccountEntity(); // Instancia a entidade usuario
        account.id = 123;
        account.username = "humb";
        account.firstName = "Humberto";
        account.lastName = "Dantas";
        account.email = "teste@test.com";
        account.password = "p@ssw0rd";
        account.phone = "1123456789";
        account.userStatus = 0;
        account.message = "123";


        // Tradicional
        //String username = "Snoop"; // usuario
        //String password = "123456"; // senha

        String jsonBody = gson.toJson(account); // Converte a entidade usuario em formato json


        // Act - Executa

        // Dado - Quando - Entao
        // Given - When - Then
        given() // dado
                .contentType("application/json")        // tipo do conteudo
                .log().all()                            // registre tudo na ida
                .body(jsonBody)                         // corpo da mensagem que será enviada
        .when() // quando
                .post("https://petstore.swagger.io/v2/user")

        // Assert - Valida
        .then() // entao
                .log().all()                            // registre tudo na volta
                .statusCode(200)                         // Valide a comunicacao
                .body("message", is(account.message)) // valida o usuario
        ; // fim da linha do REST assured

    }// fim do metodo de criacao do usuario

}
