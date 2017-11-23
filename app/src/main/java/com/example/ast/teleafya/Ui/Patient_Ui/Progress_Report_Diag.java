package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Progress_Report_Diag_Adapter;

import java.util.ArrayList;

/**
 * Created by AST on 10/27/2017.
 */

public class Progress_Report_Diag extends android.support.v4.app.Fragment {

    public ListView progress_report_diag;
    public ArrayList<String> arrayList;
    public Progress_Report_Diag_Adapter progress_report_diag_adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.progress_report_diag,null);
        progress_report_diag = (ListView)view.findViewById(R.id.progress_report_diag);
        arrayList = new ArrayList<>();

        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");

        progress_report_diag_adapter = new Progress_Report_Diag_Adapter(arrayList,getActivity());
        progress_report_diag.setAdapter(progress_report_diag_adapter);
        return view;
    }
}
