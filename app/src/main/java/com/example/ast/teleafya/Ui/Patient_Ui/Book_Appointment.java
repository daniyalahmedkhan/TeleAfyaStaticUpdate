package com.example.ast.teleafya.Ui.Patient_Ui;

import android.app.Activity;
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
import android.widget.Switch;
import android.widget.Toast;

import com.aigestudio.wheelpicker.WheelPicker;
import com.aigestudio.wheelpicker.widgets.WheelDatePicker;
import com.example.ast.teleafya.R;

/**
 * Created by AST on 10/25/2017.
 */

public class Book_Appointment extends Activity {

    public Button confirm_app;
    public Dialog filter_Regular_Service;
    RelativeLayout relativeLayout, relativeLayout2;

    LinearLayout linearLayout , linearLayout2;
    ImageView small , large;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_appointment);
        confirm_app = (Button)findViewById(R.id.confirm_app);
        View completeView = getLayoutInflater().inflate(R.layout.successfuly_apointment, null);
        filter_Regular_Service = new Dialog(this);
        filter_Regular_Service.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        filter_Regular_Service.setContentView(completeView);

        confirm_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                filter_Regular_Service.show();
            }
        });

        small = (ImageView)findViewById(R.id.SmallRound);
        large = (ImageView)findViewById(R.id.LargeRound);


        // small.setVisibility(View.GONE);
//        large.setVisibility(View.GONE);



        relativeLayout = (RelativeLayout)findViewById(R.id.Relative1);
        relativeLayout2 = (RelativeLayout)findViewById(R.id.Relative2);


        linearLayout = (LinearLayout)findViewById(R.id.Linear1);
        linearLayout2 = (LinearLayout)findViewById(R.id.Linear2);

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

    }


  


}
