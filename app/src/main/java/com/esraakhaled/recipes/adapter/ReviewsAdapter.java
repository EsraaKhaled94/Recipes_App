package com.esraakhaled.recipes.adapter;

import android.content.Context;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import com.esraakhaled.recipes.R;
import com.esraakhaled.recipes.data.models.RecipeReview;

import java.util.List;

/**
 * Created by Esraa Khaled on 6/18/2017.
 */

public class ReviewsAdapter extends ArrayAdapter {
    Context mContext;
    int resourceID;
    List<RecipeReview> reviews;


    public ReviewsAdapter(Context context, int resource, List<RecipeReview> objects) {
        super(context, resource, objects);
        mContext=context;
        resourceID=resource;
        reviews = objects;
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return reviews.get(position);
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {

        View row = convertView;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        row = inflater.inflate(resourceID, parent, false);

        TextView comment = (TextView) row.findViewById(R.id.review_comment);
        RatingBar userRate = (RatingBar) row.findViewById(R.id.review_rate);

        comment.setText(reviews.get(position).getComment());
        userRate.setRating(reviews.get(position).getStarRating());

        return row;
    }
}
