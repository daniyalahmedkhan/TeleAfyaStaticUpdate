package com.example.ast.teleafya.Ui.DoctorModule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.ast.teleafya.R;

/**
 * Created by Kashif on 12/4/2017.
 */

public class Patient_Profile_Allergies_Tab extends android.support.v4.app.Fragment {

    RelativeLayout relativeLayout;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.patient_profile_allergies_tab , null);

        relativeLayout = (RelativeLayout) view.findViewById(R.id.FoodLinear);

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                getActivity().getSupportFragmentManager().beginTransaction().add(android.R.id.content , new Patient_Profile_Allergies_Food()).commit();

            }
        });
        return view;
    }
}
