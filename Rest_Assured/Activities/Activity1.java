package restassure1;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class Activity1 {
	
	@Test(priority = 1)
	public void postreq() {
		String reqBody = """
								{
				  "id": 77232,
				  "name": "Riley",
				  "status": "alive"
				}
								""";
		Response response = given().baseUri("https://petstore.swagger.io/v2/pet")// set base URI
				.header("Content-Type", "application/json").body(reqBody).when().post();
		System.out.println(response.getBody().asPrettyString());

		System.out.println(response.then().body("id", equalTo(77232)));
		System.out.println(response.then().body("name", equalTo("Riley")));
		System.out.println(response.then().body("status", equalTo("alive")));

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
