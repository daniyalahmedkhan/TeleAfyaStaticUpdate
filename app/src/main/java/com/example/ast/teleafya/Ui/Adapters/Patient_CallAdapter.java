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

public class Patient_CallAdapter extends BaseAdapter {

    public ArrayList<String> arrayList;
    public Context context;
   // public TextView call_icon;
    public ImageView call_icon;

    public Patient_CallAdapter(ArrayList<String> arrayList, Context context) {
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
        View v  = inflater.inflate(R.layout.patient_call_view,null);
        call_icon = (ImageView) v.findViewById(R.id.call_icon);
      //  user_msg_pimage = (ImageView)v.findViewById(R.id.user_msg_pimage);

        if(i%2==0){
        //    msg_count.setVisibility(View.VISIBLE);
            call_icon.setImageResource(R.mipmap.video_call);

        }else{
           // msg_count.setVisibility(View.INVISIBLE);
            call_icon.setImageResource(R.mipmap.call);
        }


        return v;
    }
}
