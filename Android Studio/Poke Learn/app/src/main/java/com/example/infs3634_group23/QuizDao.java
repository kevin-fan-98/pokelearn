package com.example.infs3634_group23;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.lang.reflect.Array;
import java.util.List;

@Dao
public interface QuizDao {


    /*@Insert
    void insert(QuizRoom quizRoom);

    @Update
    void update(QuizRoom quizRoom);

    @Delete
    void delete(QuizRoom quizRoom);

    @Query("SELECT SUM(score) FROM quiz_table")
    int sumScore();

    @Query("SELECT * FROM quiz_table ORDER BY id ASC")
    LiveData<List<QuizRoom>> getAllQuiz();*/

    @Query("SELECT * from quiz_table ORDER BY quizDesc ASC")
    LiveData<List<QuizRoom>> getQuizList();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(QuizRoom quizRoom);

    @Update(onConflict = OnConflictStrategy.IGNORE)
    void update(QuizRoom quizRoom);

    @Query("DELETE FROM quiz_table")
    void deleteAll();

    @Query("SELECT SUM(quizScore) AS value FROM quiz_table")
    int getSumScore();




}
