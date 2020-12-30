package com.example.day5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Movie> Movies = new ArrayList<>();


        Movie a = new Movie("spiderman",3.5,2.00,"action",true,R.drawable.spider);
        Movie b = new Movie("star wars",4.5,2.00,"action",true,R.drawable.star_wars);
        Movie c = new Movie("the Hulk",5.0,2.00,"action",true,R.drawable.the_hulk);
        Movie e = new Movie("Batman",3.5,2.00,"action",true,R.drawable.batman);
        Movie f = new Movie("Wonder Woman",5.0,2.00,"action",true,R.drawable.wonder_woman);
        Movie g = new Movie("Thor",2.5,2.00,"action",true,R.drawable.thor);

        Movies.add(a);
        Movies.add(b);
        Movies.add(c);
        Movies.add(e);
        Movies.add(f);
        Movies.add(g);


        RecyclerView moviesList = findViewById(R.id.rv);
        moviesList.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        moviesList.setLayoutManager(lm);


        adapt ma = new adapt(Movies,MainActivity.this);
        moviesList.setAdapter(ma);



    }
}