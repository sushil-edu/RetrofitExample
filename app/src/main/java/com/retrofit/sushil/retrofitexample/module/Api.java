package com.retrofit.sushil.retrofitexample.module;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Sushil on 6/21/2018.
 */

public interface Api {
    String BASE_URL = "https://simplifiedcoding.net/demos/";

    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
