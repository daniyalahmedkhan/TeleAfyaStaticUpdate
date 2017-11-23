package com.example.ast.teleafya.Ui.Pharmacy_Ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.util.ArrayList;

public class AddNewMethod_mpesa extends AppCompatActivity {


    String[] titles = {"Arvind patel" , "84758693125"};
    ArrayList<String[]> arr;

    ListView l1;
    ImageView back;
    Button btnBnk, btnMpesa;

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
        setContentView(R.layout.activity_add_new_method_mpesa);

        arr = new ArrayList<>();
        arr.add(titles);
        l1 = (ListView) findViewById(R.id.listNewMethod);
        mPesa_CustomAdapter adapter = new mPesa_CustomAdapter(AddNewMethod_mpesa.this,  arr );
        l1.setAdapter(adapter);


        View footerView = ((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.new_method_pesafooter, null, false);
        l1.addFooterView(footerView);


        btnBnk = (Button) findViewById(R.id.bankDetails);
        btnMpesa = (Button) findViewById(R.id.mpesaDetails);
        back  = (ImageView) findViewById(R.id.back);


        btnBnk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddNewMethod_mpesa.this , AddNewMethod.class);
                startActivity(intent);
                AddNewMethod_mpesa.this.finish();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddNewMethod_mpesa.this.finish();
            }
        });



    }
}
