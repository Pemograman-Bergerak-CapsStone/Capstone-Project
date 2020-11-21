package com.example.listgame.model;

import com.google.gson.annotations.SerializedName;

public class Clip{

    @SerializedName("preview")
    private String preview;

    @SerializedName("clips")
    private Clips clips;

    @SerializedName("video")
    private String video;

    @SerializedName("clip")
    private String clip;

    public void setPreview(String preview){
        this.preview = preview;
    }

    public String getPreview(){
        return preview;
    }

    public void setClips(Clips clips){
        this.clips = clips;
    }

    public Clips getClips(){
        return clips;
    }

    public void setVideo(String video){
        this.video = video;
    }

    public String getVideo(){
        return video;
    }

    public void setClip(String clip){
        this.clip = clip;
    }

    public String getClip(){
        return clip;
    }
}