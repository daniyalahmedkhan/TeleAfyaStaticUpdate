package com.example.ast.teleafya.Ui.Partners.Ambulance.Transport;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ast.teleafya.R;

/**
 * Created by Kashif on 12/14/2017.
 */

public class Transport_Login extends android.support.v4.app.Fragment {


    Button btnLogn;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.transort_login , null);

        btnLogn = (Button) view.findViewById(R.id.login_btn);

        btnLogn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity() , Partners_TransportHome.class);
                startActivity(intent);
            }
        });

        return view;



    }
}
