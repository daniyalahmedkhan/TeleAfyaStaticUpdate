package com.example.ast.teleafya.Ui.Custom_Views;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.aigestudio.wheelpicker.WheelPicker;
import com.aigestudio.wheelpicker.widgets.WheelDatePicker;
import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.CountryAdapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;


public final class Activity_CountryPicker extends AppCompatActivity {

    CountryAdapter adapter;
    ArrayList<String> dataModels=new ArrayList<>();
    ListView listCountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_spinner);

        dataModels.add("one");
        dataModels.add("one");
        dataModels.add("one");
        dataModels.add("one");
        dataModels.add("one");
        dataModels.add("one");
        dataModels.add("one");
        dataModels.add("one");
        dataModels.add("one");
        dataModels.add("one");

        listCountry=(ListView)findViewById(R.id.countryList);
        adapter= new CountryAdapter(dataModels,getApplicationContext());
        listCountry.setAdapter(adapter);

    }



}
