package com.example.ast.teleafya.Ui.Pharmacy_Ui;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ast.teleafya.R;

import java.util.ArrayList;

import static com.example.ast.teleafya.R.mipmap.star;

/**
 * Created by Kashif on 10/31/2017.
 */

public class Custom_AccountAdapter extends ArrayAdapter {

    String[] titleArray;
    ArrayList<String[]> arr;


    public Custom_AccountAdapter(Context context, ArrayList<String[]> arr) {
        super(context, R.layout.custom_account_info, arr);
        this.arr = arr;

    }

    @Override
    public int getPosition(@Nullable Object item) {
        return super.getPosition(item);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.custom_account_info, parent, false);



        TextView textView1 = (TextView) row.findViewById(R.id.text4);
        TextView textView2 = (TextView) row.findViewById(R.id.text5);
        TextView textView3 = (TextView) row.findViewById(R.id.text6);
        TextView textView4 = (TextView) row.findViewById(R.id.text10);

        TextView textView5 = (TextView) row.findViewById(R.id.text11);

        TextView textView6 = (TextView) row.findViewById(R.id.text12);
        TextView textView7 = (TextView) row.findViewById(R.id.text15);
        TextView textView8 = (TextView) row.findViewById(R.id.text16);
        titleArray = arr.get(0);

        textView1.setText(titleArray[0]);
        textView2.setText(titleArray[1]);
        textView3.setText(titleArray[2]);
        textView4.setText(titleArray[3]);

        textView5.setText(titleArray[4]);

        textView6.setText(titleArray[5]);
        textView7.setText(titleArray[6]);
        textView8.setText(titleArray[7]);





        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), AddNewMethod.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);;
                getContext().startActivity(intent);

            }
        });




        return row;
    }

}