package com.example.listgame;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends  AppCompatActivity{
    private TextView namaGame;
    private TextView year;
    private ImageView ivDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        initView();
        namaGame.setText(getIntent().getStringExtra("title"));
        year.setText(getIntent().getStringExtra("tahunrilis"));
        Glide.with(getApplicationContext()).load(getIntent().getStringExtra("imageUrl")).error(R.drawable.error_logo)
                .override(512,512)
                .into(ivDetail);

    }

    private void initView() {
        ivDetail = findViewById(R.id.image_view);
        namaGame = findViewById(R.id.tv_nama_game);
        year = findViewById(R.id.tv_year);
    }

}
