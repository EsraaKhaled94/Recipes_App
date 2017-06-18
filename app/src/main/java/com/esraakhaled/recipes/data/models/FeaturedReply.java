
package com.esraakhaled.recipes.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FeaturedReply {

    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("ReviewID")
    @Expose
    private String reviewID;
    @SerializedName("Comment")
    @Expose
    private String comment;
    @SerializedName("Poster")
    @Expose
    private Poster_ poster;
    @SerializedName("CreationDate")
    @Expose
    private String creationDate;
    @SerializedName("LastModified")
    @Expose
    private String lastModified;

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getReviewID() {
        return reviewID;
    }

    public void setReviewID(String reviewID) {
        this.reviewID = reviewID;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Poster_ getPoster() {
        return poster;
    }

    public void setPoster(Poster_ poster) {
        this.poster = poster;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

}
