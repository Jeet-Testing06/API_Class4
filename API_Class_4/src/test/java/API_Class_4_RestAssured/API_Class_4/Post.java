// complex json post in the form of array

package API_Class_4_RestAssured.API_Class_4;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Post {
	
	public static void main(String[] args) {
		
		Address add[] = new Address[2];
		
		add[0] = new Address();
		add[0].setWardno(100);
		add[0].setLandmark("School");
		add[0].setHouseno(10);
		
		add[1] = new Address();
		add[1].setWardno(101);
		add[1].setLandmark("Temple");
		add[1].setHouseno(11);
		
		Basic_Data basic = new Basic_Data();
		basic.setFirstname("Johny");
		basic.setLastname("Ahuja");
		basic.setAge(28);
		basic.setAddress(add);
		
		Response res =
		
		given()
		.contentType(ContentType.JSON)
		.body(basic)
		.when()
		.post("http://localhost:3000/posts");
		
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());
		
		
	}

}