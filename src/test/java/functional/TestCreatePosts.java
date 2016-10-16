package functional;

import annotations.Request;
import core.ApiTestCase;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import resource.Resource;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.given;

/**
 * Created by German on 16.10.2016.
 */
public class TestCreatePosts extends ApiTestCase {
    static {
        basePath = Resource.POSTS + "/";
    }

    @Test
    @Request
    public void testGetSuccess(String val) {
        Response response = given().when().get(val);
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Test
    @Request
    public void testGetFailure(String val) {
        Response response = given().when().get(val);
        Assert.assertEquals(404, response.getStatusCode());
    }
}
