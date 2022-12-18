package in.controllable.model;

import java.io.Serializable;

public class ExecutionPropertyResponse implements Serializable {

    private Boolean success;

    private Value value;

    public ExecutionPropertyResponse() {

    }

    public ExecutionPropertyResponse(Boolean success, Value value) {
        this.success = success;
        this.value = value;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
