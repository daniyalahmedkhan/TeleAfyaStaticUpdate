package com.example.ast.teleafya.Ui.Patient_Ui;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.example.ast.teleafya.R;
import com.readystatesoftware.systembartint.SystemBarTintManager;

public class Patient_ReminderActivity extends AppCompatActivity {

    public Button set_reminder;
    public Dialog filter_Regular_Service;
    ImageView back_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient__reminder);
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

        set_reminder = (Button)findViewById(R.id.set_reminder);
        back_image = (ImageView)findViewById(R.id.back_image);
        View completeView = getLayoutInflater().inflate(R.layout.successfuly_apointment, null);

        filter_Regular_Service = new Dialog(Patient_ReminderActivity.this);
        filter_Regular_Service.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        filter_Regular_Service.setContentView(completeView);
        set_reminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               filter_Regular_Service.show();
            }
        });

        back_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Patient_ReminderActivity.this,Patient_HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
