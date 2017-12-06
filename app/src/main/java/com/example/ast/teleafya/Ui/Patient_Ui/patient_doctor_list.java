package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.ast.teleafya.R;

/**
 * Created by Kashif on 12/5/2017.
 */

public class patient_doctor_list extends android.support.v4.app.Fragment {

    ImageView imageView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {



                View view = inflater.inflate(R.layout.patient_doctor_list , null);


                imageView = (ImageView)view.findViewById(R.id.back_home);

                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                       getActivity().finish();

                    }
                });
                return  view;

    }
}
