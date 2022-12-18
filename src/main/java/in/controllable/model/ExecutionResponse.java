package in.controllable.model;

import java.io.Serializable;
import java.util.List;

public class ExecutionResponse implements Serializable {

    private List<PropertyExecutionResponse> responses;

    public ExecutionResponse() {

    }

    public ExecutionResponse(List<PropertyExecutionResponse> responses) {
        this.responses = responses;
    }

    public List<PropertyExecutionResponse> getResponses() {
        return responses;
    }

    public void setResponses(List<PropertyExecutionResponse> responses) {
        this.responses = responses;
    }
}
