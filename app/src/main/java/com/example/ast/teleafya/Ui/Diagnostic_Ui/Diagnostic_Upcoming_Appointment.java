package com.example.ast.teleafya.Ui.Diagnostic_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Upcoming_Diagnostic_App;
import com.example.ast.teleafya.Ui.Adapters.Upcoming_Patient_App;
import com.example.ast.teleafya.Ui.Patient_Ui.Appointment_Detail_HomeVisit;

import java.util.ArrayList;

/**
 * Created by AST on 10/24/2017.
 */

public class Diagnostic_Upcoming_Appointment extends android.support.v4.app.Fragment {

    public ListView pateint_upcom_app;
    public ArrayList<String> arrayList;
    public Upcoming_Diagnostic_App past_patient_app;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.diagnostic_upcoming_app,null);
        intializeView(view);


        return view;
    }

    private void intializeView(View view) {
        pateint_upcom_app = (ListView)view.findViewById(R.id.diagnostic_upcoming_app);
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

        past_patient_app = new Upcoming_Diagnostic_App(arrayList,getActivity());
        pateint_upcom_app.setAdapter(past_patient_app);

        pateint_upcom_app.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.p_nav_container,new Appointment_Detail_HomeVisit())
                        .addToBackStack(null)
                        .commit();
            }
        });

    }
}
