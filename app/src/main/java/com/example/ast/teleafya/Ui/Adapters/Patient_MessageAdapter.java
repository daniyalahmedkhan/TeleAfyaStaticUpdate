package com.example.ast.teleafya.Ui.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ast.teleafya.R;

import java.util.ArrayList;

/**
 * Created by AST on 10/30/2017.
 */

public class Patient_MessageAdapter extends BaseAdapter {

    public ArrayList<String> arrayList;
    public Context context;
    public TextView msg_count;
    public ImageView user_msg_pimage;

    public Patient_MessageAdapter(ArrayList<String> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
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

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v  = inflater.inflate(R.layout.patient_msg_view,null);
        msg_count = (TextView)v.findViewById(R.id.msg_count);
        user_msg_pimage = (ImageView)v.findViewById(R.id.user_msg_pimage);

        if(i%2==0){
            msg_count.setVisibility(View.VISIBLE);
            user_msg_pimage.setImageResource(R.mipmap.maxima);

        }else{
            msg_count.setVisibility(View.INVISIBLE);
        }


        return v;
    }
}
