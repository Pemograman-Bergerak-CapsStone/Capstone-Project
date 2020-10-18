package com.example.listgame.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Filters{

    @SerializedName("years")
    private List<YearsItem> years;

    public void setYears(List<YearsItem> years){
        this.years = years;
    }

    public List<YearsItem> getYears(){
        return years;
    }
}