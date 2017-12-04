package com.example.ast.teleafya.Ui.DoctorModule;

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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Activities.Doctor_Activity;
import com.example.ast.teleafya.Ui.Adapters.Navigations_ItemsAdapter;
import com.example.ast.teleafya.Ui.Adapters.Timelinelist_Adapter;
import com.example.ast.teleafya.Ui.Patient_Ui.Health_VaultActivity;
import com.example.ast.teleafya.Ui.Patient_Ui.Order_Activity;
import com.example.ast.teleafya.Ui.Patient_Ui.Patient_Appointment_Activity;
import com.example.ast.teleafya.Ui.Patient_Ui.Patient_HomeActivity;
import com.example.ast.teleafya.Ui.Patient_Ui.Patient_MessageActivity;
import com.example.ast.teleafya.Ui.Patient_Ui.Patient_PaymentActivity;
import com.example.ast.teleafya.Ui.Patient_Ui.Patient_ProviderActivity;
import com.example.ast.teleafya.Ui.Patient_Ui.Patient_ReminderActivity;
import com.example.ast.teleafya.Ui.Patient_Ui.Patient_Timeline_Activity;
import com.example.ast.teleafya.Ui.Patient_Ui.Saved_Article;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.util.ArrayList;

public class Doctor_HomeActivity extends AppCompatActivity {

   // public ListView post_list;
   // public ArrayList<String> arrayList;
   // public Timelinelist_Adapter timelinelist_adapter;
    public LinearLayout patient_view , profile_view , appointment_view1;
    public LinearLayout home_view,provider_container,appointment_view,message_view,timeline_view;
    public String[] menuName= {"APPOINTMENTS","PATIENTS","MESSAGES","PAYMENT","BANK DETAILS","EMERGENCY","TRANSPORT","ABOUT","SETTING","HELP","FEEDBACK"};
    public int[] menuicons = {R.mipmap.appointments,R.mipmap.patients,R.mipmap.messages_icon,
            R.mipmap.payments,R.mipmap.bank_details,R.mipmap.emergency_icon,R.mipmap.transport,
            R.mipmap.about,R.mipmap.settings,R.mipmap.help,R.mipmap.feedback};
    public DrawerLayout drawer_layout;
    public ListView mDrawerList;
    ImageView imageNotification;
    private ActionBarDrawerToggle mDrawerToggle;
   // public RelativeLayout home_container;

    LinearLayout Patient , Appointment , Message;

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



        setContentView(R.layout.activity_docotr__home);
      //  post_list = (ListView) findViewById(R.id.post_list);
        home_view = (LinearLayout) findViewById(R.id.home_view);
      //  provider_container = (LinearLayout) findViewById(R.id.provider_container);
       // appointment_view = (LinearLayout) findViewById(R.id.appointment_view);
        message_view = (LinearLayout) findViewById(R.id.message_view);
        timeline_view = (LinearLayout) findViewById(R.id.timeline_view);
       // arrayList = new ArrayList<>();
       // home_container = (RelativeLayout)findViewById(R.id.home_container);
        drawer_layout = (DrawerLayout)findViewById(R.id.drawer_layout);
        imageNotification = (ImageView) findViewById(R.id.notification);
        Patient = (LinearLayout) findViewById(R.id.Linear1);
        patient_view = (LinearLayout) findViewById(R.id.patient_view);
        profile_view = (LinearLayout) findViewById(R.id.profile_view);
        Appointment = (LinearLayout) findViewById(R.id.Document);
        Message = (LinearLayout) findViewById(R.id.test_order_provider2);

        appointment_view1 = (LinearLayout) findViewById(R.id.appointment_view);
                mDrawerList = (ListView)findViewById(R.id.left_drawer);
        View viewinflate = getLayoutInflater().inflate(R.layout.nav_header_main,null);
        View viewinflate_footer = getLayoutInflater().inflate(R.layout.nav_footer_main,null);

        Navigations_ItemsAdapter navigations_itemsAdapter = new Navigations_ItemsAdapter(Doctor_HomeActivity.this,menuName,menuicons);
        mDrawerList.setAdapter(navigations_itemsAdapter);
        mDrawerList.addHeaderView(viewinflate);
        mDrawerList.addFooterView(viewinflate_footer);


        mDrawerToggle = new ActionBarDrawerToggle(Doctor_HomeActivity.this, drawer_layout,null, R.string.app_name, R.string.app_name) {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
             //   home_container.setTranslationX(slideOffset * drawerView.getWidth());
                drawer_layout.bringChildToFront(drawerView);
                drawer_layout.requestLayout();
            }

        };
        drawer_layout.setDrawerListener(mDrawerToggle);


//        arrayList.add("");
//        arrayList.add("");
//        arrayList.add("");
//        arrayList.add("");
//        arrayList.add("");
//        arrayList.add("");
//
//        timelinelist_adapter = new Timelinelist_Adapter(arrayList, Doctor_HomeActivity.this);
//        post_list.setAdapter(timelinelist_adapter);


//        provider_container.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent  =new Intent(Doctor_HomeActivity.this,Patient_ProviderActivity.class);
//                startActivity(intent);
//                //     finish();
//            }
//        });

//        message_view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent  =new Intent(Doctor_HomeActivity.this,Patient_MessageActivity.class);
//                startActivity(intent);
//                //      finish();
//            }
//        });

//        appointment_view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent  =new Intent(Doctor_HomeActivity.this,Patient_Appointment_Activity.class);
//                startActivity(intent);
//                //     finish();
//            }
//        });

//        timeline_view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent  =new Intent(Doctor_HomeActivity.this,Patient_Timeline_Activity.class);
//                startActivity(intent);
//                //     finish();
//            }
//        });

        Message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Doctor_HomeActivity.this, DoctorMessage.class);
                startActivity(intent);

            }
        });

        Appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager
                        .beginTransaction();
                Doctor_MyAppointment_Tab fragmentS1 = new Doctor_MyAppointment_Tab();
                getSupportFragmentManager().beginTransaction().add(android.R.id.content, fragmentS1).commit();


            }
        });

        appointment_view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager
                        .beginTransaction();
                Doctor_MyAppointment_Tab fragmentS1 = new Doctor_MyAppointment_Tab();
                getSupportFragmentManager().beginTransaction().add(android.R.id.content, fragmentS1).commit();


            }
        });

        profile_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager
                        .beginTransaction();
                Doctor_Profile_Spec_Tab fragmentS1 = new Doctor_Profile_Spec_Tab();
                getSupportFragmentManager().beginTransaction().add(android.R.id.content, fragmentS1).commit();



            }
        });

        patient_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager
                        .beginTransaction();
                My_Patient_List fragmentS1 = new My_Patient_List();
                getSupportFragmentManager().beginTransaction().add(android.R.id.content, fragmentS1).commit();


            }
        });


        Patient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager
                    .beginTransaction();
            My_Patient_List fragmentS1 = new My_Patient_List();
            getSupportFragmentManager().beginTransaction().add(android.R.id.content, fragmentS1).commit();


            }
        });

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 1) {
                    Intent intent = new Intent(Doctor_HomeActivity.this, DoctorAppointment_Activity.class);
                    startActivity(intent);
                    //   finish();
                }else if(i==2)
                {
//                    Intent intent  =new Intent(Doctor_HomeActivity.this,Patient_ProviderActivity.class);
//
//                    intent.putExtra("doc","yes");
//                    startActivity(intent);
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager
                            .beginTransaction();
                    My_Patient_List fragmentS1 = new My_Patient_List();
                    getSupportFragmentManager().beginTransaction().add(android.R.id.content, fragmentS1).commit();



                }
                else if (i == 6) {
                    Intent intent = new Intent(Doctor_HomeActivity.this, Patient_ReminderActivity.class);
                    startActivity(intent);
                    //   finish();
                } else if (i == 3) {
                    Intent intent = new Intent(Doctor_HomeActivity.this, DoctorMessage.class);
                    startActivity(intent);
                    //   finish();
                } else if (i == 4) {

                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager
                            .beginTransaction();
                    Doctor_My_Payments fragmentS1 = new Doctor_My_Payments();
                    getSupportFragmentManager().beginTransaction().add(android.R.id.content, fragmentS1).commit();



                } else if (i == 7) {
                    Intent intent = new Intent(Doctor_HomeActivity.this, Saved_Article.class);
                    startActivity(intent);
                    //  finish();
                    drawer_layout.closeDrawer(mDrawerList);

                } else if (i == 5) {


                    Intent intent = new Intent(Doctor_HomeActivity.this, Order_Activity.class);
                    startActivity(intent);


                }
            }
        });



    imageNotification.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager
                    .beginTransaction();
            Doctor_Home_Notification fragmentS1 = new Doctor_Home_Notification();
            getSupportFragmentManager().beginTransaction().add(android.R.id.content, fragmentS1).commit();


        }
    });

    }

}
