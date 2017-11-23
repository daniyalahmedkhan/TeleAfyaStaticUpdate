package com.example.ast.teleafya.Ui.Pharmacy_Ui;

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
import com.example.ast.teleafya.Ui.Patient_Ui.Patient_HomeActivity;
import com.readystatesoftware.systembartint.SystemBarTintManager;

public class Pharmacy_HomeActivity extends AppCompatActivity {
    public String[] menuName = {"NEW ORDERS", "OPEN ORDERS", "ADD MEDICINE", "PAYMENTS", "COMPLETE ORDERS", "CANCLE ORDERS", "MESSAGES & CALLS", "ABOUT US", "SETTING", "HELP", "FEEDBACK"};
    public int[] menuicons = {R.mipmap.new_orders, R.mipmap.open_orders, R.mipmap.add_medicines,
            R.mipmap.payments, R.mipmap.completed_orders, R.mipmap.cancel_orders, R.mipmap.messages_calls,
            R.mipmap.about_us, R.mipmap.settings, R.mipmap.help, R.mipmap.feedback};
    public DrawerLayout drawer_layout;
    public ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    public RelativeLayout pharmacy_home;
    public LinearLayout new_order, open_order, complete_order, cancle_order;
    public LinearLayout home_view,new_order_view,reffling_view,profile_view,open_order_view;

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

        setContentView(R.layout.activity_pharmacy__home);
        new_order = (LinearLayout) findViewById(R.id.new_order);
        open_order = (LinearLayout) findViewById(R.id.open_order);
        complete_order = (LinearLayout) findViewById(R.id.complete_order);
        cancle_order = (LinearLayout) findViewById(R.id.cancle_order);
        drawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);
        pharmacy_home = (RelativeLayout) findViewById(R.id.pharmacy_home);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        home_view = (LinearLayout) findViewById(R.id.home_view);
        new_order_view = (LinearLayout) findViewById(R.id.new_order_view);
        reffling_view = (LinearLayout) findViewById(R.id.reffling_view);
        open_order_view = (LinearLayout) findViewById(R.id.open_order_view);
        profile_view = (LinearLayout) findViewById(R.id.profile_view);
        View viewinflate = getLayoutInflater().inflate(R.layout.nav_header_main, null);
        View viewinflate_footer = getLayoutInflater().inflate(R.layout.nav_footer_main, null);

        Navigations_ItemsAdapter navigations_itemsAdapter = new Navigations_ItemsAdapter(Pharmacy_HomeActivity.this, menuName, menuicons);
        mDrawerList.setAdapter(navigations_itemsAdapter);
        mDrawerList.addHeaderView(viewinflate);
        mDrawerList.addFooterView(viewinflate_footer);

        mDrawerToggle = new ActionBarDrawerToggle(Pharmacy_HomeActivity.this, drawer_layout, null, R.string.app_name, R.string.app_name) {
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
                if(i==1){
                    Intent intent = new Intent(Pharmacy_HomeActivity.this, NewOrder_Activity.class);
                    startActivity(intent);
                }else if(i==2){
                    Intent intent = new Intent(Pharmacy_HomeActivity.this, Open_OrderActivity.class);
                    startActivity(intent);
                }else if(i==3){
                    Intent intent = new Intent(Pharmacy_HomeActivity.this, Pharmacy_AddMedicine.class);
                    startActivity(intent);
                }else if(i==4){
                    Intent intent = new Intent(Pharmacy_HomeActivity.this, Pharmacy_PaymentActivity.class);
                    startActivity(intent);
                }else if(i==5){
                    Intent intent = new Intent(Pharmacy_HomeActivity.this, Complete_OrderActivity.class);
                    startActivity(intent);
                }else if(i==6){
                    Intent intent = new Intent(Pharmacy_HomeActivity.this, Cancel_OrderActivity.class);
                    startActivity(intent);
                }
            }
        });

        new_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pharmacy_HomeActivity.this, NewOrder_Activity.class);
                startActivity(intent);
            }
        });

        open_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pharmacy_HomeActivity.this, Open_OrderActivity.class);
                startActivity(intent);
            }
        });

        complete_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pharmacy_HomeActivity.this, Complete_OrderActivity.class);
                startActivity(intent);
            }
        });

        cancle_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pharmacy_HomeActivity.this, Cancel_OrderActivity.class);
                startActivity(intent);
            }
        });

        home_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        new_order_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pharmacy_HomeActivity.this, NewOrder_Activity.class);
                startActivity(intent);
            }
        });

        reffling_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        open_order_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pharmacy_HomeActivity.this, Open_OrderActivity.class);
                startActivity(intent);
            }
        });

        profile_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pharmacy_HomeActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}
