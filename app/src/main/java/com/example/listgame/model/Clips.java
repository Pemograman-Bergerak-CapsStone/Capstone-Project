package com.example.listgame.model;

import com.google.gson.annotations.SerializedName;

public class Clips{

    @SerializedName("320")
    private String jsonMember320;

    @SerializedName("640")
    private String jsonMember640;

    @SerializedName("full")
    private String full;

    public void setJsonMember320(String jsonMember320){
        this.jsonMember320 = jsonMember320;
    }

    public String getJsonMember320(){
        return jsonMember320;
    }

    public void setJsonMember640(String jsonMember640){
        this.jsonMember640 = jsonMember640;
    }

    public String getJsonMember640(){
        return jsonMember640;
    }

    public void setFull(String full){
        this.full = full;
    }

    public String getFull(){
        return full;
    }
}