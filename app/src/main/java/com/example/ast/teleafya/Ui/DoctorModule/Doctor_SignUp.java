package com.example.ast.teleafya.Ui.DoctorModule;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.EditText;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Custom_Views.Activity_DatePicker;

/**
 * Created by AST on 10/23/2017.
 */

public class Doctor_SignUp extends  android.support.v4.app.Fragment {
    EditText date_of_bith;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.doctor_signup,null);

        findView(view);

        return view;
    }

    public void findView(View view)
    {
        date_of_bith=(EditText)view.findViewById(R.id.date_of_bith);

        date_of_bith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), Activity_DatePicker.class);
                startActivity(intent);
            }
        });

    }
}
