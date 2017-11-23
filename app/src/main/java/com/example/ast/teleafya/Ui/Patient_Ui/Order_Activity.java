package com.example.ast.teleafya.Ui.Patient_Ui;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ast.teleafya.R;

public class Order_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();
        Order_Medicine_Home fragmentS1 = new Order_Medicine_Home();
        getSupportFragmentManager().beginTransaction().add(R.id.Container_Order, fragmentS1).commit();


    }
}
