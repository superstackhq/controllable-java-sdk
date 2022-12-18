package in.controllable.model;

import java.io.Serializable;
import java.util.Map;

public class ReadPropertyRequest implements Serializable {

    private PropertyReference reference;

    private Map<String, Object> params;

    public ReadPropertyRequest() {

    }

    public ReadPropertyRequest(PropertyReference reference, Map<String, Object> params) {
        this.reference = reference;
        this.params = params;
    }

    public PropertyReference getReference() {
        return reference;
    }

    public void setReference(PropertyReference reference) {
        this.reference = reference;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}
