package com.example.assign2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Person;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import io.realm.Realm;
import io.realm.RealmResults;

public class userInfo extends AppCompatActivity {

    String loggedInEmail;


    TextView userInfo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);



        Intent intent = getIntent();


        loggedInEmail = intent.getStringExtra("username");

        userInfo = findViewById(R.id.nameInfoID);

        userInfo.setText("Logged User is : "+loggedInEmail);





    }

}