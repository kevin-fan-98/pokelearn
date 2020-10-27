//Kevin Fan z5161205 Individual Assignment 2
package com.example.top10;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    public static final String msg = "hello";
    private final List<Restaurants> rList;
    private LayoutInflater mInflater;
    private Context context;

    public Adapter(Context context, List<Restaurants> rList){
        mInflater = LayoutInflater.from(context);
        this.rList = rList;

    }


    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int ViewType){
        View ItemView = mInflater.inflate(R.layout.items, parent, false);
        return new MyViewHolder(ItemView,this);

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int pos){
        Restaurants current = rList.get(pos);
        String rName = current.getName();
        holder.rName.setText(rName);
        String mCuisine = current.getCuisine();
        holder.cuisine.setText(mCuisine);
        String mRank = Integer.toString(current.getRank());
        holder.rank.setText(mRank);
        String mLocation = current.getLocation();
        holder.location.setText(mLocation);
        String mRating = current.getAdjustedRating();
        holder.rating.setText(mRating);
        String mPrice = current.getCost();
        holder.price.setText(mPrice);
        holder.photo.setImageResource(current.getImage());





    }

    @Override
    public int getItemCount() {
        return rList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public final TextView rName;
        public final TextView rank;
        public final TextView cuisine;
        public final TextView location;
        public final TextView rating;
        public final TextView price;
        public final ImageView photo;
        final Adapter mAdapter;

        public MyViewHolder(View itemView, Adapter adapter) {
            super(itemView);
            rName = itemView.findViewById(R.id.iname);
            rank = itemView.findViewById(R.id.rank);
            cuisine = itemView.findViewById(R.id.cuisine);
            location = itemView.findViewById(R.id.location);
            rating = itemView.findViewById(R.id.rating);
            price = itemView.findViewById(R.id.cost);
            photo = itemView.findViewById(R.id.cardbg);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getLayoutPosition();

            Intent intent = new Intent(v.getContext(), Detail.class);
            //String message = coinName.toString();
            intent.putExtra("msg", position);
            v.getContext().startActivity(intent);



        }
    }




}
