package com.example.infs3634_group23;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import static com.example.infs3634_group23.Quiz.MyPREFERENCES;

public class QuizAdapter extends RecyclerView.Adapter<QuizAdapter.MyViewHolder>{


    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private final TextView quizItemView, quizScoreView;

        private MyViewHolder(View itemView){
            super(itemView);
            quizItemView =itemView.findViewById(R.id.quizNo);
            quizScoreView = itemView.findViewById(R.id.highScore);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v){
            int position = getLayoutPosition();
            final Intent intent;
            QuizRoom curr = mQuiz.get(position);

            /*if(position == 0) {

                intent = new Intent(v.getContext(), Quiz1.class);
            }else if(position == 1) {

                intent = new Intent(v.getContext(), Quiz1.class);
            }else{
                intent = new Intent(v.getContext(), QuizContent.class);
            }*/
            intent = new Intent(v.getContext(), QuizContent.class);
            intent.putExtra("code", position);
            intent.putExtra("curr", curr.getScore());
            v.getContext().startActivity(intent);
        }
    }

    private final LayoutInflater mInflater;
    private List<QuizRoom> mQuiz;
    private int[] intArray = new int[8];

    QuizAdapter(Context context){
        mInflater = LayoutInflater.from(context);
        SharedPreferences sharedPreferences;
        sharedPreferences = context.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        int quiz1 = sharedPreferences.getInt("quiz1Score", 0);
        intArray[0] = quiz1;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = mInflater.inflate(R.layout.quiz_items, parent, false);
        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int pos){

        if(mQuiz != null){
            QuizRoom curr = mQuiz.get(pos);
            holder.quizItemView.setText(curr.getQuizDesc());
            holder.quizScoreView.setText("Best Score: " + Integer.toString(curr.getScore()) + "/4");
            //holder.quizScoreView.setText("Best Score: " + intArray[pos] + "/4");
        }else{
            holder.quizItemView.setText("NOTHING HAS HAPPENED UVE FUCKED UP");
        }
    }

    void setQuizzes(List<QuizRoom> quizzes){
        mQuiz = quizzes;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount(){
        if(mQuiz != null)
            return mQuiz.size();
        else return 0;
    }




    /*public static final String msg = "Quiz";
    //private String[] mDataset;

    private List<QuizRoom> quizList = new ArrayList<>();
    private LayoutInflater mInflater;
    private Context context;


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.quiz_items, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        QuizRoom current = quizList.get(position);
        holder.textViewTitle.setText(current.getTitle());
        //holder.textViewDescription.setText(currentNote.getDescription());
        holder.textViewScore.setText(String.valueOf(current.getScore()));
    }

    @Override
    public int getItemCount() {
        return quizList.size();
    }

    public void setQuizList(List<QuizRoom> quizList) {
        this.quizList = quizList;
        notifyDataSetChanged();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewTitle;
        private TextView textViewDescription;
        private TextView textViewScore;

        public MyViewHolder(View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.quizNo);
            //textViewDescription = itemView.findViewById(R.id.text_view_description);
            textViewScore = itemView.findViewById(R.id.highScore);
        }
    }*/



    /*public QuizAdapter(Context context, List<QuizRoom> quizList){
        mInflater = LayoutInflater.from(context);
        this.quizList = quizList;
    }

    @NonNull
    @Override
    public QuizAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int ViewType){
        View ItemView = mInflater.inflate(R.layout.quiz_items, parent, false);
        return new QuizAdapter.MyViewHolder(ItemView, this);

    }

    @Override
    public void onBindViewHolder(@NonNull QuizAdapter.MyViewHolder holder, int pos){
        QuizRoom curr = quizList.get(pos);
        String quiz = curr.getTitle();
        holder.quiz.setText(quiz);
        int score = curr.getScore();
        holder.score.setText(score);
    }

    @Override
    public int getItemCount() {
        return quizList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        //public final TextView coinItemView;
        public final TextView quiz;
        public final TextView score;
        final QuizAdapter mAdapter;

        public MyViewHolder(View itemView, QuizAdapter adapter) {
            super(itemView);
            quiz = itemView.findViewById(R.id.quizNo);
            score = itemView.findViewById(R.id.highScore);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getLayoutPosition();

            //Intent intent = new Intent(v.getContext(), .class);
            //String message = coinName.toString();
            //intent.putExtra("msg", position);
            //v.getContext().startActivity(intent);

        }
    }*/
}
