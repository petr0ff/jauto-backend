package functional;

import annotations.Request;
import base.ApiTestCase;
import core.utils.ApiUtils;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
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
        logInfo("Send GET " + baseURI + basePath + val);
        Response response = given().when().get(val);
        logInfo("Name is: " + ApiUtils.getBuilder(this.getClass()).getClass().getName());
        logInfo("Verity 200 rc");
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Test(dataProvider = "failurePosts", dataProviderClass = PostsDataProvider.class)
    @Request(contentType = Request.ContentTypes.URL_ENCODED)
    public void testGetFailure(String val) {
        logInfo("Send GET " + baseURI + basePath + val);
        Response response = given().when().get(val);
        logInfo("Name is: " + ApiUtils.getBuilder(this.getClass()).getClass().getName());
        logInfo("Verity 404 rc");
        Assert.assertEquals(404, response.getStatusCode());
    }
}
