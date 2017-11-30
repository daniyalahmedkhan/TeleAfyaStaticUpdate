package com.example.ast.teleafya.Ui.DoctorModule;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Patient_Ui.Create_Test;

public class DoctorMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_message);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();
        Doctor_MSG_Tab fragmentS1 = new Doctor_MSG_Tab();
        getSupportFragmentManager().beginTransaction().replace(R.id.activity_doctor, fragmentS1).commit();


    }
}
