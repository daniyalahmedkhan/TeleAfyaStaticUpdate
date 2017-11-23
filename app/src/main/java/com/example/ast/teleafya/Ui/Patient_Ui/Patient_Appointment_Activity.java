package com.example.ast.teleafya.Ui.Patient_Ui;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Activities.Patient_Activity;
import com.example.ast.teleafya.Ui.Adapters.Navigations_ItemsAdapter;
import com.example.ast.teleafya.Ui.Adapters.Patient_LoginPager;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.util.ArrayList;

public class Patient_Appointment_Activity extends AppCompatActivity {
    public ViewPager viewPager;
    public TabLayout tabLayout;
    public Patient_Upcoming_Appointment patient_upcoming_appointment;
    public Patient_Past_Appointment patient_past_appointment;
    public ArrayList<Fragment> fragments;
    public Patient_LoginPager patientLoginPager;
    public static TextView ActionBartitle;
    public DrawerLayout drawer_layout;
    public ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    public String[] menuName= {"APPOINTMENTS","MY DOCTOR","MY PAYMENTS","HEALTH VAULTS","ORDER MACHINE","REMINDERS","SAVED ARTCLES","ABOUT","SETTING","HELP","FEEDBACK"};
    public int[] menuicons = {R.mipmap.appointments,R.mipmap.doctors,R.mipmap.payments,
            R.mipmap.health_vault,R.mipmap.medicine_ordered,R.mipmap.payments,R.mipmap.saved_articles,
            R.mipmap.about,R.mipmap.settings,R.mipmap.help,R.mipmap.feedback};

    public RelativeLayout p_nav_container;
    public ImageView back_home;
    public LinearLayout timeline_view,provider_view;
    public LinearLayout message_view,home_view;

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

        setContentView(R.layout.patient_appointment);


        p_nav_container = (RelativeLayout)findViewById(R.id.p_nav_container);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        timeline_view = (LinearLayout)findViewById(R.id.timeline_view);
        patient_upcoming_appointment = new Patient_Upcoming_Appointment();
        patient_past_appointment = new Patient_Past_Appointment();
        back_home = (ImageView)findViewById(R.id.back_home);
        provider_view = (LinearLayout)findViewById(R.id.provider_view);
        message_view = (LinearLayout)findViewById(R.id.message_view);
        home_view = (LinearLayout)findViewById(R.id.home_view);
    //    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_outside);
    //    setSupportActionBar(toolbar);
    //    getSupportActionBar().setDisplayOptions(0, android.support.v7.app.ActionBar.DISPLAY_SHOW_TITLE);
     //   ActionBartitle = (TextView) toolbar.findViewById(R.id.main_appbar_textView);
     //   ActionBartitle.setText("Appointments");

        fragments = new ArrayList<>();
        fragments.add(patient_upcoming_appointment);
        fragments.add(patient_past_appointment);


        tabLayout.addTab(tabLayout.newTab().setText("UPCOMING"));
        tabLayout.addTab(tabLayout.newTab().setText("PAST"));

        patientLoginPager = new Patient_LoginPager(Patient_Appointment_Activity.this.getSupportFragmentManager(), fragments);
        //is line se tablayout k neche jo shade araaha hai woh change hoga pageviewer k mutabik
        viewPager.setAdapter(patientLoginPager);
        // viewPager.setOffscreenPageLimit(0);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        drawer_layout = (DrawerLayout)findViewById(R.id.drawer_layout);

        mDrawerList = (ListView)findViewById(R.id.left_drawer);
        View viewinflate = getLayoutInflater().inflate(R.layout.nav_header_main,null);

        Navigations_ItemsAdapter navigations_itemsAdapter = new Navigations_ItemsAdapter(Patient_Appointment_Activity.this,menuName,menuicons);
        mDrawerList.setAdapter(navigations_itemsAdapter);
        mDrawerList.addHeaderView(viewinflate);

        mDrawerToggle = new ActionBarDrawerToggle(Patient_Appointment_Activity.this, drawer_layout,null, R.string.app_name, R.string.app_name) {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                p_nav_container.setTranslationX(slideOffset * drawerView.getWidth());
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

        back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Patient_Appointment_Activity.this, Patient_Activity.class);
                startActivity(intent);
                finish();
            }
        });


        timeline_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Patient_Appointment_Activity.this, Patient_Timeline_Activity.class);
                startActivity(intent);
                finish();
            }
        });

        provider_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Patient_Appointment_Activity.this, Patient_ProviderActivity.class);
                startActivity(intent);
                finish();
            }
        });

        message_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Patient_Appointment_Activity.this, Patient_MessageActivity.class);
                startActivity(intent);
                finish();
            }
        });

        home_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Patient_Appointment_Activity.this, Patient_HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
