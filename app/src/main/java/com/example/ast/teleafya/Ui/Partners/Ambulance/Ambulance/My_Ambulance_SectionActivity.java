package com.example.ast.teleafya.Ui.Partners.Ambulance.Ambulance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ast.teleafya.R;

public class My_Ambulance_SectionActivity extends AppCompatActivity {


    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my__ambulance__section);

        btn1 = (Button) findViewById(R.id.buttnAdd);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




            }
        });

    }
}
