package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.ast.teleafya.R;

/**
 * Created by Kashif on 11/22/2017.
 */

public class Checkout_Payment_New extends android.support.v4.app.Fragment {


    LinearLayout linearLayout;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.checkout_payment_new , null);

        linearLayout = (LinearLayout)view.findViewById(R.id.LinearDebit);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager().beginTransaction().add(android.R.id.content , new Checkout_Payment()).commit();

            }
        });

        return view;
    }
}
