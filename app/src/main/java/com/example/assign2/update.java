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

public class update extends AppCompatActivity {
    EditText user;
    EditText pass;
    Realm realmObj;
    Button deleteBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Realm.init(getApplicationContext());
        realmObj = Realm.getDefaultInstance();
        setContentView(R.layout.login);


        user = findViewById(R.id.emailField);
        pass = findViewById(R.id.passwordField);
        deleteBtn = findViewById(R.id.deleteBtn);


        deleteBtn.setOnClickListener(new View.OnClickListener() {
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
                    UserModel aUser = realmObj.where(UserModel.class).equalTo("user", username).findFirst();
                    aUser.deleteFromRealm();
                    realmObj.commitTransaction();
                    startActivity(new Intent(update.this, MainActivity.class));
                }
            }
        });
    }

    public void validate(String title, String message){

        AlertDialog.Builder dialog = new AlertDialog.Builder(update.this);
        dialog.setTitle(title);
        dialog.setMessage(message);


        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {

            }
        });
        final AlertDialog alert = dialog.create();
        alert.show();
    }}







