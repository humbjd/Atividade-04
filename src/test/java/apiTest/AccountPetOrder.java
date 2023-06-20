// Pacotes
package apiTest;

//Bibliotecas

import com.google.gson.Gson;
import entities.PetOrderEntity;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

// Classes
public class AccountPetOrder {
    // Atributos
    String jsonBody;
    String ct = "application/json";
    String uri = "https://petstore.swagger.io/v2/store/order";
    Gson gson = new Gson();


    @Test(priority = 1)
    public void testPetOrder(){
        // Configura
        // Dados de Entrada
        PetOrderEntity pet = new PetOrderEntity();

        pet.id = 99;
        pet.petId = 98;
        pet.quantity = 97;
        pet.shipDate = "2023";
        pet.status = "placed";
        pet.complete = true;

        jsonBody = gson.toJson(pet);

        // Dados de Saida
        int id = 99;
        int petId = 98;
        int quantity = 97;
        String shipDate = "2023";
        String status = "placed";
        boolean complete = true;


        // Executa
        given()
                .contentType(ct)
                .log().all()
                .body(jsonBody)
        .when()
                .post(uri)
        // Valida
        .then()
                .log().all()
                .statusCode(200)
                .body("id", is(99))
                .body("petId", is(98))
                .body("quantity", is(97))
                .body("shipDate", is("2023"))
                .body("status", is("placed"))
                .body("complete", is(true))
        ;// fim do teste


    }


}
