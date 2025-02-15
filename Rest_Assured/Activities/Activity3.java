import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import io.restassured.response.Response;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class Activity3 {
	
	RequestSpecification requestspec;
	ResponseSpecification responsespec;
	
	@BeforeClass
	public void setUp() {
		
		requestspec= new RequestSpecBuilder()
				.setBaseUri("https://petstore.swagger.io/v2/pet")
				.setContentType(ContentType.JSON)
				.build();
		
		responsespec = new ResponseSpecBuilder()
				.expectStatusCode(200)
				.expectContentType("application/json")
				.build();
	}
	
	
	@Test (priority = 1)
	public void postPet() throws IOException {
		
		try (FileInputStream inputjson = new FileInputStream("src/test/resources/petDetailsPost.json")) {
			byte[] fileData = inputjson.readAllBytes();
			String jsonArrayString = new String(fileData, StandardCharsets.UTF_8);
			System.out.println(jsonArrayString);
			JSONArray jsonArray = new JSONArray(jsonArrayString);
			
			for(int i =0; i<jsonArray.length();i++) {
				JSONObject pet = jsonArray.getJSONObject(i);
				String petJson = pet.toString();
				Response res = given()
						.spec(requestspec)
						.body(petJson).when().post();
				res.prettyPrint();
				res.then().spec(responsespec);
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test (priority = 2)
	public void getPet() {
		int[] petIds = {23, 24};
		for (int pet : petIds) {
			Response res = given().spec(requestspec)
					.pathParam("petId", pet)
					.log().all()
					.when().get("{petId}");
			
			res.prettyPrint();
			res.then().spec(responsespec);
		}
	}
	
	@Test (priority = 3)
	public void deletePet() {
		int[] petIds = {23, 24};
		for (int pet : petIds) {
			Response res = given().spec(requestspec)
					.pathParam("petId", pet)
					.log().all()
					.when().delete("{petId}");
			
			res.prettyPrint();
			res.then().spec(responsespec);
		}
	}
	
}
