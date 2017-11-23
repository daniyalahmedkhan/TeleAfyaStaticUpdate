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
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Navigations_ItemsAdapter;
import com.example.ast.teleafya.Ui.Adapters.Timelinelist_Adapter;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.util.ArrayList;

public class Patient_HomeActivity extends AppCompatActivity {

    public ListView post_list;
    public ArrayList<String> arrayList;
    public Timelinelist_Adapter timelinelist_adapter;
    public LinearLayout home_view,provider_container,appointment_view,message_view,timeline_view;
    public String[] menuName= {"APPOINTMENTS","MY DOCTOR","MY PAYMENTS","HEALTH VAULTS","ORDER MEDICINE","REMINDERS","SAVED ARTCLES","ABOUT","SETTING","HELP","FEEDBACK"};
    public int[] menuicons = {R.mipmap.appointments,R.mipmap.doctors,R.mipmap.payments,
                                R.mipmap.health_vault,R.mipmap.medicine_ordered,R.mipmap.payments,R.mipmap.saved_articles,
                                R.mipmap.about,R.mipmap.settings,R.mipmap.help,R.mipmap.feedback};
    public DrawerLayout drawer_layout;
    public ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    public RelativeLayout home_container;

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

        setContentView(R.layout.activity_patient__home);
        post_list = (ListView) findViewById(R.id.post_list);
        home_view = (LinearLayout) findViewById(R.id.home_view);
        provider_container = (LinearLayout) findViewById(R.id.provider_container);
        appointment_view = (LinearLayout) findViewById(R.id.appointment_view);
        message_view = (LinearLayout) findViewById(R.id.message_view);
        timeline_view = (LinearLayout) findViewById(R.id.timeline_view);
        arrayList = new ArrayList<>();
        home_container = (RelativeLayout)findViewById(R.id.home_container);
        drawer_layout = (DrawerLayout)findViewById(R.id.drawer_layout);

        mDrawerList = (ListView)findViewById(R.id.left_drawer);
        View viewinflate = getLayoutInflater().inflate(R.layout.nav_header_main,null);
        View viewinflate_footer = getLayoutInflater().inflate(R.layout.nav_footer_main,null);

        Navigations_ItemsAdapter navigations_itemsAdapter = new Navigations_ItemsAdapter(Patient_HomeActivity.this,menuName,menuicons);
        mDrawerList.setAdapter(navigations_itemsAdapter);
        mDrawerList.addHeaderView(viewinflate);
        mDrawerList.addFooterView(viewinflate_footer);

        mDrawerToggle = new ActionBarDrawerToggle(Patient_HomeActivity.this, drawer_layout,null, R.string.app_name, R.string.app_name) {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                home_container.setTranslationX(slideOffset * drawerView.getWidth());
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

        timelinelist_adapter = new Timelinelist_Adapter(arrayList, Patient_HomeActivity.this);
        post_list.setAdapter(timelinelist_adapter);


        provider_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  =new Intent(Patient_HomeActivity.this,Patient_ProviderActivity.class);
                startActivity(intent);
           //     finish();
            }
        });

        message_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  =new Intent(Patient_HomeActivity.this,Patient_MessageActivity.class);
                startActivity(intent);
         //      finish();
            }
        });

        appointment_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  =new Intent(Patient_HomeActivity.this,Patient_Appointment_Activity.class);
                startActivity(intent);
           //     finish();
            }
        });

        timeline_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  =new Intent(Patient_HomeActivity.this,Patient_Timeline_Activity.class);
                startActivity(intent);
           //     finish();
            }
        });

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 1) {
                    Intent intent = new Intent(Patient_HomeActivity.this, Patient_Appointment_Activity.class);
                    startActivity(intent);
                    //   finish();
                }else if(i==2)
                {
                    Intent intent  =new Intent(Patient_HomeActivity.this,Patient_ProviderActivity.class);

                    intent.putExtra("doc","yes");
                    startActivity(intent);
                }
                else if (i == 6) {
                    Intent intent = new Intent(Patient_HomeActivity.this, Patient_ReminderActivity.class);
                    startActivity(intent);
                    //   finish();
                } else if (i == 3) {
                    Intent intent = new Intent(Patient_HomeActivity.this, Patient_PaymentActivity.class);
                    startActivity(intent);
                    //   finish();
                } else if (i == 4) {
                    Intent intent = new Intent(Patient_HomeActivity.this, Health_VaultActivity.class);
                    startActivity(intent);
                    //  finish();
                } else if (i == 7) {
                    Intent intent = new Intent(Patient_HomeActivity.this, Saved_Article.class);
                    startActivity(intent);
                    //  finish();
                    drawer_layout.closeDrawer(mDrawerList);

                } else if (i == 5) {


                    Intent intent = new Intent(Patient_HomeActivity.this, Order_Activity.class);
                    startActivity(intent);


                }
            }
        });





    }

}
