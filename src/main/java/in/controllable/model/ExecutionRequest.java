package in.controllable.model;

import java.io.Serializable;
import java.util.List;

public class ExecutionRequest implements Serializable {

    private Operation operation;

    private String environment;

    private List<PropertyExecutionRequest> requests;

    public ExecutionRequest() {

    }

    public ExecutionRequest(Operation operation, String environment, List<PropertyExecutionRequest> requests) {
        this.operation = operation;
        this.environment = environment;
        this.requests = requests;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public List<PropertyExecutionRequest> getRequests() {
        return requests;
    }

    public void setRequests(List<PropertyExecutionRequest> requests) {
        this.requests = requests;
    }
}
