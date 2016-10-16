package functional;

import annotations.Request;
import core.ApiTestCase;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import resource.ContentTypes;
import resource.Resource;
import dataproviders.PostsDataProvider;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

/**
 * Created by German on 16.10.2016.
 */
public class TestGetPosts extends ApiTestCase {
    static {
        basePath = Resource.POSTS + "/";
    }

    @Test(dataProvider = "successPosts", dataProviderClass = PostsDataProvider.class)
    @Request
    public void testGetSuccess(String val) {
        Response response = given().when().get(val);
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Test(dataProvider = "failurePosts", dataProviderClass = PostsDataProvider.class)
    @Request
    public void testGetFailure(String val) {
        Response response = given().when().get(val);
        Assert.assertEquals(404, response.getStatusCode());
    }
}
