package com.example.intel.innoprojnew2;


//import android.support.v7.util.SortedList;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by intel on 13/09/2017.
 */

public interface client {
    @FormUrlEncoded
    @POST("/client/new2.php")
    public void insertuser(
            @Field("username")String username,
            @Field("password")String password,
            Callback<pojo> callback);
}

