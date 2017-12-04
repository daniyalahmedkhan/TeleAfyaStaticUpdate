package com.example.ast.teleafya.Ui.DoctorModule;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.ast.teleafya.R;

/**
 * Created by Kashif on 12/4/2017.
 */

public class Doctor_Payment_Details extends android.support.v4.app.Fragment {


    ImageView imageView;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.doctor_payment_detail , null);


        imageView = (ImageView)view.findViewById(R.id.back_press_app);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager().beginTransaction().replace(android.R.id.content , new Doctor_My_Payments()).commit();


            }
        });

        return view;
    }
}
