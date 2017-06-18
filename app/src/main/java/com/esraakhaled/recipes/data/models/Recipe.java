package com.esraakhaled.recipes.data.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Recipe {

    @SerializedName("RecipeID")
    @Expose
    private int recipeID;
    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("Description")
    @Expose
    private String description;
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
    private Object microcategory;
    @SerializedName("PrimaryIngredient")
    @Expose
    private String primaryIngredient;
    @SerializedName("StarRating")
    @Expose
    private double starRating;
    @SerializedName("WebURL")
    @Expose
    private String webURL;
    @SerializedName("ImageURL")
    @Expose
    private String imageURL;
    @SerializedName("ReviewCount")
    @Expose
    private int reviewCount;
    @SerializedName("MedalCount")
    @Expose
    private int medalCount;
    @SerializedName("FavoriteCount")
    @Expose
    private int favoriteCount;
    @SerializedName("Poster")
    @Expose
    private Poster poster;
    @SerializedName("Ingredients")
    @Expose
    private List<Ingredient> ingredients = null;
    @SerializedName("Instructions")
    @Expose
    private String instructions;
    @SerializedName("YieldNumber")
    @Expose
    private int yieldNumber;
    @SerializedName("YieldUnit")
    @Expose
    private String yieldUnit;
    @SerializedName("TotalMinutes")
    @Expose
    private int totalMinutes;
    @SerializedName("ActiveMinutes")
    @Expose
    private int activeMinutes;
    @SerializedName("NutritionInfo")
    @Expose
    private NutritionInfo nutritionInfo;
    @SerializedName("IsPrivate")
    @Expose
    private boolean isPrivate;
    @SerializedName("CreationDate")
    @Expose
    private String creationDate;
    @SerializedName("LastModified")
    @Expose
    private String lastModified;
    @SerializedName("IsBookmark")
    @Expose
    private boolean isBookmark;
    @SerializedName("BookmarkURL")
    @Expose
    private Object bookmarkURL;
    @SerializedName("BookmarkSiteLogo")
    @Expose
    private String bookmarkSiteLogo;
    @SerializedName("BookmarkImageURL")
    @Expose
    private Object bookmarkImageURL;
    @SerializedName("IsRecipeScan")
    @Expose
    private Object isRecipeScan;
    @SerializedName("MenuCount")
    @Expose
    private int menuCount;
    @SerializedName("NotesCount")
    @Expose
    private int notesCount;
    @SerializedName("AdTags")
    @Expose
    private String adTags;
    @SerializedName("IngredientsTextBlock")
    @Expose
    private Object ingredientsTextBlock;
    @SerializedName("AllCategoriesText")
    @Expose
    private String allCategoriesText;
    @SerializedName("IsSponsored")
    @Expose
    private boolean isSponsored;
    @SerializedName("VariantOfRecipeID")
    @Expose
    private Object variantOfRecipeID;
    @SerializedName("Collection")
    @Expose
    private String collection;
    @SerializedName("CollectionID")
    @Expose
    private Object collectionID;
    @SerializedName("AdminBoost")
    @Expose
    private int adminBoost;
    @SerializedName("VerifiedDateTime")
    @Expose
    private String verifiedDateTime;
    @SerializedName("MaxImageSquare")
    @Expose
    private int maxImageSquare;
    @SerializedName("ImageSquares")
    @Expose
    private List<Integer> imageSquares = null;
    @SerializedName("PhotoUrl")
    @Expose
    private String photoUrl;
    @SerializedName("VerifiedByClass")
    @Expose
    private String verifiedByClass;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Object getMicrocategory() {
        return microcategory;
    }

    public void setMicrocategory(Object microcategory) {
        this.microcategory = microcategory;
    }

    public String getPrimaryIngredient() {
        return primaryIngredient;
    }

    public void setPrimaryIngredient(String primaryIngredient) {
        this.primaryIngredient = primaryIngredient;
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

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }

    public int getMedalCount() {
        return medalCount;
    }

    public void setMedalCount(int medalCount) {
        this.medalCount = medalCount;
    }

    public int getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(int favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public Poster getPoster() {
        return poster;
    }

    public void setPoster(Poster poster) {
        this.poster = poster;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public int getYieldNumber() {
        return yieldNumber;
    }

    public void setYieldNumber(int yieldNumber) {
        this.yieldNumber = yieldNumber;
    }

    public String getYieldUnit() {
        return yieldUnit;
    }

    public void setYieldUnit(String yieldUnit) {
        this.yieldUnit = yieldUnit;
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

    public NutritionInfo getNutritionInfo() {
        return nutritionInfo;
    }

    public void setNutritionInfo(NutritionInfo nutritionInfo) {
        this.nutritionInfo = nutritionInfo;
    }

    public boolean isIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
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

    public boolean isIsBookmark() {
        return isBookmark;
    }

    public void setIsBookmark(boolean isBookmark) {
        this.isBookmark = isBookmark;
    }

    public Object getBookmarkURL() {
        return bookmarkURL;
    }

    public void setBookmarkURL(Object bookmarkURL) {
        this.bookmarkURL = bookmarkURL;
    }

    public String getBookmarkSiteLogo() {
        return bookmarkSiteLogo;
    }

    public void setBookmarkSiteLogo(String bookmarkSiteLogo) {
        this.bookmarkSiteLogo = bookmarkSiteLogo;
    }

    public Object getBookmarkImageURL() {
        return bookmarkImageURL;
    }

    public void setBookmarkImageURL(Object bookmarkImageURL) {
        this.bookmarkImageURL = bookmarkImageURL;
    }

    public Object getIsRecipeScan() {
        return isRecipeScan;
    }

    public void setIsRecipeScan(Object isRecipeScan) {
        this.isRecipeScan = isRecipeScan;
    }

    public int getMenuCount() {
        return menuCount;
    }

    public void setMenuCount(int menuCount) {
        this.menuCount = menuCount;
    }

    public int getNotesCount() {
        return notesCount;
    }

    public void setNotesCount(int notesCount) {
        this.notesCount = notesCount;
    }

    public String getAdTags() {
        return adTags;
    }

    public void setAdTags(String adTags) {
        this.adTags = adTags;
    }

    public Object getIngredientsTextBlock() {
        return ingredientsTextBlock;
    }

    public void setIngredientsTextBlock(Object ingredientsTextBlock) {
        this.ingredientsTextBlock = ingredientsTextBlock;
    }

    public String getAllCategoriesText() {
        return allCategoriesText;
    }

    public void setAllCategoriesText(String allCategoriesText) {
        this.allCategoriesText = allCategoriesText;
    }

    public boolean isIsSponsored() {
        return isSponsored;
    }

    public void setIsSponsored(boolean isSponsored) {
        this.isSponsored = isSponsored;
    }

    public Object getVariantOfRecipeID() {
        return variantOfRecipeID;
    }

    public void setVariantOfRecipeID(Object variantOfRecipeID) {
        this.variantOfRecipeID = variantOfRecipeID;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public Object getCollectionID() {
        return collectionID;
    }

    public void setCollectionID(Object collectionID) {
        this.collectionID = collectionID;
    }

    public int getAdminBoost() {
        return adminBoost;
    }

    public void setAdminBoost(int adminBoost) {
        this.adminBoost = adminBoost;
    }

    public String getVerifiedDateTime() {
        return verifiedDateTime;
    }

    public void setVerifiedDateTime(String verifiedDateTime) {
        this.verifiedDateTime = verifiedDateTime;
    }

    public int getMaxImageSquare() {
        return maxImageSquare;
    }

    public void setMaxImageSquare(int maxImageSquare) {
        this.maxImageSquare = maxImageSquare;
    }

    public List<Integer> getImageSquares() {
        return imageSquares;
    }

    public void setImageSquares(List<Integer> imageSquares) {
        this.imageSquares = imageSquares;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getVerifiedByClass() {
        return verifiedByClass;
    }

    public void setVerifiedByClass(String verifiedByClass) {
        this.verifiedByClass = verifiedByClass;
    }

}
