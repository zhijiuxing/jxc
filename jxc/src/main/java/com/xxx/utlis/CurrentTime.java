package com.xxx.utlis;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
@Component
public class CurrentTime {
    //获得今天时间
    public  Date Time(){
        Date date=new Date();
        return date;
    }
    //获得本周周一时间
    public  Date Time(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //今天距离上周周六过了几天
        int weekday= calendar.get(Calendar.DAY_OF_WEEK);
        weekday=weekday-2;
        //周一日期
        calendar.add(Calendar.DAY_OF_MONTH,- weekday);
        return calendar.getTime();
    }
    //上周日
    public Date LastSunday(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH,- 1);
        return calendar.getTime();
    }
    //上周一
    public Date LastMonday(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH,- 7);
        return calendar.getTime();
    }
    //前x天日期
    public Date FrontX(Date date,int x){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH,- x);
        return calendar.getTime();
    }
    public String MonthDay(Date date){
        SimpleDateFormat format = new SimpleDateFormat("MM-dd");

        return format.format(date);
    }
}
