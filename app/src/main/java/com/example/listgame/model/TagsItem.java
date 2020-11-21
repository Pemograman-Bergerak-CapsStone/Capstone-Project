package com.example.listgame.model;

import com.google.gson.annotations.SerializedName;

public class TagsItem{

    @SerializedName("games_count")
    private Integer gamesCount;

    @SerializedName("name")
    private String name;

    @SerializedName("language")
    private String language;

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

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    public String getLanguage(){
        return language;
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