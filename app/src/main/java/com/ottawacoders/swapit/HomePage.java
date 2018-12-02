package com.ottawacoders.swapit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        //Adding Buttons
        Button set_schedule = (Button) findViewById(R.id.but_set_schedule);
        Button get_schedule = (Button) findViewById(R.id.but_get_schedule);

        //Adding Listeners
        set_schedule.setOnClickListener(this);
        get_schedule.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.but_set_schedule:
                Intent intent = new Intent(getApplicationContext(), shift_give.class);
                startActivity(intent);
                break;
            case R.id.but_get_schedule:
                Intent second = new Intent(getApplicationContext(), WeeklySchedule.class);
                startActivity(second);
                break;
        }
    }
}
