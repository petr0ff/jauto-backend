package dataproviders;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.DataProvider;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by German on 16.10.2016.
 */
public final class PostsDataProvider {
    private PostsDataProvider() {}

    private static Object[][] randomIntInput(boolean positive) {
        int n = ThreadLocalRandom.current().nextInt(4, 6 + 1);
        Object[][] data = new Object[1][n];
        Random ri = new Random();
        for (int i = 0; i < n; i++) {
            if (positive) {
                data[1][i] = String.valueOf(ri.nextInt(100));
            } else {
                data[1][i] = RandomStringUtils.random(n);
            }
        }
        return data;
    }

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
