package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Grid_Familymember_Adapter;

import java.util.ArrayList;

/**
 * Created by AST on 10/27/2017.
 */

public class Family_Members extends android.support.v4.app.Fragment {

    public GridView grid_view;
    public ArrayList<String> arrayList;
    public Grid_Familymember_Adapter grid_familymember_adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.family_member,null);
        grid_view  = (GridView)view.findViewById(R.id.grid_view);
        arrayList = new ArrayList<>();

        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");


        grid_familymember_adapter = new Grid_Familymember_Adapter(arrayList,getActivity());
        grid_view.setAdapter(grid_familymember_adapter);

        return view;
    }
}
