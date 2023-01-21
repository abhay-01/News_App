package com.tul.project_news_2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    ArrayList<NewsModal> modalClass;

    public Adapter(Context context, ArrayList<NewsModal> modalClass) {
        this.context = context;
        this.modalClass = modalClass;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item,null,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, webView.class);
                intent.putExtra("url",modalClass.get(position).getUrl());
                context.startActivity(intent);
            }
        });

        holder.time.setText("Published at:-" + modalClass.get(position).getPublished());
        holder.author.setText(modalClass.get(position).getAuthor());
        holder.title.setText(modalClass.get(position).getTitle());
        holder.description.setText(modalClass.get(position).getDesc());
        Glide.with(context).load(modalClass.get(position).getUrlToImage()).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return modalClass.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title,description,author,time;
        CardView cardView;
        ImageView imageView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.newsTitle);
            description = itemView.findViewById(R.id.desc);
            author = itemView.findViewById(R.id.auhor);
           time = itemView.findViewById(R.id.time);
           cardView = itemView.findViewById(R.id.cardview);
           imageView = itemView.findViewById(R.id.image);
        }
    }
}
