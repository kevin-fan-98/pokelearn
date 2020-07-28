package com.example.infs3634_group23;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.lang.reflect.Array;
import java.util.List;

public class QuizViewModel extends AndroidViewModel {

    private QuizRepository mRepository;
    private LiveData<List<QuizRoom>> allQuiz;
    //private int sumScore;
    //private List<Integer> sumScore;

    public QuizViewModel(Application application){
        super(application);
        mRepository= new QuizRepository(application);
        allQuiz = mRepository.getAllQuiz();
        //sumScore = mRepository.getSumScore();
    }

    LiveData<List<QuizRoom>> getAllQuiz(){
        return allQuiz;
    }

    /*List<Integer> getSumScore(){
        return sumScore;
    }*/

    void insert(QuizRoom quizRoom){
        mRepository.insert(quizRoom);
    }

    void update(QuizRoom quizRoom){
        mRepository.update(quizRoom);
    }


    /*private QuizRepository repository;
    private int scoreSum;
    private LiveData<List<QuizRoom>> allQuiz;

    public QuizViewModel(@NonNull Application application) {
        super(application);
        repository = new QuizRepository(application);
        scoreSum = repository.getScoreSum();
        allQuiz = repository.getAllQuiz();
    }

    public void insert(QuizRoom quizRoom){
        repository.insert(quizRoom);
    }

    public void update(QuizRoom quizRoom){
        repository.update(quizRoom);
    }

    public void delete(QuizRoom quizRoom){
        repository.delete(quizRoom);
    }

    public int getScoreSum(){
        return scoreSum;
    }

    public LiveData<List<QuizRoom>> getAllQuiz(){
        return allQuiz;
    }*/


}
