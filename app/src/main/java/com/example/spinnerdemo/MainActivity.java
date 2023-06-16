package com.example.spinnerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    String Card[] = {"Aadhar Card","Pan Card","Voter Card","Driving License Card","Xth Score Card","XIIth Score Card"};
    String Language[] = {"Gujarati","English","Hindi","Marathi","Telugu","Tamil","Sanskurt","French"};
    AutoCompleteTextView actxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        actxtView = findViewById(R.id.actxtView);

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,Card);
        spinner.setAdapter(spinnerAdapter);

        ArrayAdapter<String> actvAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,Language);
        actxtView.setAdapter(actvAdapter);
        actxtView.setThreshold(1);
    }


}
















