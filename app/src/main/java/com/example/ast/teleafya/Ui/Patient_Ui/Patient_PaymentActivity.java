package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Patient_LoginPager;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.util.ArrayList;

public class Patient_PaymentActivity extends AppCompatActivity {
    public DrawerLayout drawer_layout;
    public ViewPager viewPager;
    public TabLayout tabLayout;
    public ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    public ArrayList<Fragment> fragments;
    public Patient_LoginPager patientLoginPager;
    public Pateint_Last_Transaction last_transaction;
    public Patient_Save_Cards patient_save_cards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();

        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.KITKAT) {
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            SystemBarTintManager tintManager = new SystemBarTintManager(this);
            tintManager.setStatusBarTintEnabled(true);
            tintManager.setStatusBarTintColor(getResources().getColor(R.color.transparent));


        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

            getWindow().setStatusBarColor(getResources().getColor(R.color.transparent));
        }
        setContentView(R.layout.activity_patient__payment);
        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        viewPager = (ViewPager)findViewById(R.id.view_pager);
        last_transaction = new Pateint_Last_Transaction();
        patient_save_cards = new Patient_Save_Cards();
        fragments = new ArrayList<>();
        fragments.add(last_transaction);
        fragments.add(patient_save_cards);


        tabLayout.addTab(tabLayout.newTab().setText("LAST TRANSACTION"));
        tabLayout.addTab(tabLayout.newTab().setText("SAVED CARDS"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        patientLoginPager = new Patient_LoginPager(Patient_PaymentActivity.this.getSupportFragmentManager(), fragments);
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
