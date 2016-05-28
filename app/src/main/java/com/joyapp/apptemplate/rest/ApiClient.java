package com.joyapp.apptemplate.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by JOY on 5/28/2016.
 */
public class ApiClient{
    public static final String BASE_URL = "http://shoppinglist.iitds.win/api/v1/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
