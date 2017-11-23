package com.example.ast.teleafya.Ui.Pharmacy_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ast.teleafya.R;

/**
 * Created by AST on 11/1/2017.
 */

public class Open_OrderDetails_Pharmacy extends android.support.v4.app.Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.openorder_detail_view,null);


        return view;
    }
}
