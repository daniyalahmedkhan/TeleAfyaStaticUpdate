package com.example.ast.teleafya.Ui.Partners.Ambulance.Transport;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Patient_Ui.patient_doctor_list;

public class My_Car_Activity extends AppCompatActivity {

    Button btnAddCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my__car_);


        btnAddCar = (Button) findViewById(R.id.AddCar);


        btnAddCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                android.app.FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager
                        .beginTransaction();
                Transport_Add_Car fragmentS1 = new Transport_Add_Car();
                getSupportFragmentManager().beginTransaction().add(android.R.id.content, fragmentS1).commit();



            }
        });

    }
}
