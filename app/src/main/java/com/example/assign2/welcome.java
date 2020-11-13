package com.example.assign2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class welcome extends AppCompatActivity {
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        listview= findViewById(R.id.listViewID);
        ArrayList<details> movieList = new ArrayList<>();
        movieList.add(new details(R.drawable.johnwick,"John Wick","Action"));
        movieList.add(new details(R.drawable.lof,"Lord Of Ring","Adventure"));
        movieList.add(new details(R.drawable.tiktok,"Tik Tok","suspenseful"));
        movieAdapter movieadapter= new movieAdapter(this,R.layout.list,movieList);
        listview.setAdapter(movieadapter);
    }
}