package restassure1;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;

import io.restassured.internal.support.FileReader;
import io.restassured.response.Response;

public class Activity2 {

	@Test(priority = 1)
	public void postreq() throws IOException {
		
		FileInputStream inputJSON = new FileInputStream("C:\\Users\\004OZF744\\eclipse-workspace\\restassure1\\source\\userInfo.json");
	
		
		
		/*
		 * String reqBody = """
		 * 
		 * { "id": 9901, "username": "justinc", "firstName": "Justin", "lastName":
		 * "Case", "email": "justincase@mail.com", "password": "password123", "phone":
		 * "9812763450" } """;
		 */
		Response response = given().baseUri("https://petstore.swagger.io/v2/user")// set base URI
				.header("Content-Type", "application/json").body(inputJSON).when().post();
		System.out.println(response.getBody().asPrettyString());
		
		inputJSON.close();
		System.out.println(response.then().body("code", equalTo(200)));
		System.out.println(response.then().body("message", equalTo("9901")));

		/*
		 * System.out.println(response.then().body("id", equalTo(77232)));
		 * System.out.println(response.then().body("name", equalTo("Riley")));
		 * System.out.println(response.then().body("status", equalTo("alive")));
		 */

	}

	@Test(priority = 2)
	public void getresp() {
		Response response = given().baseUri("https://petstore.swagger.io/v2/pet")
				.header("content-type", "application/json").when().pathParam("petId", 77232).get("/{petId}");
		System.out.println(response.then().body("id", equalTo(77232)));
		System.out.println(response.then().body("name", equalTo("Riley")));
		System.out.println(response.then().body("status", equalTo("alive")));

	}

	@Test(priority = 3)
	public void delresp() {
		Response response = given().baseUri("https://petstore.swagger.io/v2/pet")
				.header("content-type", "application/json").when().pathParam("petId", 77232).delete("/{petId}");
		System.out.println(response.then().body("code", equalTo(200)));
		System.out.println(response.then().body("message", equalTo("77232")));

	}
	
    
	

}
