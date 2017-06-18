package com.esraakhaled.recipes;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.esraakhaled.recipes.adapter.EndlessRecyclerViewScrollListener;
import com.esraakhaled.recipes.adapter.RecipesAdapter;
import com.esraakhaled.recipes.data.models.RecipeSearch;
import com.esraakhaled.recipes.data.models.Result;
import com.esraakhaled.recipes.data.remote.RecipeAPI;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    final static String API_KEY ="axV15293h59oU9Z853fw48CmI1H1Js";
    int code =1;
    String searchWord="";

    List<Result> results,newResults;
    FloatingActionButton search;
    int NUMBER_OF_RECIPES_TO_FETCH = 15;
    int currentPage=0;
    boolean scrolling=false;
    RecyclerView recipesPreview;
    RecyclerView.LayoutManager layoutManager;
    RecipesAdapter recipesAdapter;
    EndlessRecyclerViewScrollListener scrollListener;

    SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        swipeRefreshLayout= (SwipeRefreshLayout) findViewById(R.id.swipe);

        ImageLoader.getInstance().init(ImageLoaderConfiguration.createDefault(MainActivity.this));
        recipesPreview = (RecyclerView) findViewById(R.id.recipes_preview);
        layoutManager = new LinearLayoutManager(MainActivity.this);
        recipesPreview.setLayoutManager(layoutManager);

        //Endless Scrolling
        scrollListener= new EndlessRecyclerViewScrollListener((LinearLayoutManager) layoutManager) {
            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                currentPage = page;
                scrolling=true;
                getRecipesFromAPI();
            }
        };
        recipesPreview.addOnScrollListener(scrollListener);

        //swipe refresh
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener(){
            @Override
            public void onRefresh() {
                recipesAdapter.clear();
                currentPage=0;
                scrolling=false;
                getRecipesFromAPI();
                swipeRefreshLayout.setRefreshing(false);
            }
        });

        getRecipesFromAPI();

        //Search Box
        search= (FloatingActionButton) findViewById(R.id.floatingSearch);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder searchDialog =new AlertDialog.Builder(new ContextThemeWrapper(MainActivity.this, R.style.AlertDialogCustom));
                searchDialog.setTitle("Search Recipes");
                searchDialog.setMessage("Enter search word");
                searchDialog.setIcon(R.drawable.search_small);
                final EditText searchbox = new EditText(MainActivity.this);
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
                searchbox.setLayoutParams(lp);
                searchDialog.setView(searchbox);

                searchDialog.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        searchWord = searchbox.getText().toString();
                        if (searchWord.equals("") ) {
                            Toast.makeText(MainActivity.this, "Please Enter a valid Search word!", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            code = 2;
                            currentPage=0;
                            scrolling=false;
                            recipesAdapter.clear();
                            getRecipesFromAPI();
                            dialog.dismiss();
                        }
                    }
                });
                searchDialog.setNegativeButton("Cancel",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        code=1;
                        dialog.cancel();
                        getRecipesFromAPI();
                    }
                });
                searchDialog.show();
            }

        });




        //land scape mode
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
            recipesPreview.setLayoutManager(layoutManager);

            //Endless Scrolling
            scrollListener= new EndlessRecyclerViewScrollListener((StaggeredGridLayoutManager) layoutManager) {
                @Override
                public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                    currentPage = page;
                    scrolling=true;
                    getRecipesFromAPI();
                }
            };
            recipesPreview.addOnScrollListener(scrollListener);
        }
        //portrait mode
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {

            layoutManager = new LinearLayoutManager(MainActivity.this);
            recipesPreview.setLayoutManager(layoutManager);

            //Endless Scrolling
            scrollListener = new EndlessRecyclerViewScrollListener((LinearLayoutManager) layoutManager) {
                @Override
                public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                    currentPage = page;
                    scrolling = true;
                    getRecipesFromAPI();
                }
            };
            recipesPreview.addOnScrollListener(scrollListener);
        }
    }

    public void getRecipesFromAPI() {
        final ProgressDialog dialog = new ProgressDialog(this, AlertDialog.THEME_DEVICE_DEFAULT_DARK);
        if (!scrolling) {
            dialog.setMessage("Loading , Please wait...");
            dialog.setIndeterminate(true);
            dialog.setCancelable(false);
            dialog.show();
        }
        if (code==1) {
            RecipeAPI.RecipesFetcher.getInstance().getRecipes(((currentPage*NUMBER_OF_RECIPES_TO_FETCH)+1), NUMBER_OF_RECIPES_TO_FETCH, API_KEY).enqueue(new Callback<RecipeSearch>() {
                @Override
                public void onResponse(Call<RecipeSearch> call, Response<RecipeSearch> response) {
                    if (response.isSuccessful()) {
                        if (scrolling) {
                            dialog.dismiss();
                            newResults=response.body().getResults();
                            int oldSize=results.size();
                            results.addAll(newResults);
                            recipesAdapter.notifyItemRangeInserted(oldSize, newResults.size());
                        }
                        else {
                            dialog.dismiss();
                            results=response.body().getResults();
                            recipesAdapter = new RecipesAdapter(results,recipesPreview, MainActivity.this);
                            recipesPreview.setAdapter(recipesAdapter);
                        }

                    } else {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "Something went wrong!", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<RecipeSearch> call, Throwable t) {
                    dialog.dismiss();
                    Toast.makeText(MainActivity.this, "Check your Internet Connection!", Toast.LENGTH_SHORT).show();
                }
            });
        }
        else if (code ==2){
            RecipeAPI.RecipesFetcher.getInstance().getRecipes(((currentPage*NUMBER_OF_RECIPES_TO_FETCH)+1),NUMBER_OF_RECIPES_TO_FETCH,searchWord,API_KEY).enqueue(new Callback<RecipeSearch>() {
                @Override
                public void onResponse(Call<RecipeSearch> call, Response<RecipeSearch> response) {
                    if (response.isSuccessful()) {
                        if (scrolling) {
                            dialog.dismiss();
                            newResults=response.body().getResults();
                            int oldSize=results.size();
                            results.addAll(newResults);
                            recipesAdapter.notifyItemRangeInserted(oldSize, newResults.size());
                        }
                        else {
                            dialog.dismiss();
                            results=response.body().getResults();
                            recipesAdapter = new RecipesAdapter(results,recipesPreview, MainActivity.this);
                            recipesPreview.setAdapter(recipesAdapter);
                        }
                    }
                    else {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "Something went wrong!", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<RecipeSearch> call, Throwable t) {
                    dialog.dismiss();
                    Toast.makeText(MainActivity.this, "Check your Internet Connection!", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}
