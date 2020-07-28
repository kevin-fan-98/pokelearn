package com.example.infs3634_group23;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.SharedPreferences;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;


//quiz main page
public class Quiz extends AppCompatActivity {

                    private QuizViewModel quizViewModel;
                    //private Button testButton;
                    //private List<QuizRoom> getList;
                    //private RecyclerView list;
                    //private RecyclerView.Adapter mAdapter;
                    //private RecyclerView.LayoutManager layoutManager;



                    private QuizViewModel mQuizViewModel;

                    public static final String MyPREFERENCES = "MyPrefs";

                    SharedPreferences sharedPreferences;




                    @Override
                    protected void onCreate(Bundle savedInstanceState) {
                        super.onCreate(savedInstanceState);
                        setContentView(R.layout.activity_quiz);


                        RecyclerView recyclerView = findViewById(R.id.quiz_list);
                        final QuizAdapter adapter = new QuizAdapter(this);
                        recyclerView.setAdapter(adapter);
                        recyclerView.setLayoutManager(new LinearLayoutManager(this));

                        mQuizViewModel = new ViewModelProvider(this).get(QuizViewModel.class);
                        mQuizViewModel.getAllQuiz().observe(this, new Observer<List<QuizRoom>>() {
                            @Override
                            public void onChanged(List<QuizRoom> quizRooms) {
                                adapter.setQuizzes(quizRooms);
                            }
                        });



                        //init nav bar and variables
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);

        //Set main as home page
        bottomNavigationView.setSelectedItemId(R.id.quiz);
        //itemselected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.learn:
                        startActivity(new Intent(getApplicationContext(), Learn.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.quiz:
                        return true;
                }

                return false;
            }
        });
    }




}
