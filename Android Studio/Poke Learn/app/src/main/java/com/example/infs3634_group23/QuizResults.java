package com.example.infs3634_group23;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.infs3634_group23.Quiz.MyPREFERENCES;


//results page for quiz
public class QuizResults extends AppCompatActivity {

    TextView score, flavour;
    Button goBack;
    ImageView resultImg;
    SharedPreferences sharedPreferences;
    private QuizViewModel mQuizViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        sharedPreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        score = (TextView) findViewById(R.id.result_score);
        goBack = (Button) findViewById(R.id.back_to_quizzes);
        resultImg = findViewById(R.id.resultgif);
        flavour = findViewById(R.id.flavour_text);

        Intent intent = getIntent();
        Bundle extra = intent.getExtras();
        final int mark = extra.getInt("score");
        final int quizNo = extra.getInt("code");
        final int currentMark = extra.getInt("currMark");

        mQuizViewModel = new ViewModelProvider(this).get(QuizViewModel.class);

        if(quizNo == 0){
            if(mark>currentMark) {
                QuizRoomDB quizRoomDB = QuizRoomDB.getDatabase(this);
                QuizRoom quizRoom = new QuizRoom("QUIZ 1", mark);


                mQuizViewModel = new ViewModelProvider(this).get(QuizViewModel.class);
                mQuizViewModel.update(quizRoom);
            }
        }
        if(quizNo == 1){
            if(mark>currentMark) {
                QuizRoomDB quizRoomDB = QuizRoomDB.getDatabase(this);
                QuizRoom quizRoom = new QuizRoom("QUIZ 2", mark);


                mQuizViewModel = new ViewModelProvider(this).get(QuizViewModel.class);
                mQuizViewModel.update(quizRoom);
            }
        }
        if(quizNo == 2){
            if(mark>currentMark) {
                QuizRoomDB quizRoomDB = QuizRoomDB.getDatabase(this);
                QuizRoom quizRoom = new QuizRoom("QUIZ 3", mark);


                mQuizViewModel = new ViewModelProvider(this).get(QuizViewModel.class);
                mQuizViewModel.update(quizRoom);
            }
        }
        if(quizNo == 3){
            if(mark>currentMark) {
                QuizRoomDB quizRoomDB = QuizRoomDB.getDatabase(this);
                QuizRoom quizRoom = new QuizRoom("QUIZ 4", mark);


                mQuizViewModel = new ViewModelProvider(this).get(QuizViewModel.class);
                mQuizViewModel.update(quizRoom);
            }
        }
        if(quizNo == 4){
            if(mark>currentMark) {
                QuizRoomDB quizRoomDB = QuizRoomDB.getDatabase(this);
                QuizRoom quizRoom = new QuizRoom("QUIZ 5", mark);


                mQuizViewModel = new ViewModelProvider(this).get(QuizViewModel.class);
                mQuizViewModel.update(quizRoom);
            }
        }
        if(quizNo == 5){
            if(mark>currentMark) {
                QuizRoomDB quizRoomDB = QuizRoomDB.getDatabase(this);
                QuizRoom quizRoom = new QuizRoom("QUIZ 6", mark);


                mQuizViewModel = new ViewModelProvider(this).get(QuizViewModel.class);
                mQuizViewModel.update(quizRoom);
            }
        }
        if(quizNo == 6){
            if(mark>currentMark) {
                QuizRoomDB quizRoomDB = QuizRoomDB.getDatabase(this);
                QuizRoom quizRoom = new QuizRoom("QUIZ 7", mark);


                mQuizViewModel = new ViewModelProvider(this).get(QuizViewModel.class);
                mQuizViewModel.update(quizRoom);
            }
        }
        if(quizNo == 7){
            if(mark>currentMark) {
                QuizRoomDB quizRoomDB = QuizRoomDB.getDatabase(this);
                QuizRoom quizRoom = new QuizRoom("QUIZ 8", mark);


                mQuizViewModel = new ViewModelProvider(this).get(QuizViewModel.class);
                mQuizViewModel.update(quizRoom);
            }
        }
        if(quizNo == 8){
            if(mark>currentMark) {
                QuizRoomDB quizRoomDB = QuizRoomDB.getDatabase(this);
                QuizRoom quizRoom = new QuizRoom("QUIZ 9", mark);


                mQuizViewModel = new ViewModelProvider(this).get(QuizViewModel.class);
                mQuizViewModel.update(quizRoom);
            }
        }


        if(mark==0){
            resultImg.setImageResource(R.drawable.result0);
            flavour.setText("Have you looked at the learn section yet?");
        }
        if(mark==1){
            resultImg.setImageResource(R.drawable.result1);
            flavour.setText("Chin up. You just need to revise a bit more!");
        }
        if(mark==2){
            resultImg.setImageResource(R.drawable.result2);
            flavour.setText("Passed! But you can do better next time!");
        }
        if(mark==3){
            resultImg.setImageResource(R.drawable.result3);
            flavour.setText("Hurry! So close to full marks!");
        }
        if(mark==4){
            resultImg.setImageResource(R.drawable.result4);
            flavour.setText("You're a java champion. Keep it up!");
        }

        score.setText("You Scored: "+ mark + "/4");





        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizResults.this, Quiz.class);
                startActivity(intent);
            }
        });


    }

}
