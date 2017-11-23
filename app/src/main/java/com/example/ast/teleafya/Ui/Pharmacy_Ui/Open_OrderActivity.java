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
import com.example.ast.teleafya.Ui.Adapters.NewOrder_listAdapter;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.util.ArrayList;

public class Open_OrderActivity extends AppCompatActivity {
    public ListView new_order_list;
    public ArrayList<String> arrayList;
    public NewOrder_listAdapter newOrder_listAdapter;
    public ImageView back_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open__order);

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
        setContentView(R.layout.activity_new_order_);
        new_order_list = (ListView)findViewById(R.id.new_order_list);
        back_home = (ImageView)findViewById(R.id.back_home);
        arrayList  = new ArrayList<>();

        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");

        newOrder_listAdapter = new NewOrder_listAdapter(arrayList,Open_OrderActivity.this);
        new_order_list.setAdapter(newOrder_listAdapter);


        back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Open_OrderActivity.this,Pharmacy_HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });

        new_order_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.order_container, new Open_OrderDetails_Pharmacy())
                        .addToBackStack(null)
                        .commit();
            }
        });



    }
}
