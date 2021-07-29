package com.example.apiappdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ClassAdapter adapter;
    private RecyclerView recyclerView;
    private ProgressBar progressBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progress_bar);

        Api api = RetrofitInstance.getRetrofitInstance().create(Api.class);

        Call<TrnsList> call = api.getTrnsData();
        call.enqueue(new Callback<TrnsList>() {
            @Override
            public void onResponse(Call<TrnsList> call, Response<TrnsList> response) {
                progressBar.setVisibility(View.GONE);
                generateTrnsList(response.body().getTrnsArrayListList());

            }

            @Override
            public void onFailure(Call<TrnsList> call, Throwable t) {

            }
        });
    }

    private void generateTrnsList(ArrayList<Trns> trnsArrayListList) {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        adapter = new ClassAdapter(trnsArrayListList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }
}