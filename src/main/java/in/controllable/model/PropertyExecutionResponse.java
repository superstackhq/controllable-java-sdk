package in.controllable.model;

import java.io.Serializable;

public class PropertyExecutionResponse implements Serializable {

    private Boolean success;

    private PropertyValue value;

    public PropertyExecutionResponse() {

    }

    public PropertyExecutionResponse(Boolean success, PropertyValue value) {
        this.success = success;
        this.value = value;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public PropertyValue getValue() {
        return value;
    }

    public void setValue(PropertyValue value) {
        this.value = value;
    }
}
