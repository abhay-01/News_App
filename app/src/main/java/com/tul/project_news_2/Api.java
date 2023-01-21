package com.tul.project_news_2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    String BASE_URL = "https://newsapi.org/v2/";

    @GET("top-headlines")

        Call<DetailNews> getNews(
                @Query("country") String country,
                @Query("pageSize") int pagesize,
                @Query("apiKey") String apikey
                );

    @GET("top-headlines")

    Call<DetailNews> getCategoryNews(
            @Query("country") String country,
            @Query("category") String category,
            @Query("pageSize") int pagesize,
            @Query("apiKey") String apikey
    );

}
