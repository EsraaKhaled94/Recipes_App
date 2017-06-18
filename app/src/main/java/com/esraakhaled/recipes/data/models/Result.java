package com.esraakhaled.recipes.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("RecipeID")
    @Expose
    private int recipeID;
    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("Cuisine")
    @Expose
    private String cuisine;
    @SerializedName("Category")
    @Expose
    private String category;
    @SerializedName("Subcategory")
    @Expose
    private String subcategory;
    @SerializedName("Microcategory")
    @Expose
    private String microcategory;
    @SerializedName("StarRating")
    @Expose
    private double starRating;
    @SerializedName("WebURL")
    @Expose
    private String webURL;
    @SerializedName("ReviewCount")
    @Expose
    private int reviewCount;
    @SerializedName("Poster")
    @Expose
    private PosterShortVersion posterShortVersion;
    @SerializedName("IsPrivate")
    @Expose
    private boolean isPrivate;
    @SerializedName("Servings")
    @Expose
    private int servings;
    @SerializedName("CreationDate")
    @Expose
    private String creationDate;
    @SerializedName("IsRecipeScan")
    @Expose
    private boolean isRecipeScan;
    @SerializedName("IsBookmark")
    @Expose
    private boolean isBookmark;
    @SerializedName("TotalTries")
    @Expose
    private int totalTries;
    @SerializedName("PhotoUrl")
    @Expose
    private String photoUrl;

    public int getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getMicrocategory() {
        return microcategory;
    }

    public void setMicrocategory(String microcategory) {
        this.microcategory = microcategory;
    }

    public double getStarRating() {
        return starRating;
    }

    public void setStarRating(double starRating) {
        this.starRating = starRating;
    }

    public String getWebURL() {
        return webURL;
    }

    public void setWebURL(String webURL) {
        this.webURL = webURL;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }

    public PosterShortVersion getPosterShortVersion() {
        return posterShortVersion;
    }

    public void setPosterShortVersion(PosterShortVersion posterShortVersion) {
        this.posterShortVersion = posterShortVersion;
    }

    public boolean isIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isIsRecipeScan() {
        return isRecipeScan;
    }

    public void setIsRecipeScan(boolean isRecipeScan) {
        this.isRecipeScan = isRecipeScan;
    }

    public boolean isIsBookmark() {
        return isBookmark;
    }

    public void setIsBookmark(boolean isBookmark) {
        this.isBookmark = isBookmark;
    }

    public int getTotalTries() {
        return totalTries;
    }

    public void setTotalTries(int totalTries) {
        this.totalTries = totalTries;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

}
