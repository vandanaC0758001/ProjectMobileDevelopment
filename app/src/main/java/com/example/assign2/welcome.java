package com.example.assign2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class welcome extends AppCompatActivity {
    ListView listview;
    SearchView searchView;
    private List<details> searchList= new ArrayList<details>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        listview= findViewById(R.id.listViewID);
        searchView = findViewById(R.id.searchid);

        listview= findViewById(R.id.listViewID);
        final ArrayList<details> movieList = new ArrayList<>();
        movieList.add(new details(R.drawable.delta1,"Delta Hotel","Hotel"));
        movieList.add(new details(R.drawable.sheraton1,"Sheraton Hotel","Hotel"));
        movieList.add(new details(R.drawable.fair,"Fairmont Hotel","Hotel"));
        movieList.add(new details(R.drawable.knights1,"Knights Inn","Hotel/Spa/Indoor pool"));
        movieList.add(new details(R.drawable.hilton1,"Hilton Hotel","Hotel/Spa"));
        movieList.add(new details(R.drawable.ann,"The Anndore House","Hotel"));
        movieList.add(new details(R.drawable.court,"Courtyard Hotel","Hotel"));
        movieList.add(new details(R.drawable.inter,"Intercontinental","Hotel"));
        movieAdapter movieadapter= new movieAdapter(this,R.layout.list,movieList);
        listview.setAdapter(movieadapter);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener(){
            public boolean onQueryTextSubmit(String value){
                System.out.println("search text"+value);
                return false;
            }
            @Override
            public boolean onQueryTextChange(String value) {
                System.out.println("search text" + value);
                ArrayList<details> templist = new ArrayList<>();
                for(details aobj:movieList){
                    if(aobj.title.contains(value)){
                        templist.add(aobj);
                    }
                }
                movieAdapter adapter;
                adapter = new movieAdapter(getApplicationContext(),R.layout.list,templist);
                listview.setAdapter(adapter);
                return false;
            }
        });
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent = new Intent(view.getContext(),tabs.class);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent = new Intent(view.getContext(),tabs1.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent(view.getContext(),tabs2.class);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent = new Intent(view.getContext(),tabs3.class);
                    startActivity(intent);
                }
                if (position==4){
                    Intent intent = new Intent(view.getContext(),tabs4.class);
                    startActivity(intent);
                }
                if (position==5){
                    Intent intent = new Intent(view.getContext(),tabs5.class);
                    startActivity(intent);
                }
                if (position==6){
                    Intent intent = new Intent(view.getContext(),tabs6.class);
                    startActivity(intent);
                }
                if (position==7){
                    Intent intent = new Intent(view.getContext(),tabs7.class);
                    startActivity(intent);
                }
            }
        });






    }
}