package com.example.ast.teleafya.Ui.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.ast.teleafya.R;

import java.util.ArrayList;

/**
 * Created by AST on 10/27/2017.
 */

public class Recommanded_DiagListAdapter extends BaseAdapter {
    public ArrayList<String> stringArrayList;
    public Context context;


    public Recommanded_DiagListAdapter(ArrayList<String> stringArrayList, Context context) {
        this.stringArrayList = stringArrayList;
        this.context = context;
    }


    @Override
    public int getCount() {
        return stringArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return stringArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v ;
        if(i%2==0){
            v = layoutInflater.inflate(R.layout.recommaded_diaglab_view_m,null);
        }else{
            v = layoutInflater.inflate(R.layout.recommaded_diaglab_view,null);
        }


        return v;
    }
}
