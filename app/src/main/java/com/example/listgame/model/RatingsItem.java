package com.example.listgame.model;

import com.google.gson.annotations.SerializedName;

public class RatingsItem{

    @SerializedName("count")
    private Integer count;

    @SerializedName("id")
    private Integer id;

    @SerializedName("title")
    private String title;

    @SerializedName("percent")
    private Double percent;

    public void setCount(Integer count){
        this.count = count;
    }

    public Integer getCount(){
        return count;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setPercent(Double percent){
        this.percent = percent;
    }

    public Double getPercent(){
        return percent;
    }
}