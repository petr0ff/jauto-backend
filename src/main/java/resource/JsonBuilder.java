package resource;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import javafx.util.Pair;

/**
 * Created by German on 16.10.2016.
 */
public class JsonBuilder implements Body {
    JsonObject root = new JsonObject();

    @Override
    public void addParameter(Pair pair) {
        root.add(pair.getKey().toString(), new JsonPrimitive(""));
    }

}
