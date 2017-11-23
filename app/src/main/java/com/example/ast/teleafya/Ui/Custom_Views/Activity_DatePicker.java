package com.example.ast.teleafya.Ui.Custom_Views;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.aigestudio.wheelpicker.WheelPicker;
import com.aigestudio.wheelpicker.widgets.WheelDatePicker;
import com.example.ast.teleafya.R;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;


public final class Activity_DatePicker extends AppCompatActivity implements WheelPicker.OnItemSelectedListener, View.OnClickListener {
    private static final String DEFAULT_TEMPLATE = "dd/MM/yyyy";
    private WheelDatePicker wheelCenter;
    private Button gotoBtn;
    private Integer gotoBtnItemIndex;

    @NonNull
    private final SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_TEMPLATE, Locale.getDefault());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dob_spinner);
        wheelCenter = (WheelDatePicker) findViewById(R.id.main_wheel_center);
       // wheelCenter.setOnItemSelectedListener(this);



    }


    private void onDateSelected(int year, int month, int dayOfMonth) {
        final Calendar calendar = Calendar.getInstance(Locale.getDefault());

        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.YEAR, year);

        Toast.makeText(Activity_DatePicker.this, formatter.format(calendar.getTime()), Toast.LENGTH_SHORT).show();
    }

    private void randomlySetGotoBtnIndex() {
        gotoBtnItemIndex = (int) (Math.random() * wheelCenter.getData().size());
        gotoBtn.setText("Goto '" + wheelCenter.getData().get(gotoBtnItemIndex) + "'");
    }

    @Override
    public void onItemSelected(WheelPicker picker, Object data, int position) {
        String text = "";
        switch (picker.getId()) {
            case R.id.main_wheel_center:
                text = "Center:";
                break;

        }
        Toast.makeText(this, text + String.valueOf(data), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        wheelCenter.setSelectedItemPosition(gotoBtnItemIndex);
        randomlySetGotoBtnIndex();
    }


}
