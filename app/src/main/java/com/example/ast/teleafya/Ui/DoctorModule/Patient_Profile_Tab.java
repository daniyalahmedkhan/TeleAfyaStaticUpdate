package com.example.ast.teleafya.Ui.DoctorModule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Patient_LoginPager;
import com.example.ast.teleafya.Ui.Patient_Ui.Map_List;
import com.example.ast.teleafya.Ui.Patient_Ui.Nurses;

import java.util.ArrayList;

/**
 * Created by Kashif on 12/4/2017.
 */

public class Patient_Profile_Tab extends android.support.v4.app.Fragment {

    ImageView imageView;
    public ViewPager viewPager;
    public TabLayout tabLayout;
    public ArrayList<Fragment> arrayList;
    public Patient_Profile_Health_Status patientProfileHealthStatus;
    public  Patient_Profile_Medication_Tab patientProfileMedicationTab;
    public Patient_Profile_Allergies_Tab patient_profile_allergies_tab;
    public Patient_LoginPager patientLoginPager;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.patient_profile , null);

        initView(view);


        imageView = (ImageView)view.findViewById(R.id.nav_icon);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                getActivity().getSupportFragmentManager().beginTransaction().add(android.R.id.content , new My_Patient_List()).commit();

            }
        });
        return view;

        }


    private void initView(View view) {
        viewPager = (ViewPager) view.findViewById(R.id.view_pager);
        tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        arrayList = new ArrayList<>();
        patientProfileHealthStatus = new Patient_Profile_Health_Status();
        patientProfileMedicationTab = new Patient_Profile_Medication_Tab();
        patient_profile_allergies_tab = new Patient_Profile_Allergies_Tab();



        arrayList.add(patientProfileHealthStatus);
        arrayList.add(patientProfileMedicationTab);
        arrayList.add(patient_profile_allergies_tab);

        tabLayout.addTab(tabLayout.newTab().setText("HEALTH STATUS"));
        tabLayout.addTab(tabLayout.newTab().setText("MEDICATION"));
        tabLayout.addTab(tabLayout.newTab().setText("ALLERGIES"));

        patientLoginPager = new Patient_LoginPager(getActivity().getSupportFragmentManager(), arrayList);
        //is line se tablayout k neche jo shade araaha hai woh change hoga pageviewer k mutabik
        viewPager.setAdapter(patientLoginPager);
        // viewPager.setOffscreenPageLimit(0);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }



}
