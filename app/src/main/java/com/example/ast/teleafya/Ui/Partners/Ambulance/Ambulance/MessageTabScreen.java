package com.example.ast.teleafya.Ui.Partners.Ambulance.Ambulance;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Patient_LoginPager;
import com.example.ast.teleafya.Ui.DoctorModule.Docotr_MSG_Tab_Screen;
import com.example.ast.teleafya.Ui.DoctorModule.Doctor_Call_Tab_Screen;

import java.util.ArrayList;

public class MessageTabScreen extends AppCompatActivity {

    ImageView imageView;
    public ViewPager viewPager;
    public TabLayout tabLayout;
    public ArrayList<Fragment> arrayList;
    public Docotr_MSG_Tab_Screen docotrMsgTabScreen;
    public Doctor_Call_Tab_Screen doctorCallTabScreen;
    public Patient_LoginPager patientLoginPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_tab_screen);



        imageView = (ImageView) findViewById(R.id.back_home);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MessageTabScreen.this , Partners_AmbulanceHome.class);
                startActivity(intent);
            }
        });

        initView();

    }

    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        arrayList = new ArrayList<>();
        docotrMsgTabScreen = new Docotr_MSG_Tab_Screen();
        doctorCallTabScreen = new Doctor_Call_Tab_Screen();


        arrayList.add(docotrMsgTabScreen);
        arrayList.add(doctorCallTabScreen);

        tabLayout.addTab(tabLayout.newTab().setText("CHAT"));
        tabLayout.addTab(tabLayout.newTab().setText("CALL"));

        patientLoginPager = new Patient_LoginPager(MessageTabScreen.this.getSupportFragmentManager(), arrayList);
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
