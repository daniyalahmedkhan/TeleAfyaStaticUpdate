package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Family_test_diag_Adapter;

import java.util.ArrayList;

/**
 * Created by AST on 10/27/2017.
 */

public class Family_Test_Diag extends android.support.v4.app.Fragment {
    public ListView family_test_diag;
    public ArrayList<String> arrayList;
    public Family_test_diag_Adapter family_test_diag_adapter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.family_test_diag,null);
        family_test_diag = (ListView)view.findViewById(R.id.family_test_diag);
        arrayList = new ArrayList<>();

        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");


        family_test_diag_adapter  = new Family_test_diag_Adapter(arrayList,getActivity());
        family_test_diag.setAdapter(family_test_diag_adapter);

        return view;
    }
}
