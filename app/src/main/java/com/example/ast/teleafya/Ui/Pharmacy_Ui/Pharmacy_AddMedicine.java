package com.example.ast.teleafya.Ui.Pharmacy_Ui;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.AddMedicine_PharmacyAdapter;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.util.ArrayList;

public class Pharmacy_AddMedicine extends AppCompatActivity {

    public ListView medicine_list;
    public ArrayList<String> arrayList;
    public AddMedicine_PharmacyAdapter addMedicine_pharmacyAdapter;
    public ImageView back_home;
    public ImageView add_medicine;

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
        setContentView(R.layout.activity_pharmacy__add_medicine);
        back_home = (ImageView)findViewById(R.id.back_home);
        add_medicine = (ImageView)findViewById(R.id.add_medicine);
        medicine_list = (ListView)findViewById(R.id.medicine_list);
        arrayList = new ArrayList<>();

        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");

        addMedicine_pharmacyAdapter = new AddMedicine_PharmacyAdapter(arrayList,Pharmacy_AddMedicine.this);
        medicine_list.setAdapter(addMedicine_pharmacyAdapter);

        medicine_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.home_container,new Update_MedicineDetail())
                        .addToBackStack(null)
                        .commit();
            }
        });

        back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pharmacy_AddMedicine.this,Pharmacy_HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });

        add_medicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.home_container,new AddMedicine_Pharmacy())
                        .addToBackStack(null)
                        .commit();
            }
        });


    }
}
