package com.example.listgame.adapter;

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
import com.example.listgame.DetailActivity;
import com.example.listgame.R;
import com.example.listgame.model.ResultsItem;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private Context context;
    private ArrayList<ResultsItem> resultsItems;

    public MainAdapter(Context context, ArrayList<ResultsItem> resultsItems) {
        this.context = context;
        this.resultsItems = resultsItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.nama_game.setText(resultsItems.get(position).getName());
        holder.year.setText(resultsItems.get(position).getReleased());
        Glide.with(context).load(resultsItems.get(position).getBackgroundImage()).error(R.drawable.error_logo)
                .override(512,512)
                .into(holder.imageView);
        holder.games.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("title",resultsItems.get(position).getName());
                intent.putExtra("tahun rilis",resultsItems.get(position).getReleased());
                intent.putExtra("imageUrl",resultsItems.get(position).getBackgroundImage());
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return resultsItems.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView nama_game;
        private TextView year;
        private CardView games;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            nama_game = itemView.findViewById(R.id.tv_nama_game);
            year = itemView.findViewById(R.id.tv_year);
            games = itemView.findViewById(R.id.games);
        }
    }
}
