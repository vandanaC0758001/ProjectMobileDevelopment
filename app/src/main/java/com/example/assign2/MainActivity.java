package com.example.assign2;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import io.realm.Realm;
import io.realm.RealmQuery;
import io.realm.RealmResults;


public class MainActivity extends AppCompatActivity {

    EditText emailField;
    EditText passwordField;
    TextView signupText;
    Button loginBtn;
    ImageView google;
    ImageView facebook;
    Realm realmObj;
    String username;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Realm.init(getApplicationContext());
        realmObj = Realm.getDefaultInstance();
        setContentView(R.layout.activity_main);

        emailField = findViewById(R.id.emailField);
        passwordField = findViewById(R.id.passwordField);
        loginBtn = findViewById(R.id.loginBtn);
        signupText = findViewById(R.id.signupText);
        google = findViewById(R.id.google);
        facebook = findViewById(R.id.facebook);


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = emailField.getText().toString();
                password = passwordField.getText().toString();


                if (username.isEmpty() || username.length() < 1) {

                    validate("User Name", "Please Enter Valid User Name...");


                } else if (password.isEmpty() || password.length() < 1) {

                    validate("Password", "Please Enter Valid Password...");

                } else {



                    RealmQuery<UserModel> recordlist = realmObj.where(UserModel.class);

                    System.out.println("Number of records " + recordlist.count());

                    RealmResults<UserModel> results = recordlist.findAll();
                    for(UserModel obj:results){
                        if(username.equals(obj.getUsername())&& password.equals(obj.getPassword())){
                            startActivity(new Intent(MainActivity.this, welcome.class));
                        } else{
                            validate("Failed","username/password not matched");
                        }

                    }
                }
            }
        });
        signupText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, login.class));
            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                google("https://www.google.com");
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                facebook("https://www.facebook.com");
            }
        });
    }

    public void validate(String title, String message){

        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle(title);
        dialog.setMessage(message);

        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });
        final AlertDialog alert = dialog.create();
        alert.show();
    }



    private void google(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

        private void facebook(String s) {
            Uri url = Uri.parse(s);
            startActivity(new Intent(Intent.ACTION_VIEW, url));
        }





}