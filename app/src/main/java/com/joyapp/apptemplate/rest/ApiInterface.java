package com.joyapp.apptemplate.rest;

import com.joyapp.apptemplate.model.Group;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by JOY on 5/28/2016.
 */
public interface ApiInterface {
    @GET("groups")
    Call<List<Group>> getAllGroups();

    @GET("group/{id}")
    Call<Group> getGroup(@Path("id") int id);
}
