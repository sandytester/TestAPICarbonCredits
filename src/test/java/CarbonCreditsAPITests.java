import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarbonCreditsAPITests {

  private static String apiBaseUrl = "https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false";

  @BeforeAll
  public static void setUp() {
    RestAssured.baseURI = apiBaseUrl;
  }

  @Test
  public void testCarbonCredits() {
    Response response = given()
        .when()
        .get()
        .then()
        .statusCode(200)
        .extract()
        .response();

    String name = response.jsonPath().getString("Name");
    assertEquals("Carbon credits", name);
  }

  @Test
  public void testCanReList() {
    Response response = given()
        .when()
        .get()
        .then()
        .statusCode(200)
        .extract()
        .response();

    boolean canRelist = response.jsonPath().getBoolean("CanRelist");
    assertTrue(canRelist);
  }

  @Test
  public void testGoodPositionInCategory() {
    Response response = given()
        .when()
        .get()
        .then()
        .statusCode(200)
        .extract()
        .response();

    String galleryDescription = response.jsonPath().getString("Promotions.find { it.Name == 'Gallery' }.Description");
    assertTrue(galleryDescription.contains("Good position in category"));
  }
}
