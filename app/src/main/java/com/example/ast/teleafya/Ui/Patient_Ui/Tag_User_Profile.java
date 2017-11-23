package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Timelinelist_Adapter;

import java.util.ArrayList;

/**
 * Created by AST on 10/26/2017.
 */

public class Tag_User_Profile extends android.support.v4.app.Fragment {

    public ListView tag_people_post;
    public ArrayList<String> arrayList;
    public Timelinelist_Adapter timelinelist_adapter;
    public ImageView back_home;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tag_user_profile,null);
        initview(view);

        back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager()
                        .popBackStack();
            }
        });



        return view;
    }

    private void initview(View view) {
        tag_people_post = (ListView)view.findViewById(R.id.tag_people_post);
        arrayList = new ArrayList<>();
        back_home = (ImageView)view.findViewById(R.id.back_home);
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");


        timelinelist_adapter = new Timelinelist_Adapter(arrayList,getActivity());
        tag_people_post.setAdapter(timelinelist_adapter);

    }
}
