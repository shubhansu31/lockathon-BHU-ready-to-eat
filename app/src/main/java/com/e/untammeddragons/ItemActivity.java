package com.e.untammeddragons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView itemTextView, priceTextView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        imageView = findViewById(R.id.large_image_view);
        itemTextView = findViewById(R.id.large_item_name);
        priceTextView = findViewById(R.id.large_price);
        button = findViewById(R.id.btn_add);

        int image = getIntent().getIntExtra("image", 0);
        String itemName = getIntent().getStringExtra("name");
        int price = getIntent().getIntExtra("price", 0);

        itemTextView.setText(itemName);
        priceTextView.setText(String.format("%d/-", price));
        imageView.setImageResource(image);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemActivity.this, CartMain.class);
            }
        });
    }
}