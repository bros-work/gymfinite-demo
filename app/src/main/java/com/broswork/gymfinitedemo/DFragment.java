package com.broswork.gymfinitedemo;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class DFragment extends DialogFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.dialog_layout, container,
                false);

        Button mBtnOk = rootView.findViewById(R.id.login_success);
        mBtnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getContext(),SettingActivity.class);
                getContext().startActivity(i);
            }
        });


        return rootView;


        }
}