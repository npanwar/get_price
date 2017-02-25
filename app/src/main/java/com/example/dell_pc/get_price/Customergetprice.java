package com.example.dell_pc.get_price;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Customergetprice extends AppCompatActivity {

    Button getpric;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customergetprice);
        getpric=(Button)findViewById(R.id.buttoncustomergetprice);
        getpric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),CustomerInquiry.class));
            }
        });
    }
}
