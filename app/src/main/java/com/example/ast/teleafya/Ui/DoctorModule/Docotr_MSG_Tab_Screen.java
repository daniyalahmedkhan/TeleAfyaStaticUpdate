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

public class Docotr_MSG_Tab_Screen  extends  android.support.v4.app.Fragment{

    LinearLayout Linear;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.doctor_message_tab_screen , null);


        Linear = (LinearLayout)view.findViewById(R.id.Linar1);
        Linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                getActivity().getSupportFragmentManager().beginTransaction().add(android.R.id.content , new Doctor_MSG_Chat()).commit();

            }
        });
        return view;
    }
}