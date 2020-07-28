package com.example.infs3634_group23;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;
import java.util.List;

public class LearnAdapter extends RecyclerView.Adapter<LearnAdapter.MyViewHolder> {
    public static final String msg = "Learn";
    //private String[] mDataset;

    private final List<LearnDB> learnList;
    private LayoutInflater mInflater;
    private Context context;

    public LearnAdapter(Context context, List<LearnDB> learnList){
        mInflater = LayoutInflater.from(context);
        this.learnList = learnList;
    }

    @NonNull
    @Override
    public LearnAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int ViewType){
        View ItemView = mInflater.inflate(R.layout.learn_items, parent, false);
        return new MyViewHolder(ItemView, this);

    }

    @Override
    public void onBindViewHolder(@NonNull LearnAdapter.MyViewHolder holder, int pos){
        LearnDB curr = learnList.get(pos);
        String module = curr.getModule();
        holder.module.setText(module);
    }

    @Override
    public int getItemCount() {
        return learnList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        //public final TextView coinItemView;
        public final TextView module;
        final LearnAdapter mAdapter;

        public MyViewHolder(View itemView, LearnAdapter adapter) {
            super(itemView);
            module = itemView.findViewById(R.id.module);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getLayoutPosition();

            Intent intent = new Intent(v.getContext(), LearnContent.class);
            //String message = coinName.toString();
            intent.putExtra("content", position);
            v.getContext().startActivity(intent);

        }
    }



}
