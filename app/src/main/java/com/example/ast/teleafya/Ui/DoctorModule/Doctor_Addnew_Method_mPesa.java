package com.example.ast.teleafya.Ui.DoctorModule;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Activities.Doctor_Activity;

/**
 * Created by Kashif on 11/28/2017.
 */

public class Doctor_Addnew_Method_mPesa extends android.support.v4.app.Fragment {

    Button btn1;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_add_new_method_mpesa , null);


        btn1 = (Button)view.findViewById(R.id.Save_Mpesa);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity() , Doctor_Activity.class);
                startActivity(intent);

            }
        });

        return view;
    }
}
