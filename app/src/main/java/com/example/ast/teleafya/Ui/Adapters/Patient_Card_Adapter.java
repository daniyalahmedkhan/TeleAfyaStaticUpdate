package com.example.ast.teleafya.Ui.Adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.ast.teleafya.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by AST on 10/26/2017.
 */

public class Patient_Card_Adapter extends BaseAdapter{

    public Context context;
    public ArrayList<String>arrayList;


    public Patient_Card_Adapter(Context context, ArrayList<String> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = layoutInflater.inflate(R.layout.user_card_view,null);



        return v;
    }
}