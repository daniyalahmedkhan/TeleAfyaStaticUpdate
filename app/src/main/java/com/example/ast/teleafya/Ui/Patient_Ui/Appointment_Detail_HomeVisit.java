package com.example.ast.teleafya.Ui.Patient_Ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.ast.teleafya.R;

/**
 * Created by AST on 10/24/2017.
 */

public class Appointment_Detail_HomeVisit extends android.support.v4.app.Fragment {

    public ImageView back_press_app;
    public ImageView map_view;
    public Button reshedule_app;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.appointment_detail_home_visit, null);
        initViews(view);

        back_press_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        map_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                getActivity().getSupportFragmentManager()
//                        .beginTransaction()
//                        .replace(android.R.id.content, new Doctor_Location())
//                        .addToBackStack(null)
//                        .commit();

                Intent i = new Intent(getActivity() , Doctor_Location.class);
                startActivity(i);
            }
        });


        return view;
    }

    private void initViews(View view) {
        back_press_app = (ImageView) view.findViewById(R.id.back_press_app);
        map_view = (ImageView) view.findViewById(R.id.map_view);
        reshedule_app = (Button)view.findViewById(R.id.reshedule_app);

//        reshedule_app.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(getActivity(),Book_Appointment.class);
//                startActivity(intent);
////                getActivity().getSupportFragmentManager()
////                        .beginTransaction()
////                        .replace(R.id.p_nav_container, new Book_Appointment())
////                        .addToBackStack(null)
////                        .commit();
//            }
//        });

    }
}
