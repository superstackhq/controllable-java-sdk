package in.controllable.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PropertyReferenceValuePairs implements Serializable {

    private List<PropertyReferenceValuePair> pairs;

    public PropertyReferenceValuePairs() {
        this.pairs = new ArrayList<>();
    }

    public void add(PropertyReferenceValuePair pair) {
        this.pairs.add(pair);
    }

    public PropertyReferenceValuePairs(List<PropertyReferenceValuePair> pairs) {
        this.pairs = pairs;
    }

    public List<PropertyReferenceValuePair> getPairs() {
        return pairs;
    }

    public void setPairs(List<PropertyReferenceValuePair> pairs) {
        this.pairs = pairs;
    }
}
