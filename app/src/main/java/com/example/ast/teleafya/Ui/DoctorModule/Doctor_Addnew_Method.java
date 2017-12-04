package com.example.ast.teleafya.Ui.DoctorModule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ast.teleafya.R;

/**
 * Created by Kashif on 11/28/2017.
 */

public class Doctor_Addnew_Method extends android.support.v4.app.Fragment {

    Button btnSave;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_add_new_method , null);

        btnSave = (Button)view.findViewById(R.id.btnSaveInfo);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager().beginTransaction().replace(android.R.id.content , new Doctor_Addnew_Method_mPesa()).commit();
            }
        });

        return view;
    }
}
