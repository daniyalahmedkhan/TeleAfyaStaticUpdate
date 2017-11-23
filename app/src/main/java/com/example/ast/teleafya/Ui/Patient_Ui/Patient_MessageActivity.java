package com.example.ast.teleafya.Ui.Patient_Ui;

import android.content.Intent;
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
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Navigations_ItemsAdapter;
import com.example.ast.teleafya.Ui.Adapters.Patient_LoginPager;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.util.ArrayList;

public class Patient_MessageActivity extends AppCompatActivity {
    public ViewPager viewPager;
    public TabLayout tabLayout;
    public DrawerLayout drawer_layout;
    public ListView mDrawerList;
    public ArrayList<Fragment> fragments;
    private ActionBarDrawerToggle mDrawerToggle;
    public String[] menuName= {"APPOINTMENTS","MY DOCTOR","MY PAYMENTS","HEALTH VAULTS","ORDER MACHINE","REMINDERS","SAVED ARTCLES","ABOUT","SETTING","HELP","FEEDBACK"};
    public int[] menuicons = {R.mipmap.appointments,R.mipmap.doctors,R.mipmap.payments,
            R.mipmap.health_vault,R.mipmap.medicine_ordered,R.mipmap.payments,R.mipmap.saved_articles,
            R.mipmap.about,R.mipmap.settings,R.mipmap.help,R.mipmap.feedback};

    public RelativeLayout message_container;
    public Patient_LoginPager patientLoginPager;
    public LinearLayout home_view,timeline_view,appointment_view,provider_view;
    public Patient_Call_Fragment patient_call_fragment;
    public Patient_MsgFragment patient_msgFragment;

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

        setContentView(R.layout.activity_patient__message);
        message_container = (RelativeLayout) findViewById(R.id.message_container);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        fragments = new ArrayList<>();
        home_view = (LinearLayout) findViewById(R.id.home_view);
        provider_view = (LinearLayout) findViewById(R.id.provider_view);
        appointment_view = (LinearLayout) findViewById(R.id.appointment_view);
        timeline_view = (LinearLayout) findViewById(R.id.timeline_view);
        patient_call_fragment = new Patient_Call_Fragment();
        patient_msgFragment = new Patient_MsgFragment();

        fragments.add(patient_msgFragment);
        fragments.add(patient_call_fragment);


        tabLayout.addTab(tabLayout.newTab().setText("CHAT"));
        tabLayout.addTab(tabLayout.newTab().setText("CALL"));

        patientLoginPager = new Patient_LoginPager(Patient_MessageActivity.this.getSupportFragmentManager(), fragments);
        //is line se tablayout k neche jo shade araaha hai woh change hoga pageviewer k mutabik
        viewPager.setAdapter(patientLoginPager);
        // viewPager.setOffscreenPageLimit(0);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        drawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);

        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        View viewinflate = getLayoutInflater().inflate(R.layout.nav_header_main, null);

        Navigations_ItemsAdapter navigations_itemsAdapter = new Navigations_ItemsAdapter(Patient_MessageActivity.this, menuName,menuicons);
        mDrawerList.setAdapter(navigations_itemsAdapter);
        mDrawerList.addHeaderView(viewinflate);

        mDrawerToggle = new ActionBarDrawerToggle(Patient_MessageActivity.this, drawer_layout, null, R.string.app_name, R.string.app_name) {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                message_container.setTranslationX(slideOffset * drawerView.getWidth());
                drawer_layout.bringChildToFront(drawerView);
                drawer_layout.requestLayout();
            }
        };
        drawer_layout.setDrawerListener(mDrawerToggle);

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

        timeline_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Patient_MessageActivity.this,Patient_Timeline_Activity.class);
                startActivity(intent);
           //     finish();
            }
        });

        provider_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Patient_MessageActivity.this,Patient_ProviderActivity.class);
                startActivity(intent);
              //  finish();
            }
        });

        appointment_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Patient_MessageActivity.this,Patient_Appointment_Activity.class);
                startActivity(intent);
             //   finish();
            }
        });

        home_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Patient_MessageActivity.this,Patient_HomeActivity.class);
                startActivity(intent);
             //   finish();
            }
        });


    }
}
