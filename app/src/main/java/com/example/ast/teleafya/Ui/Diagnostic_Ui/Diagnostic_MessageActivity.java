package com.example.ast.teleafya.Ui.Diagnostic_Ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Navigations_ItemsAdapter;
import com.example.ast.teleafya.Ui.Adapters.Patient_LoginPager;
import com.example.ast.teleafya.Ui.Patient_Ui.Patient_Appointment_Activity;
import com.example.ast.teleafya.Ui.Patient_Ui.Patient_Call_Fragment;
import com.example.ast.teleafya.Ui.Patient_Ui.Patient_HomeActivity;
import com.example.ast.teleafya.Ui.Patient_Ui.Patient_MsgFragment;
import com.example.ast.teleafya.Ui.Patient_Ui.Patient_ProviderActivity;
import com.example.ast.teleafya.Ui.Patient_Ui.Patient_Timeline_Activity;
import com.example.ast.teleafya.Ui.Pharmacy_Ui.ProfileActivity;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.util.ArrayList;

public class Diagnostic_MessageActivity extends AppCompatActivity {
    public ViewPager viewPager;
    public TabLayout tabLayout;
    public DrawerLayout drawer_layout;
    public ListView mDrawerList;
    public ArrayList<Fragment> fragments;
    private ActionBarDrawerToggle mDrawerToggle;
    public String[] menuName = {"APPOINTMENTS", "PATIENTS LIST", "CREATE TEST", "TEST RESULT", "ABOUT", "SETTING", "HELP", "FEEDBACK"};
    public int[] menuicons = {R.mipmap.appointments, R.mipmap.patients, R.mipmap.add_medicines,
            R.mipmap.payments,R.mipmap.about_us, R.mipmap.settings, R.mipmap.help, R.mipmap.feedback};

    public RelativeLayout message_container;
    public Patient_LoginPager patientLoginPager;
    public LinearLayout home_view,patient_view,appointment_view,profile_view,create_test_view;
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

        setContentView(R.layout.activity_diagnostic__message);
        message_container = (RelativeLayout) findViewById(R.id.message_container);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        fragments = new ArrayList<>();
        home_view = (LinearLayout) findViewById(R.id.home_view);
        patient_view = (LinearLayout) findViewById(R.id.patient_view);
        appointment_view = (LinearLayout) findViewById(R.id.appointment_view);
        create_test_view = (LinearLayout) findViewById(R.id.create_test_view);
        profile_view = (LinearLayout) findViewById(R.id.profile_view);

        patient_call_fragment = new Patient_Call_Fragment();
        patient_msgFragment = new Patient_MsgFragment();

        fragments.add(patient_msgFragment);
        fragments.add(patient_call_fragment);


        tabLayout.addTab(tabLayout.newTab().setText("CHAT"));
        tabLayout.addTab(tabLayout.newTab().setText("CALL"));

        patientLoginPager = new Patient_LoginPager(Diagnostic_MessageActivity.this.getSupportFragmentManager(), fragments);
        //is line se tablayout k neche jo shade araaha hai woh change hoga pageviewer k mutabik
        viewPager.setAdapter(patientLoginPager);
        // viewPager.setOffscreenPageLimit(0);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        drawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);

        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        View viewinflate = getLayoutInflater().inflate(R.layout.nav_header_main, null);

        Navigations_ItemsAdapter navigations_itemsAdapter = new Navigations_ItemsAdapter(Diagnostic_MessageActivity.this, menuName,menuicons);
        mDrawerList.setAdapter(navigations_itemsAdapter);
        mDrawerList.addHeaderView(viewinflate);

        mDrawerToggle = new ActionBarDrawerToggle(Diagnostic_MessageActivity.this, drawer_layout, null, R.string.app_name, R.string.app_name) {
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
        home_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  =new Intent(Diagnostic_MessageActivity.this,Diagnostic_HomeActivity.class);
                startActivity(intent);
            }
        });

        appointment_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Diagnostic_MessageActivity.this, Diagnostic_Appointment_Activity.class);
                startActivity(intent);
            }
        });


//        profile_view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Diagnostic_MessageActivity.this, ProfileActivity.class);
//                startActivity(intent);
//            }
//        });


    }
}
