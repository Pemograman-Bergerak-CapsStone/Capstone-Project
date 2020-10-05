package com.example.listgame;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class DetailActivity extends  AppCompatActivity{
    private TextView namaGame;
    private TextView year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        initView();
        namaGame.setText(getIntent().getStringExtra("nama_game"));
        year.setText(getIntent().getStringExtra("tahun_rilis"));

    }

    private void initView() {
        namaGame = findViewById(R.id.tv_nama_game);
        year = findViewById(R.id.tv_year);
    }

}
