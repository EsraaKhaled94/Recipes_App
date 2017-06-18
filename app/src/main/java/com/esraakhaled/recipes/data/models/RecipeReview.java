
package com.esraakhaled.recipes.data.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecipeReview {

    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("ReviewID")
    @Expose
    private int reviewID;
    @SerializedName("GUID")
    @Expose
    private String gUID;
    @SerializedName("Comment")
    @Expose
    private String comment;
    @SerializedName("StarRating")
    @Expose
    private int starRating;
    @SerializedName("TotalMinutes")
    @Expose
    private int totalMinutes;
    @SerializedName("ActiveMinutes")
    @Expose
    private int activeMinutes;
    @SerializedName("Poster")
    @Expose
    private PosterReview poster;
    @SerializedName("CreationDate")
    @Expose
    private String creationDate;
    @SerializedName("ParentID")
    @Expose
    private int parentID;
    @SerializedName("Replies")
    @Expose
    private List<Reply> replies = null;
    @SerializedName("FeaturedReply")
    @Expose
    private FeaturedReply featuredReply;
    @SerializedName("ReplyCount")
    @Expose
    private int replyCount;
    @SerializedName("LastModified")
    @Expose
    private String lastModified;

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    public String getGUID() {
        return gUID;
    }

    public void setGUID(String gUID) {
        this.gUID = gUID;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public int getTotalMinutes() {
        return totalMinutes;
    }

    public void setTotalMinutes(int totalMinutes) {
        this.totalMinutes = totalMinutes;
    }

    public int getActiveMinutes() {
        return activeMinutes;
    }

    public void setActiveMinutes(int activeMinutes) {
        this.activeMinutes = activeMinutes;
    }

    public PosterReview getPoster() {
        return poster;
    }

    public void setPoster(PosterReview poster) {
        this.poster = poster;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public int getParentID() {
        return parentID;
    }

    public void setParentID(int parentID) {
        this.parentID = parentID;
    }

    public List<Reply> getReplies() {
        return replies;
    }

    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }

    public FeaturedReply getFeaturedReply() {
        return featuredReply;
    }

    public void setFeaturedReply(FeaturedReply featuredReply) {
        this.featuredReply = featuredReply;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

}
