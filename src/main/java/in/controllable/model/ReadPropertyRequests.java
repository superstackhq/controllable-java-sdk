package in.controllable.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ReadPropertyRequests implements Serializable {

    private List<ReadPropertyRequest> requests;

    public ReadPropertyRequests() {
        this.requests = new ArrayList<>();
    }

    public void add(ReadPropertyRequest request) {
        this.requests.add(request);
    }

    public ReadPropertyRequests(List<ReadPropertyRequest> requests) {
        this.requests = requests;
    }

    public List<ReadPropertyRequest> getRequests() {
        return requests;
    }

    public void setRequests(List<ReadPropertyRequest> requests) {
        this.requests = requests;
    }
}
