package com.example.listgame.model;

import com.google.gson.annotations.SerializedName;

public class ShortScreenshotsItem{

    @SerializedName("image")
    private String image;

    @SerializedName("id")
    private Integer id;

    public void setImage(String image){
        this.image = image;
    }

    public String getImage(){
        return image;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }
}