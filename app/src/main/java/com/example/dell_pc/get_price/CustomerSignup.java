package com.example.dell_pc.get_price;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CustomerSignup extends AppCompatActivity {

    EditText first,last,email,pass,mob,pin,address;
    Button RegCust;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_signup);

        first=(EditText)findViewById(R.id.editTextFirstname);
        last=(EditText)findViewById(R.id.editTextlastname);
        email=(EditText)findViewById(R.id.editTextemail);
        pass =(EditText)findViewById(R.id.editTextpassword);
        mob =(EditText)findViewById(R.id.editTextmobile);
        pin =(EditText)findViewById(R.id.editTextpincode);
        address =(EditText)findViewById(R.id.editTextaddress);

        RegCust=(Button)findViewById(R.id.buttonregister);
        RegCust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Customergetprice.class));
            }
        });

    }
}