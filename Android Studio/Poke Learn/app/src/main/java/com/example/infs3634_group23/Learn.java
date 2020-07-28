package com.example.infs3634_group23;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;

//learn homepage
public class Learn extends AppCompatActivity {

    private List<LearnDB> getList = LearnDB.getLearn();
    private RecyclerView list;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    ImageView apiButton;
    private static final String TAG = "ExamplesLandingPage";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        Log.d(TAG, "onCreate: Starting");

        // find view from layout resource file
        apiButton = (ImageView) findViewById(R.id.apiButton);
        //connect to recyclerview xml
        list = findViewById(R.id.learn_list);
        //getting data from coin
        mAdapter = new LearnAdapter(this, getList);
        //connect adapter
        list.setAdapter(mAdapter);
        //default layout manager
        list.setLayoutManager(new LinearLayoutManager(this));

        apiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: usefulVideos imageView clicked");
                Intent intent = new Intent(Learn.this, YoutubeLandingPage.class);
                startActivity(intent);
                Log.d(TAG, "onClick: apiButton intent launch");
            }
        });

        //init nav bar and variables
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);

        //Set main as home page
        bottomNavigationView.setSelectedItemId(R.id.learn);
        //itemselected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.learn:
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.quiz:
                        startActivity(new Intent(getApplicationContext(), Quiz.class));
                        overridePendingTransition(0,0);
                        return true;
                }

                return false;
            }
        });
    }
}
