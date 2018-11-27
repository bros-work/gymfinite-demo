package com.broswork.gymfinitedemo;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;

public class CheckinActivity extends FragmentActivity {

    Button check_inButton;
    FragmentManager fm = getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searched_checkin_layout2);

        // Locate the button in activity_main.xml
        check_inButton = (Button) findViewById(R.id.check_inButton);


        // Capture button clicks
        check_inButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                DFragment dFragment = new DFragment();
                // Show DialogFragment
                dFragment.show(fm, "Dialog Fragment");
            }
        });




    }
}
