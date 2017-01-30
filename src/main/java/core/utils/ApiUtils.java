package core.utils;

import annotations.Request;
import resource.builder.Body;
import resource.builder.BodyFactory;

import java.lang.reflect.Method;

/**
 * Created by German_Petrov on 12/23/2016.
 */
public class ApiUtils {
    public static Body getBuilder(Class<?> c) {
        Method[] methods = c.getDeclaredMethods();
        System.out.println(methods.length);
        for (Method m: methods) {
            Request r = m.getAnnotation(Request.class);
            if (r == null) {
                return BodyFactory.getFactory(Request.ContentTypes.JSON);
            }
            return BodyFactory.getFactory(r.contentType());
        }
        return BodyFactory.getFactory(Request.ContentTypes.JSON);
    }
}
