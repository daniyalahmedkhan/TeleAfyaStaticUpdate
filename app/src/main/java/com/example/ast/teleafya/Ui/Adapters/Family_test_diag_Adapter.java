package com.example.ast.teleafya.Ui.Adapters;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import com.example.ast.teleafya.R;

import java.util.ArrayList;

/**
 * Created by AST on 10/27/2017.
 */

public class Family_test_diag_Adapter extends BaseAdapter {
    public ArrayList<String> stringArrayList;
    public Activity context;
    public Dialog book_dialog;

    public Family_test_diag_Adapter(ArrayList<String> stringArrayList, Activity context) {
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
            v = layoutInflater.inflate(R.layout.family_test_diag_view_m,null);
        }else{
            v = layoutInflater.inflate(R.layout.family_test_diag_view,null);
        }

       Button book_now = (Button)v.findViewById(R.id.book_now);
        book_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book_dialog.show();
            }
        });
        View completeView = context.getLayoutInflater().inflate(R.layout.family_test_alert, null);

        book_dialog = new Dialog(context);
        book_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        book_dialog.setContentView(completeView);


        return v;
    }
}
