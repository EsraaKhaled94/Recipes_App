package com.esraakhaled.recipes.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NutritionInfo {

    @SerializedName("SingularYieldUnit")
    @Expose
    private String singularYieldUnit;
    @SerializedName("TotalCalories")
    @Expose
    private int totalCalories;
    @SerializedName("TotalFat")
    @Expose
    private double totalFat;
    @SerializedName("CaloriesFromFat")
    @Expose
    private int caloriesFromFat;
    @SerializedName("TotalFatPct")
    @Expose
    private double totalFatPct;
    @SerializedName("SatFat")
    @Expose
    private double satFat;
    @SerializedName("SatFatPct")
    @Expose
    private double satFatPct;
    @SerializedName("MonoFat")
    @Expose
    private double monoFat;
    @SerializedName("PolyFat")
    @Expose
    private double polyFat;
    @SerializedName("TransFat")
    @Expose
    private double transFat;
    @SerializedName("Cholesterol")
    @Expose
    private double cholesterol;
    @SerializedName("CholesterolPct")
    @Expose
    private double cholesterolPct;
    @SerializedName("Sodium")
    @Expose
    private double sodium;
    @SerializedName("SodiumPct")
    @Expose
    private double sodiumPct;
    @SerializedName("Potassium")
    @Expose
    private double potassium;
    @SerializedName("PotassiumPct")
    @Expose
    private double potassiumPct;
    @SerializedName("TotalCarbs")
    @Expose
    private double totalCarbs;
    @SerializedName("TotalCarbsPct")
    @Expose
    private double totalCarbsPct;
    @SerializedName("DietaryFiber")
    @Expose
    private double dietaryFiber;
    @SerializedName("DietaryFiberPct")
    @Expose
    private double dietaryFiberPct;
    @SerializedName("Sugar")
    @Expose
    private double sugar;
    @SerializedName("Protein")
    @Expose
    private double protein;
    @SerializedName("ProteinPct")
    @Expose
    private double proteinPct;

    public String getSingularYieldUnit() {
        return singularYieldUnit;
    }

    public void setSingularYieldUnit(String singularYieldUnit) {
        this.singularYieldUnit = singularYieldUnit;
    }

    public int getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(int totalCalories) {
        this.totalCalories = totalCalories;
    }

    public double getTotalFat() {
        return totalFat;
    }

    public void setTotalFat(double totalFat) {
        this.totalFat = totalFat;
    }

    public int getCaloriesFromFat() {
        return caloriesFromFat;
    }

    public void setCaloriesFromFat(int caloriesFromFat) {
        this.caloriesFromFat = caloriesFromFat;
    }

    public double getTotalFatPct() {
        return totalFatPct;
    }

    public void setTotalFatPct(double totalFatPct) {
        this.totalFatPct = totalFatPct;
    }

    public double getSatFat() {
        return satFat;
    }

    public void setSatFat(double satFat) {
        this.satFat = satFat;
    }

    public double getSatFatPct() {
        return satFatPct;
    }

    public void setSatFatPct(double satFatPct) {
        this.satFatPct = satFatPct;
    }

    public double getMonoFat() {
        return monoFat;
    }

    public void setMonoFat(double monoFat) {
        this.monoFat = monoFat;
    }

    public double getPolyFat() {
        return polyFat;
    }

    public void setPolyFat(double polyFat) {
        this.polyFat = polyFat;
    }

    public double getTransFat() {
        return transFat;
    }

    public void setTransFat(double transFat) {
        this.transFat = transFat;
    }

    public double getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(double cholesterol) {
        this.cholesterol = cholesterol;
    }

    public double getCholesterolPct() {
        return cholesterolPct;
    }

    public void setCholesterolPct(double cholesterolPct) {
        this.cholesterolPct = cholesterolPct;
    }

    public double getSodium() {
        return sodium;
    }

    public void setSodium(double sodium) {
        this.sodium = sodium;
    }

    public double getSodiumPct() {
        return sodiumPct;
    }

    public void setSodiumPct(double sodiumPct) {
        this.sodiumPct = sodiumPct;
    }

    public double getPotassium() {
        return potassium;
    }

    public void setPotassium(double potassium) {
        this.potassium = potassium;
    }

    public double getPotassiumPct() {
        return potassiumPct;
    }

    public void setPotassiumPct(double potassiumPct) {
        this.potassiumPct = potassiumPct;
    }

    public double getTotalCarbs() {
        return totalCarbs;
    }

    public void setTotalCarbs(double totalCarbs) {
        this.totalCarbs = totalCarbs;
    }

    public double getTotalCarbsPct() {
        return totalCarbsPct;
    }

    public void setTotalCarbsPct(double totalCarbsPct) {
        this.totalCarbsPct = totalCarbsPct;
    }

    public double getDietaryFiber() {
        return dietaryFiber;
    }

    public void setDietaryFiber(double dietaryFiber) {
        this.dietaryFiber = dietaryFiber;
    }

    public double getDietaryFiberPct() {
        return dietaryFiberPct;
    }

    public void setDietaryFiberPct(double dietaryFiberPct) {
        this.dietaryFiberPct = dietaryFiberPct;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getProteinPct() {
        return proteinPct;
    }

    public void setProteinPct(double proteinPct) {
        this.proteinPct = proteinPct;
    }

}
