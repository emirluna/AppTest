package com.example.testlogin.retrofit;

import com.example.testlogin.RequestLogin;
import com.example.testlogin.RequestSignup;
import com.example.testlogin.ResponseAuth;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface MiniService {

    @POST("/auth/login")
    Call<ResponseAuth> doLogin(@Body RequestLogin requestLogin);

    @POST("/auth/signup")
    Call<ResponseAuth> doSignUp(@Body RequestSignup requestSignup);

}
