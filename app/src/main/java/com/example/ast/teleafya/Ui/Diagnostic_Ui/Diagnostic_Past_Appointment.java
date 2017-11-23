package com.example.ast.teleafya.Ui.Diagnostic_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Past_Diagnostic_App;
import com.example.ast.teleafya.Ui.Adapters.Past_Patient_App;
import com.example.ast.teleafya.Ui.Patient_Ui.Appointment_Detail_Location;

import java.util.ArrayList;

/**
 * Created by AST on 10/24/2017.
 */

public class Diagnostic_Past_Appointment extends android.support.v4.app.Fragment {

    public ListView pateint_past_app;
    public Past_Diagnostic_App past_patient_app;
    public ArrayList<String> arrayList;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.diagnostic_past_app,null);
        initilizeView(view);


        return view;
    }

    private void initilizeView(View view) {
        pateint_past_app = (ListView)view.findViewById(R.id.diagnostic_past_app);
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

        past_patient_app = new Past_Diagnostic_App(arrayList,getActivity());
        pateint_past_app.setAdapter(past_patient_app);

        pateint_past_app.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.p_nav_container,new Appointment_Detail_Location())
                        .addToBackStack(null)
                        .commit();
            }
        });

    }
}
