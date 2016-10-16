package dataproviders;

import org.testng.annotations.DataProvider;

/**
 * Created by German on 16.10.2016.
 */
public final class PostsDataProvider {
    private PostsDataProvider() {}

    @DataProvider(name = "successPosts")
    public static Object[][] successPosts() {
        return new Object[][]{
                {"1"}, {"5"}, {"10"}
        };
    }

    @DataProvider(name = "failurePosts")
    public static Object[][] failurePosts() {
        return new Object[][]{
                {"A"}, {"-2"}, {"0"}
        };
    }
}
