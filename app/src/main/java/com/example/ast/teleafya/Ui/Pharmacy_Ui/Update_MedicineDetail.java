package com.example.ast.teleafya.Ui.Pharmacy_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.ast.teleafya.R;

/**
 * Created by AST on 11/1/2017.
 */

public class Update_MedicineDetail extends android.support.v4.app.Fragment {
    public ImageView back_home;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.update_medicine_detail,null);
        back_home = (ImageView)view.findViewById(R.id.back_home);

        back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        return view;
    }
}
