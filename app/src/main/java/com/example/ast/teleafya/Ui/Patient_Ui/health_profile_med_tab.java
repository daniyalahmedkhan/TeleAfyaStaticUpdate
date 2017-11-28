package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Patient_LoginPager;

import java.util.ArrayList;

/**
 * Created by Kashif on 11/27/2017.
 */

public class health_profile_med_tab extends android.support.v4.app.Fragment {

    public ViewPager viewPager;
    public TabLayout tabLayout;
    public ArrayList<android.support.v4.app.Fragment> arrayList;
    public Patient_LoginPager patientLoginPager;
    public health_profile_medication healthProfileMedication;
    public health_profile_medi_today healthProfileMediToday;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.health_profile_tab,null);
        initView(view);


        return view;
    }

    private void initView(View view) {
        viewPager = (ViewPager) view.findViewById(R.id.view_pager);
        tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        arrayList = new ArrayList<>();

        healthProfileMedication = new health_profile_medication();
        healthProfileMediToday = new health_profile_medi_today();

        // map_list = new Map_List();

        arrayList.add(healthProfileMedication);
        arrayList.add(healthProfileMediToday);

        //   arrayList.add(map_list);

        tabLayout.addTab(tabLayout.newTab().setText("ALL MEDICINE"));
        tabLayout.addTab(tabLayout.newTab().setText("TODAY MEDICINE"));


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
