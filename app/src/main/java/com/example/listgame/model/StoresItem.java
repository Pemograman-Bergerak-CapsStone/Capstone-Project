package com.example.listgame.model;

import com.google.gson.annotations.SerializedName;

public class StoresItem{

    @SerializedName("url_ru")
    private String urlRu;

    @SerializedName("url_en")
    private String urlEn;

    @SerializedName("id")
    private Integer id;

    @SerializedName("store")
    private Store store;

    public void setUrlRu(String urlRu){
        this.urlRu = urlRu;
    }

    public String getUrlRu(){
        return urlRu;
    }

    public void setUrlEn(String urlEn){
        this.urlEn = urlEn;
    }

    public String getUrlEn(){
        return urlEn;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public void setStore(Store store){
        this.store = store;
    }

    public Store getStore(){
        return store;
    }
}