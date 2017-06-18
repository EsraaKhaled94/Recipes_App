package com.esraakhaled.recipes.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.esraakhaled.recipes.R;
import com.esraakhaled.recipes.data.models.Ingredient;
import com.esraakhaled.recipes.data.models.Result;

import java.util.List;

/**
 * Created by Esraa Khaled on 6/17/2017.
 */

public class IngredientsAdapter extends RecyclerView.Adapter<IngredientsViewHolder> {
    private List<Ingredient> ingredientList;
    private Context context;

    public IngredientsAdapter(Context context, List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
        this.context = context;
    }

    @Override
    public IngredientsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.ingredient_view,null);
        IngredientsViewHolder ingredientViewHolder = new IngredientsViewHolder(layoutView);
        return ingredientViewHolder;
    }

    @Override
    public void onBindViewHolder(IngredientsViewHolder holder, int position) {
        String q=String.valueOf(ingredientList.get(position).getDisplayQuantity());
        if (!q.equals("null")){
            holder.quantity.setText(q);
        }
        else {
            holder.quantity.setVisibility(View.GONE);
        }
        String u = String.valueOf(ingredientList.get(position).getUnit());
        if (!u.equals("null")) {
            holder.unit.setText(u);
        }
        else {
            holder.unit.setVisibility(View.GONE);
        }
        holder.name.setText(ingredientList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return ingredientList.size();
    }
}
