package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Recommanded_DiagListAdapter;
import com.example.ast.teleafya.Ui.Adapters.TestOrder_DiagnosticAdapter;

import java.util.ArrayList;

/**
 * Created by AST on 10/27/2017.
 */

public class TestOrder_Diagnostic extends android.support.v4.app.Fragment {

    public ListView testorder_list;
    public ArrayList<String> arrayList;
    public TestOrder_DiagnosticAdapter recommanded_diagListAdapter;
    public ImageView back_home;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.testorder_diag_home,null);

        testorder_list = (ListView)view.findViewById(R.id.testorder_list);
        back_home  = (ImageView)view.findViewById(R.id.back_home);
        arrayList = new ArrayList<>();

        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");


        recommanded_diagListAdapter = new TestOrder_DiagnosticAdapter(arrayList,getActivity());
        testorder_list.setAdapter(recommanded_diagListAdapter);


        back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });


        return view;
    }
}
