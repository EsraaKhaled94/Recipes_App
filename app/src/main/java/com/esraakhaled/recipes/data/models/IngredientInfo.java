package com.esraakhaled.recipes.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IngredientInfo {

    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Department")
    @Expose
    private String department;
    @SerializedName("MasterIngredientID")
    @Expose
    private int masterIngredientID;
    @SerializedName("UsuallyOnHand")
    @Expose
    private boolean usuallyOnHand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getMasterIngredientID() {
        return masterIngredientID;
    }

    public void setMasterIngredientID(int masterIngredientID) {
        this.masterIngredientID = masterIngredientID;
    }

    public boolean isUsuallyOnHand() {
        return usuallyOnHand;
    }

    public void setUsuallyOnHand(boolean usuallyOnHand) {
        this.usuallyOnHand = usuallyOnHand;
    }

}
