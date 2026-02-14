package org.freecodecamp.app;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

@QuarkusTest
class FilmResourceTest {

    @Test
    void test() {
        given()
                .when()
                .get("/film/5")
                .then()
                .statusCode(200)
               .body(containsString("AFRICAN EGG"));
    }

    @Test
    void getFilm() {
        // TODO: create it later
    }

    @Test
    void paged() {
        // TODO: create it later
    }

    @Test
    void actors() {
        // TODO: create it later
    }

    @Test
    void update() {
        // TODO: create it later
    }
}