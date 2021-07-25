package com.saida_aliyeva.task_deirvlon.interfaces;

import com.saida_aliyeva.task_deirvlon.model.Root;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

//    @GET("/user/{username}?type={admin}")
//    void getUserOuth(@Path("username") String username, @Query("type") String type)
//    www.app.net/api/searchtypes/862189/filters?Type=6&SearchText=School
//
//    @GET("/api/searchtypes/{Id}/filters")
//    Call<FilterResponse> getFilterList(
//            @Path("Id") long customerId,
//            @Query("Type") String responseType,
//            @Query("SearchText") String searchText
//    );

   // http://dnews.deirvlon.com/test_api?Content-Type=application/json&key=deirvlon
 //   @GET("test_api?Content-Type={application/json}&key={deirvlon}")
    @GET("test_api")
    Call<Root> getData(@Query("Content-Type") String content_type, @Query("key") String key);


}
