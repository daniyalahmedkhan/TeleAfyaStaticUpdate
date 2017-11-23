package com.example.ast.teleafya.Ui.Patient_Ui;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.ast.teleafya.R;

/**
 * Created by Kashif on 11/19/2017.
 */

public class Book_Test_Appointment extends android.support.v4.app.Fragment {


    public Button confirm_app;
    public Dialog filter_Regular_Service;
    RelativeLayout relativeLayout, relativeLayout2;

    LinearLayout linearLayout , linearLayout2;
    ImageView small , large;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.book_test_appointment,null);
        View completeView = getActivity().getLayoutInflater().inflate(R.layout.successfuly_apointment, null);
        confirm_app = (Button)view.findViewById(R.id.confirm_app);
        filter_Regular_Service = new Dialog(getActivity());
        filter_Regular_Service.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        filter_Regular_Service.setContentView(completeView);

        confirm_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                filter_Regular_Service.show();
            }
        });


        small = (ImageView)view.findViewById(R.id.SmallRound);
        large = (ImageView)view.findViewById(R.id.LargeRound);


        // small.setVisibility(View.GONE);
        large.setVisibility(View.GONE);



        relativeLayout = (RelativeLayout)view.findViewById(R.id.Relative1);
        relativeLayout2 = (RelativeLayout)view.findViewById(R.id.Relative2);


        linearLayout = (LinearLayout)view.findViewById(R.id.Linear1);
        linearLayout2 = (LinearLayout)view.findViewById(R.id.Linear2);

        linearLayout.setVisibility(View.GONE);
        linearLayout2.setVisibility(View.GONE);

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


//                Toast.makeText(getActivity(), "Hello World" , Toast.LENGTH_SHORT).show();
                if(linearLayout.getVisibility() == View.VISIBLE) {


                    linearLayout.setVisibility(View.GONE);
                    large.setVisibility(View.GONE);

                }else {


                    linearLayout.setVisibility(View.VISIBLE);
                    large.setVisibility(View.VISIBLE);
                }

            }
        });


        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (linearLayout2.getVisibility() == View.VISIBLE){


                    linearLayout2.setVisibility(View.GONE);
                    small.setVisibility(View.GONE);

                }
                else {

                    linearLayout2.setVisibility(View.VISIBLE);
                    small.setVisibility(View.VISIBLE);
                }
            }
        });


        return view;



    }


}

