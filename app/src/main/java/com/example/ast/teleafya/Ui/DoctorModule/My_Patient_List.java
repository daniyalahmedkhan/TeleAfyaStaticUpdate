package com.example.ast.teleafya.Ui.DoctorModule;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.ast.teleafya.R;

/**
 * Created by Kashif on 12/4/2017.
 */

public class My_Patient_List extends android.support.v4.app.Fragment {

    ImageView imageView;

    LinearLayout linearLayout;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.my_patient_list , null);


        imageView = (ImageView)view.findViewById(R.id.back_home);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity() , Doctor_HomeActivity.class);
                startActivity(intent);
            }
        });

        linearLayout = (LinearLayout)view.findViewById(R.id.Linear1);


        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                getActivity().getSupportFragmentManager().beginTransaction().add(android.R.id.content ,new Patient_Profile_Tab()).commit();


            }
        });

        return view;
    }
}
