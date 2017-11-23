package com.example.ast.teleafya.Ui.Patient_Ui;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
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

public class Order_Medicine_Cart extends android.support.v4.app.Fragment {

    Button btn1 , btn2;
    public Dialog book_dialog;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.order_medicine_cart,null);


        btn1 = (Button)view.findViewById(R.id.CartBtn);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                View completeView = getActivity().getLayoutInflater().inflate(R.layout.order_via_shipping_method, null);

                book_dialog = new Dialog(getActivity());
                book_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
                book_dialog.setContentView(completeView);
                book_dialog.setCancelable(true);
                book_dialog.show();


                btn2 = (Button)completeView.findViewById(R.id.btn1);

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        book_dialog.dismiss();

                        getActivity().getSupportFragmentManager()
                                .beginTransaction()
                                .replace(android.R.id.content,new Checkout_Payment())
                                .addToBackStack(null)
                                .commit();                    }
                });


            }
        });

        return view;
    }
}
