package com.example.dell_pc.get_price;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.Toast;

public class CustomerInquiry extends AppCompatActivity {

    TextView selectcategory,selectItem,pincode;
    EditText enterpin;
    Spinner spinner;
    ListView listView;
    Button logout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_inquiry);
        selectcategory=(TextView)findViewById(R.id.textViewenterpincode);
        selectItem=(TextView)findViewById(R.id.textViewSelectItem);
        pincode =(TextView)findViewById(R.id.textViewSelectItem);

        enterpin=(EditText)findViewById(R.id.editTextenterpincode);
        spinner=(Spinner)findViewById(R.id.spinnerselectcategory);
        listView=(ListView)findViewById(R.id.listViewSelectitem);

        logout=(Button)findViewById(R.id.buttonlogout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Thanku for use",Toast.LENGTH_LONG).show();
            }
        });


    }
}