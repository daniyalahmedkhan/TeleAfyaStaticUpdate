package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Patient_CallAdapter;

import java.util.ArrayList;

/**
 * Created by AST on 10/30/2017.
 */

public class Patient_Call_Fragment extends android.support.v4.app.Fragment {

    public ListView call_patient_list;
    public ArrayList<String> arrayList;
    public Patient_CallAdapter patient_callAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.patient_call_layout,null);

        call_patient_list = (ListView)view.findViewById(R.id.call_patient_list);
        arrayList = new ArrayList<>();

        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");

        patient_callAdapter = new Patient_CallAdapter(arrayList,getActivity());
        call_patient_list.setAdapter(patient_callAdapter);

        return view;
    }
}
