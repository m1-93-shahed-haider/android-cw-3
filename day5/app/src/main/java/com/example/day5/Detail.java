package com.example.day5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle B = getIntent().getExtras();
        Movie M = (Movie) B.getSerializable("movie");



        ImageView img = findViewById(R.id.imageView4);
        TextView name = findViewById(R.id.textView4);
        TextView rating = findViewById(R.id.textView9);
        TextView Dur = findViewById(R.id.textView6);

        img.setImageResource(M.getImg());
        name.setText(M.getName());
        rating.setText(M.getRating()+"");
        Dur.setText(M.getDuration()+"");

    }
}