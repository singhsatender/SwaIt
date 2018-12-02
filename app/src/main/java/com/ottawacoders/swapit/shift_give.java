package com.ottawacoders.swapit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class shift_give extends AppCompatActivity {
    //LIST OF ARRAY STRINGS WHICH WILL SERVE AS LIST ITEMS
    List<String> listItems=new ArrayList<String>();
    ListView listMembers;
    private String[] lv_arr = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shift_give);

        Intent intent = getIntent();
        String day = intent.getStringExtra("day");
        listMembers = (ListView)
                findViewById(R.id.dailySchedule);


        //Access Schedule
        for (HashMap.Entry<String,ArrayList<Shift>> temMonday: LoginActivity.schedule.get(day).entrySet()) {
            System.out.println("Schedule for "+temMonday.getKey());
            for(Shift shift: temMonday.getValue())
            listItems.add("Employee Name : "+shift.getEmployeeName()+"\nStart Time: " + shift.getStartTime()+"\nEnd Time: " + shift.getEndTime());

        }
        // Convert ArrayList to array
        lv_arr = (String[]) listItems.toArray(new String[0]);
        listMembers.setAdapter(new ArrayAdapter<String>(shift_give.this,
                android.R.layout.simple_list_item_1, lv_arr));

    }
}
