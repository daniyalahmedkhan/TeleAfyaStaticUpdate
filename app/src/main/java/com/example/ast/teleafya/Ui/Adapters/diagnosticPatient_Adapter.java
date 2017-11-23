package com.example.ast.teleafya.Ui.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.ast.teleafya.R;

import java.util.ArrayList;

/**
 * Created by AST on 10/24/2017.
 */

public class diagnosticPatient_Adapter extends BaseAdapter {

    public ArrayList<String> patient_appointments;
    public Context context;


    public diagnosticPatient_Adapter(ArrayList<String> patient_appointments, Context context) {
        this.patient_appointments = patient_appointments;
        this.context = context;
    }

    @Override
    public int getCount() {
        return patient_appointments.size();
    }

    @Override
    public Object getItem(int i) {
        return patient_appointments.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater  = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = layoutInflater.inflate(R.layout.item_dia_patient,null);




        return v;
    }
}
