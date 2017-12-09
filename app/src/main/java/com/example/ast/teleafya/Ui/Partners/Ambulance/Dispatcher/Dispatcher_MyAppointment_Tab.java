package com.example.ast.teleafya.Ui.Partners.Ambulance.Dispatcher;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Patient_LoginPager;
import com.example.ast.teleafya.Ui.DoctorModule.MY_Appointment_TabRequest;
import com.example.ast.teleafya.Ui.DoctorModule.My_Appointment_TabPast;
import com.example.ast.teleafya.Ui.DoctorModule.My_Appointment_TabUpcoming;

import java.util.ArrayList;

public class Dispatcher_MyAppointment_Tab extends AppCompatActivity {

    public ViewPager viewPager;
    public TabLayout tabLayout;
    public ArrayList<Fragment> arrayList;
    public dispatcher_myappointment_past dispatcherMyappointmentPast;
    public dispatcher_myappointment_upcoming dispatcherMyappointmentUpcoming;
    public ArrayList<Fragment> fragments;
    public Patient_LoginPager patientLoginPager;
    ImageView backHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispatcher__my_appointment__tab);

        initView();


    }


    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        arrayList = new ArrayList<>();
        dispatcherMyappointmentUpcoming = new dispatcher_myappointment_upcoming();
        dispatcherMyappointmentPast = new dispatcher_myappointment_past();


        arrayList.add(dispatcherMyappointmentUpcoming);
        arrayList.add(dispatcherMyappointmentPast);


        tabLayout.addTab(tabLayout.newTab().setText("UPCOMING"));
        tabLayout.addTab(tabLayout.newTab().setText("PAST"));


        patientLoginPager = new Patient_LoginPager(Dispatcher_MyAppointment_Tab.this.getSupportFragmentManager(), arrayList);
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
