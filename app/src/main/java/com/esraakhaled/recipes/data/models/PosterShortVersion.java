package com.esraakhaled.recipes.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PosterShortVersion {

    @SerializedName("UserName")
    @Expose
    private String userName;
    @SerializedName("UserID")
    @Expose
    private int userID;
    @SerializedName("FirstName")
    @Expose
    private Object firstName;
    @SerializedName("LastName")
    @Expose
    private Object lastName;
    @SerializedName("PhotoUrl")
    @Expose
    private String photoUrl;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Object getFirstName() {
        return firstName;
    }

    public void setFirstName(Object firstName) {
        this.firstName = firstName;
    }

    public Object getLastName() {
        return lastName;
    }

    public void setLastName(Object lastName) {
        this.lastName = lastName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

}
