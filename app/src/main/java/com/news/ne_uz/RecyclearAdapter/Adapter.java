package com.news.ne_uz.RecyclearAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.news.ne_uz.News.News;
import com.news.ne_uz.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    ArrayList<News> ArrayList;
    Context context;

    public Adapter(java.util.ArrayList<News> arrayList, Context context) {
        ArrayList = arrayList;
        this.context = context;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclearview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        News news = ArrayList.get(position);
        Glide.with(context).load(news.getUrlToImage()).into(holder.imageView);
        holder.Source.setText(news.getSource());
        holder.Title.setText(news.getTitle());
    }

    @Override
    public int getItemCount() {
        return ArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView Source;
        public TextView Title;
        public CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            Source = itemView.findViewById(R.id.Source);
            Title = itemView.findViewById(R.id.Title);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
