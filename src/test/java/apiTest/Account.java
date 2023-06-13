// Pacotes
package apiTest;
//Bibliotecas

import com.google.gson.Gson;
import entities.AccountEntity;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

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
        account.username = "snoop";
        //account.password = password;


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
                .statusCode()

    }// fim do metodo de criacao do usuario




}
