package com.example.listgame.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class YearsItem{

    @SerializedName("filter")
    private String filter;

    @SerializedName("nofollow")
    private Boolean nofollow;

    @SerializedName("decade")
    private Integer decade;

    @SerializedName("count")
    private Integer count;

    @SerializedName("from")
    private Integer from;

    @SerializedName("to")
    private Integer to;

    @SerializedName("years")
    private List<YearsItem> years;

    @SerializedName("year")
    private Integer year;

    public void setFilter(String filter){
        this.filter = filter;
    }

    public String getFilter(){
        return filter;
    }

    public void setNofollow(Boolean nofollow){
        this.nofollow = nofollow;
    }

    public boolean isNofollow(){
        return nofollow;
    }

    public void setDecade(Integer decade){
        this.decade = decade;
    }

    public Integer getDecade(){
        return decade;
    }

    public void setCount(Integer count){
        this.count = count;
    }

    public Integer getCount(){
        return count;
    }

    public void setFrom(Integer from){
        this.from = from;
    }

    public Integer getFrom(){
        return from;
    }

    public void setTo(Integer to){
        this.to = to;
    }

    public Integer getTo(){
        return to;
    }

    public void setYears(List<YearsItem> years){
        this.years = years;
    }

    public List<YearsItem> getYears(){
        return years;
    }

    public void setYear(Integer year){
        this.year = year;
    }

    public Integer getYear(){
        return year;
    }
}