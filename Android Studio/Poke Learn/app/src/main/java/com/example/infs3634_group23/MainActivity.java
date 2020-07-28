package com.example.infs3634_group23;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;



//main page, with pokemon character and leveling stats
public class MainActivity extends AppCompatActivity {
    TextView xp, lvl;
    ProgressBar bar;
    //Button lvlUp;
    ArrayList<CharacterDB> temp = new ArrayList <>();
    ImageView pokemon;
    QuizViewModel mQuizViewModel;
    private List<QuizRoom> mQuiz;
    private QuizRoomDB mDB;
    MainViewModel mMainViewModel;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //setting xml references
        xp = findViewById(R.id.xp_number);
        lvl = findViewById(R.id.level);
        bar = findViewById(R.id.xp_bar);




        new getXp().execute();

        /*//xp levelling logic
        int rawXp = enter.getExp();
        //int rawXp = total;
        int adjustedXp = rawXp%4;
        xp.setText(adjustedXp + "/4xp");
        int adjustedLvl = rawXp/4;
        lvl.setText("Level " + adjustedLvl);

        //setting progress bar with respect to xp
        double progPercent = (double)adjustedXp/4;
        int progFinal = (int)(progPercent*100);
        //lvl.setText("Testing " + progFinal);
        xpBar.setProgress(progFinal);*/


        //test leveling system with button that adds 1 xp
        /*lvlUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });*/


        //Change pokemon form when certain level is hit.
        pokemon = findViewById(R.id.gif);
        /*if(adjustedLvl == 1){
            pokemon.setImageResource(R.drawable.sprite4);
        }
        if(adjustedLvl == 5){
            pokemon.setImageResource(R.drawable.sprite5);
        }
        if(adjustedLvl == 9){
            pokemon.setImageResource(R.drawable.sprite6);
        }*/


        //init nav bar and variables
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);

        //Set main as home page
        bottomNavigationView.setSelectedItemId(R.id.home);
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


    public class getXp extends AsyncTask<Void, Void, Integer>{

        @Override
        protected Integer doInBackground(Void... voids) {
            mDB = Room.databaseBuilder(getApplicationContext(), QuizRoomDB.class, "quiz_database").build();
            int sum = mDB.quizDao().getSumScore();
            return sum;

        }

        @Override
        protected void onPostExecute(Integer sum) {
            try {
                int adjustedXp = sum%4;
                xp.setText(adjustedXp +"/4xp");
                int adjustedLvl = sum/4;
                lvl.setText("Level " + adjustedLvl);
                double progPercent = (double)adjustedXp/4;
                int progFinal = (int)(progPercent*100);
                bar.setProgress(progFinal);

                if(adjustedLvl >= 1){
                    pokemon.setImageResource(R.drawable.sprite4);
                }
                if(adjustedLvl >= 4 ){
                    pokemon.setImageResource(R.drawable.sprite5);
                }
                if(adjustedLvl >= 7){
                    pokemon.setImageResource(R.drawable.sprite6);
                }


            }catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }


}
