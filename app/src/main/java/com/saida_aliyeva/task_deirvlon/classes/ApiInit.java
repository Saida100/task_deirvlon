package com.saida_aliyeva.task_deirvlon.classes;

import com.saida_aliyeva.task_deirvlon.interfaces.ApiInterface;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiInit {

    private Retrofit retrofit;
    ApiInterface apiInterface;
    public ApiInit initRetrofit(){
        retrofit=new Retrofit.Builder()
                .baseUrl(Constants.API_LINK)
                .client(httpLogging())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return this;
    }

    public OkHttpClient httpLogging(){
        HttpLoggingInterceptor httpLoggingInterceptor=new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient=new OkHttpClient();
        okHttpClient=okHttpClient.newBuilder()
                .addInterceptor(httpLoggingInterceptor)
                .build();

        return okHttpClient ;
    }

    public ApiInterface getClient(){
        if (apiInterface==null){
            apiInterface=retrofit.create(ApiInterface.class);
        }
        return apiInterface;
    }
}
