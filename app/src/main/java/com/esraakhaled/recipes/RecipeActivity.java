package com.esraakhaled.recipes;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.animation.GlideAnimationFactory;
import com.esraakhaled.recipes.adapter.IngredientsAdapter;
import com.esraakhaled.recipes.data.models.Recipe;
import com.esraakhaled.recipes.data.remote.RecipeAPI;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class RecipeActivity extends AppCompatActivity {

    int recipeID;
    final static String API_KEY ="axV15293h59oU9Z853fw48CmI1H1Js";
    TextView title,description,category,subcategory,instructions;
    RatingBar recipeRating;
    ImageView recipeImage,loading;
    RecyclerView recipeIngredients;
    LinearLayoutManager layoutManager;
    IngredientsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        //get data from intent
        recipeID= getIntent().getExtras().getInt("RECIPE_ID");

        title = (TextView) findViewById(R.id.recipe_details_title);
        description = (TextView) findViewById(R.id.recipe_details_description);
        category = (TextView) findViewById(R.id.recipe_details_category);
        subcategory = (TextView) findViewById(R.id.recipe_details_subcategory);
        instructions = (TextView) findViewById(R.id.recipe_details_instructions);
        recipeRating= (RatingBar) findViewById(R.id.recipe_details_rating);
        recipeImage = (ImageView) findViewById(R.id.recipe_details_image);
        loading = (ImageView) findViewById(R.id.recipe_details_loading);
        recipeIngredients = (RecyclerView) findViewById(R.id.recipe_details_ingredients_list);

        layoutManager= new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recipeIngredients.setLayoutManager(layoutManager);
        getRecipeDataFromAPI();
    }
    public void getRecipeDataFromAPI(){
        final ProgressDialog dialog = new ProgressDialog(this, AlertDialog.THEME_DEVICE_DEFAULT_DARK);
        dialog.setMessage("Loading , Please wait...");
        dialog.setIndeterminate(true);
        dialog.setCancelable(false);
        dialog.show();
        RecipeAPI.RecipesFetcher.getInstance().getRecipe(recipeID,API_KEY).enqueue(new Callback<Recipe>() {
            @Override
            public void onResponse(Call<Recipe> call, Response<Recipe> response) {
                if (response.isSuccessful()){
                    dialog.dismiss();
                    loading.setVisibility(View.VISIBLE);
                    Glide
                            .with(RecipeActivity.this)
                            .load(R.drawable.food_loader)
                            .asGif().animate(new GlideAnimationFactory<GifDrawable>() {
                        @Override
                        public GlideAnimation<GifDrawable> build(boolean b, boolean b1) {
                            return null;
                        }
                    }).into(loading);

                    Recipe recipe = response.body();

                    title.setText(recipe.getTitle());
                    description.setText(recipe.getDescription());
                    category.setText(recipe.getCategory());
                    subcategory.setText(recipe.getSubcategory());
                    instructions.setText(recipe.getInstructions());
                    recipeRating.setRating((float) recipe.getStarRating());

                    adapter = new IngredientsAdapter(RecipeActivity.this, recipe.getIngredients());
                    recipeIngredients.setAdapter(adapter);

                    ImageLoader imageLoader = ImageLoader.getInstance();
                    imageLoader.loadImage(recipe.getPhotoUrl(), new SimpleImageLoadingListener() {
                        @Override
                        public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
                            loading.setVisibility(View.GONE);
                            recipeImage.setImageBitmap(loadedImage);
                        }
                    });
                }
                else{
                    dialog.dismiss();
                    Toast.makeText(RecipeActivity.this, "Something went wrong!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Recipe> call, Throwable t) {
                dialog.dismiss();
                Toast.makeText(RecipeActivity.this, "Check your Internet Connection!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
