package com.example.dell_pc.get_price;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;
public class activity_add_item extends AppCompatActivity {

    EditText editAddcat,editAddname,editAddprice,editAdddec;
    TextView textAddcat,textaddname,textaddprice,textadddec;
    Spinner catSpinner;
    Button Catsubmit;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
        textAddcat=(TextView)findViewById(R.id.textViewaddcat);
        textaddname=(TextView)findViewById(R.id.textViewnameofproductcat);
        textaddprice=(TextView)findViewById(R.id.textViewpricecat);
        textadddec=(TextView)findViewById(R.id.textViewDiscriptioncat);
        editAddcat=(EditText)findViewById(R.id.editTextAddcat);
        editAddname=(EditText)findViewById(R.id.editTextnameofproductcat);
        editAddprice=(EditText)findViewById(R.id.editTextpricecat);
        editAdddec=(EditText)findViewById(R.id.editTextDiscriptioncat);
        catSpinner=(Spinner)findViewById(R.id.spinnerselectcat);
        Catsubmit=(Button)findViewById(R.id.buttonsubmitcat);
    }
}
