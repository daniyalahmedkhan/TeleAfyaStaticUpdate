package com.example.ast.teleafya.Ui.Patient_Ui;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.ast.teleafya.R;
import com.readystatesoftware.systembartint.SystemBarTintManager;

public class Health_VaultActivity extends AppCompatActivity {

    public LinearLayout home_view,appointment_view,timeline_view,message_view,provider_container;
    public ImageView back_image;
    LinearLayout   L1 , L2 , L3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health__vault);

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

        L1 = (LinearLayout) findViewById(R.id.Linear1);
        L2 = (LinearLayout) findViewById(R.id.Document);
        L3 = (LinearLayout) findViewById(R.id.test_order_provider);
        home_view = (LinearLayout) findViewById(R.id.home_view);
        provider_container = (LinearLayout) findViewById(R.id.provider_container);
        appointment_view = (LinearLayout) findViewById(R.id.appointment_view);
        message_view = (LinearLayout) findViewById(R.id.message_view);
        timeline_view = (LinearLayout) findViewById(R.id.timeline_view);
        back_image = (ImageView)findViewById(R.id.back_image);
        provider_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  =new Intent(Health_VaultActivity.this,Patient_ProviderActivity.class);
                startActivity(intent);
                finish();
            }
        });

        L2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager
                        .beginTransaction();
                health_profile_doc_list fragmentS1 = new health_profile_doc_list();
                getSupportFragmentManager().beginTransaction().add(R.id.activity_health, fragmentS1).commit();



            }
        });

        L3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager
                        .beginTransaction();
                health_profile_med_tab fragmentS1 = new health_profile_med_tab();
                getSupportFragmentManager().beginTransaction().add(R.id.activity_health, fragmentS1).commit();


            }
        });

        L1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager
                        .beginTransaction();
                health_profile_tab fragmentS1 = new health_profile_tab();
                getSupportFragmentManager().beginTransaction().add(R.id.activity_health, fragmentS1).commit();



            }
        });

        timeline_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  =new Intent(Health_VaultActivity.this,Patient_Timeline_Activity.class);
                startActivity(intent);
                finish();
            }
        });

        message_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  =new Intent(Health_VaultActivity.this,Patient_MessageActivity.class);
                startActivity(intent);
                finish();
            }
        });

        appointment_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  =new Intent(Health_VaultActivity.this,Patient_Appointment_Activity.class);
                startActivity(intent);
                finish();
            }
        });

        back_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  =new Intent(Health_VaultActivity.this,Patient_HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
