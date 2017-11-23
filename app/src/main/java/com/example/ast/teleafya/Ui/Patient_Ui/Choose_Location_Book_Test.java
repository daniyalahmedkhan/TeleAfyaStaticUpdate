package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.ImageView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Choose_Location_ExpandAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by AST on 10/26/2017.
 */

public class Choose_Location_Book_Test extends Fragment {

    public ExpandableListView select_country_test;
    public Choose_Location_ExpandAdapter choose_location_Adapter;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    public ImageView back_home;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.choose_location,null);
        initView(view);

        select_country_test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

        select_country_test.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {

                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.provider_con,new Diagnostic_Lab_Book_Test())
                        .addToBackStack(null)
                        .commit();
                return false;
            }
        });

        back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity()
                        .getSupportFragmentManager()
                        .popBackStack();
            }
        });


        return view;
    }

    private void initView(View view) {
        select_country_test = (ExpandableListView)view.findViewById(R.id.select_country_test);
        back_home = (ImageView)view.findViewById(R.id.back_home);
        prepareListData();
        choose_location_Adapter = new Choose_Location_ExpandAdapter(getActivity(),listDataHeader,listDataChild);
        select_country_test.setAdapter(choose_location_Adapter);
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("United State");
        listDataHeader.add("India");
        listDataHeader.add("United Kingdom");
        listDataHeader.add("Canada");

        // Adding child data
        List<String> top250 = new ArrayList<String>();
        top250.add("New York");
        top250.add("Los Angeles");
        top250.add("Chicago");
        top250.add("Houston");
        top250.add("San Antonio");
        top250.add("San Jose");
        top250.add("Washington");

        List<String> nowShowing = new ArrayList<String>();
        nowShowing.add("Mumbai");
        nowShowing.add("Delhi");
        nowShowing.add("Bangalore");
        nowShowing.add("Hyderabad");
        nowShowing.add("Chennai");
        nowShowing.add("Lucknow");

        List<String> comingSoon = new ArrayList<String>();
        comingSoon.add("Birmingham");
        comingSoon.add("Bristol");
        comingSoon.add("Cambridge");
        comingSoon.add("Canterbury");
        comingSoon.add("Carlisle");

        List<String> canada = new ArrayList<String>();
        canada.add("Airdrie");
        canada.add("Brooks");
        canada.add("Cold Lake");
        canada.add("Lethbridge");
        canada.add("St. Albert");

        listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
        listDataChild.put(listDataHeader.get(1), nowShowing);
        listDataChild.put(listDataHeader.get(2), comingSoon);
        listDataChild.put(listDataHeader.get(3), canada);
    }
}
