package com.example.ast.teleafya.Ui.Patient_Ui;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ast.teleafya.R;

public class Create_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_);


        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();
        Create_Test fragmentS1 = new Create_Test();
        getSupportFragmentManager().beginTransaction().add(R.id.Create_Test, fragmentS1).commit();



    }
}
