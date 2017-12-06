package com.example.ast.teleafya.Ui.Partners.Ambulance.Ambulance;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
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
import com.example.ast.teleafya.Ui.DoctorModule.DoctorAppointment_Activity;
import com.example.ast.teleafya.Ui.DoctorModule.DoctorMessage;
import com.example.ast.teleafya.Ui.DoctorModule.Doctor_HomeActivity;
import com.example.ast.teleafya.Ui.DoctorModule.Doctor_My_Payments;
import com.example.ast.teleafya.Ui.DoctorModule.My_Patient_List;
import com.example.ast.teleafya.Ui.Patient_Ui.Order_Activity;
import com.example.ast.teleafya.Ui.Patient_Ui.Patient_ReminderActivity;
import com.example.ast.teleafya.Ui.Patient_Ui.Saved_Article;
import com.readystatesoftware.systembartint.SystemBarTintManager;

public class Partners_AmbulanceHome extends AppCompatActivity {

    public String[] menuName = {"NEW REQUEST", "MY AMBULANCES", "PAST REQUEST", "EMERGENCY CALLS", "MESSAGES", "PAYMENTS", "ABOUT US", "SETTINGS" , "HELP" ,  "FEEDBACK"};
    public int[] menuicons = {R.mipmap.appointments, R.mipmap.patients, R.mipmap.add_medicines,
            R.mipmap.payments,R.mipmap.about_us, R.mipmap.settings, R.mipmap.help, R.mipmap.feedback , 0 , 0};
    public DrawerLayout drawer_layout;
    public ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    public RelativeLayout pharmacy_home;
    public LinearLayout patient, appointment, lab_test, test_result,message,emergency;
    public LinearLayout home_view,patient_view,appointment_view,profile_view,create_test_view;



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


        setContentView(R.layout.activity_partners__ambulance_home);
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
        View viewinflate = getLayoutInflater().inflate(R.layout.ambulance_home_header, null);
        View viewinflate_footer = getLayoutInflater().inflate(R.layout.nav_footer_main, null);


        Navigations_ItemsAdapter navigations_itemsAdapter = new Navigations_ItemsAdapter(Partners_AmbulanceHome.this, menuName, menuicons);
        mDrawerList.setAdapter(navigations_itemsAdapter);
        mDrawerList.addHeaderView(viewinflate);
        mDrawerList.addFooterView(viewinflate_footer);


        mDrawerToggle = new ActionBarDrawerToggle(Partners_AmbulanceHome.this, drawer_layout, null, R.string.app_name, R.string.app_name) {
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
                if (i == 1) {
//                    Intent intent = new Intent(Doctor_HomeActivity.this, DoctorAppointment_Activity.class);
//                    startActivity(intent);
                    //   finish();
                }else if(i==2)
                {
//                    Intent intent  =new Intent(Doctor_HomeActivity.this,Patient_ProviderActivity.class);
//
//                    intent.putExtra("doc","yes");
//                    startActivity(intent);
//                    FragmentManager fragmentManager = getFragmentManager();
//                    FragmentTransaction fragmentTransaction = fragmentManager
//                            .beginTransaction();
//                    My_Patient_List fragmentS1 = new My_Patient_List();
//                    getSupportFragmentManager().beginTransaction().add(android.R.id.content, fragmentS1).commit();



                }
                else if (i == 6) {
//                    Intent intent = new Intent(Doctor_HomeActivity.this, Patient_ReminderActivity.class);
//                    startActivity(intent);
                //   finish();
                } else if (i == 3) {
//                    Intent intent = new Intent(Doctor_HomeActivity.this, DoctorMessage.class);
//                    startActivity(intent);
                    //   finish();
                } else if (i == 4) {

//                    FragmentManager fragmentManager = getFragmentManager();
//                    FragmentTransaction fragmentTransaction = fragmentManager
//                            .beginTransaction();
//                    Doctor_My_Payments fragmentS1 = new Doctor_My_Payments();
//                    getSupportFragmentManager().beginTransaction().add(android.R.id.content, fragmentS1).commit();



                } else if (i == 7) {
//                    Intent intent = new Intent(Doctor_HomeActivity.this, Saved_Article.class);
//                    startActivity(intent);
                    //  finish();
                    drawer_layout.closeDrawer(mDrawerList);

                } else if (i == 5) {


                    Intent intent = new Intent(Partners_AmbulanceHome.this, MessageTabScreen.class);
                    startActivity(intent);


                }
            }
        });




    }

}
