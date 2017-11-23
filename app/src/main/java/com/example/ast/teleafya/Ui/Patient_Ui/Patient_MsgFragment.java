package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Patient_MessageAdapter;

import java.util.ArrayList;

/**
 * Created by AST on 10/30/2017.
 */

public class Patient_MsgFragment extends android.support.v4.app.Fragment {

    public ListView chat_user_list;
    public ArrayList<String> strings;
    public Patient_MessageAdapter patient_messageAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.patient_msg_frag,null);
        chat_user_list = (ListView)view.findViewById(R.id.chat_user_list);
        strings = new ArrayList<>();

        strings.add("");
        strings.add("");
        strings.add("");
        strings.add("");
        strings.add("");
        strings.add("");
        strings.add("");
        strings.add("");




        chat_user_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.message_container,new Conversation_Fragment())
                        .commit();
            }
        });


        patient_messageAdapter = new Patient_MessageAdapter(strings,getActivity());
        chat_user_list.setAdapter(patient_messageAdapter);

        return view;
    }
}
