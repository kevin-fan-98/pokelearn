package com.example.infs3634_group23;


import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.lang.reflect.Array;
import java.util.List;

public class QuizRepository {

    private QuizDao quizDao;
    private LiveData<List<QuizRoom>> allQuiz;
    //private int sumScore;
    //private List<Integer> sumScore;

    QuizRepository(Application application){
        QuizRoomDB db = QuizRoomDB.getDatabase(application);
        quizDao = db.quizDao();
        allQuiz = quizDao.getQuizList();
        //sumScore = quizDao.getSumScore();
    }

    LiveData<List<QuizRoom>> getAllQuiz(){
        return allQuiz;
    }

    /*List<Integer> getSumScore(){
        return sumScore;
    }*/



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



    /*private QuizDao quizDao;
    private int scoreSum;
    private LiveData<List<QuizRoom>> allQuiz;

    public QuizRepository(Application application){
        QuizRoomDB database = QuizRoomDB.getInstance(application);
        quizDao = database.quizDao();
        scoreSum = quizDao.sumScore();
        allQuiz = quizDao.getAllQuiz();


    }

    public void insert(QuizRoom quizRoom){
            new InsertQuizAsyncTask(quizDao).execute(quizRoom);
    }

    public void update(QuizRoom quizRoom){

    }

    public void delete(QuizRoom quizRoom){

    }

    public int getScoreSum(){
        return scoreSum;
    }

    private static class InsertQuizAsyncTask extends AsyncTask<QuizRoom, Void, Void>{
        private QuizDao quizDao;

        private InsertQuizAsyncTask(QuizDao quizDao){
            this.quizDao = quizDao;
        }

        @Override
        protected Void doInBackground(QuizRoom... quizRooms) {
            quizDao.insert(quizRooms[0]);
            return null;
        }
    }

    public LiveData<List<QuizRoom>> getAllQuiz() {
        return allQuiz;
    }*/

}
