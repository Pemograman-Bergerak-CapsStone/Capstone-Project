package com.example.listgame.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listgame.DetailActivity;
import com.example.listgame.R;
import com.example.listgame.model.MainDataModel;
import com.example.listgame.model.MainModel;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private Context context;
    private List<MainModel> mainModel = new ArrayList<>();

    public MainAdapter(Context context, List<MainModel> mainModel) {
        this.context = context;
        this.mainModel = mainModel;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_game, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        MainModel mainModels = mainModel.get(position);
        holder.namaGame.setText(mainModels.getName());
        holder.year.setText(String.valueOf(mainModels.getYear()));
        holder.games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("nama_game", holder.namaGame.getText().toString().trim());
                intent.putExtra("tahun_rilis", holder.year.getText().toString().trim());
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return mainModel.size();
    }

    public void updateData(List<MainModel> gamesList) {
        this.mainModel = gamesList;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView namaGame;
        private TextView year;
        private CardView games;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaGame = itemView.findViewById(R.id.tv_nama_game);
            year = itemView.findViewById(R.id.tv_year);
            games = itemView.findViewById(R.id.games);
        }
    }
}
