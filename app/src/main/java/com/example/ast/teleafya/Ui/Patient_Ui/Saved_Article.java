package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Timelinelist_Adapter;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.util.ArrayList;

public class Saved_Article extends AppCompatActivity {
    public ListView timeline_list;
    public Timelinelist_Adapter timelinelist_adapter;
    public ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();

        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.KITKAT) {
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            SystemBarTintManager tintManager = new SystemBarTintManager(this);
            tintManager.setStatusBarTintEnabled(true);
            tintManager.setStatusBarTintColor(getResources().getColor(R.color.transparent));


        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

            getWindow().setStatusBarColor(getResources().getColor(R.color.transparent));
        }
        setContentView(R.layout.activity_saved__article);

        timeline_list = (ListView)findViewById(R.id.timeline_list);
        arrayList = new ArrayList<>();
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

        timelinelist_adapter = new Timelinelist_Adapter(arrayList, Saved_Article.this);
        timeline_list.setAdapter(timelinelist_adapter);

    }
}
