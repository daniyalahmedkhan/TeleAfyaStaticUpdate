package com.example.ast.teleafya.Ui.Patient_Ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Recommanded_DiagListAdapter;

import java.util.ArrayList;

/**
 * Created by AST on 10/27/2017.
 */

public class TestTab_DiagLab_Profile extends android.support.v4.app.Fragment {

    public ListView recomanded_diag_lab;
    public Recommanded_DiagListAdapter recommanded_diagListAdapter;
    public ArrayList<String> arrayList;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.recommaded_diaglab,null);
        recomanded_diag_lab = (ListView)view.findViewById(R.id.recomanded_diag_lab);
        arrayList = new ArrayList<>();

        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");


        recommanded_diagListAdapter = new Recommanded_DiagListAdapter(arrayList,getActivity());
        recomanded_diag_lab.setAdapter(recommanded_diagListAdapter);

        recomanded_diag_lab.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(getActivity(),Book_Appointment.class);
                startActivity(intent);
//                getActivity().getSupportFragmentManager()
//                        .beginTransaction()
//                        .replace(R.id.p_nav_container, new Book_Appointment())
//                        .addToBackStack(null)
//                        .commit();
            }
        });


        return view;
    }
}
