package resource.builder;

import javafx.util.Pair;

/**
 * Created by German on 16.10.2016.
 */
public interface Body<K, String> {
    void addParameter(Pair<K, String> pair);
}
