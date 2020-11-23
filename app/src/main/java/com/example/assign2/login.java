package com.example.assign2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import io.realm.Realm;
import io.realm.RealmQuery;
import io.realm.RealmResults;

public class login extends AppCompatActivity {
    EditText user;
    EditText pass;
    Realm realmObj;
    TextView signinText;
    Button signupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Realm.init(getApplicationContext());
        realmObj = Realm.getDefaultInstance();
        setContentView(R.layout.login);


        user = findViewById(R.id.Regname);
        pass = findViewById(R.id.Regpass);
        signupBtn = findViewById(R.id.signupBtn);
        signinText = findViewById(R.id.signinText);


        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = user.getText().toString();
                String password = pass.getText().toString();


                if (username.isEmpty() || username.length() < 1) {

                    validate("User Name", "Please Enter Valid User Name...");


                } else if (password.isEmpty() || password.length() < 1) {

                    validate("Password", "Please Enter Valid Password...");

                } else {


                    realmObj.beginTransaction();

                    UserModel aUser = realmObj.createObject(UserModel.class);
                    aUser.setUsername(username);
                    aUser.setPassword(password);

                    realmObj.commitTransaction();


                    //query the User Model Table
                    RealmQuery<UserModel> recordlist = realmObj.where(UserModel.class);

                    System.out.println("Number of records " + recordlist.count());

                    RealmResults<UserModel> results = recordlist.findAll();

                    for (UserModel obj : results) {

                        System.out.println("User Name " + obj.getUsername());
                        System.out.println("Password " + obj.getPassword());
                    }

                    //
                    //validate("DONE", "You have entered correct info...");

                    System.out.println("User Entered valid string");
                }
            }
        });
    }
    public void validate(String title, String message){

        AlertDialog.Builder dialog = new AlertDialog.Builder(login.this);
        dialog.setTitle(title);
        dialog.setMessage(message);

        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                //Action for "Delete".
            }
        });
        final AlertDialog alert = dialog.create();
        alert.show();
    }}







