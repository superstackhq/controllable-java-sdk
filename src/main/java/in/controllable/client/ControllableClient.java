package in.controllable.client;

import in.controllable.caller.ControllableCaller;
import in.controllable.model.*;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ControllableClient {

    private final ControllableCaller caller;

    private final String appKey;

    private final String environment;

    public ControllableClient(String controllableServerEndpoint, String appKey, String environment, Integer callTimeoutInMS) {
        this.appKey = appKey;
        this.environment = environment;
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(controllableServerEndpoint)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.callTimeout(Duration.ofMillis(callTimeoutInMS)).build())
                .build();

        this.caller = retrofit.create(ControllableCaller.class);
    }

    private ExecutionResponse execute(ExecutionRequest executionRequest) throws IOException {
        return caller.execute(executionRequest, Map.of("Authorization", "AppKey " + appKey)).execute().body();
    }

    public ExecutionResponse createPropertyValue(PropertyReferenceValuePairs propertyReferenceValuePairs) throws IOException {
        ExecutionRequest executionRequest = new ExecutionRequest();
        executionRequest.setEnvironment(environment);
        executionRequest.setOperation(Operation.CREATE_PROPERTY_VALUE);

        List<PropertyExecutionRequest> requests = new ArrayList<>();

        for (PropertyReferenceValuePair pair : propertyReferenceValuePairs.getPairs()) {
            PropertyExecutionRequest propertyExecutionRequest = new PropertyExecutionRequest();
            propertyExecutionRequest.setProperty(pair.getReference());
            propertyExecutionRequest.setValue(pair.getValue());
            requests.add(propertyExecutionRequest);
        }

        executionRequest.setRequests(requests);
        return execute(executionRequest);
    }

    public ExecutionResponse updatePropertyValue(PropertyReferenceValuePairs propertyReferenceValuePairs) throws IOException {
        ExecutionRequest executionRequest = new ExecutionRequest();
        executionRequest.setEnvironment(environment);
        executionRequest.setOperation(Operation.UPDATE_PROPERTY_VALUE);

        List<PropertyExecutionRequest> requests = new ArrayList<>();

        for (PropertyReferenceValuePair pair : propertyReferenceValuePairs.getPairs()) {
            PropertyExecutionRequest propertyExecutionRequest = new PropertyExecutionRequest();
            propertyExecutionRequest.setProperty(pair.getReference());
            propertyExecutionRequest.setValue(pair.getValue());
            requests.add(propertyExecutionRequest);
        }

        executionRequest.setRequests(requests);
        return execute(executionRequest);
    }

    public ExecutionResponse deletePropertyValue(PropertyReferenceValuePairs propertyReferenceValuePairs) throws IOException {
        ExecutionRequest executionRequest = new ExecutionRequest();
        executionRequest.setEnvironment(environment);
        executionRequest.setOperation(Operation.DELETE_PROPERTY_VALUE);

        List<PropertyExecutionRequest> requests = new ArrayList<>();

        for (PropertyReferenceValuePair pair : propertyReferenceValuePairs.getPairs()) {
            PropertyExecutionRequest propertyExecutionRequest = new PropertyExecutionRequest();
            propertyExecutionRequest.setProperty(pair.getReference());
            propertyExecutionRequest.setValue(pair.getValue());
            requests.add(propertyExecutionRequest);
        }

        executionRequest.setRequests(requests);
        return execute(executionRequest);
    }

    public ExecutionResponse readPropertyValue(ReadPropertyRequests readPropertyRequests) throws IOException {
        ExecutionRequest executionRequest = new ExecutionRequest();
        executionRequest.setEnvironment(environment);
        executionRequest.setOperation(Operation.READ_PROPERTY_VALUE);

        List<PropertyExecutionRequest> requests = new ArrayList<>();

        for (ReadPropertyRequest readPropertyRequest : readPropertyRequests.getRequests()) {
            PropertyExecutionRequest propertyExecutionRequest = new PropertyExecutionRequest();
            propertyExecutionRequest.setProperty(readPropertyRequest.getReference());
            propertyExecutionRequest.setParams(readPropertyRequest.getParams());
            requests.add(propertyExecutionRequest);
        }

        executionRequest.setRequests(requests);
        return execute(executionRequest);

    }
}
