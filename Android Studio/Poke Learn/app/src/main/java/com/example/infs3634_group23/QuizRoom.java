package com.example.infs3634_group23;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "quiz_table")

//room databaser for quiz
public class QuizRoom {

    /*@PrimaryKey(autoGenerate =  true)
    private int id;

    private String title;

    private String description;

    private int score;

    public QuizRoom(String title, String description, int score) {
        this.title = title;
        this.description = description;
        this.score = score;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getScore() {
        return score;
    }*/

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "quizDesc")
    private String quizDesc;

    @ColumnInfo(name = "quizScore")
    private int score;



    public QuizRoom(@NonNull String quizDesc, int score) {

        this.quizDesc = quizDesc;
        this.score = score;
    }


    @NonNull
    public String getQuizDesc() {
        return this.quizDesc;

    }
    public void setQuizDesc(@NonNull String quizDesc) {
        this.quizDesc = quizDesc;
    }

    @NonNull
    public int getScore() {
        return this.score;
    }
    public void setScore(int score) {
        this.score = score;
    }



}
