package com.ottawacoders.swapit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;

public class shift_give extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shift_give);
        Intent intent = getIntent();
        String day = intent.getStringExtra("day");

        //Access Schedule
        for (HashMap.Entry<String,ArrayList<Shift>> temMonday: LoginActivity.schedule.get(day).entrySet()) {
            System.out.println("Schedule for "+temMonday.getKey());
            for(Shift shift: temMonday.getValue())
                System.out.println("Start Time: " + shift.getStartTime()+"Start Time: " + shift.getEndTime());
        }
    }
}
