package com.example.listgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.listgame.adapter.MainAdapter;
import com.example.listgame.model.ResultsItem;
import com.example.listgame.model.RootGamesModel;
import com.example.listgame.rest.ApiConfig;
import com.example.listgame.rest.ApiService;

import java.util.ArrayList;

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
}
