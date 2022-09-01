package restAss.restAss;

import static org.junit.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import org.junit.Test;


import io.restassured.response.Response;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	@Test
	public void test_02() {
		given().
			get("https://test.javalearninglab.com/api/vocab")
		.then().statusCode(200).body("\"word\"[1]",equalTo("inhearitance")); // word[1] = polymorphism, just to cause a failure so we know its pulling something.
	}
}
