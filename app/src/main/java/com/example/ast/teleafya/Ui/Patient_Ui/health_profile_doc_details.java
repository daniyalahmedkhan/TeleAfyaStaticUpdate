package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.ast.teleafya.R;

/**
 * Created by Kashif on 11/27/2017.
 */

public class health_profile_doc_details extends android.support.v4.app.Fragment{

    ImageView imageView , back_home;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.health_profile_document_details , null);


        back_home = (ImageView)view.findViewById(R.id.back_home);

        back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


               getActivity().getSupportFragmentManager().beginTransaction().replace(android.R.id.content , new health_profile_doc_list()).commit();

            }
        });

        imageView = (ImageView)view.findViewById(R.id.IMG1);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager().beginTransaction().add(android.R.id.content , new health_profile_img_view()).commit();

            }
        });

        return view;
    }
}
