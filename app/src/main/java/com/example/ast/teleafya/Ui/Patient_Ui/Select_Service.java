package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Choose_Special_Screen_Adapter;

/**
 * Created by Kashif on 11/16/2017.
 */


public class Select_Service extends android.support.v4.app.Fragment {

    GridView gridView;
    LinearLayout linearLayout;

    String letters[] = {"ASTHMA " , "COLD & FLU" , "EYE ISSUE" , "PREGNANCY" , "PEDIATRIC ISSUES" , "MENTAL HEALTH"};

    int imgs[] = { R.mipmap.asthma , R.mipmap.cold , R.mipmap.eye , R.mipmap.pregnancy,

            R.mipmap.issurs , R.mipmap.mental };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.choose_special_screen,null);


        gridView = (GridView)view.findViewById(R.id.gridView);
        linearLayout = (LinearLayout)view.findViewById(R.id.Linear1);

        gridView.setAdapter(new Choose_Special_Screen_Adapter(getActivity(), imgs, letters));


        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .add(android.R.id.content, new Doctors_Tabs())
                        .addToBackStack(null)
                        .commit();

            }
        });

        return view;
    }
}
