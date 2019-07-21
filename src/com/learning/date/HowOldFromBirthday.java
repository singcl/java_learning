package com.learning.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HowOldFromBirthday {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String birthday = "1990年02月03日";
        Date d = sdf.parse(birthday);
        long myTime = d.getTime();
        long cuurentTime = new Date().getTime();
        System.out.println("年齡為：" + (cuurentTime - myTime) / 1000 / 60 / 60 / 24 / 365);
    }
}
