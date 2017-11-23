package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.ast.teleafya.R;

/**
 * Created by AST on 10/23/2017.
 */

public class Patient_SignUp extends  android.support.v4.app.Fragment {

    public EditText gender,date_of_bith,country;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public static final Patient_SignUp newInstance(String message)
    {
        Patient_SignUp f = new Patient_SignUp();

        return f;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.patient_signup,null);
        gender = (EditText)view.findViewById(R.id.gender);
        date_of_bith = (EditText)view.findViewById(R.id.date_of_bith);
        country = (EditText)view.findViewById(R.id.country);


        return view;
    }
}
