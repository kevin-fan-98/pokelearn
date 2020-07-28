package com.example.infs3634_group23;

import android.util.Log;

import java.io.Serializable;

//quiz db template
public class QuizDB implements Serializable {

    private String question;
    private String answer;
    private String incorrect1;
    private String incorrect2;
    private String incorrect3;
    private Integer image;
    private char qType;


    public QuizDB(String question, String answer, String incorrect1, String incorrect2, String incorrect3, Integer image, char qType) {

        this.question = question;
        this.answer = answer;
        this.incorrect1 = incorrect1;
        this.incorrect2 = incorrect2;
        this.incorrect3 = incorrect3;
        this.image = image;
        this.qType = qType;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getIncorrect1() {
        return incorrect1;
    }

    public String getIncorrect2() {
        return incorrect2;
    }

    public String getIncorrect3() {
        return incorrect3;
    }

    public Integer getImage() {
        return image;
    }

    public char getqType() {
        return qType;
    }


}