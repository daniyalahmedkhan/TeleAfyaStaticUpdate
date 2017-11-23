package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Patient_Card_Adapter;

import java.util.ArrayList;

/**
 * Created by AST on 10/30/2017.
 */

public class Patient_Save_Cards extends android.support.v4.app.Fragment {

    public ListView user_card;
    public ArrayList<String> arrayList;
    public Patient_Card_Adapter patient_card_adapter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.patient_save_card,null);
        user_card = (ListView)view.findViewById(R.id.user_card);
        arrayList = new ArrayList<>();

        arrayList.add("");
        arrayList.add("");

        patient_card_adapter = new Patient_Card_Adapter(getActivity(),arrayList);
        user_card.setAdapter(patient_card_adapter);

        return view;
    }
}
