package base;

/**
 * Created by German on 16.10.2016.
 */
import configuration.Environment;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.log4testng.Logger;

import static io.restassured.RestAssured.baseURI;

public class ApiTestCase {
    protected static Logger logger = Logger.getLogger(ApiTestCase.class);
    public static RequestSpecBuilder builder;
    public static RequestSpecification requestSpec;

    @BeforeClass
    public static void setUpClass() {
        baseURI = Environment.baseUrl;
    }

    @BeforeMethod
    public static void setUpMethod() {
        logInfo("Start test");
    }

    @AfterMethod
    public static void tearDown() {
        logInfo("End test");
    }

    public static void logInfo(String s) {
        logger.info(s);
        Reporter.log(s + "<br>");
    }
}
