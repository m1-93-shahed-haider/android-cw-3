package com.example.day5;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;

public class adapt extends RecyclerView.Adapter {

    ArrayList<Movie> marray;
    Context cont;

    public adapt(ArrayList<Movie> marray, Context cont) {
        this.marray = marray;
        this.cont = cont;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.movies_library,parent,false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ((ViewHolder) holder).rating.setText(marray.get(position).getRating()+"");
        ((ViewHolder) holder).name.setText(marray.get(position).getName());
        ((ViewHolder) holder).genres.setText(marray.get(position).getGenres()+"");
        ((ViewHolder) holder).duration.setText(marray.get(position).getDuration()+"");
        ((ViewHolder) holder).img.setImageResource(marray.get(position).getImg());
        ((ViewHolder) holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cont,Detail.class);
                i.putExtra("movie",marray.get(position));
                cont.startActivity(i);
            }
        });

        ((ViewHolder) holder).delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marray.remove(position);
                notifyDataSetChanged();
            }
        });






    }

    @Override
    public int getItemCount() {
        return marray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView img;
        public ImageView delete;
        public TextView name;
        public TextView rating;
        public TextView duration;
        public TextView genres;
        public View view;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            view = itemView;

            img = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.textView);
            rating = itemView.findViewById(R.id.textView1);
            duration = itemView.findViewById(R.id.textView3);
            genres = itemView.findViewById(R.id.textView2);
            delete = itemView.findViewById(R.id.imageView3);

        }
    }
}
