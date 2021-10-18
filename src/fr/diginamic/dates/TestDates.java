package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * TP - Apprendre à utiliser les Dates et Calendar
 *
 * @author: Tibo Pfeifer
 * @version: 1.0
 * @date: 15/10/2021
 */
public class TestDates {
    public static void main(String[] args) {

        Date newDate = new Date();
        SimpleDateFormat newDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(newDateFormat.format(newDate));

        Date date = new Date(116,4,19,23,59,30);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(dateFormat.format(date));
        System.out.println(dateFormat.format(newDate));
    }
}