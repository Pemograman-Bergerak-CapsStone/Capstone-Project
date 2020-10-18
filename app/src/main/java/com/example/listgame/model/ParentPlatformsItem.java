package com.example.listgame.model;

import com.google.gson.annotations.SerializedName;

public class ParentPlatformsItem{

    @SerializedName("platform")
    private Platform platform;

    public void setPlatform(Platform platform){
        this.platform = platform;
    }

    public Platform getPlatform(){
        return platform;
    }
}