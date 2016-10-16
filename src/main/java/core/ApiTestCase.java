package core;

/**
 * Created by German on 16.10.2016.
 */
import configuration.AutoConfig;
import configuration.Environment;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.log4testng.Logger;

import static io.restassured.RestAssured.baseURI;

public class ApiTestCase {
    public static Logger logger;
    public static RequestSpecBuilder builder;
    public static RequestSpecification requestSpec;

    @BeforeClass
    public static void setUpClass() {
        baseURI = Environment.baseUrl;
    }

    @BeforeMethod
    public static void setUpMethod() {
        //logger = Logger.getLogger("TEST");
        //logger.info("Start test");
    }

    @AfterMethod
    public static void tearDown() {
        //logger.info("End test");
    }
}
