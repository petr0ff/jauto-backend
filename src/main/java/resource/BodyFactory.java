package resource;

/**
 * Created by German on 16.10.2016.
 */
public abstract class BodyFactory {

    public static Body getBuilder(String contentType){
        if(contentType == null){
            return null;
        }
        if(contentType.equalsIgnoreCase(ContentTypes.JSON)){
            return new JsonBuilder();

        } else if(contentType.equalsIgnoreCase(ContentTypes.URL_ENCODED)){
            return new UrlEncodedBuilder();

        } else if(contentType.equalsIgnoreCase(ContentTypes.XML)){
            return new XmlBuilder();
        }

        return null;
    }
}
