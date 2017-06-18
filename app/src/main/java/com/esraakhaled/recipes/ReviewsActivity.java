package com.esraakhaled.recipes;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.esraakhaled.recipes.adapter.ReviewsAdapter;
import com.esraakhaled.recipes.data.models.RecipeReview;
import com.esraakhaled.recipes.data.remote.RecipeAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ReviewsActivity extends AppCompatActivity {

    ListView reviewsListView;
    ReviewsAdapter adapter;

    final static String RECIPE_ID="RECIPE_ID";
    final static String API_KEY ="axV15293h59oU9Z853fw48CmI1H1Js";
    int recipeID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);
        recipeID= getIntent().getExtras().getInt(RECIPE_ID);
        reviewsListView = (ListView) findViewById(R.id.reviews_list);
        TextView title= (TextView) findViewById(R.id.review_recipe_title);
        title.setText(getIntent().getExtras().getString("RECIPE_TITLE"));
        getReviewsFromAPI();
    }
    public void getReviewsFromAPI(){
        final ProgressDialog dialog = new ProgressDialog(this, AlertDialog.THEME_DEVICE_DEFAULT_DARK);
        dialog.setMessage("Loading , Please wait...");
        dialog.setIndeterminate(true);
        dialog.setCancelable(true);
        dialog.show();
        RecipeAPI.RecipesFetcher.getInstance().getReviews(recipeID,API_KEY).enqueue(new Callback<List<RecipeReview>>() {
            @Override
            public void onResponse(Call<List<RecipeReview>> call, Response<List<RecipeReview>> response) {
                if (response.isSuccessful()) {
                    adapter = new ReviewsAdapter(ReviewsActivity.this, R.layout.review_view, response.body());
                    reviewsListView.setAdapter(adapter);
                    if (response.body().size()==0){
                        Toast.makeText(ReviewsActivity.this, "No Reviews for this Recipe", Toast.LENGTH_LONG).show();
                    }
                    dialog.dismiss();
                }
                else {
                    dialog.dismiss();
                    Toast.makeText(ReviewsActivity.this, "Something went wrong!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<RecipeReview>> call, Throwable t) {
                dialog.dismiss();
                Toast.makeText(ReviewsActivity.this, "Check your Internet Connection!", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
