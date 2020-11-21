package com.example.listgame.rest;

import com.example.listgame.model.RootGamesModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("games")
    Call<RootGamesModel> getData();


}