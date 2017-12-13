package com.example.ast.teleafya.Ui.Diagnostic_Ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Navigations_ItemsAdapter;
import com.example.ast.teleafya.Ui.Patient_Ui.Create_Activity;
import com.example.ast.teleafya.Ui.Patient_Ui.Patient_HomeActivity;
import com.example.ast.teleafya.Ui.Patient_Ui.Patient_MessageActivity;
import com.example.ast.teleafya.Ui.Patient_Ui.Test_Result;
import com.example.ast.teleafya.Ui.Pharmacy_Ui.Cancel_OrderActivity;
import com.example.ast.teleafya.Ui.Pharmacy_Ui.Complete_OrderActivity;
import com.example.ast.teleafya.Ui.Pharmacy_Ui.NewOrder_Activity;
import com.example.ast.teleafya.Ui.Pharmacy_Ui.Open_OrderActivity;
import com.example.ast.teleafya.Ui.Pharmacy_Ui.Pharmacy_AddMedicine;
import com.example.ast.teleafya.Ui.Pharmacy_Ui.Pharmacy_PaymentActivity;
import com.example.ast.teleafya.Ui.Pharmacy_Ui.ProfileActivity;
import com.readystatesoftware.systembartint.SystemBarTintManager;

public class Diagnostic_HomeActivity extends AppCompatActivity {
    public  String[] menuName = {"APPOINTMENTS", "PATIENTS LIST", "CREATE TEST", "TEST RESULT", "ABOUT", "SETTING", "HELP", "FEEDBACK"};
    public  int[] menuicons = {R.mipmap.appointments, R.mipmap.patients, R.mipmap.add_medicines,
            R.mipmap.payments,R.mipmap.about_us, R.mipmap.settings, R.mipmap.help, R.mipmap.feedback};
    public  DrawerLayout drawer_layout;
    public  ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    public  RelativeLayout pharmacy_home;
    public  LinearLayout patient, appointment, lab_test, test_result,message,emergency;
    public  LinearLayout home_view,patient_view,appointment_view,profile_view,create_test_view;

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

        setContentView(R.layout.diagnostic_lab);
        patient = (LinearLayout) findViewById(R.id.patient);
        appointment = (LinearLayout) findViewById(R.id.appointment);
        lab_test = (LinearLayout) findViewById(R.id.test_lab);
        test_result = (LinearLayout) findViewById(R.id.test_result);
        drawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);
        pharmacy_home = (RelativeLayout) findViewById(R.id.pharmacy_home);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        home_view = (LinearLayout) findViewById(R.id.home_view);
        patient_view = (LinearLayout) findViewById(R.id.patient_view);
        appointment_view = (LinearLayout) findViewById(R.id.appointment_view);
        create_test_view = (LinearLayout) findViewById(R.id.create_test_view);
        profile_view = (LinearLayout) findViewById(R.id.profile_view);
        message=(LinearLayout)findViewById(R.id.message);
        View viewinflate = getLayoutInflater().inflate(R.layout.nav_header_main, null);
        View viewinflate_footer = getLayoutInflater().inflate(R.layout.nav_footer_main, null);

        Navigations_ItemsAdapter navigations_itemsAdapter = new Navigations_ItemsAdapter(Diagnostic_HomeActivity.this, menuName, menuicons);
        mDrawerList.setAdapter(navigations_itemsAdapter);
        mDrawerList.addHeaderView(viewinflate);
        mDrawerList.addFooterView(viewinflate_footer);

        mDrawerToggle = new ActionBarDrawerToggle(Diagnostic_HomeActivity.this, drawer_layout, null, R.string.app_name, R.string.app_name) {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                pharmacy_home.setTranslationX(slideOffset * drawerView.getWidth());
                drawer_layout.bringChildToFront(drawerView);
                drawer_layout.requestLayout();
            }

        };
        drawer_layout.setDrawerListener(mDrawerToggle);

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==1){
                    Intent intent = new Intent(Diagnostic_HomeActivity.this, Diagnostic_Appointment_Activity.class);
                    startActivity(intent);
                }else if(i==2){
                    Intent intent = new Intent(Diagnostic_HomeActivity.this, Open_OrderActivity.class);
                    startActivity(intent);
                }else if(i==3){
                    Intent intent = new Intent(Diagnostic_HomeActivity.this, Create_Activity.class);
                    startActivity(intent);
                }else if(i==4){
                    Intent intent = new Intent(Diagnostic_HomeActivity.this, Test_Result.class);
                    startActivity(intent);
                }else if(i==5){
                    Intent intent = new Intent(Diagnostic_HomeActivity.this, Complete_OrderActivity.class);
                    startActivity(intent);
                }else if(i==6){
                    Intent intent = new Intent(Diagnostic_HomeActivity.this, Cancel_OrderActivity.class);
                    startActivity(intent);
                }
            }
        });



        home_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  =new Intent(Diagnostic_HomeActivity.this,Diagnostic_MessageActivity.class);
                startActivity(intent);
            }
        });
        appointment_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Diagnostic_HomeActivity.this, Diagnostic_Appointment_Activity.class);
                startActivity(intent);
            }
        });


        profile_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Diagnostic_HomeActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
        patient_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Diagnostic_HomeActivity.this, Diagnostic_Patient.class);
                startActivity(intent);
            }
        });
        create_test_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
