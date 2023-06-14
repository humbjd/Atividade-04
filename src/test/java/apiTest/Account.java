// Pacotes
package apiTest;
//Bibliotecas

import com.google.gson.Gson;
import entities.AccountEntity;
import entities.PetEntity;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

// Classes
public class Account {
    // Atributos
    String userId;
    Response resposta; // guardar o retorno da API
    String ct = "application/json"; // contentType da API
    String uri = "https://petstore.swagger.io/v2/"; // endereço base
    String jsonBody; // guardar o json que será enviado

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

        jsonBody = gson.toJson(account); // Converte a entidade usuario em formato json


        // Act - Executa

        // Dado - Quando - Entao
        // Given - When - Then
        resposta = (Response) given() // dado
                .contentType(ct)        // tipo do conteudo
                .log().all()                            // registre tudo na ida
                .body(jsonBody)                         // corpo da mensagem que será enviada
        .when() // quando
                .post(uri + "user")

        // Assert - Valida
        .then() // entao
                .log().all()                            // registre tudo na volta
                .statusCode(200)                         // Valide a comunicacao
                .body("message", is(account.message)) // valida o usuario
        ; // fim da linha do REST assured

    }// fim do metodo de criacao do usuario

    @Test
    public void testAddPet(){
        // Configura - Arrange
        PetEntity account = new PetEntity();
        jsonBody = gson.toJson(account);

        account.id = 321;
        account.category = "cat";
        account.name = "Lagertha";
        account.photoUrls = "total";
        account.status = "available";



        // Executa - Act
        resposta = (Response) given() // dado
                .contentType(ct)
                .log().all()
                .body(jsonBody)
        .when() // quando
                .post(uri + "pet")
        .then()
                .log().all()
                .statusCode(200) // valida a comunicação
                .body("status", is("available"))
                .extract()
        ; // fim do codigo testAddPet

        // Extração do userId
        userId = resposta.jsonPath().getString("userId");
        // Valida - Assert
        Assert.assertTrue(userId.length() != 0);
    }// fim do metodo de add pet


}
