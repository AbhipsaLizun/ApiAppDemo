package com.example.apiappdemo;

import retrofit2.Call;
import retrofit2.http.GET;


public interface Api {
    @GET("config.json")
    Call<TrnsList> getTrnsData();
    //initial code
}
