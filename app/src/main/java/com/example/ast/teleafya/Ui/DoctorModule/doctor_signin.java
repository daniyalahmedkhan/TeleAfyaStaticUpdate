package com.example.ast.teleafya.Ui.DoctorModule;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Patient_Ui.Patient_HomeActivity;

/**
 * Created by Kashif on 11/28/2017.
 */

public class doctor_signin extends android.support.v4.app.Fragment{

    RelativeLayout relativeLayout;
    Button btnLogin;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.doctor_signin , null);
        btnLogin = (Button)view.findViewById(R.id.login_btn);







        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(),Doctor_HomeActivity.class);
                startActivity(intent);

            }
        });

        return view;
    }
}
