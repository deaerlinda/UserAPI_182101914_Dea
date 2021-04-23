package com.deaerlinda.userapi_182101914_dea.services;

import com.deaerlinda.userapi_182101914_dea.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<User>> getUsersList();
}