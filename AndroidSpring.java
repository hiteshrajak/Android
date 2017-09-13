package com.mdindia.retrofitdemo.Activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import com.mdindia.retrofitdemo.R;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private Spinner spinner;
    private ListView lstShowItem;
    private String[] mobileData = {"Moto","Apple","Oppo"};
    private String[] computerData = {"Dell","Lenovo","HP"};
    private String[] spinnerData = {"Mobile","Computer"};
    private ArrayAdapter<String> lstAdapter, spinnerAdapter;
    private Button btnShowData;
    private String selectedItem = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initialization();
        setListeners();

    }

    private void setListeners() {
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                selectedItem = (String) adapterView.getItemAtPosition(pos);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btnShowData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!selectedItem.equalsIgnoreCase("")){
                    if(selectedItem.equalsIgnoreCase("Mobile")){
                        lstAdapter = new ArrayAdapter<String>(mContext, android.R.layout.simple_list_item_1, mobileData);
                    }else {
                        lstAdapter = new ArrayAdapter<String>(mContext, android.R.layout.simple_list_item_1, computerData);
                    }
                    lstShowItem.setAdapter(lstAdapter);
                }
            }
        });
    }

    private void initialization() {
        mContext = MainActivity.this;
        spinner = (Spinner) findViewById(R.id.spinner);
        lstShowItem = (ListView) findViewById(R.id.lstShowItem);
        btnShowData = findViewById(R.id.btnShowData);
        spinnerAdapter = new ArrayAdapter<String>(mContext, android.R.layout.simple_spinner_item, spinnerData);
    }
}
