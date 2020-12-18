package com.example.editprofile5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements
        AdapterView.OnItemSelectedListener {
    String[] departmentValue = { "IT", "ACCOUNTS", "HRM", "MANAGEMENT", "Other"};
    String[] designationValue = { "Developer", "Engineer", "Manager", "Internee", "Other"};
    String[] reportingValue = { "Senior", "Manager", "Internee", "HR", "Other"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_profile);
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner department_spinner = findViewById(R.id.department_spinner);
        Spinner designation_spinner = findViewById(R.id.designation_spinner);
        Spinner reporting_spinner = findViewById(R.id.reporting_spinner);

        department_spinner.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter departmentAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, departmentValue);
       ArrayAdapter designationAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, designationValue);
         ArrayAdapter reportingAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, reportingValue);

        designationAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        reportingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        departmentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        department_spinner.setAdapter(departmentAdapter);
        designation_spinner.setAdapter(designationAdapter);
        reporting_spinner.setAdapter(reportingAdapter);


    }

    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), departmentValue[position] , Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), designationValue[position] , Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), reportingValue [position] , Toast.LENGTH_LONG).show();

    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}