package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ast.teleafya.R;

/**
 * Created by Kashif on 11/22/2017.
 */

public class Order_Medicine_PDP extends android.support.v4.app.Fragment {

    Button btn1;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.order_medicine_pdp,null);


        btn1 = (Button)view.findViewById(R.id.PDPbtn);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(android.R.id.content , new Order_Medicine_Cart()).commit();

            }
        });

        return view;
    }
}
