package com.example.ast.teleafya.Ui.Pharmacy_Ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.util.ArrayList;

public class AccountInfo extends android.support.v4.app.Fragment {

    String[] titles = {"Arvind patel" , "84758693125" , "458793" , "Arvind Patel" , "CHE452361" , "Chakala Andheri" , "976918807" , "Business"};
    ArrayList<String[]> arr;

    ListView l1;
    Button AddNewAcc;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_account_info,null);
        arr = new ArrayList<>();
        arr.add(titles);
        l1 = (ListView) view.findViewById(R.id.listAccount);
        Custom_AccountAdapter adapter = new Custom_AccountAdapter(getActivity(),  arr );
        l1.setAdapter(adapter);

        View footerView = ((LayoutInflater)getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.account_info_footer, null, false);
        l1.addFooterView(footerView);

        AddNewAcc  = (Button) view.findViewById(R.id.AddNewMethod);

        AddNewAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity() , AddNewMethod.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
