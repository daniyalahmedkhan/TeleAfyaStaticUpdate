package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Completed_Report_Diag_Adapter;
import com.example.ast.teleafya.Ui.Adapters.Progress_Report_Diag_Adapter;

import java.util.ArrayList;

/**
 * Created by AST on 10/27/2017.
 */

public class Complete_Report_Diag extends android.support.v4.app.Fragment {

    public ListView complete_report_diag;
    public ArrayList<String> arrayList;
    public Completed_Report_Diag_Adapter completed_report_diag_adapter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.complete_report_diag,null);
        complete_report_diag = (ListView)view.findViewById(R.id.complete_report_diag);
        arrayList = new ArrayList<>();

        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");

        completed_report_diag_adapter = new Completed_Report_Diag_Adapter(arrayList,getActivity());
        complete_report_diag.setAdapter(completed_report_diag_adapter);

        return view;
    }
}
