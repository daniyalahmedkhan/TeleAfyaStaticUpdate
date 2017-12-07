package com.example.ast.teleafya.Ui.Partners.Ambulance.Ambulance;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.ast.teleafya.R;

public class partners_ambulance_past_requestActivity extends AppCompatActivity {

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partners_ambulance_past_request);

        linearLayout = (LinearLayout) findViewById(R.id.Linear1);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager
                        .beginTransaction();
                partners_ambulance_past_requestActivity_detail fragmentS1 = new partners_ambulance_past_requestActivity_detail();
                getSupportFragmentManager().beginTransaction().add(android.R.id.content, fragmentS1).commit();

            }
        });


    }
}
