package by.epam.globTask7.task06.main;

import java.io.Serializable;

public class Time implements Serializable {
    private int hours;
    private int minutes;
    private int seconds;


    public Time(){
        hours = 0;
        minutes = 10;
        seconds = 0;
    }

    public void setHours(int _hours){
        if (_hours<=24 && _hours>=0) {
            hours = _hours;
        } else {
            hours = 0;
        }
    }
    public int getHours(){
        return hours;
    }

    public void setMinutes(int _minutes){
        if (_minutes<=60 && _minutes>=0) {
            minutes = _minutes;
        } else {
            minutes = 0;
        }

    }

    public int getMinutes(){
        return minutes;
    }

    public void setSeconds(int _seconds){
        if (_seconds<=60 && _seconds>=0) {
            seconds = _seconds;
        } else {
            seconds = 0;
        }
    }
    public int getSeconds(){
        return seconds;
    }

    public void changeTime(int hour, int minute, int second){
        setHours(hour);
        setMinutes(minute);
        setSeconds(second);
    }
 


}
