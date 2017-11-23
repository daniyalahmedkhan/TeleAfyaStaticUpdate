package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.ast.teleafya.R;

/**
 * Created by AST on 10/26/2017.
 */

public class Diagnostic_Provider extends Fragment {

    public LinearLayout report_provider,book_a_test_provider,test_order_provider,family_provider;
    public ImageView back_image;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.diagnostic_provider,null);
        initViews(view);


        return view;
    }

    private void initViews(View view) {
        book_a_test_provider = (LinearLayout)view.findViewById(R.id.book_a_test_provider);
        family_provider = (LinearLayout)view.findViewById(R.id.family_provider);
        report_provider = (LinearLayout)view.findViewById(R.id.report_provider);
        test_order_provider  = (LinearLayout)view.findViewById(R.id.test_order_provider);
        back_image = (ImageView)view.findViewById(R.id.back_image);

        book_a_test_provider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.provider_con,new Choose_Location_Book_Test())
                        .addToBackStack(null)
                        .commit();

            }
        });

        family_provider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.provider_con,new FamilyMember_DiagTest())
                        .addToBackStack(null)
                        .commit();
            }
        });

        report_provider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.provider_con,new Report_DiagProvider())
                        .addToBackStack(null)
                        .commit();
            }
        });

        back_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager()
                        .popBackStack();
            }
        });

        test_order_provider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.provider_con,new TestOrder_Diagnostic())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}
