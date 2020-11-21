package com.example.listgame.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class RootGamesModel{

    @SerializedName("next")
    private String next;

    @SerializedName("nofollow")
    private Boolean nofollow;

    @SerializedName("noindex")
    private Boolean noindex;

    @SerializedName("nofollow_collections")
    private ArrayList<String> nofollowCollections;

    @SerializedName("previous")
    private Object previous;

    @SerializedName("count")
    private Integer count;

    @SerializedName("description")
    private String description;

    @SerializedName("seo_h1")
    private String seoH1;

    @SerializedName("filters")
    private Filters filters;

    @SerializedName("seo_title")
    private String seoTitle;

    @SerializedName("seo_description")
    private String seoDescription;

    @SerializedName("results")
    private ArrayList<ResultsItem> results;

    @SerializedName("seo_keywords")
    private String seoKeywords;

    public void setNext(String next){
        this.next = next;
    }

    public String getNext(){
        return next;
    }

    public void setNofollow(Boolean nofollow){
        this.nofollow = nofollow;
    }

    public boolean isNofollow(){
        return nofollow;
    }

    public void setNoindex(Boolean noindex){
        this.noindex = noindex;
    }

    public boolean isNoindex(){
        return noindex;
    }

    public void setNofollowCollections(ArrayList<String> nofollowCollections){
        this.nofollowCollections = nofollowCollections;
    }

    public ArrayList<String> getNofollowCollections(){
        return nofollowCollections;
    }

    public void setPrevious(Object previous){
        this.previous = previous;
    }

    public Object getPrevious(){
        return previous;
    }

    public void setCount(Integer count){
        this.count = count;
    }

    public Integer getCount(){
        return count;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setSeoH1(String seoH1){
        this.seoH1 = seoH1;
    }

    public String getSeoH1(){
        return seoH1;
    }

    public void setFilters(Filters filters){
        this.filters = filters;
    }

    public Filters getFilters(){
        return filters;
    }

    public void setSeoTitle(String seoTitle){
        this.seoTitle = seoTitle;
    }

    public String getSeoTitle(){
        return seoTitle;
    }

    public void setSeoDescription(String seoDescription){
        this.seoDescription = seoDescription;
    }

    public String getSeoDescription(){
        return seoDescription;
    }

    public void setResults(ArrayList<ResultsItem> results){
        this.results = results;
    }

    public ArrayList<ResultsItem> getResults(){
        return results;
    }

    public void setSeoKeywords(String seoKeywords){
        this.seoKeywords = seoKeywords;
    }

    public String getSeoKeywords(){
        return seoKeywords;
    }
}