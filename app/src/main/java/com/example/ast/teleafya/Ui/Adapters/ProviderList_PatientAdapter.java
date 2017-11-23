package com.example.ast.teleafya.Ui.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ast.teleafya.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by AST on 10/24/2017.
 */

public class ProviderList_PatientAdapter extends BaseAdapter {

    public ArrayList<String> patient_appointments;
    public Context context;
    public CircleImageView provider_image;
    public TextView provider_name;

    public ProviderList_PatientAdapter(ArrayList<String> patient_appointments, Context context) {
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

        View v = layoutInflater.inflate(R.layout.provider_list_patient,null);
        provider_image = (CircleImageView)v.findViewById(R.id.provider_image);
        provider_name = (TextView)v.findViewById(R.id.provider_name);

        if(patient_appointments.get(i).equals("Doctors")){
            provider_image.setImageResource(R.mipmap.doctors_img);
            provider_name.setText("Doctor");
        }else if(patient_appointments.get(i).equals("Nurse")){
            provider_image.setImageResource(R.mipmap.nurse_img);
            provider_name.setText("Nurse");
        }else if(patient_appointments.get(i).equals("Mid Wive")){
            provider_image.setImageResource(R.mipmap.mid_wive_img);
            provider_name.setText("Mid Wive");
        }else if(patient_appointments.get(i).equals("Home Health Aided")){
            provider_image.setImageResource(R.mipmap.home_health_aide_img);
            provider_name.setText("Home Health Aided");
        }else if(patient_appointments.get(i).equals("Dentist")){
            provider_image.setImageResource(R.mipmap.dentist_img);
            provider_name.setText("Dentist");
        }else if(patient_appointments.get(i).equals("Diagnostic Lab")){
            provider_image.setImageResource(R.mipmap.diagnostic_labs_img);
            provider_name.setText("Diagnostic Lab");
        }



        return v;
    }
}
