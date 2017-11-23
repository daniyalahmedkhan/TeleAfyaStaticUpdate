package com.example.ast.teleafya.Ui.Patient_Ui;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.ProviderList_PatientAdapter;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.util.ArrayList;

public class Patient_ProviderActivity extends AppCompatActivity {
    public LinearLayout home_view,provider_container,appointment_view,message_view,timeline_view;
    public ListView provider_list;
    public ArrayList<String> arrayList;
    public ProviderList_PatientAdapter providerList_patientAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient__provider);

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




        home_view = (LinearLayout) findViewById(R.id.home_view);
        provider_container = (LinearLayout) findViewById(R.id.provider_container);
        appointment_view = (LinearLayout) findViewById(R.id.appointment_view);
        message_view = (LinearLayout) findViewById(R.id.message_view);
        timeline_view = (LinearLayout) findViewById(R.id.timeline_view);
        provider_list = (ListView)findViewById(R.id.provider_list);
        arrayList = new ArrayList<>();

        arrayList.add("Doctors");
        arrayList.add("Nurse");
        arrayList.add("Mid Wive");
        arrayList.add("Home Health Aided");
        arrayList.add("Dentist");
        arrayList.add("Diagnostic Lab");

        if(getIntent().getStringExtra("doc")!=null) {
            if (getIntent().getStringExtra("doc").equals("yes")) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.provider_con,new Diagnostic_Provider())
                        .addToBackStack(null)
                        .commit();
            }
        }
        providerList_patientAdapter  = new ProviderList_PatientAdapter(arrayList,Patient_ProviderActivity.this);
        provider_list.setAdapter(providerList_patientAdapter);




        home_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  =new Intent(Patient_ProviderActivity.this,Patient_HomeActivity.class);
                startActivity(intent);
          //      finish();
            }
        });

        message_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  =new Intent(Patient_ProviderActivity.this,Patient_MessageActivity.class);
                startActivity(intent);
            //    finish();
            }
        });

        appointment_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  =new Intent(Patient_ProviderActivity.this,Patient_Appointment_Activity.class);
                startActivity(intent);
           //     finish();
            }
        });

        timeline_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  =new Intent(Patient_ProviderActivity.this,Patient_Timeline_Activity.class);
                startActivity(intent);
            //    finish();
            }
        });

        provider_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //int position = 0;
//                getSupportFragmentManager()
//                        .beginTransaction()
//                        .add(R.id.provider_con,new Diagnostic_Provider())
//                        .addToBackStack(null)
//                        .commit();

                if(i == 0){

                    getSupportFragmentManager()
                        .beginTransaction()
                            .add(R.id.provider_con,new Select_Service())
                        .addToBackStack(null)
                        .commit();

                }
                else if (i == 1){


                    getSupportFragmentManager()
                            .beginTransaction()
                            .add(R.id.provider_con,new Select_Service_Nurse())
                            .addToBackStack(null)
                            .commit();


                }


               // Toast.makeText(Patient_ProviderActivity.this , "Pos"+i , Toast.LENGTH_SHORT).show();
            }
        });



    }
}
