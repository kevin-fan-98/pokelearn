package com.example.infs3634_group23;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


//storing the data for room db. Could have used it more extensively but didnt learn it early enough.
@Database(entities = QuizRoom.class, version = 2, exportSchema = false)
public abstract class QuizRoomDB extends RoomDatabase {





    abstract QuizDao quizDao();

    private static volatile QuizRoomDB INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static QuizRoomDB getDatabase(final Context context){

        if(INSTANCE == null){
            synchronized (QuizRoomDB.class){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), QuizRoomDB.class, "quiz_database").fallbackToDestructiveMigration().addCallback(sRoomDatabaseCallback).build();
                }
            }
        }
        return INSTANCE;
    }


    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase db) {
            super.onOpen(db);

            // If you want to keep data through app restarts,
            // comment out the following block
            databaseWriteExecutor.execute(() -> {
                // Populate the database in the background.
                // If you want to start with more words, just add them.
                QuizDao dao = INSTANCE.quizDao();
                dao.deleteAll();

                QuizRoom quizRoom = new QuizRoom("QUIZ 1", 0);
                dao.insert(quizRoom);
                quizRoom = new QuizRoom("QUIZ 2", 0);
                dao.insert(quizRoom);
                quizRoom = new QuizRoom("QUIZ 3", 0);
                dao.insert(quizRoom);
                quizRoom = new QuizRoom("QUIZ 4", 0);
                dao.insert(quizRoom);
                quizRoom = new QuizRoom("QUIZ 5", 0);
                dao.insert(quizRoom);
                quizRoom = new QuizRoom("QUIZ 6", 0);
                dao.insert(quizRoom);
                quizRoom = new QuizRoom("QUIZ 7", 0);
                dao.insert(quizRoom);
                quizRoom = new QuizRoom("QUIZ 8", 0);
                dao.insert(quizRoom);
                quizRoom = new QuizRoom("QUIZ 9", 0);
                dao.insert(quizRoom);


            });
        }
    };



    /*private static QuizRoomDB instance;

    public abstract QuizDao quizDao();

    public static synchronized QuizRoomDB getInstance(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(), QuizRoomDB.class, "quiz_database").fallbackToDestructiveMigration().addCallback(roomCallback).build();
        }
        return instance;
    }

    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsyncTask(instance).execute();
        }
    };

    private static class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void>{

        private QuizDao quizDao;

        private PopulateDbAsyncTask(QuizRoomDB db){
            quizDao = db.quizDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            quizDao.insert(new QuizRoom("Quiz 1", "This is QUIZ 1", 1));
            quizDao.insert(new QuizRoom("Quiz 2", "This is QUIZ 2", 2));
            quizDao.insert(new QuizRoom("Quiz 3", "This is QUIZ 3", 3));
            quizDao.insert(new QuizRoom("Quiz 4", "This is QUIZ 4", 4));
            return null;
        }
    }*/

}
