package com.example.assign2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class welcome extends AppCompatActivity {
    ListView listview;
    Button btn1;
    Button btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        btn1 = findViewById(R.id.button1);
        btn2= findViewById(R.id.button2);
        listview= findViewById(R.id.listViewID);
        ArrayList<details> movieList = new ArrayList<>();
        movieList.add(new details(R.drawable.johnwick,"John Wick","Action"));
        movieList.add(new details(R.drawable.lof,"Lord Of Ring","Adventure"));
        movieList.add(new details(R.drawable.tiktok,"Tik Tok","suspenseful"));
        movieAdapter movieadapter= new movieAdapter(this,R.layout.list,movieList);
        listview.setAdapter(movieadapter);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(welcome.this, tabs.class));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(welcome.this, tabs1.class));
            }
        });


    }
}