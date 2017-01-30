package resource.builder;

import annotations.Request;

/**
 * Created by German on 16.10.2016.
 */
public abstract class BodyFactory {

    public static Body getFactory(String contentType){
        if(contentType == null){
            return null;
        }
        if(contentType.equalsIgnoreCase(Request.ContentTypes.JSON)){
            return new JsonBuilder();

        } else if(contentType.equalsIgnoreCase(Request.ContentTypes.URL_ENCODED)){
            return new UrlEncodedBuilder();

        } else if(contentType.equalsIgnoreCase(Request.ContentTypes.XML)){
            return new XmlBuilder();
        }

        return null;
    }
}
