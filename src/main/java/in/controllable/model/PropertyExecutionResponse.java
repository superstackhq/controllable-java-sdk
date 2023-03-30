package in.controllable.model;

import java.io.Serializable;

public class PropertyExecutionResponse implements Serializable {

    private Boolean success;

    private String message;

    private PropertyValue value;

    public PropertyExecutionResponse() {

    }

    public PropertyExecutionResponse(Boolean success, String message, PropertyValue value) {
        this.success = success;
        this.message = message;
        this.value = value;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PropertyValue getValue() {
        return value;
    }

    public void setValue(PropertyValue value) {
        this.value = value;
    }
}
