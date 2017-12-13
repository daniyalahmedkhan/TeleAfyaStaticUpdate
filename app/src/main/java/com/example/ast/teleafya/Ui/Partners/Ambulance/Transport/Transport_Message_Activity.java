package com.example.ast.teleafya.Ui.Partners.Ambulance.Transport;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Patient_LoginPager;
import com.example.ast.teleafya.Ui.DoctorModule.Docotr_MSG_Tab_Screen;
import com.example.ast.teleafya.Ui.DoctorModule.Doctor_Call_Tab_Screen;
import com.example.ast.teleafya.Ui.Partners.Ambulance.Ambulance.MessageTabScreen;

import java.util.ArrayList;

public class Transport_Message_Activity extends AppCompatActivity {

    ImageView imageView;
    public ViewPager viewPager;
    public TabLayout tabLayout;
    public ArrayList<Fragment> arrayList;
    public Transport_MessageTab_Screen transportMessageTabScreen;
    public Transport_CallTab_Screen transportCallTabScreen;



    public Patient_LoginPager patientLoginPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport__message_);


                initView();


    }

    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        arrayList = new ArrayList<>();
        transportMessageTabScreen = new Transport_MessageTab_Screen();
        transportCallTabScreen = new Transport_CallTab_Screen();


        arrayList.add(transportMessageTabScreen);
        arrayList.add(transportCallTabScreen);

        tabLayout.addTab(tabLayout.newTab().setText("CHAT"));
        tabLayout.addTab(tabLayout.newTab().setText("CALL"));

        patientLoginPager = new Patient_LoginPager(Transport_Message_Activity.this.getSupportFragmentManager(), arrayList);
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
