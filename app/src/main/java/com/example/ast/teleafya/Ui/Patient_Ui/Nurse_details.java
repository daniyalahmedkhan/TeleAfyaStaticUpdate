package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.ast.teleafya.R;

/**
 * Created by Kashif on 11/21/2017.
 */

public class Nurse_details extends android.support.v4.app.Fragment {

    Button btn1;
    RelativeLayout R1,R1S, R2,R2s , R3,R3s , R5,R5s , R6,R6s;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.nurse_details,null);


        btn1 = (Button)view.findViewById(R.id.confirm_app);

        R1 = (RelativeLayout)view.findViewById(R.id.Relative2);
        R1S = (RelativeLayout)view.findViewById(R.id.Relative2show);



        R2 = (RelativeLayout)view.findViewById(R.id.Relative5);
        R2s = (RelativeLayout)view.findViewById(R.id.Relative5show);


        R3 = (RelativeLayout)view.findViewById(R.id.Relative5n3 );
        R3s = (RelativeLayout)view.findViewById(R.id.Relative5n3show);


        R5 = (RelativeLayout)view.findViewById(R.id.Relative5n4th  );
        R5s = (RelativeLayout)view.findViewById(R.id.Relative5n4thshow);


        R6 = (RelativeLayout)view.findViewById(R.id.Relative5n5th   );
        R6s = (RelativeLayout)view.findViewById(R.id.Relative5n5thshow);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




            }
        });

        R1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (R1S.getVisibility() == View.GONE){

                    R1S.setVisibility(View.VISIBLE);

                }else {

                    R1S.setVisibility(View.GONE);
                }


            }
        });




        R2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (R2s.getVisibility() == View.GONE){

                    R2s.setVisibility(View.VISIBLE);

                }else {

                    R2s.setVisibility(View.GONE);
                }


            }
        });


        R3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (R3s.getVisibility() == View.GONE){

                    R3s.setVisibility(View.VISIBLE);

                }else {

                    R3s.setVisibility(View.GONE);
                }


            }
        });


        R5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (R5s.getVisibility() == View.GONE){

                    R5s.setVisibility(View.VISIBLE);

                }else {

                    R5s.setVisibility(View.GONE);
                }


            }
        });


        R6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (R6s.getVisibility() == View.GONE){

                    R6s.setVisibility(View.VISIBLE);

                }else {

                    R6s.setVisibility(View.GONE);
                }


            }
        });


        return view;
    }
}
