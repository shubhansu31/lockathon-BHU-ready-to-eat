package com.e.untammeddragons;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity {

    ImageView foodcart;

    RecyclerView recyclerView;
    MyAdapter myAdapter;

//    List<String> itemList;
//    List<Integer> priceList;
//    List<Integer> imageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        recyclerView = findViewById(R.id.recyclerView);
        myAdapter = new MyAdapter();

//        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(myAdapter);

        foodcart = (ImageView) findViewById(R.id.foodcart);
        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.activity_my_action_bar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        itemList = new ArrayList<>();
//        priceList = new ArrayList<>();
//        imageList = new ArrayList<>();

//        itemList.add("Aloo-Paratha");
//        itemList.add("Burger");
//        itemList.add("Chole-Bhature");
//        itemList.add("Coffee");
//        itemList.add("Cold-Coffee");
//        itemList.add("Hot-Dog");
//        itemList.add("Masala-Dosa");
//        itemList.add("Plain-Dosa");
//        itemList.add("Samosa");
//        itemList.add("Tea");
//
//        priceList.add(45);
//        priceList.add(25);
//        priceList.add(45);
//        priceList.add(20);
//        priceList.add(30);
//        priceList.add(20);
//        priceList.add(45);
//        priceList.add(35);
//        priceList.add(10);
//        priceList.add(10);
//
//        imageList.add(R.drawable.aloo_paratha);
//        imageList.add(R.drawable.burger);
//        imageList.add(R.drawable.chole_bhature);
//        imageList.add(R.drawable.coffee);
//        imageList.add(R.drawable.cold_coffee);
//        imageList.add(R.drawable.hot_dog);
//        imageList.add(R.drawable.masala_dosa);
//        imageList.add(R.drawable.plain_dosa);
//        imageList.add(R.drawable.samosa);
//        imageList.add(R.drawable.tea);



    }

    public void foodClick(View view){
        startActivity(new Intent(Menu.this, CartMain.class));
        //Toast.makeText(Menu.this,"Working",Toast.LENGTH_LONG).show();
    }
}