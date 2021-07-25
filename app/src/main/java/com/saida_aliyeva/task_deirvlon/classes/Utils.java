package com.saida_aliyeva.task_deirvlon.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static String formatDate(String date) {
        Date date_2 = null;
        String formattedDate = null;
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        try {
            date_2 = dt.parse(date);
            SimpleDateFormat dt1 = new SimpleDateFormat("yy.MM.dd hh:mm");
            formattedDate = dt1.format(date_2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return formattedDate;
    }

}
