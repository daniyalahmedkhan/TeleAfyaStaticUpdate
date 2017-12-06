package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Patient_LastTransaction_ListAdapter;

import java.util.ArrayList;

/**
 * Created by AST on 10/30/2017.
 */

public class Pateint_Last_Transaction extends android.support.v4.app.Fragment {


    ImageView imageView;
    public ListView last_transaction;
    public ArrayList<String> arrayList;
    public Patient_LastTransaction_ListAdapter patient_lastTransaction_listAdapter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.patient_last_transaction,null);
        last_transaction = (ListView)view.findViewById(R.id.last_transaction);
        arrayList = new ArrayList<>();

        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");

        patient_lastTransaction_listAdapter = new Patient_LastTransaction_ListAdapter(arrayList,getActivity());
        last_transaction.setAdapter(patient_lastTransaction_listAdapter);

        last_transaction.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.payment_patient,new Successfuly_Payment_Patient())
                        .commit();



            }
        });


        return view;
    }
}
