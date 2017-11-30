package com.example.ast.teleafya.Ui.DoctorModule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.ast.teleafya.R;

/**
 * Created by Kashif on 11/30/2017.
 */

public class MY_Appointment_TabRequest extends android.support.v4.app.Fragment {

    LinearLayout linearLayout;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_appointment_tab_request , null);


        linearLayout = (LinearLayout)view.findViewById(R.id.Linear1);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager().beginTransaction().add(android.R.id.content , new MY_Appointment_TabRequestDetail()).commit();
            }
        });
        return view;
    }
}
