package com.example.ast.teleafya.Ui.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.ast.teleafya.R;

import java.util.ArrayList;

/**
 * Created by Apple on 10/26/17.
 */

public class CountryAdapter extends ArrayAdapter<String> implements View.OnClickListener{

    private ArrayList<String> dataSet;
    Context mContext;



    public CountryAdapter(ArrayList<String> data, Context context) {
        super(context, R.layout.item_country, data);
        this.dataSet = data;
        this.mContext=context;

    }

    @Override
    public void onClick(View v) {

        int position=(Integer) v.getTag();
        Object object= getItem(position);


    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position

        // Check if an existing view is being reused, otherwise inflate the view
        // view lookup cache stored in tag

        final View result;

        if (convertView == null) {


            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_country, parent, false);

            result=convertView;

        }

        return convertView;
    }
}
