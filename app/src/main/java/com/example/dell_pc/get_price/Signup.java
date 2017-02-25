package com.example.dell_pc.get_price;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signup extends AppCompatActivity {

    Button customer,shopkeeper;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        customer=(Button)findViewById(R.id.buttonCustomer);
        shopkeeper=(Button)findViewById(R.id. buttonshopkeeper);

        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),CustomerSignup.class));
            }
        });

        shopkeeper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Shopkeeper_Signup.class));
            }
        });
    }
}
