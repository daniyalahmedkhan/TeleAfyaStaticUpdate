package com.example.ast.teleafya.Ui.Partners.Ambulance.Ambulance;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Pharmacy_Ui.Custom_CompanyAdapter;

/**
 * Created by Kashif on 12/7/2017.
 */

public class ambulance_company_info extends android.support.v4.app.Fragment {


    String[] titles = {"Mumbai health care service" , "05-08-2012" , "India" , "company@gmail.com" , "97658925" , "*********" , "200075*" ,"Mumbai", "Maharashtara" , "Flat / HouseNo. / Building" , "Locality / Colony / Street" , "Documents (Required)" };
    int[] images = {R.mipmap.company_name , R.mipmap.establishment , R.mipmap.code , R.mipmap.email , R.mipmap.comphone , R.mipmap.password , R.mipmap.code , R.mipmap.city , R.mipmap.state ,   R.mipmap.flat , R.mipmap.loca , R.mipmap.documents };
    ListView l1;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.ambulance_company_info , null);

        l1 = (ListView) view.findViewById(R.id.listCompany);
        Custom_CompanyAdapter adapter = new Custom_CompanyAdapter(getActivity(), images ,titles );
        l1.setAdapter(adapter);


        return view;

    }
}
