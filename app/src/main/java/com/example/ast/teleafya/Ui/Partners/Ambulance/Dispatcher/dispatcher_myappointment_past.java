package com.example.ast.teleafya.Ui.Partners.Ambulance.Dispatcher;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.ast.teleafya.R;

/**
 * Created by Kashif on 12/9/2017.
 */

public class dispatcher_myappointment_past extends android.support.v4.app.Fragment {

    LinearLayout linearLayout;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.dispatcher_myappointment_past , null);


        linearLayout = (LinearLayout)view.findViewById(R.id.LinearTop);


        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                getActivity().getSupportFragmentManager().beginTransaction().add(android.R.id.content , new dispatcher_myappointment_details_view()).commit();




            }
        });

        return view;

    }
}
