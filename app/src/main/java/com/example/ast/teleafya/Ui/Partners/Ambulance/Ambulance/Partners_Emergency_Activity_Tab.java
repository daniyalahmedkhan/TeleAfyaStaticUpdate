package com.example.ast.teleafya.Ui.Partners.Ambulance.Ambulance;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Patient_LoginPager;
import com.example.ast.teleafya.Ui.Patient_Ui.Map_List;
import com.example.ast.teleafya.Ui.Patient_Ui.Nurses;

import java.util.ArrayList;

public class Partners_Emergency_Activity_Tab extends AppCompatActivity {

    public ViewPager viewPager;
    public TabLayout tabLayout;
    public ArrayList<Fragment> arrayList;
    public partners_emergency_call partnersEmergencyCall;
    public  partners_appointment_screen partnersAppointmentScreen;
    public Patient_LoginPager patientLoginPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partners__emergency___tab);

        initView();

    }


    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        arrayList = new ArrayList<>();
        partnersEmergencyCall = new partners_emergency_call();
        partnersAppointmentScreen = new partners_appointment_screen();


        arrayList.add(partnersEmergencyCall);
        arrayList.add(partnersAppointmentScreen);

        tabLayout.addTab(tabLayout.newTab().setText("CALLS"));
        tabLayout.addTab(tabLayout.newTab().setText("APPOINTMENT"));

        patientLoginPager = new Patient_LoginPager(Partners_Emergency_Activity_Tab.this.getSupportFragmentManager(), arrayList);
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
