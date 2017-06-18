package com.esraakhaled.recipes.data.remote;

import com.esraakhaled.recipes.data.models.Recipe;
import com.esraakhaled.recipes.data.models.RecipeSearch;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Esraa Khaled on 6/17/2017.
 */

public interface RecipeAPI {
    String BASE_URL = "http://api2.bigoven.com/";
    @GET("recipes")
    Call<RecipeSearch> getRecipes(@Query("pg")int from,
                                  @Query("rpp") int count,
                                  @Query("api_key") String apiKey);

    @GET("recipes")
    Call<RecipeSearch> getRecipes(@Query("pg")int from,
                                  @Query("rpp") int count,
                                  @Query("title_kw") String keyWord,
                                  @Query("api_key") String apiKey);
    @GET("recipe/{id}")
    Call<Recipe> getRecipe(@Path("id") int ID,
                           @Query("api_key") String apiKey);


    class RecipesFetcher{
        private static RecipeAPI service;
        public static RecipeAPI getInstance(){
            if (service==null) {

                Retrofit retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BASE_URL)
                    .build();
            service = retrofit.create(RecipeAPI.class);
            return service;
            } else {
                return service;
            }
        }
    }
}
