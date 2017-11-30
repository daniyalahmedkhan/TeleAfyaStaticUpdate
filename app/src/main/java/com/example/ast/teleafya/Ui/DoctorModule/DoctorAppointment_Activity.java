package com.example.ast.teleafya.Ui.DoctorModule;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ast.teleafya.R;

public class DoctorAppointment_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_appointment_);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();
        Doctor_MyAppointment_Tab fragmentS1 = new Doctor_MyAppointment_Tab();
        getSupportFragmentManager().beginTransaction().add(R.id.ActivityDcotorAppointment, fragmentS1).commit();



    }
}
