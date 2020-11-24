package com.example.listgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.listgame.adapter.MainAdapter;
import com.example.listgame.alarm.AlarmActivity;
import com.example.listgame.model.ResultsItem;
import com.example.listgame.model.RootGamesModel;
import com.example.listgame.rest.ApiConfig;
import com.example.listgame.rest.ApiService;

import java.util.ArrayList;
import java.util.Calendar;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private MainAdapter mainAdapter;
    private ArrayList<ResultsItem> resultsItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        resultsItems = new ArrayList<>();

        getData();

    }

    private void initView() {
        rv = findViewById(R.id.recyclerview);
    }

    private void getData() {
        ApiService apiService = ApiConfig.getApiService();
        apiService.getData()
                .enqueue(new Callback<RootGamesModel>() {
                    @Override
                    public void onResponse(Call<RootGamesModel> call, Response<RootGamesModel> response) {
                        if(response.isSuccessful()){
                            resultsItems = response.body().getResults();
                            mainAdapter = new MainAdapter(getApplicationContext(), resultsItems);
                            rv.setAdapter(mainAdapter);
                            rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        }
                    }

                    @Override
                    public void onFailure(Call<RootGamesModel> call, Throwable t) {
                        Toast.makeText(MainActivity.this,"" + t.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_about) {
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);
            return true;
        } else if (item.getItemId() == R.id.action_notif) {
            Intent intent = new Intent(MainActivity.this, AlarmActivity.class);
            startActivity(intent);
            return true;
        } else if(item.getItemId() == R.id.action_logout){
            Intent intent = new Intent(MainActivity.this,LogoutActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
