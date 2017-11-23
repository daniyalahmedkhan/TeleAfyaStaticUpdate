package com.example.ast.teleafya.Ui.Activities;

import android.os.Build;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.MyViewPagerAdapterfortour;
import com.readystatesoftware.systembartint.SystemBarTintManager;

public class Splash_Screen extends AppCompatActivity {

    public ViewPager splash_tour;
    private MyViewPagerAdapterfortour myViewPagerAdapterfortour;

//    public int layouts[] = new int[]{
//        R.layout.first_tour_page,
//                R.layout.second_tour_page,
//                R.layout.third_tour_page,
//                R.layout.fourth_tour_page};

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
        setContentView(R.layout.activity_splash__screen2);

        splash_tour = (ViewPager)findViewById(R.id.splash_tour);
     //   myViewPagerAdapterfortour = new MyViewPagerAdapterfortour(Splash_Screen.this,layouts);
        splash_tour.setAdapter(myViewPagerAdapterfortour);



        ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        };

        splash_tour.addOnPageChangeListener(viewPagerPageChangeListener);
    }
}
