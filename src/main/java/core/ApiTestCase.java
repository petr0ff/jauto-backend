package core;

/**
 * Created by German on 16.10.2016.
 */
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ApiTestCase {
    public static RequestSpecBuilder builder;
    public static RequestSpecification requestSpec;

    @BeforeClass
    public static void setUp() {

    }

    @AfterClass
    public static void tearDown() {

    }
}
