package core.utils;

import annotations.Request;
import resource.Body;
import resource.BodyFactory;
import resource.ContentTypes;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by German_Petrov on 12/23/2016.
 */
public class ApiUtils {
    public static Body getBuilder(Class<?> c) {
        Method[] methods = c.getDeclaredMethods();
        System.out.println(methods.length);
        for (Method m: methods
             ) {
            //Annotation[] annotations = m.getAnnotations();
            System.out.println(m.getName());
            System.out.println(m.getAnnotations().length);
            System.out.println(m.getAnnotations()[0].getClass());
            Request r = m.getAnnotation(Request.class);
            //System.out.println(r.getClass().getName());
            //System.out.println(r.contentType());
            //return BodyFactory.getBuilder(r.contentType());
        }
        return BodyFactory.getBuilder(ContentTypes.JSON);
    }


}
