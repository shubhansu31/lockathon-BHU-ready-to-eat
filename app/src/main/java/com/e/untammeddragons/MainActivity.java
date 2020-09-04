package com.e.untammeddragons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
/*
        Splash screen for  look and monitor if the user is logged in or not
*/
public class MainActivity extends AppCompatActivity {

    private int TIME_OUT = 2500;
    Intent home;
//    FirebaseUser currentUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //currentUser = FirebaseAuth.getInstance().getCurrentUser();
//        if (currentUser == null) {
//            home = new Intent(this,SignInHome.class);
//        } else {
//            home = new Intent(this,Home.class);
//        }
        home = new Intent(this,SignInHome.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(home);
                finish();
            }
        },TIME_OUT);
    }
}