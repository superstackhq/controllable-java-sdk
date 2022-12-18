package in.controllable.client;

import in.controllable.caller.ControllableCaller;
import in.controllable.model.ExecutionRequest;
import in.controllable.model.ExecutionResponse;
import in.controllable.model.PropertyReferenceValuePairs;
import in.controllable.model.ReadPropertyRequests;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.time.Duration;
import java.util.Map;

public class ControllableClient {

    private final ControllableCaller caller;

    private final String appKey;

    public ControllableClient(String controllableServerEndpoint, String appKey, Integer callTimeout) {
        this.appKey = appKey;
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(controllableServerEndpoint)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.callTimeout(Duration.ofMillis(callTimeout)).build())
                .build();

        this.caller = retrofit.create(ControllableCaller.class);
    }

    private ExecutionResponse execute(ExecutionRequest executionRequest) throws IOException {
        return caller.execute(executionRequest, Map.of("Authorization", "AppKey " + appKey)).execute().body();
    }

    public ExecutionResponse createPropertyValue(PropertyReferenceValuePairs propertyReferenceValuePairs) {
        return null;
    }

    public ExecutionResponse updatePropertyValue(PropertyReferenceValuePairs propertyReferenceValuePairs) {
        return null;
    }

    public ExecutionResponse deletePropertyValue(PropertyReferenceValuePairs propertyReferenceValuePairs) {
        return null;
    }

    public ExecutionResponse readPropertyValue(ReadPropertyRequests readPropertyRequests) {
        return null;
    }
}
