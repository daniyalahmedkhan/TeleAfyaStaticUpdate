package com.example.ast.teleafya.Ui.Patient_Ui;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.example.ast.teleafya.R;

/**
 * Created by Kashif on 11/23/2017.
 */

public class Test_Result_Detail extends android.support.v4.app.Fragment {


    LinearLayout linearLayout , linearLayout2;
    public Dialog dlg;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.test_result_detail , null);

        linearLayout = (LinearLayout)view.findViewById(R.id.LDL);


        View completeView = getActivity().getLayoutInflater().inflate(R.layout.create_test_result_type, null);

        linearLayout2 = (LinearLayout)completeView.findViewById(R.id.Linear1Top);

        dlg = new Dialog(getActivity());
        dlg.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dlg.setContentView(completeView);
        dlg.setCancelable(true);



        Window window = dlg.getWindow();
        WindowManager.LayoutParams wlp = window.getAttributes();
        wlp.gravity = Gravity.BOTTOM;
        wlp.flags &= ~WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        window.setAttributes(wlp);


        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dlg.dismiss();

            getActivity().getSupportFragmentManager().beginTransaction().replace(android.R.id.content , new Create_Test_Result_Form()).commit();

            }
        });




        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            dlg.show();

            }
        });

        return view;
    }
}
