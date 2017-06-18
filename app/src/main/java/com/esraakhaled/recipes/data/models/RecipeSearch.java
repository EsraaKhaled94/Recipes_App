package com.esraakhaled.recipes.data.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecipeSearch {

    @SerializedName("ResultCount")
    @Expose
    private int resultCount;
    @SerializedName("Results")
    @Expose
    private List<Result> results = null;
    @SerializedName("SpellSuggest")
    @Expose
    private Object spellSuggest;

    public int getResultCount() {
        return resultCount;
    }

    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Object getSpellSuggest() {
        return spellSuggest;
    }

    public void setSpellSuggest(Object spellSuggest) {
        this.spellSuggest = spellSuggest;
    }

}
