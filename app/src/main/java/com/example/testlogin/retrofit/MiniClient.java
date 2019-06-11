package com.example.testlogin.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MiniClient {

    private static  MiniClient instance = null;
    private MiniService miniService;
    private Retrofit retrofit;

    public MiniClient(){
        retrofit = new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        miniService = retrofit.create(MiniService.class);
    }



}
