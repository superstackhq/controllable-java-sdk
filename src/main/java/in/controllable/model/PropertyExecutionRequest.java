package in.controllable.model;

import java.io.Serializable;
import java.util.Map;

public class PropertyExecutionRequest implements Serializable {

    private PropertyReference property;

    private PropertyValue value;

    private Map<String, Object> params;

    public PropertyExecutionRequest() {

    }

    public PropertyExecutionRequest(PropertyReference property, PropertyValue value, Map<String, Object> params) {
        this.property = property;
        this.value = value;
        this.params = params;
    }

    public PropertyReference getProperty() {
        return property;
    }

    public void setProperty(PropertyReference property) {
        this.property = property;
    }

    public PropertyValue getValue() {
        return value;
    }

    public void setValue(PropertyValue value) {
        this.value = value;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}
