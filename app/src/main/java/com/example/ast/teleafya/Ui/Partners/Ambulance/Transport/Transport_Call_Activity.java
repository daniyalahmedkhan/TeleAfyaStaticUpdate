package com.example.ast.teleafya.Ui.Partners.Ambulance.Transport;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Patient_LoginPager;
import com.example.ast.teleafya.Ui.DoctorModule.Doctor_SignUp;
import com.example.ast.teleafya.Ui.Partners.Ambulance.Ambulance.Ambulance_LoginActivity;
import com.example.ast.teleafya.Ui.Partners.Ambulance.Ambulance.Ambulance_SignIn;
import com.example.ast.teleafya.Ui.Partners.Ambulance.Dispatcher.Dispatcher_LoginActivity;

import java.util.ArrayList;

public class Transport_Call_Activity extends AppCompatActivity {



    public ViewPager viewPager;
    public TabLayout tabLayout;
    public ArrayList<Fragment> arrayList;
    public Transport_Call_Tab transportCallTab;
    public Transport_Apointment_Tab transportApointmentTab;
    public Patient_LoginPager patientLoginPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport__call_);


        initView();



    }


    private void initView() {

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        arrayList = new ArrayList<>();
        transportCallTab = new Transport_Call_Tab();
        transportApointmentTab = new Transport_Apointment_Tab();


        arrayList.add(transportCallTab);
        arrayList.add(transportApointmentTab);

        tabLayout.addTab(tabLayout.newTab().setText("SIGN IN "));
        tabLayout.addTab(tabLayout.newTab().setText("SIGN UP"));

        patientLoginPager = new Patient_LoginPager(Transport_Call_Activity.this.getSupportFragmentManager(), arrayList);
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
