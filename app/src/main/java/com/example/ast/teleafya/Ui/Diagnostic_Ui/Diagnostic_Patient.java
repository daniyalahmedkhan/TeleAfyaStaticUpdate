package com.example.ast.teleafya.Ui.Diagnostic_Ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.AddMedicine_PharmacyAdapter;
import com.example.ast.teleafya.Ui.Adapters.diagnosticPatient_Adapter;
import com.example.ast.teleafya.Ui.Pharmacy_Ui.AddMedicine_Pharmacy;
import com.example.ast.teleafya.Ui.Pharmacy_Ui.Pharmacy_HomeActivity;
import com.example.ast.teleafya.Ui.Pharmacy_Ui.ProfileActivity;
import com.example.ast.teleafya.Ui.Pharmacy_Ui.Update_MedicineDetail;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.util.ArrayList;

public class Diagnostic_Patient extends AppCompatActivity {

    public ListView medicine_list;
    public ArrayList<String> arrayList;
    public diagnosticPatient_Adapter addMedicine_pharmacyAdapter;
    public ImageView back_home;
    public String[] menuName = {"APPOINTMENTS", "PATIENTS LIST", "CREATE TEST", "TEST RESULT", "ABOUT", "SETTING", "HELP", "FEEDBACK"};
    public int[] menuicons = {R.mipmap.appointments, R.mipmap.patients, R.mipmap.add_medicines,
            R.mipmap.payments,R.mipmap.about_us, R.mipmap.settings, R.mipmap.help, R.mipmap.feedback};
    public ImageView add_medicine;
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
        setContentView(R.layout.diagnostic_patients);
        home_view = (LinearLayout) findViewById(R.id.home_view);
        patient_view = (LinearLayout) findViewById(R.id.patient_view);
        appointment_view = (LinearLayout) findViewById(R.id.appointment_view);
        create_test_view = (LinearLayout) findViewById(R.id.create_test_view);
        profile_view = (LinearLayout) findViewById(R.id.profile_view);
        medicine_list=(ListView)findViewById(R.id.medicine_list);
        arrayList = new ArrayList<>();

        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");

        addMedicine_pharmacyAdapter = new diagnosticPatient_Adapter(arrayList,Diagnostic_Patient.this);
        medicine_list.setAdapter(addMedicine_pharmacyAdapter);


        home_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Diagnostic_Patient.this, Diagnostic_HomeActivity.class);
                startActivity(intent);
            }
        });

        appointment_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Diagnostic_Patient.this, Diagnostic_Appointment_Activity.class);
                startActivity(intent);
            }
        });


        profile_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Diagnostic_Patient.this, ProfileActivity.class);
                startActivity(intent);
            }
        });


    }
}
