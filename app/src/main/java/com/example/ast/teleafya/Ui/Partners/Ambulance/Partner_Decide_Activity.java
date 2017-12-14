package com.example.ast.teleafya.Ui.Partners.Ambulance;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Patient_LoginPager;
import com.example.ast.teleafya.Ui.DoctorModule.Doctor_SignUp;
import com.example.ast.teleafya.Ui.Partners.Ambulance.Ambulance.Ambulance_LoginActivity;
import com.example.ast.teleafya.Ui.Partners.Ambulance.Ambulance.Ambulance_SignIn;
import com.example.ast.teleafya.Ui.Partners.Ambulance.Ambulance.add_ambulance;
import com.example.ast.teleafya.Ui.Partners.Ambulance.Dispatcher.Dispatcher_LoginActivity;
import com.example.ast.teleafya.Ui.Partners.Ambulance.Transport.Transport_Login;

import java.util.ArrayList;
import java.util.List;

import in.goodiebag.carouselpicker.CarouselPicker;

public class Partner_Decide_Activity extends AppCompatActivity {


    public ViewPager viewPager;
    public TabLayout tabLayout;
    //public ArrayList<Fragment> arrayList;
    public Doctor_SignUp doctorSignUp;
    public Ambulance_SignIn ambulanceSignIn;
    public add_ambulance  addAmbulance;
    public Transport_Login transportLogin;
    public Dispatcher_LoginActivity dispatcherLoginActivity;
    public Patient_LoginPager patientLoginPager;
    ArrayList arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partner__decide_);

        arrayList  = new ArrayList();


        CarouselPicker carouselPicker = (CarouselPicker) findViewById(R.id.carousel);

        //Case 3 : To populate the picker with both images and text
        List<CarouselPicker.PickerItem> mixItems = new ArrayList<>();
        mixItems.add(new CarouselPicker.DrawableItem(R.mipmap.dispatcher));
        //  mixItems.add(new CarouselPicker.TextItem("Dis", 20));
        mixItems.add(new CarouselPicker.DrawableItem(R.mipmap.ambulance));
        //  mixItems.add(new CarouselPicker.TextItem("Amb", 20));
        mixItems.add(new CarouselPicker.DrawableItem(R.mipmap.transport));
        //  mixItems.add(new CarouselPicker.TextItem("Tra", 20));
        CarouselPicker.CarouselViewAdapter mixAdapter = new CarouselPicker.CarouselViewAdapter(this, mixItems, 0);
        carouselPicker.setAdapter(mixAdapter);



        carouselPicker.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                if (position == 0) {

                    viewPager = (ViewPager) findViewById(R.id.view_pager);
                    tabLayout = (TabLayout) findViewById(R.id.tab_layout);

                    arrayList = new ArrayList<>();

                    ambulanceSignIn = new Ambulance_SignIn();
                    doctorSignUp = new Doctor_SignUp();

                    tabLayout.removeAllTabs();

                    arrayList.clear();
                    arrayList.add(ambulanceSignIn);
                    arrayList.add(doctorSignUp);

                    tabLayout.addTab(tabLayout.newTab().setText("SIGN IN "));
                    tabLayout.addTab(tabLayout.newTab().setText("SIGN UP"));

                    patientLoginPager = new Patient_LoginPager(Partner_Decide_Activity.this.getSupportFragmentManager(), arrayList);
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



                }else if (position == 1){


                    viewPager = (ViewPager) findViewById(R.id.view_pager);
                    tabLayout = (TabLayout) findViewById(R.id.tab_layout);

                    arrayList = new ArrayList<>();

                    ambulanceSignIn = new Ambulance_SignIn();
                    addAmbulance = new add_ambulance();

                    arrayList.clear();

                    arrayList.add(ambulanceSignIn);
                    arrayList.add(addAmbulance);



                    tabLayout.removeAllTabs();

                    tabLayout.addTab(tabLayout.newTab().setText("SIGN IN "));
                    tabLayout.addTab(tabLayout.newTab().setText("SIGN UP"));

                    patientLoginPager = new Patient_LoginPager(Partner_Decide_Activity.this.getSupportFragmentManager(), arrayList);
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


                }else if (position == 2){


                    viewPager = (ViewPager) findViewById(R.id.view_pager);
                    tabLayout = (TabLayout) findViewById(R.id.tab_layout);

                    arrayList = new ArrayList<>();

                    transportLogin = new Transport_Login();
                    addAmbulance = new add_ambulance();

                    arrayList.clear();

                    arrayList.add(transportLogin);
                    arrayList.add(addAmbulance);



                    tabLayout.removeAllTabs();

                    tabLayout.addTab(tabLayout.newTab().setText("SIGN IN "));
                    tabLayout.addTab(tabLayout.newTab().setText("SIGN UP"));

                    patientLoginPager = new Patient_LoginPager(Partner_Decide_Activity.this.getSupportFragmentManager(), arrayList);
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

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }


}
