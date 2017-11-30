package com.example.ast.teleafya.Ui.DoctorModule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Patient_LoginPager;
import com.example.ast.teleafya.Ui.Patient_Ui.Map_List;
import com.example.ast.teleafya.Ui.Patient_Ui.Nurses;

import java.util.ArrayList;

/**
 * Created by Kashif on 11/30/2017.
 */

public class Doctor_MSG_Tab extends android.support.v4.app.Fragment {

    public ViewPager viewPager;
    public TabLayout tabLayout;
    public ArrayList<Fragment> arrayList;
    public Docotr_MSG_Tab_Screen docotrMsgTabScreen;
    public  Doctor_Call_Tab_Screen doctorCallTabScreen;
    public Patient_LoginPager patientLoginPager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.doctor_msg_tab , null);
        initView(view);



        return view;

    }

    private void initView(View view) {
        viewPager = (ViewPager) view.findViewById(R.id.view_pager);
        tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        arrayList = new ArrayList<>();
        docotrMsgTabScreen = new Docotr_MSG_Tab_Screen();
        doctorCallTabScreen = new Doctor_Call_Tab_Screen();


        arrayList.add(docotrMsgTabScreen);
        arrayList.add(doctorCallTabScreen);

        tabLayout.addTab(tabLayout.newTab().setText("CHAT"));
        tabLayout.addTab(tabLayout.newTab().setText("CALL"));

    patientLoginPager = new Patient_LoginPager(getActivity().getSupportFragmentManager(), arrayList);
        //is line se tablayout k neche jo shade araaha hai woh change hoga pageviewer k mutabik
        viewPager.setAdapter(patientLoginPager);
         viewPager.setOffscreenPageLimit(0);
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
