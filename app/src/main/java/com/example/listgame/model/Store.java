package com.example.listgame.model;

import com.google.gson.annotations.SerializedName;

public class Store{

    @SerializedName("games_count")
    private Integer gamesCount;

    @SerializedName("domain")
    private String domain;

    @SerializedName("name")
    private String name;

    @SerializedName("id")
    private Integer id;

    @SerializedName("image_background")
    private String imageBackground;

    @SerializedName("slug")
    private String slug;

    public void setGamesCount(Integer gamesCount){
        this.gamesCount = gamesCount;
    }

    public Integer getGamesCount(){
        return gamesCount;
    }

    public void setDomain(String domain){
        this.domain = domain;
    }

    public String getDomain(){
        return domain;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public void setImageBackground(String imageBackground){
        this.imageBackground = imageBackground;
    }

    public String getImageBackground(){
        return imageBackground;
    }

    public void setSlug(String slug){
        this.slug = slug;
    }

    public String getSlug(){
        return slug;
    }
}