package com.example.ast.teleafya.Ui.Pharmacy_Ui;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Navigations_ItemsAdapter;
import com.example.ast.teleafya.Ui.Adapters.Patient_LoginPager;
import com.example.ast.teleafya.Ui.Patient_Ui.Patient_Appointment_Activity;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.util.ArrayList;


@SuppressWarnings("deprecation")
public class ProfileActivity extends AppCompatActivity {

    TabHost tabHost;
    private float lastX;
    private GestureDetectorCompat gDetector;
    public DrawerLayout drawer_layout;
    public ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
//    final TabHost
public ViewPager viewPager;
    public TabLayout tabLayout;
    public ArrayList<Fragment> fragments;
    public Patient_LoginPager patientLoginPager;
    public String[] menuName = {"NEW ORDERS", "OPEN ORDERS", "ADD MEDICINE", "PAYMENTS", "COMPLETE ORDERS", "CANCLE ORDERS", "MESSAGES & CALLS", "ABOUT US", "SETTING", "HELP", "FEEDBACK"};
    public int[] menuicons = {R.mipmap.new_orders, R.mipmap.open_orders, R.mipmap.add_medicines,
            R.mipmap.payments, R.mipmap.completed_orders, R.mipmap.cancel_orders, R.mipmap.messages_calls,
            R.mipmap.about_us, R.mipmap.settings, R.mipmap.help, R.mipmap.feedback};

    public CompanyInfo companyInfo;
    public AccountInfo accountInfo;
    public LinearLayout cont;
    public ImageView nav_icon;


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
        setContentView(R.layout.activity_profile);
        cont= (LinearLayout)findViewById(R.id.cont);
        companyInfo = new CompanyInfo();
        accountInfo = new AccountInfo();
        fragments = new ArrayList<>();
        fragments.add(companyInfo);
        fragments.add(accountInfo);
        nav_icon =  (ImageView)findViewById(R.id.nav_icon);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("COMPANY INFO"));
        tabLayout.addTab(tabLayout.newTab().setText("ACCOUNT INFO"));

        patientLoginPager = new Patient_LoginPager(getSupportFragmentManager(), fragments);
        //is line se tablayout k neche jo shade araaha hai woh change hoga pageviewer k mutabik
        viewPager.setAdapter(patientLoginPager);
        // viewPager.setOffscreenPageLimit(0);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        drawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);

        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        View viewinflate = getLayoutInflater().inflate(R.layout.nav_header_main, null);

        Navigations_ItemsAdapter navigations_itemsAdapter = new Navigations_ItemsAdapter(ProfileActivity.this, menuName, menuicons);
        mDrawerList.setAdapter(navigations_itemsAdapter);
        mDrawerList.addHeaderView(viewinflate);

        mDrawerToggle = new ActionBarDrawerToggle(ProfileActivity.this, drawer_layout, null, R.string.app_name, R.string.app_name) {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                cont.setTranslationX(slideOffset * drawerView.getWidth());
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

        nav_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer_layout.openDrawer(mDrawerList);
            }
        });

    }
}


