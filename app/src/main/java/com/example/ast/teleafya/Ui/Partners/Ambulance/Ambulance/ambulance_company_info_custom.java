package com.example.ast.teleafya.Ui.Partners.Ambulance.Ambulance;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.ast.teleafya.R;

/**
 * Created by Kashif on 12/7/2017.
 */

public class ambulance_company_info_custom extends ArrayAdapter {

    int[] imagesArray;
    String[] titleArray;

    public ambulance_company_info_custom(Context context, int[] imagesArray , String[] titleArray) {
        super(context, R.layout.ambulance_company_info_custom, R.id.Title1 , titleArray);
        this.imagesArray = imagesArray;
        this.titleArray = titleArray;

    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.ambulance_company_info_custom , parent , false);


        ImageView imageView = (ImageView) row.findViewById(R.id.ImageComp);
        TextView textView = (TextView) row.findViewById(R.id.Title1);

        imageView.setImageResource(imagesArray[position]);
        textView.setText(titleArray[position]);


        if(titleArray[position].equals("Select a file from your gallery")){


//            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
//            RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
//
//
//
//            params.addRule(RelativeLayout.CENTER_HORIZONTAL);
//
//            imageView.setLayoutParams(params);
//
//            params2.addRule(RelativeLayout.BELOW , imageView.getId());
//
//
//            params2.setMargins(20 , 0 , 0 , 0);
//            textView.setLayoutParams(params2);


        }else {


            imageView.setImageResource(imagesArray[position]);
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

            params.leftMargin = 3;

            imageView.setLayoutParams(params);
            //  textView.setLayoutParams(layoutParams);


        }



        return row;
    }

}



