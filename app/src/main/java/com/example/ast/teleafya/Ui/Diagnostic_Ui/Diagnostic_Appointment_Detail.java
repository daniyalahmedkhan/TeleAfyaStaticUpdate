package com.example.ast.teleafya.Ui.Diagnostic_Ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Request_Diagnostic_App;
import com.example.ast.teleafya.Ui.Adapters.Request_Diagnostic_Detail_Adp;
import com.example.ast.teleafya.Ui.Patient_Ui.Book_Appointment;
import com.example.ast.teleafya.Ui.Patient_Ui.Patient_to_Doctor;

import java.util.ArrayList;

/**
 * Created by AST on 10/24/2017.
 */

public class Diagnostic_Appointment_Detail extends android.support.v4.app.Fragment {

    public ImageView back_press_app;
    public Button reshedule_app;
    ListView lvPast;

    Request_Diagnostic_Detail_Adp adp;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.diagnostic_appointment_detail, null);
        initViews(view);


        back_press_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });



        return view;
    }

    private void initViews(View view) {
        back_press_app = (ImageView) view.findViewById(R.id.back_press_app);

        reshedule_app = (Button)view.findViewById(R.id.reshedule_app);

        lvPast=(ListView)view.findViewById(R.id.listpast);

       ArrayList arrayList = new ArrayList<>();

        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");

        adp = new Request_Diagnostic_Detail_Adp(arrayList,getActivity());
        lvPast.setAdapter(adp);
        setListViewHeightBasedOnChildren(lvPast);
        reshedule_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                getActivity().getSupportFragmentManager()
//                        .beginTransaction()
//                        .replace(R.id.p_nav_container, new Book_Appointment())
//                        .addToBackStack(null)
//                        .commit();
            }
        });

    }

    public void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            // pre-condition
            return;
        }

        int totalHeight = listView.getPaddingTop() + listView.getPaddingBottom();
        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), View.MeasureSpec.AT_MOST);
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);

            if(listItem != null){
                // This next line is needed before you call measure or else you won't get measured height at all. The listitem needs to be drawn first to know the height.
                listItem.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
                listItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
                totalHeight += listItem.getMeasuredHeight();

            }
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
        listView.requestLayout();
    }
}
