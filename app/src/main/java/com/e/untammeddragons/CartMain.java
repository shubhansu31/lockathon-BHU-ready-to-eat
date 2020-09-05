package com.e.untammeddragons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CartMain extends AppCompatActivity {

    TextView item , item_value, total_value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_main);
        item = (TextView)findViewById(R.id.carttext);
        item_value = (TextView)findViewById(R.id.cartvalue);
        total_value = (TextView)findViewById(R.id.cartvaluetotal);

        String itemName = getIntent().getStringExtra("name");
        int price = getIntent().getIntExtra("price", 0);

        item.setText(itemName);
        item_value.setText(String.format("%d/-", price));
    }
}