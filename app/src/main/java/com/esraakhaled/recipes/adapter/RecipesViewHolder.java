package com.esraakhaled.recipes.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.esraakhaled.recipes.R;

/**
 * Created by Esraa Khaled on 6/17/2017.
 */

public class RecipesViewHolder extends RecyclerView.ViewHolder {
    TextView title, category;
    RatingBar recipeRating;
    ImageView recipeImage,loading;
    public RecipesViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.recipe_title);
        category = (TextView) itemView.findViewById(R.id.recipe_category);
        recipeRating = (RatingBar) itemView.findViewById(R.id.recipe_rating);
        recipeImage = (ImageView) itemView.findViewById(R.id.recipe_image);
        loading = (ImageView) itemView.findViewById(R.id.loading);
    }
}
