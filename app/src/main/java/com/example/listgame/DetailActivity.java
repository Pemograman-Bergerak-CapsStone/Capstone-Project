package com.example.listgame;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DetailActivity extends  AppCompatActivity{
    private TextView namaGame;
    private TextView year;
    private ImageView ivDetail;
    private TextView rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        initView();


        getSupportActionBar().setTitle(getIntent().getStringExtra("title"));
        namaGame.setText("Nama Game:" +getIntent().getStringExtra("title"));
        rating.setText(getIntent().getStringExtra("rating"));
        year.setText("Tahun Rilis:"+getIntent().getStringExtra("tahun rilis"));
        Glide.with(getApplicationContext()).load(getIntent().getStringExtra("imageUrl")).error(R.drawable.error_logo)
                .override(512,512)
                .into(ivDetail);

    }

    private void initView() {
        ivDetail = findViewById(R.id.iv_detail);
        namaGame = findViewById(R.id.tv_nama_game);
        year = findViewById(R.id.tv_year);
        rating = findViewById(R.id.tv_rating);
    }


}
