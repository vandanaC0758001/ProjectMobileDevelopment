package com.example.assign2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        listview= findViewById(R.id.listViewID);
        ArrayList<details> movieList = new ArrayList<>();
        movieList.add(new details(R.drawable.johnwick,"John Wick","Action"));
        movieList.add(new details(R.drawable.lof,"Lord Of Ring","Adventure"));
        movieList.add(new details(R.drawable.tiktok,"Tik Tok","suspenseful"));
        movieAdapter movieadapter= new movieAdapter(this,R.layout.list,movieList);
        listview.setAdapter(movieadapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent = new Intent(view.getContext(),tabs1.class);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent = new Intent(view.getContext(),tabs1.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent(view.getContext(),tabs1.class);
                    startActivity(intent);
                }
            }
        });






    }
}