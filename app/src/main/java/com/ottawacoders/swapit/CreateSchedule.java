package com.ottawacoders.swapit;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class CreateSchedule extends AppCompatActivity {
    EditText startTime;
    EditText endTime;
    EditText name;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_schedule);
        startTime = findViewById(R.id.startTime);
        endTime = findViewById(R.id.endTime);
        name = findViewById(R.id.person_name);
        spinner = findViewById(R.id.spinner);
    }

    public void selectTime(final View view){
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        TimePickerDialog timePickerDialog = new TimePickerDialog(CreateSchedule.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {
                if (startTime==view){
                    startTime.setText(i+""+i1);
                }
                else
                    endTime.setText(i+""+i1);
            }
        }, hour,minute,true);
        timePickerDialog.show();
    }

    public void submitSchedule(View view){
        //Save to schedule
        Shift shift = new Shift(Integer.parseInt(startTime.getText().toString()),Integer.parseInt(endTime.getText().toString()),name.getText().toString());
        ArrayList<Shift> shifts = new ArrayList<Shift>();
        shifts.add(shift);
        HashMap<String,ArrayList<Shift>> map1 = new HashMap<String,ArrayList<Shift>>();
        map1.put(name.getText().toString(),shifts);
        String day = spinner.getSelectedItem().toString();
        LoginActivity.schedule.put(day,map1);


        Intent intent = new Intent(this, WeeklySchedule.class);
        intent.putExtra("personName", name.getText());
        intent.putExtra("day", day);
        intent.putExtra("startTime", startTime.getText());
        intent.putExtra("endTime", endTime.getText());
        startActivity(intent);
    }
}
