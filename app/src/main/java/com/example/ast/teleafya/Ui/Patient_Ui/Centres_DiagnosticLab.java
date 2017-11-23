package com.example.ast.teleafya.Ui.Patient_Ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Centres_DiagLab_Adapter;
import com.example.ast.teleafya.Ui.Adapters.Past_Patient_App;

import java.util.ArrayList;

/**
 * Created by AST on 10/26/2017.
 */

public class Centres_DiagnosticLab extends android.support.v4.app.Fragment {

    public ListView center_diag_lab;
    public Centres_DiagLab_Adapter centres_diagLab_adapter;
    public ArrayList<String> arrayList;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_centre_diaglab,null);
        center_diag_lab  =(ListView)view.findViewById(R.id.center_diag_lab);

        arrayList = new ArrayList<>();

        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");

        centres_diagLab_adapter = new Centres_DiagLab_Adapter(arrayList,getActivity());
        center_diag_lab.setAdapter(centres_diagLab_adapter);




        center_diag_lab.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent=new Intent(getActivity(),Diagnostic_Center_Profile.class);
                startActivity(intent);
//                getActivity().getSupportFragmentManager()
//                        .beginTransaction()
//                        .replace(R.id.provider_container,new Diagnostic_Center_Profile())
//                        .addToBackStack(null)
//                        .commit();
            }
        });




        return view;
    }

}
