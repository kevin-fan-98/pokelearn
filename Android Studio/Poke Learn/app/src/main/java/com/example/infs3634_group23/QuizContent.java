package com.example.infs3634_group23;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.infs3634_group23.QuizContent;
import com.example.infs3634_group23.QuizDB;
import com.example.infs3634_group23.QuizResults;
import com.example.infs3634_group23.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


//content for quiz
public class QuizContent extends AppCompatActivity {

    ImageView imageView;
    Button nextBtn;
    EditText editText;
    TextView qText;

    int curr = 0;
    int currTemp = 0;


    RadioGroup radioGroup;
    RadioButton ans1;
    RadioButton ans2;
    RadioButton ans3;
    RadioButton ans4;


    //inserting quiz questions to db
    QuizDB[] qBank = new QuizDB[]{
            //quiz 1
            new QuizDB("1. What is a correct syntax to output \"Hello World\" in Java?", "System.out.println(\"Hello World\"); ", "print (\"Hello World\");", "Console.WriteLine(\"Hello World\");", "echo(\"Hello World\");", null, 'M'),
            new QuizDB("2. Java is short for \"JavaScript\".", "False", "True", null, null, null, 'T'),
            new QuizDB("3. How do you insert COMMENTS in Java code?","// This is a comment", "/* This is a comment", "# This is a comment", "[] This is a comment", null, 'M'),
            new QuizDB("4. Which data type is used to create a variable that should store text?", "String", "string ", "Txt", "myString", null, 'M'),
            //quiz2
            new QuizDB("1. How do you create a variable with the numeric value 5?", "int x = 5;", "x = 5;", "float x = 5;", "num x = 5", null, 'M'),
            new QuizDB("2. Which method can be used to find the length of a string?", "getLength()", "length()", "getSize()", "len()", null, 'M'),
            new QuizDB("3. How do you create a method in Java?","methodName()", "methodName.", "methodName[]", "(methodName)", null, 'M'),
            new QuizDB("4. Which method can be used to find the highest value of x and y?", "Math.max(x,y)", "Math.maximum(x,y)", "Math.largest(x,y)", "Math.maxNum(x,y)", null, 'M'),
            //quiz 3
            new QuizDB("1. Which operator is used to multiply numbers?", "*", "%", "x", "#", null, 'M'),
            new QuizDB("2. Which of the following is a correct header line for main in a Java program?", "public static void main(String [ ] args", "public static void main(args)", "public static void main(String args)", "public static void main(args [ ])", null, 'M'),
            new QuizDB("3. Java is case sensitive?","True", "False", null, null, null, 'T'),
            new QuizDB("4. All statements must end with:", "semi colon (;)", "full stop (.)", "comma (,)", "exclamation mark (!)", null, 'M'),
            //quiz 4
            new QuizDB("1. Which operator can be used to compare two values?", "==", "><", "=", "<>", null, 'M'),
            new QuizDB("2. How do you start writing an if statement in Java?", "if (x > y)", "if x > y:", "if x > y then:", "if x greater than y", null, 'M'),
            new QuizDB("3. How do you start writing a while loop in Java?","while (x > y)", "x > y while {", "while x > y:", "while x > y {", null, 'M'),
            new QuizDB("4. What will be the output of the program above?", "i = 5 and j = 6", "i = 6 and j = 5", "i = 5 and j = 5", "i = 6 and j = 4", R.drawable.quiz4question4, 'M'),
            //quiz 5
            new QuizDB("1. What will be the output of the program above?", "51", "41", "42", "50", R.drawable.quiz5question1, 'M'),
            new QuizDB("2. What will be the output of the program above?", "c", "a", "b", "d", R.drawable.quiz5question2, 'M'),
            new QuizDB("3. What will be the output of the program above?","tRuEfalse", "falsefalse", "tRuEtRuE", "falseTruE", R.drawable.quiz5question3, 'M'),
            new QuizDB("4. What will happen when you compile and run the following code?", "2 will be printed", "1 will be printed", "3 will be printed", "nothing will be printed", R.drawable.quiz5question4, 'M'),
            //quiz 6
            new QuizDB("1. Consider the above code. What is the output?", "hihihi", null, null, null, R.drawable.quiz6question1, 'S'),
            new QuizDB("2. Consider the above code. What is the output?", "hihihibye", null, null, null, R.drawable.quiz6question2, 'S'),
            new QuizDB("3. What is the expression that is executed by the for loop only once, regardless of the number of iterations?","initialisation",null , null, null, null, 'S'),
            new QuizDB("4. The while loop is what type of loop?", "Pre-test loop", "Post-test loop", "Recursive loop", "Simple loop", null, 'M'),
            //quiz 7
            new QuizDB("1. Consider the above code. What is the output?", "3 4 5 6 7 8 9", null, null, null, R.drawable.quiz7question1, 'S'),
            new QuizDB("2. What is the break keyword used for?", "Exit an iteration", "Starts a loop", "Increment variable", "Break the code", null, 'M'),
            new QuizDB("3. What is the format of a for loop?","A","B" , "C", "D", R.drawable.quiz7question3, 'M'),
            new QuizDB("4. The initialisation expression in a for loop.", "Is used to initialise a control variable to its starting value", "Is normally used to initialize a test which controls the expression of the loop.", "Is normally used to initialize an update of a variable.", "Is just a term used to describe the start of every iteration", null, 'M'),
            //quiz 8
            new QuizDB("1. What is the return value of value[5]?", "8", "4", "9", "12", R.drawable.quiz8question1, 'M'),
            new QuizDB("2. What is the value of array.length?", "7", "8", "9", "6", R.drawable.quiz8question1, 'M'),
            new QuizDB("3. Which of the following correctly initializes an array to contain four elements each with value 0?","I & II & III","II only" , "III only", "I only", R.drawable.quiz8question3, 'M'),
            new QuizDB("4. Given the following method, what would test return if: a = {0, 2, 3, 4} and v = 1?", " -1", "1", "0", "2", R.drawable.quiz8question4, 'M'),
            //quiz 9
            new QuizDB("1. What is the output of the above code?", "14", "10", "-2", "5", R.drawable.quiz9question1, 'M'),
            new QuizDB("2. What is the output of the above code?", "Compile error", "0,0", "Exception value", "1", R.drawable.quiz9question2, 'M'),
            new QuizDB("3. What is the output of the following code?","Not Same",null , null, null, R.drawable.quiz9question3, 'S'),
            new QuizDB("4. Which segment will fill an array with the strings “I”, “Love”, “Java” ", "A", "B", "C", "D", R.drawable.quiz9question4, 'M'),

    };

    int correct = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_content);

        Intent intent = getIntent();
        Bundle extra = intent.getExtras();
        final int pos = extra.getInt("code");
        final int currentMark = extra.getInt("curr");


        //setting the position of quesitons in the db so they start and end on the right one
        if(pos==1){
            curr = 4;
            currTemp = 4;
        }
        if(pos==2){
            curr = 8;
            currTemp = 8;
        }
        if(pos==3){
            curr = 12;
            currTemp = 12;
        }
        if(pos==4){
            curr = 16;
            currTemp = 16;
        }
        if(pos==5){
            curr = 20;
            currTemp = 20;
        }
        if(pos==6){
            curr = 24;
            currTemp = 24;
        }
        if(pos==7){
            curr = 28;
            currTemp = 28;
        }
        if(pos==8){
            curr = 32;
            currTemp = 32;
        }

        qText = findViewById(R.id.qText);
        nextBtn = findViewById(R.id.nextBtn);
        radioGroup = findViewById(R.id.radioGroup);
        ans1 = findViewById(R.id.ans1);
        ans2 = findViewById(R.id.ans2);
        ans3 = findViewById(R.id.ans3);
        ans4 = findViewById(R.id.ans4);
        editText = findViewById(R.id.editText);
        imageView = findViewById(R.id.imageView);
        imageView.setVisibility(View.INVISIBLE);
        editText.setVisibility(View.INVISIBLE);

        setQ();



        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAns(qBank[curr]);

                if (curr == (currTemp+3)) {
                    //Code load and start intent for results page
                    Intent intent = new Intent(QuizContent.this, QuizResults.class);

                    intent.putExtra("score", correct);
                    intent.putExtra("code", pos);
                    intent.putExtra("currMark", currentMark);

                    startActivity(intent);

                } else{
                    //Increment question and reload 'page'
                    curr++;
                    setQ();
                    nextBtn.setVisibility(View.INVISIBLE);
                }
            }

        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton checkedRadioButton = (RadioButton)group.findViewById(checkedId);

                nextBtn.setVisibility(View.VISIBLE);

            }
        });

        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextBtn.setVisibility(View.VISIBLE);

            }
        });


    }


    //settting quesitons and changing visbilities of objects
    public void setQ() {

        nextBtn.setVisibility(View.INVISIBLE);

        radioGroup.clearCheck();
        editText.setText(null);

        qText.setText(qBank[curr].getQuestion());
        hideImg(qBank[curr]);
        hideAns(qBank[curr]);


        if (qBank[curr].getqType() != 'S') {
            setAns(qBank[curr]);
        }
    }

    //setting the answers to the radio buttons and then mixing the order with math random funciton
    public void setAns(QuizDB quizDB) {

        ArrayList<String> temp = new ArrayList<>(Arrays.asList(
                quizDB.getAnswer(),
                quizDB.getIncorrect1(),
                quizDB.getIncorrect2(),
                quizDB.getIncorrect3()));

        if (temp.get(1).equals("True") || temp.get(1).equals("False")) {
            ans1.setText("True");
            ans2.setText("False");

        } else {


            int mix = Math.abs(new Random().nextInt(4));

            ans1.setText(temp.get(mix));
            temp.remove(mix);

            mix = Math.abs(new Random().nextInt(3));
            ans2.setText(temp.get(mix));
            temp.remove(mix);

            mix = Math.abs(new Random().nextInt(2));
            ans3.setText(temp.get(mix));
            temp.remove(mix);

            ans4.setText(temp.get(0));
        }
    }

    //changing visibility title images. Decided to show default pokeball image for other questions so i guess this is a showimg lol.
    public void hideImg(QuizDB quizDB) {
        if (quizDB.getImage() != null) {

            imageView.setImageResource(quizDB.getImage());


            imageView.setVisibility(View.VISIBLE);
        }else if (quizDB.getImage() == null) {

            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.pokeball);
        }

    }

    //switches out the layout of the page depending on questions
    public void hideAns(QuizDB quizDB) {

        if (quizDB.getqType() == 'T') {

            ans1.setVisibility(View.VISIBLE);
            ans2.setVisibility(View.VISIBLE);
            ans3.setVisibility(View.INVISIBLE);
            ans4.setVisibility(View.INVISIBLE);
            editText.setVisibility(View.INVISIBLE);

        } else if (quizDB.getqType() == 'M') {

            ans1.setVisibility(View.VISIBLE);
            ans2.setVisibility(View.VISIBLE);
            ans3.setVisibility(View.VISIBLE);
            ans4.setVisibility(View.VISIBLE);
            editText.setVisibility(View.INVISIBLE);

        }else if (quizDB.getqType() == 'S') {

            ans1.setVisibility(View.INVISIBLE);
            ans2.setVisibility(View.INVISIBLE);
            ans3.setVisibility(View.INVISIBLE);
            ans4.setVisibility(View.INVISIBLE);
            editText.setVisibility(View.VISIBLE);
        }
    }

    //checks if answer is correct
    public void checkAns(QuizDB quizDB) {
        String answer;
        String correctAns = quizDB.getAnswer();

        if (quizDB.getqType() == 'S') { answer = editText.getText().toString().toLowerCase(); }
        else {
            RadioButton ans = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            answer = ans.getText().toString();
        }


        if (answer.equals(correctAns)) {
            correct++;
            Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
        }
    }






}