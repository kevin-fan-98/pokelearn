package com.example.infs3634_group23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.infs3634_group23.topics.LearnArr;
import com.example.infs3634_group23.topics.LearnCond;
import com.example.infs3634_group23.topics.LearnFor;
import com.example.infs3634_group23.topics.LearnMath;
import com.example.infs3634_group23.topics.LearnMathClass;
import com.example.infs3634_group23.topics.LearnSwitch;
import com.example.infs3634_group23.topics.LearnSyntax;
import com.example.infs3634_group23.topics.LearnTern;
import com.example.infs3634_group23.topics.LearnVariables;
import com.example.infs3634_group23.topics.LearnWhile;

import java.util.ArrayList;


//topics for each learn module
public class LearnContent extends AppCompatActivity {

    Button content1, content2, content3;
    ImageView bg1, bg2, bg3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_content);

        content1 = findViewById(R.id.content1);
        content2 = findViewById(R.id.content2);
        content3 = findViewById(R.id.content3);

        Intent intent = getIntent();
        Bundle extra = intent.getExtras();
        final int position = extra.getInt("content");

        LearnDB temp = new LearnDB();

        ArrayList<LearnDB> temp2 = new ArrayList<>();
        temp2 = temp.getLearn();

        LearnDB enter = temp2.get(position);
        final String parseText1 = enter.getTopic1();
        final String parseText2 = enter.getTopic2();
        final String parseText3 = enter.getTopic3();

        /*if(parseText.equals("Syntax")){
            .setVisibility(View.GONE);
        }*/



        content1.setText(enter.getTopic1());
        content2.setText(enter.getTopic2());
        content3.setText(enter.getTopic3());

        //content1.setBackgroundColor(Color.parseColor("#00c3ff"));

        if(position == 3){
            content1.setVisibility(View.INVISIBLE);
            content3.setVisibility(View.INVISIBLE);
        }


        content1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(parseText1.equals("Syntax")){
                    startActivity(new Intent(getApplicationContext(), LearnSyntax.class));
                }
                if(parseText1.equals("Mathematical Notations")){
                    startActivity(new Intent(getApplicationContext(), LearnMath.class));
                }
                if(parseText1.equals("While Loops")){
                    startActivity(new Intent(getApplicationContext(), LearnWhile.class));
                }

            }
        });

        content2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(parseText2.equals("Variables")){
                    startActivity(new Intent(getApplicationContext(), LearnVariables.class));
                }
                if(parseText2.equals("Conditional Statements")){
                    startActivity(new Intent(getApplicationContext(), LearnCond.class));
                }
                if(parseText2.equals("For Loops")){
                    startActivity(new Intent(getApplicationContext(), LearnFor.class));
                }
                if(parseText2.equals("Arrays")){
                    startActivity(new Intent(getApplicationContext(), LearnArr.class));
                }

            }
        });

        content3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(parseText3.equals("Java Math Class")){
                    startActivity(new Intent(getApplicationContext(), LearnMathClass.class));
                }
                if(parseText3.equals("Ternary Operators")){
                    startActivity(new Intent(getApplicationContext(), LearnTern.class));
                }
                if(parseText3.equals("Switch Statements")){
                    startActivity(new Intent(getApplicationContext(), LearnSwitch.class));
                }

            }
        });




    }
}
