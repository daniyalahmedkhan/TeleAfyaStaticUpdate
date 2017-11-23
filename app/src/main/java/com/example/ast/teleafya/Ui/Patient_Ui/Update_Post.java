package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.ast.teleafya.R;

/**
 * Created by AST on 10/25/2017.
 */

public class Update_Post extends android.support.v4.app.Fragment {

    public ImageView add_people;
    public ImageView back_image;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.update_post,null);
        initViews(view);

        add_people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.post_container, new Add_People_Post())
                        .addToBackStack(null)
                        .commit();
            }
        });

        back_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager()
                        .popBackStack();
            }
        });

        return view;
    }

    private void initViews(View view) {
        add_people = (ImageView)view.findViewById(R.id.add_people);
        back_image = (ImageView)view.findViewById(R.id.back_image);
    }
}
