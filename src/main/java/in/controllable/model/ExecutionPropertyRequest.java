package in.controllable.model;

import java.io.Serializable;
import java.util.Map;

public class ExecutionPropertyRequest implements Serializable {

    private PropertyReference property;

    private Value value;

    private Map<String, Object> params;

    public ExecutionPropertyRequest() {

    }

    public ExecutionPropertyRequest(PropertyReference property, Value value, Map<String, Object> params) {
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

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}
