package com.example.ast.teleafya.Ui.Activities;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Diagnostic_Ui.Diagnostic_HomeActivity;
import com.example.ast.teleafya.Ui.Partners.Ambulance.Ambulance.Ambulance_LoginActivity;
import com.example.ast.teleafya.Ui.Partners.Ambulance.Ambulance.Partners_AmbulanceHome;
import com.example.ast.teleafya.Ui.Pharmacy_Ui.Pharmacy_HomeActivity;
import com.readystatesoftware.systembartint.SystemBarTintManager;

public class User_Selection_Screen extends AppCompatActivity {

    public LinearLayout doctor_container;
    public LinearLayout nurse_container;
    public LinearLayout patient_container;
    public LinearLayout diagnostic_container;
    public LinearLayout home_aid_midwive;
    public LinearLayout dentist_container;
    public LinearLayout partner_flow;

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
        setContentView(R.layout.user_selection_screen);

        doctor_container = (LinearLayout) findViewById(R.id.doctor_container);
        nurse_container = (LinearLayout) findViewById(R.id.nurse_container);
        patient_container = (LinearLayout) findViewById(R.id.patient_container);
        diagnostic_container = (LinearLayout) findViewById(R.id.diagnostic_container);
        dentist_container = (LinearLayout) findViewById(R.id.dentist_container);
        home_aid_midwive = (LinearLayout) findViewById(R.id.home_aid_midwive);
        partner_flow = (LinearLayout) findViewById(R.id.partner_flow);

        doctor_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User_Selection_Screen.this,Doctor_Activity.class);
                startActivity(intent);
            }
        });

        patient_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User_Selection_Screen.this,Patient_Activity.class);
                startActivity(intent);
            }
        });

        home_aid_midwive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User_Selection_Screen.this,Pharmacy_HomeActivity.class);
                startActivity(intent);
            }
        });

        diagnostic_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  =new Intent(User_Selection_Screen.this,Diagnostic_HomeActivity.class);
                startActivity(intent);
            }
        });

        partner_flow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  =new Intent(User_Selection_Screen.this, Ambulance_LoginActivity.class);
                startActivity(intent);


            }
        });



    }
}
