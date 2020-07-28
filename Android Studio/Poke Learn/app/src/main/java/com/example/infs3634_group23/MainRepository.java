package com.example.infs3634_group23;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class MainRepository {

    private QuizDao quizDao;
    private LiveData<List<QuizRoom>> allQuiz;
    private int sumScore;
    //private List<Integer> sumScore;

    MainRepository(Application application){
        QuizRoomDB db = QuizRoomDB.getDatabase(application);
        quizDao = db.quizDao();
        //allQuiz = quizDao.getQuizList();
        sumScore = quizDao.getSumScore();
    }

    /*LiveData<List<QuizRoom>> getAllQuiz(){
        return allQuiz;
    }*/

    /*List<Integer> getSumScore(){
        return sumScore;
    }*/

    int getSumScore(){
        return sumScore;
    }



    void insert(QuizRoom quizRoom){
        QuizRoomDB.databaseWriteExecutor.execute(() -> {
            quizDao.insert(quizRoom);
        });
    }

    void update(QuizRoom quizRoom){
        QuizRoomDB.databaseWriteExecutor.execute(() -> {
            quizDao.update(quizRoom);
        });
    }
}
