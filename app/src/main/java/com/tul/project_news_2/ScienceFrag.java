package com.tul.project_news_2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ScienceFrag extends Fragment {


    String api = "59886d9a676a4753ae3e07d0ffc6c4a4";
    ArrayList<NewsModal> modalArrayList;
    Adapter adapter;
    String country = "in";
    private RecyclerView recyclerViewScience;
    private String category = "science";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.science_fragment,null);

        recyclerViewScience = v.findViewById(R.id.recycleScience);
        modalArrayList = new ArrayList<>();
        recyclerViewScience.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(getContext(),modalArrayList);
        recyclerViewScience.setAdapter(adapter);

        findNews();


        return v;
    }

    private void findNews() {

        RetroFit.getApiInterface().getCategoryNews(country,category,100,api).enqueue(new Callback<DetailNews>() {
            @Override
            public void onResponse(Call<DetailNews> call, Response<DetailNews> response) {
                if(response.isSuccessful()){
                    modalArrayList.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<DetailNews> call, Throwable t) {

            }
        });

    }
}
