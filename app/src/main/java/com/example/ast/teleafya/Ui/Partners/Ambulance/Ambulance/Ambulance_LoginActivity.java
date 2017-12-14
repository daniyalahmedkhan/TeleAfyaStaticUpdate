package com.example.ast.teleafya.Ui.Partners.Ambulance.Ambulance;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Patient_LoginPager;
import com.example.ast.teleafya.Ui.DoctorModule.Doctor_SignUp;
import com.example.ast.teleafya.Ui.DoctorModule.doctor_signin;
import com.example.ast.teleafya.Ui.Partners.Ambulance.Dispatcher.Dispatcher_Home_Landing;
import com.example.ast.teleafya.Ui.Partners.Ambulance.Dispatcher.Dispatcher_LoginActivity;

import java.util.ArrayList;
import java.util.List;

import in.goodiebag.carouselpicker.CarouselPicker;

public class Ambulance_LoginActivity extends AppCompatActivity {

    public ViewPager viewPager;
    public TabLayout tabLayout;
    public ArrayList<Fragment> arrayList;
    public Doctor_SignUp doctorSignUp;
    public Ambulance_SignIn ambulanceSignIn;
    public Dispatcher_LoginActivity dispatcherLoginActivity;
    public Patient_LoginPager patientLoginPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance__login);
        initView();


        CarouselPicker carouselPicker = (CarouselPicker) findViewById(R.id.carousel);

        //Case 3 : To populate the picker with both images and text
        List<CarouselPicker.PickerItem> mixItems = new ArrayList<>();
        mixItems.add(new CarouselPicker.DrawableItem(R.mipmap.dispatcher));
        //  mixItems.add(new CarouselPicker.TextItem("Dis", 20));
        mixItems.add(new CarouselPicker.DrawableItem(R.mipmap.ambulance));
        //  mixItems.add(new CarouselPicker.TextItem("Amb", 20));
        mixItems.add(new CarouselPicker.DrawableItem(R.mipmap.transport));
        //  mixItems.add(new CarouselPicker.TextItem("Tra", 20));
        CarouselPicker.CarouselViewAdapter mixAdapter = new CarouselPicker.CarouselViewAdapter(this, mixItems, 0);
        carouselPicker.setAdapter(mixAdapter);


        carouselPicker.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //position of the selected item


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }


    private void initView() {

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        arrayList = new ArrayList<>();
        ambulanceSignIn = new Ambulance_SignIn();
        doctorSignUp = new Doctor_SignUp();


        arrayList.add(ambulanceSignIn);
        arrayList.add(doctorSignUp);

        tabLayout.addTab(tabLayout.newTab().setText("SIGN IN "));
        tabLayout.addTab(tabLayout.newTab().setText("SIGN UP"));

        patientLoginPager = new Patient_LoginPager(Ambulance_LoginActivity.this.getSupportFragmentManager(), arrayList);
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


    private void initView2() {
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        arrayList = new ArrayList<>();
        dispatcherLoginActivity = new Dispatcher_LoginActivity();
        doctorSignUp = new Doctor_SignUp();


        arrayList.add(dispatcherLoginActivity);
        arrayList.add(doctorSignUp);

        tabLayout.addTab(tabLayout.newTab().setText("SIGN IN "));
        tabLayout.addTab(tabLayout.newTab().setText("SIGN UP"));

        patientLoginPager = new Patient_LoginPager(Ambulance_LoginActivity.this.getSupportFragmentManager(), arrayList);
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

