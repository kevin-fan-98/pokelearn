package com.example.infs3634_group23;

import java.util.ArrayList;
import java.util.HashMap;

//db to hold learn modules
public class LearnDB {
    private String module;
    private String topic1;
    private String topic2;
    private String topic3;



    public LearnDB() {

    }

    public LearnDB(String module,String topic1,String topic2,String topic3) {

        this.module = module;
        this.topic1 = topic1;
        this.topic2 = topic2;
        this.topic3 = topic3;

    }



    public static ArrayList<LearnDB> getLearn() {
            ArrayList<LearnDB> learn = new ArrayList<>();
            learn.add(new LearnDB("Module 1", "Syntax", "Variables", "Java Math Class"));
            learn.add(new LearnDB("Module 2", "Mathematical Notations", "Conditional Statements", "Ternary Operators"));
            learn.add(new LearnDB("Module 3", "While Loops", "For Loops", "Switch Statements"));
            learn.add(new LearnDB("Module 4", null, "Arrays", null));
            return learn;
        }



    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }


    public String getTopic1() {
        return topic1;
    }

    public void setTopic1(String topic1) {
        this.topic1 = topic1;
    }

    public String getTopic2() {
        return topic2;
    }

    public void setTopic2(String topic2) {
        this.topic2 = topic2;
    }

    public String getTopic3() {
        return topic3;
    }

    public void setTopic3(String topic3) {
        this.topic3 = topic3;
    }

    public static HashMap<Integer, Content> youtubeMap = new HashMap(){{
        put(0, new Content(0, "Syntax and Variables",  "hF8F3wm9DUc", "Are you stuck on this concept? Struggling to get more XP? Watch this video to help solidify " +
                "your understanding on Syntax and Variables. Once you're done test this knowledge in quiz 1!"));
        put(1, new Content(1, "Math Class Methods", "JzMdepMLW44", "Are you stuck on this concept? Struggling to get more XP? Watch this video to help solidify " +
                            "your understanding on Math Class Methods. Once you're done test this knowledge in quizzes 2, 3 and 4!"));
        put(2, new Content(2, "Conditional Statements", "iMeaovDbgkQ", "Are you stuck on this concept? Struggling to get more XP? Watch this video to help solidify " +
                "your understanding on Conditional Statements. Once you're done test this knowledge in quizzes 4 and 5! "));
        put(3, new Content(3, "Loops", "6djggrlkHY8" , "Are you stuck on this concept? Struggling to get more XP? Watch this video to help solidify " +
                "your understanding on Loops. Once you're done test this knowledge in quizzes 6 and 7!"));
        put(4, new Content(4, "Switch Statements",  "RVRPmeccFT0", "Are you stuck on this concept? Struggling to get more XP? Watch this video to help solidify " +
                "your understanding on Switch Statements. Once you're done test this knowledge in quiz 8!"));
        put(5, new Content(5, "Arrays", "L06uGnF4IpY", "Are you stuck on this concept? Struggling to get more XP? Watch this video to help solidify " +
                "your understanding on Arrays. Once you're done test this knowledge in quizzes 8 and 9!"));
    }};


    public static Content getVideoById(int id){
        return youtubeMap.get(id);
    }}
    ;
