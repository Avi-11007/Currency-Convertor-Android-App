package com.avi.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText currencyEditText=(EditText) findViewById(R.id.currencyEditText);
        String amountInPound=currencyEditText.getText().toString();
        double amountInPoundDouble=Double.parseDouble(amountInPound);
        double amountInDollerDouble=amountInPoundDouble*1.3;
        String amountInDollerString=String.format("%.2f",amountInDollerDouble);
        Toast.makeText(this,  amountInPound+" Pounds "+"is "+amountInDollerString+" Dollers", Toast.LENGTH_LONG).show();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}