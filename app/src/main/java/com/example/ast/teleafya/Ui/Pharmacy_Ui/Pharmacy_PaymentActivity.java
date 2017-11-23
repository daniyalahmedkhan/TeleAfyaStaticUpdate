package com.example.ast.teleafya.Ui.Pharmacy_Ui;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.PaymentList_Adapter;
import com.example.ast.teleafya.Ui.Patient_Ui.Appointment_Detail_HomeVisit;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.util.ArrayList;

public class Pharmacy_PaymentActivity extends AppCompatActivity {

    public ArrayList<String> arrayList;
    public ListView payment_dayslist;
    public PaymentList_Adapter paymentList_adapter;
    public ImageView back_home;

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
        setContentView(R.layout.activity_pharmacy__payment);
        payment_dayslist = (ListView)findViewById(R.id.payment_dayslist);
        arrayList = new ArrayList<>();

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

        paymentList_adapter = new PaymentList_Adapter(arrayList,Pharmacy_PaymentActivity.this);
        payment_dayslist.setAdapter(paymentList_adapter);

        back_home = (ImageView)findViewById(R.id.back_home);

        back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pharmacy_PaymentActivity.this,Pharmacy_HomeActivity.class);
                startActivity(i);
                finish();
            }
        });

        payment_dayslist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.payment_container,new Payment_Detail())
                        .commit();
            }
        });

    }
}
