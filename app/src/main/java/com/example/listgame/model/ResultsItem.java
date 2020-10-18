package com.example.listgame.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResultsItem{

    @SerializedName("added")
    private Integer added;

    @SerializedName("rating")
    private Double rating;

    @SerializedName("metacritic")
    private Integer metacritic;

    @SerializedName("playtime")
    private Integer playtime;

    @SerializedName("short_screenshots")
    private List<ShortScreenshotsItem> shortScreenshots;

    @SerializedName("platforms")
    private List<PlatformsItem> platforms;

    @SerializedName("user_game")
    private Object userGame;

    @SerializedName("rating_top")
    private Integer ratingTop;

    @SerializedName("reviews_text_count")
    private Integer reviewsTextCount;

    @SerializedName("ratings")
    private List<RatingsItem> ratings;

    @SerializedName("genres")
    private List<GenresItem> genres;

    @SerializedName("saturated_color")
    private String saturatedColor;

    @SerializedName("id")
    private Integer id;

    @SerializedName("added_by_status")
    private AddedByStatus addedByStatus;

    @SerializedName("parent_platforms")
    private List<ParentPlatformsItem> parentPlatforms;

    @SerializedName("ratings_count")
    private Integer ratingsCount;

    @SerializedName("slug")
    private String slug;

    @SerializedName("released")
    private String released;

    @SerializedName("suggestions_count")
    private Integer suggestionsCount;

    @SerializedName("stores")
    private List<StoresItem> stores;

    @SerializedName("tags")
    private List<TagsItem> tags;

    @SerializedName("background_image")
    private String backgroundImage;

    @SerializedName("tba")
    private Boolean tba;

    @SerializedName("dominant_color")
    private String dominantColor;

    @SerializedName("name")
    private String name;

    @SerializedName("clip")
    private Clip clip;

    @SerializedName("reviews_count")
    private Integer reviewsCount;

    public void setAdded(Integer added){
        this.added = added;
    }

    public Integer getAdded(){
        return added;
    }

    public void setRating(Double rating){
        this.rating = rating;
    }

    public Double getRating(){
        return rating;
    }

    public void setMetacritic(Integer metacritic){
        this.metacritic = metacritic;
    }

    public Integer getMetacritic(){
        return metacritic;
    }

    public void setPlaytime(Integer playtime){
        this.playtime = playtime;
    }

    public Integer getPlaytime(){
        return playtime;
    }

    public void setShortScreenshots(List<ShortScreenshotsItem> shortScreenshots){
        this.shortScreenshots = shortScreenshots;
    }

    public List<ShortScreenshotsItem> getShortScreenshots(){
        return shortScreenshots;
    }

    public void setPlatforms(List<PlatformsItem> platforms){
        this.platforms = platforms;
    }

    public List<PlatformsItem> getPlatforms(){
        return platforms;
    }

    public void setUserGame(Object userGame){
        this.userGame = userGame;
    }

    public Object getUserGame(){
        return userGame;
    }

    public void setRatingTop(Integer ratingTop){
        this.ratingTop = ratingTop;
    }

    public Integer getRatingTop(){
        return ratingTop;
    }

    public void setReviewsTextCount(Integer reviewsTextCount){
        this.reviewsTextCount = reviewsTextCount;
    }

    public Integer getReviewsTextCount(){
        return reviewsTextCount;
    }

    public void setRatings(List<RatingsItem> ratings){
        this.ratings = ratings;
    }

    public List<RatingsItem> getRatings(){
        return ratings;
    }

    public void setGenres(List<GenresItem> genres){
        this.genres = genres;
    }

    public List<GenresItem> getGenres(){
        return genres;
    }

    public void setSaturatedColor(String saturatedColor){
        this.saturatedColor = saturatedColor;
    }

    public String getSaturatedColor(){
        return saturatedColor;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public void setAddedByStatus(AddedByStatus addedByStatus){
        this.addedByStatus = addedByStatus;
    }

    public AddedByStatus getAddedByStatus(){
        return addedByStatus;
    }

    public void setParentPlatforms(List<ParentPlatformsItem> parentPlatforms){
        this.parentPlatforms = parentPlatforms;
    }

    public List<ParentPlatformsItem> getParentPlatforms(){
        return parentPlatforms;
    }

    public void setRatingsCount(Integer ratingsCount){
        this.ratingsCount = ratingsCount;
    }

    public Integer getRatingsCount(){
        return ratingsCount;
    }

    public void setSlug(String slug){
        this.slug = slug;
    }

    public String getSlug(){
        return slug;
    }

    public void setReleased(String released){
        this.released = released;
    }

    public String getReleased(){
        return released;
    }

    public void setSuggestionsCount(Integer suggestionsCount){
        this.suggestionsCount = suggestionsCount;
    }

    public Integer getSuggestionsCount(){
        return suggestionsCount;
    }

    public void setStores(List<StoresItem> stores){
        this.stores = stores;
    }

    public List<StoresItem> getStores(){
        return stores;
    }

    public void setTags(List<TagsItem> tags){
        this.tags = tags;
    }

    public List<TagsItem> getTags(){
        return tags;
    }

    public void setBackgroundImage(String backgroundImage){
        this.backgroundImage = backgroundImage;
    }

    public String getBackgroundImage(){
        return backgroundImage;
    }

    public void setTba(Boolean tba){
        this.tba = tba;
    }

    public boolean isTba(){
        return tba;
    }

    public void setDominantColor(String dominantColor){
        this.dominantColor = dominantColor;
    }

    public String getDominantColor(){
        return dominantColor;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setClip(Clip clip){
        this.clip = clip;
    }

    public Clip getClip(){
        return clip;
    }

    public void setReviewsCount(Integer reviewsCount){
        this.reviewsCount = reviewsCount;
    }

    public Integer getReviewsCount(){
        return reviewsCount;
    }
}