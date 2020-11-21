package com.example.listgame.model;

import com.google.gson.annotations.SerializedName;

public class PlatformsItem{

    @SerializedName("requirements_ru")
    private RequirementsRu requirementsRu;

    @SerializedName("requirements_en")
    private RequirementsEn requirementsEn;

    @SerializedName("released_at")
    private String releasedAt;

    @SerializedName("platform")
    private Platform platform;

    public void setRequirementsRu(RequirementsRu requirementsRu){
        this.requirementsRu = requirementsRu;
    }

    public RequirementsRu getRequirementsRu(){
        return requirementsRu;
    }

    public void setRequirementsEn(RequirementsEn requirementsEn){
        this.requirementsEn = requirementsEn;
    }

    public RequirementsEn getRequirementsEn(){
        return requirementsEn;
    }

    public void setReleasedAt(String releasedAt){
        this.releasedAt = releasedAt;
    }

    public String getReleasedAt(){
        return releasedAt;
    }

    public void setPlatform(Platform platform){
        this.platform = platform;
    }

    public Platform getPlatform(){
        return platform;
    }
}