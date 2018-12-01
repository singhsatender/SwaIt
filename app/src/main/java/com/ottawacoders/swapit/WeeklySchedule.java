package com.ottawacoders.swapit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WeeklySchedule extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly_schedule);

        // Adding Buttons for Weekdays.
        Button monday = (Button) findViewById(R.id.but_monday);
        Button tuesday = (Button) findViewById(R.id.but_tuesday);
        Button wednesday = (Button) findViewById(R.id.but_wednesday);
        Button thursday = (Button) findViewById(R.id.but_thrusday);
        Button friday = (Button) findViewById(R.id.but_friday);
        Button saturday = (Button) findViewById(R.id.but_saturday);
        Button sunday = (Button) findViewById(R.id.but_sunday);

        // Adding listeners for all the buttons.

        monday.setOnClickListener(this);
        tuesday.setOnClickListener(this);
        wednesday.setOnClickListener(this);
        thursday.setOnClickListener(this);
        friday.setOnClickListener(this);
        saturday.setOnClickListener(this);
        sunday.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.but_monday:
                Intent intent = new Intent(getApplicationContext(), shift_give.class);
                startActivity(intent);

                break;
            case R.id.but_tuesday:

                break;
            case R.id.but_wednesday:

                break;
            case R.id.but_thrusday:

                break;
            case R.id.but_friday:

                break;
            case R.id.but_saturday:

                break;
            case R.id.but_sunday:

                break;
        }

    }

}
