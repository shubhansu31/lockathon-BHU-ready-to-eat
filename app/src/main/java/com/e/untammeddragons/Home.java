package com.e.untammeddragons;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class Home extends AppCompatActivity {

//    private DrawerLayout drawerLayout;
//    private NavigationView navigationView;
//    private ActionBarDrawerToggle toggle;
//    ImageView foodcart;
//    TextView canteenwork;

    RecyclerView recyclerHome;
    HomeAdapter homeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerHome = findViewById(R.id.recyclerHome);
        homeAdapter = new HomeAdapter();

        recyclerHome.setAdapter(homeAdapter);

//        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
//        navigationView = (NavigationView) findViewById(R.id.navigation);
//        foodcart = (ImageView) findViewById(R.id.foodcart);
//        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
//        drawerLayout.addDrawerListener(toggle);
//        toggle.syncState();

//        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
//        getSupportActionBar().setDisplayShowCustomEnabled(true);
//        getSupportActionBar().setCustomView(R.layout.activity_my_action_bar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        canteenwork = (TextView) findViewById(R.id.textView);
//        canteenwork.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Home.this, Menu.class);
//                startActivity(intent);
//            }
//        });
    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
////        switch(item.getItemId()){
////            case R.id.menusignout:
////                FirebaseAuth.getInstance().signOut();
////                Toast.makeText(Home.this,"Signing out",Toast.LENGTH_LONG).show();
////                startActivity(new Intent(Home.this,SignInHome.class));
////                return true;
////        }
//        if(toggle.onOptionsItemSelected(item)){
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

   public void foodClick(View view){
        startActivity(new Intent(Home.this, CartMain.class));
        Toast.makeText(Home.this,"Working",Toast.LENGTH_LONG).show();
    }
}