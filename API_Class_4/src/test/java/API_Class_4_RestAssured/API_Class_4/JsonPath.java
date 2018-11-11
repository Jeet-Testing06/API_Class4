package API_Class_4_RestAssured.API_Class_4;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class JsonPath {
	
	public static void main(String[] args) {
		
		Response res =
		
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/posts");
		
		System.out.println(res.jsonPath().get("[6].Address[1].landmark"));
		System.out.println(res.getTime());
		System.out.println(res.contentType());
		
	
			
	}
	

}