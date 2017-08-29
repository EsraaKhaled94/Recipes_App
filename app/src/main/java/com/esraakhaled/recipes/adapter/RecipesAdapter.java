package com.esraakhaled.recipes.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.animation.GlideAnimationFactory;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.esraakhaled.recipes.R;
import com.esraakhaled.recipes.RecipeActivity;
import com.esraakhaled.recipes.data.models.Result;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;

import java.util.List;

import static android.text.TextUtils.isEmpty;

/**
 * Created by Esraa Khaled on 6/17/2017.
 */

public class RecipesAdapter extends RecyclerView.Adapter<RecipesViewHolder> {
    private List<Result> resultList;
    private Context context;
    private RecyclerView recyclerView;

    public RecipesAdapter(List<Result> resultList,RecyclerView recyclerView, Context context) {
        this.resultList = resultList;
        this.context = context;
        this.recyclerView=recyclerView;
    }

    @Override
    public RecipesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipe_view, null);
        RecipesViewHolder recipesViewHolder = new RecipesViewHolder(layoutView);
        layoutView.setOnClickListener(new getRecipeDetails());
        return recipesViewHolder;
    }

    @Override
    public void onBindViewHolder(final RecipesViewHolder holder, int position) {

        holder.loading.setVisibility(View.VISIBLE);

        GlideDrawableImageViewTarget imageViewTarget = new GlideDrawableImageViewTarget(holder.loading);
        Glide.with(context).load(R.raw.food_loader).into(imageViewTarget);


        holder.title.setText(resultList.get(position).getTitle());
        holder.category.setText(resultList.get(position).getCategory());
        holder.recipeRating.setRating((float) resultList.get(position).getStarRating());

        holder.recipeImage.setImageResource(R.drawable.default_white);
        holder.recipeImage.setTag(resultList.get(position).getPhotoUrl());


        ImageLoader imageLoader = ImageLoader.getInstance();
        imageLoader.loadImage(resultList.get(position).getPhotoUrl(), new SimpleImageLoadingListener() {
            @Override
            public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
                if (imageUri == holder.recipeImage.getTag().toString()) {
                    holder.loading.setVisibility(View.GONE);
                    holder.recipeImage.setImageBitmap(loadedImage);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return resultList.size();
    }
    public void clear() {
        int size = this.resultList.size();
        this.resultList.clear();
        notifyItemRangeRemoved(0, size);
    }

    private class getRecipeDetails implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(context,RecipeActivity.class);
            int itemPosition = recyclerView.getChildAdapterPosition(v);
            i.putExtra("RECIPE_ID",resultList.get(itemPosition).getRecipeID());
            context.startActivity(i);
        }
    }
}
