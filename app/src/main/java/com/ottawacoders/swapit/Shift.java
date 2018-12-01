package com.ottawacoders.swapit;

import java.util.Date;

/**
 * Created by singh on 12/1/2018.
 */

public class Shift {
    int startTime;
    int  endTime;
    String employeeName;

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public Shift(int startTime, int endTime, String employeeName) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
