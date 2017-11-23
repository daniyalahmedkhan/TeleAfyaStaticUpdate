package com.example.ast.teleafya.Ui.Adapters;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ast.teleafya.R;


/**
 * Created by AST on 9/13/2017.
 */

public class Navigations_ItemsAdapter extends BaseAdapter {

    public Context context;
    public String[] menuName;
    public int[] menuIcons;
    public LayoutInflater layoutInflater;

    public Navigations_ItemsAdapter(FragmentActivity activity, String[] menuName,int[] menuIcons) {

        this.context = activity;
        this.menuName = menuName;
        this.menuIcons = menuIcons;
        this.layoutInflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);



    }

    @Override
    public int getCount() {
        return menuName.length;
    }

    @Override
    public Object getItem(int i) {
        return menuName[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View view1 = layoutInflater.inflate(R.layout.navinner_view,null);

        TextView textView = (TextView)view1.findViewById(R.id.text_nav);
        ImageView imageView = (ImageView)view1.findViewById(R.id.icon_nav);

        textView.setText(menuName[i]);
        imageView.setImageResource(menuIcons[i]);


        return view1;
    }
}
