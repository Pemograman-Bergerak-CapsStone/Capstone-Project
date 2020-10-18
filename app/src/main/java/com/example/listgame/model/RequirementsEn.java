package com.example.listgame.model;

import com.google.gson.annotations.SerializedName;

public class RequirementsEn{

    @SerializedName("minimum")
    private String minimum;

    public void setMinimum(String minimum){
        this.minimum = minimum;
    }

    public String getMinimum(){
        return minimum;
    }
}