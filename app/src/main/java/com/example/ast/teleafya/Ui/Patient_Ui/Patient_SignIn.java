package com.example.ast.teleafya.Ui.Patient_Ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ast.teleafya.R;

import org.w3c.dom.Text;

/**
 * Created by AST on 10/23/2017.
 */

public class Patient_SignIn extends android.support.v4.app.Fragment {


    public TextView welcome, wel_disc, forgot_pass, patient_google, patient_facebook;
    public AutoCompleteTextView email;
    public EditText password;
    public Button login_btn;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public static final Patient_SignIn newInstance(String message) {
        Patient_SignIn f = new Patient_SignIn();

        return f;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.patient_signin, null);
        initializeViews(view);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Patient_HomeActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }

    private void initializeViews(View view) {
        welcome = (TextView) view.findViewById(R.id.welcome);
        wel_disc = (TextView) view.findViewById(R.id.wel_disc);
        forgot_pass = (TextView) view.findViewById(R.id.forgot_pass);
        patient_google = (TextView) view.findViewById(R.id.patient_google);
        patient_facebook = (TextView) view.findViewById(R.id.patient_facebook);
        email = (AutoCompleteTextView) view.findViewById(R.id.email);
        password = (EditText) view.findViewById(R.id.password);
        login_btn = (Button) view.findViewById(R.id.login_btn);
        Typeface face = Typeface.createFromAsset(getActivity().getAssets(), "font/lato_bold.ttf");
        welcome.setTypeface(face);

        Typeface face1 = Typeface.createFromAsset(getActivity().getAssets(), "font/lato_light.ttf");
        wel_disc.setTypeface(face1);
        //   Typeface face2= Typeface.createFromAsset(getActivity().getAssets(),"font/lato_lightItalic.ttf");
        forgot_pass.setTypeface(face1);
        //    Typeface face2= Typeface.createFromAsset(getActivity().getAssets(),"font/lato_black.ttf");

        patient_google.setTypeface(face1);
        patient_facebook.setTypeface(face1);
        email.setTypeface(face1);
        password.setTypeface(face1);


    }
}
