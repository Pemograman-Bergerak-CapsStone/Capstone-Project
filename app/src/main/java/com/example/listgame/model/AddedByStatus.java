package com.example.listgame.model;

import com.google.gson.annotations.SerializedName;

public class AddedByStatus{

    @SerializedName("owned")
    private Integer owned;

    @SerializedName("beaten")
    private Integer beaten;

    @SerializedName("dropped")
    private Integer dropped;

    @SerializedName("yet")
    private Integer yet;

    @SerializedName("playing")
    private Integer playing;

    @SerializedName("toplay")
    private Integer toplay;

    public void setOwned(Integer owned){
        this.owned = owned;
    }

    public Integer getOwned(){
        return owned;
    }

    public void setBeaten(Integer beaten){
        this.beaten = beaten;
    }

    public Integer getBeaten(){
        return beaten;
    }

    public void setDropped(Integer dropped){
        this.dropped = dropped;
    }

    public Integer getDropped(){
        return dropped;
    }

    public void setYet(Integer yet){
        this.yet = yet;
    }

    public Integer getYet(){
        return yet;
    }

    public void setPlaying(Integer playing){
        this.playing = playing;
    }

    public Integer getPlaying(){
        return playing;
    }

    public void setToplay(Integer toplay){
        this.toplay = toplay;
    }

    public Integer getToplay(){
        return toplay;
    }
}