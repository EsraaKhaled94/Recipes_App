package com.esraakhaled.recipes.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.esraakhaled.recipes.R;

/**
 * Created by Esraa Khaled on 6/18/2017.
 */

public class IngredientsViewHolder extends RecyclerView.ViewHolder {
    TextView quantity,unit,name;
    public IngredientsViewHolder(View itemView) {
        super(itemView);
        quantity = (TextView) itemView.findViewById(R.id.ingredient_quantity);
        unit = (TextView) itemView.findViewById(R.id.ingredient_unit);
        name = (TextView) itemView.findViewById(R.id.ingredient_name);
    }
}
