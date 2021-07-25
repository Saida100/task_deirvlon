package com.saida_aliyeva.task_deirvlon;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.saida_aliyeva.task_deirvlon.activities.ContentActivity;
import com.saida_aliyeva.task_deirvlon.adapter.RVAdapter;
import com.saida_aliyeva.task_deirvlon.classes.ApiInit;
import com.saida_aliyeva.task_deirvlon.interfaces.ApiInterface;
import com.saida_aliyeva.task_deirvlon.interfaces.OnItemClickListener;
import com.saida_aliyeva.task_deirvlon.model.Newsfeed;
import com.saida_aliyeva.task_deirvlon.model.Root;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    List<Newsfeed> newsfeeds ;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    ApiInterface apiInterface;
    RVAdapter rvAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newsfeeds = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerview);
        linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        apiInterface = new ApiInit().initRetrofit().getClient();
        apiInterface.getData("application/json", "deirvlon").enqueue(new Callback<Root>() {
            @Override
            public void onResponse(Call<Root> call, Response<Root> response) {
                Root root = new Root();
                if (response.code() == 200) {
                    root = response.body();
                    newsfeeds.addAll(root.getNewsfeed());

                }

                recyclerView.setLayoutManager(linearLayoutManager);
                rvAdapter = new RVAdapter(newsfeeds, getApplicationContext(), new OnItemClickListener() {
                    @Override
                    public void onItemClick(Newsfeed newsfeed) {
                        Bundle bundle=new Bundle();
                        bundle.putString("text",newsfeed.getText());
                        Intent intent=new Intent(MainActivity.this, ContentActivity.class);
                        intent.putExtras(bundle);
                        startActivity(intent);
                      //  Toast.makeText(MainActivity.this, newsfeed.getText(), Toast.LENGTH_SHORT).show();
                    }
                });
                recyclerView.setAdapter(rvAdapter);
            }

            @Override
            public void onFailure(Call<Root> call, Throwable t) {
                t.printStackTrace();
                Log.e("Saida", t.getMessage());
            }


        });


    }
}