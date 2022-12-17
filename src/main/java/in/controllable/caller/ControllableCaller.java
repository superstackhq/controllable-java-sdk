package in.controllable.caller;

import in.controllable.model.ExecutionRequest;
import in.controllable.model.ExecutionResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;

import java.util.Map;

public interface ControllableCaller {

    @POST("/api/v1/properties/execute")
    Call<ExecutionResponse> execute(@Body ExecutionRequest executionRequest, @HeaderMap Map<String, String> headers);
}
