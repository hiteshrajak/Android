package com.example.hitesh.dropdownlist;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends Activity implements OnItemSelectedListener{
    ListView Mb,Co;
    String []mblist={"Moto","Apple","Appo"};
    String []CoList={"Dell","Lenovo","HP"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //List elements
        Mb= (ListView) findViewById(R.id.list_item);
        Co=(ListView) findViewById(R.id.list_item1);
        // Creating adapter for Mobile list value
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mblist);
        Mb.setAdapter(adapter);
        // Creating adapter for Computre list value
        ArrayAdapter<String> Cadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,CoList);
        Co.setAdapter(Cadapter);



        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Mobile");
        categories.add("Computer");



        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

       if(item == "Mobile"){
           // Showing selected spinner item
           Mb.setVisibility(View.VISIBLE);
       }
       else {
           Mb.setVisibility(View.GONE);
       }

        if(item == "Computer"){
            // Showing selected spinner item
            Co.setVisibility(View.VISIBLE);
        }
        else {
            Co.setVisibility(View.GONE);
        }
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}