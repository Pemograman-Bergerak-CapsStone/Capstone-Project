package com.example.listgame.model;

import com.google.gson.annotations.SerializedName;

public class RequirementsRu{

    @SerializedName("minimum")
    private String minimum;

    @SerializedName("recommended")
    private String recommended;

    public void setMinimum(String minimum){
        this.minimum = minimum;
    }

    public String getMinimum(){
        return minimum;
    }

    public void setRecommended(String recommended){
        this.recommended = recommended;
    }

    public String getRecommended(){
        return recommended;
    }
}