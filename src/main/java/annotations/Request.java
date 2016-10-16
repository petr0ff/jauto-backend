package annotations;

import resource.ContentTypes;

/**
 * Created by German on 16.10.2016.
 */

public @interface Request {
    String contentType() default ContentTypes.JSON;
}
