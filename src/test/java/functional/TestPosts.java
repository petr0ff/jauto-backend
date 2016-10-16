package functional;

import annotations.Request;
import core.ApiTestCase;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import resource.Resource;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

/**
 * Created by German on 16.10.2016.
 */
public class TestPosts extends ApiTestCase {
    static {
        basePath = Resource.POSTS + "/";
    }

    @DataProvider(name = "success")
    public static Object[][] success() {
        return new Object[][]{{"1"}, {"5"}, {"10"}};
    }

    @DataProvider(name = "failure")
    public static Object[][] failure() {
        return new Object[][]{{"A"}, {"-1"}, {"0"}};
    }

    @Test(dataProvider = "success")
    public void testGetSuccess(String val) {
        Response response = given().when().get(val);
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Test(dataProvider = "failure")
    public void testGetFailure(String val) {
        Response response = given().when().get(val);
        Assert.assertEquals(404, response.getStatusCode());
    }
}
