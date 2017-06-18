package com.esraakhaled.recipes.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Poster {

    @SerializedName("UserID")
    @Expose
    private int userID;
    @SerializedName("UserName")
    @Expose
    private String userName;
    @SerializedName("PhotoUrl")
    @Expose
    private String photoUrl;
    @SerializedName("IsPremium")
    @Expose
    private boolean isPremium;
    @SerializedName("IsKitchenHelper")
    @Expose
    private boolean isKitchenHelper;
    @SerializedName("PremiumExpiryDate")
    @Expose
    private String premiumExpiryDate;
    @SerializedName("MemberSince")
    @Expose
    private String memberSince;
    @SerializedName("IsUsingRecurly")
    @Expose
    private boolean isUsingRecurly;
    @SerializedName("FirstName")
    @Expose
    private Object firstName;
    @SerializedName("LastName")
    @Expose
    private Object lastName;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public boolean isIsPremium() {
        return isPremium;
    }

    public void setIsPremium(boolean isPremium) {
        this.isPremium = isPremium;
    }

    public boolean isIsKitchenHelper() {
        return isKitchenHelper;
    }

    public void setIsKitchenHelper(boolean isKitchenHelper) {
        this.isKitchenHelper = isKitchenHelper;
    }

    public String getPremiumExpiryDate() {
        return premiumExpiryDate;
    }

    public void setPremiumExpiryDate(String premiumExpiryDate) {
        this.premiumExpiryDate = premiumExpiryDate;
    }

    public String getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(String memberSince) {
        this.memberSince = memberSince;
    }

    public boolean isIsUsingRecurly() {
        return isUsingRecurly;
    }

    public void setIsUsingRecurly(boolean isUsingRecurly) {
        this.isUsingRecurly = isUsingRecurly;
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

}
