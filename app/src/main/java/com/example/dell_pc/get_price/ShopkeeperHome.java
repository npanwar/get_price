package com.example.dell_pc.get_price;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ShopkeeperHome extends AppCompatActivity {

    ImageButton additem,update,delete,stalk;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopkeeper_home);

        additem=(ImageButton)findViewById(R.id.imageButtonAdditem);
        update=(ImageButton)findViewById(R.id.imageButtonUpdate);
        delete=(ImageButton)findViewById(R.id.imageButtondelete);
        stalk=(ImageButton)findViewById(R.id.imageButtonStalk);

        additem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),activity_add_item.class));
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Update.class));
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Delete.class));
            }
        });

        stalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Stalk.class));
            }
        });

    }
}