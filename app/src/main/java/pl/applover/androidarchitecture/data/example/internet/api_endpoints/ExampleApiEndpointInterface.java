package pl.applover.androidarchitecture.data.example.internet.api_endpoints;

public interface ExampleApiEndpointInterface {
    /**
    @POST("/api/v1/events")
    Observable<Response<ResponseBackendEvent>> saveEvent
            (
                    @Header("Content-Type") String contentType,
                    @Header("Authorization") String authorization,
                    @Header("Login") String login,
                    @Header("Device") String device,
                    @Body JsonObject bean
            );

    @HTTP(method = "DELETE", path = "/api/v1/events", hasBody = true)
    Observable<Response<EmptyResponse>> deleteEvent
            (
                    @Header("Content-Type") String contentType,
                    @Header("Authorization") String authorization,
                    @Header("Login") String login,
                    @Header("Device") String device,
                    @Body JsonObject bean
            );

    @GET("/api/v1/events")
    Observable<Response<List<ResponseBackendEvent>>> getEvents
            (
                    @Header("Content-Type") String contentType,
                    @Header("Authorization") String authorization,
                    @Header("Login") String login,
                    @Header("Device") String device
            );
                    **/


}
