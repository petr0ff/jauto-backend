package annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by German on 16.10.2016.
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.METHOD)
public @interface Request {
    class ContentTypes {
        public final static String URL_ENCODED = "application/x-www-form-urlencoded";
        public final static String JSON = "application/json";
        public final static String XML = "application/xml";
    }

    String contentType() default ContentTypes.JSON;
}
