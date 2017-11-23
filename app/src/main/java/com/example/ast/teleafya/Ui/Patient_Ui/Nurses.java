package com.example.ast.teleafya.Ui.Patient_Ui;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.ast.teleafya.R;

/**
 * Created by Kashif on 11/20/2017.
 */

public class Nurses extends android.support.v4.app.Fragment {

    LinearLayout linearLayout;
    public Dialog book_dialog;
    Button button;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.nurses,null);

        linearLayout = (LinearLayout)view.findViewById(R.id.Linear1);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                View completeView = getActivity().getLayoutInflater().inflate(R.layout.nurses_list_filter, null);

                book_dialog = new Dialog(getActivity());
                book_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
                book_dialog.setContentView(completeView);
                book_dialog.setCancelable(true);
                book_dialog.show();


                button = (Button)completeView.findViewById(R.id.Apply);

                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        book_dialog.dismiss();

                        getActivity().getSupportFragmentManager()
                                .beginTransaction()
                                .add(android.R.id.content,new Nurse_details())
                                .addToBackStack(null)
                                .commit();                    }
                });


            }
        });
        return view;
    }
}
