package com.example.ast.teleafya.Ui.Patient_Ui;

import android.content.Intent;
import android.os.Build;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Navigations_ItemsAdapter;
import com.example.ast.teleafya.Ui.Adapters.Timelinelist_Adapter;
import com.google.android.gms.vision.text.Line;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.util.ArrayList;

public class Patient_Timeline_Activity extends AppCompatActivity {

    public ListView timeline_list;
    public Timelinelist_Adapter timelinelist_adapter;
    public ArrayList<String> arrayList;
    public ImageView edit_post;
    public DrawerLayout drawer_layout;
    public ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    public String[] menuName= {"APPOINTMENTS","MY DOCTOR","MY PAYMENTS","HEALTH VAULTS","ORDER MACHINE","REMINDERS","SAVED ARTCLES","ABOUT","SETTING","HELP","FEEDBACK"};
    public int[] menuicons = {R.mipmap.appointments,R.mipmap.doctors,R.mipmap.payments,
            R.mipmap.health_vault,R.mipmap.medicine_ordered,R.mipmap.payments,R.mipmap.saved_articles,
            R.mipmap.about,R.mipmap.settings,R.mipmap.help,R.mipmap.feedback};

    public RelativeLayout post_container;
    public LinearLayout appointment_view;
    public LinearLayout provider_container,home_view,message_view;

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
        setContentView(R.layout.activity_patient__timeline_);
        arrayList = new ArrayList<>();
        post_container = (RelativeLayout) findViewById(R.id.post_container);
        timeline_list = (ListView) findViewById(R.id.timeline_list);
        edit_post = (ImageView) findViewById(R.id.edit_post);
        appointment_view = (LinearLayout) findViewById(R.id.appointment_view);
        provider_container = (LinearLayout) findViewById(R.id.provider_container);
        home_view = (LinearLayout) findViewById(R.id.home_view);
        message_view = (LinearLayout) findViewById(R.id.message_view);

        drawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        View viewinflate = getLayoutInflater().inflate(R.layout.nav_header_main, null);
        Navigations_ItemsAdapter navigations_itemsAdapter = new Navigations_ItemsAdapter(Patient_Timeline_Activity.this, menuName,menuicons);
        mDrawerList.setAdapter(navigations_itemsAdapter);
        mDrawerList.addHeaderView(viewinflate);

        mDrawerToggle = new ActionBarDrawerToggle(Patient_Timeline_Activity.this, drawer_layout, null, R.string.app_name, R.string.app_name) {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                post_container.setTranslationX(slideOffset * drawerView.getWidth());
                drawer_layout.bringChildToFront(drawerView);
                drawer_layout.requestLayout();
            }
        };
        drawer_layout.setDrawerListener(mDrawerToggle);
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");

        timelinelist_adapter = new Timelinelist_Adapter(arrayList, Patient_Timeline_Activity.this);
        timeline_list.setAdapter(timelinelist_adapter);

        edit_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.post_container, new Update_Post())
                        .addToBackStack(null)
                        .commit();
            }
        });

        appointment_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Patient_Timeline_Activity.this, Patient_Appointment_Activity.class);
                startActivity(intent);
              //  finish();
            }
        });

        provider_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Patient_Timeline_Activity.this, Patient_ProviderActivity.class);
                startActivity(intent);
             //   finish();
            }
        });

        message_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Patient_Timeline_Activity.this, Patient_MessageActivity.class);
                startActivity(intent);
            }
        });

        home_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Patient_Timeline_Activity.this, Patient_HomeActivity.class);
                startActivity(intent);
            }
        });

    }
}
