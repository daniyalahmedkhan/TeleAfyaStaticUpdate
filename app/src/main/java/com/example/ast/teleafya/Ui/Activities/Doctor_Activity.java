package com.example.ast.teleafya.Ui.Activities;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Patient_LoginPager;
import com.example.ast.teleafya.Ui.DoctorModule.Doctor_SignUp;
import com.example.ast.teleafya.Ui.DoctorModule.doctor_signin;
import com.example.ast.teleafya.Ui.Patient_Ui.Patient_SignIn;
import com.example.ast.teleafya.Ui.Patient_Ui.Patient_SignUp;

import java.util.ArrayList;

public class Doctor_Activity extends AppCompatActivity {

    public ViewPager viewPager;
    public TabLayout tabLayout;
    public doctor_signin doctorSignin;
    public Doctor_SignUp doctor_signUp;
    public ArrayList<Fragment> fragments;
    public Patient_LoginPager patientLoginPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_);

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        doctorSignin = new doctor_signin();
        doctor_signUp = new Doctor_SignUp();

        fragments = new ArrayList<>();
        fragments.add(doctorSignin);
        fragments.add(doctor_signUp);


        tabLayout.addTab(tabLayout.newTab().setText("SIGN IN"));
        tabLayout.addTab(tabLayout.newTab().setText("SIGN UP"));

        patientLoginPager = new Patient_LoginPager(getSupportFragmentManager(), fragments);
        //is line se tablayout k neche jo shade araaha hai woh change hoga pageviewer k mutabik
        viewPager.setAdapter(patientLoginPager);
        // viewPager.setOffscreenPageLimit(0);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        //  viewPager.addOnPageChangeListener(new TabLayoutWithArrow.TabLayoutOnPageChangeListener(tabLayout));
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
