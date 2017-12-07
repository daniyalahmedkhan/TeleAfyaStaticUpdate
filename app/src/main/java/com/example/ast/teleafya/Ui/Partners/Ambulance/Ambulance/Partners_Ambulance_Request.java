package com.example.ast.teleafya.Ui.Partners.Ambulance.Ambulance;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.DoctorModule.Doctor_Home_Notification;

public class Partners_Ambulance_Request extends AppCompatActivity {

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partners__ambulance__request);
        linearLayout = (LinearLayout) findViewById(R.id.Linear1);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager
                        .beginTransaction();
                partners_ambulance_request_detail fragmentS1 = new partners_ambulance_request_detail();
                getSupportFragmentManager().beginTransaction().add(android.R.id.content, fragmentS1).commit();



            }
        });



    }
}
