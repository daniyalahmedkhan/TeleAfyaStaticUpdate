package com.example.ast.teleafya.Ui.Partners.Ambulance.Dispatcher;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Patient_LoginPager;
import com.example.ast.teleafya.Ui.Patient_Ui.Map_List;
import com.example.ast.teleafya.Ui.Patient_Ui.Nurses;

import java.util.ArrayList;

public class Dispatcher_My_Payment_Transaction_Activity extends AppCompatActivity {

    public ViewPager viewPager;
    public TabLayout tabLayout;
    public ArrayList<Fragment> arrayList;
    public Dispatcher_My_Payment_Transaction_Tab dispatcherMyPaymentTransactionTab;
    public Dispatcher_My_Payment_Saved dispatcherMyPaymentSaved;
    public Patient_LoginPager patientLoginPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispatcher__my__payment__transaction_);


        initView();
    }




    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        arrayList = new ArrayList<>();
        dispatcherMyPaymentTransactionTab = new Dispatcher_My_Payment_Transaction_Tab();
        dispatcherMyPaymentSaved = new Dispatcher_My_Payment_Saved();

        arrayList.add(dispatcherMyPaymentTransactionTab);
        arrayList.add(dispatcherMyPaymentSaved);

        tabLayout.addTab(tabLayout.newTab().setText("LAST TRANSACTION"));
        tabLayout.addTab(tabLayout.newTab().setText("SAVED CARD"));

        patientLoginPager = new Patient_LoginPager(Dispatcher_My_Payment_Transaction_Activity.this.getSupportFragmentManager(), arrayList);
        //is line se tablayout k neche jo shade araaha hai woh change hoga pageviewer k mutabik
        viewPager.setAdapter(patientLoginPager);
        // viewPager.setOffscreenPageLimit(0);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }
}
