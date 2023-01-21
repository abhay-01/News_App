package com.tul.project_news_2;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFit {

    private static Retrofit retroFit = null;

    public static Api getApiInterface() {

        if (retroFit == null) {
            retroFit = new Retrofit.Builder()
                    .baseUrl(Api.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retroFit.create(Api.class);

    }
}
