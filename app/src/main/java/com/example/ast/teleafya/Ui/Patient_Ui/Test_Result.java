package com.example.ast.teleafya.Ui.Patient_Ui;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ast.teleafya.R;

public class Test_Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test__result);



        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();
        Test_Result_Listing fragmentS1 = new Test_Result_Listing();
        getSupportFragmentManager().beginTransaction().add(R.id.Test_ResultA, fragmentS1).commit();



    }
}
