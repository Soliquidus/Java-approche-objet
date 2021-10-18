package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * TP - Apprendre à utiliser les Dates et Calendar
 *
 * @author: Tibo Pfeifer
 * @version: 1.0
 * @date: 15/10/2021
 */
public class TestCalendar {
    public static void main(String[] args) {
        Calendar newCalendar = Calendar.getInstance();
        newCalendar.set(2016, 4, 19, 23, 59, 30);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateFormat.format(newCalendar.getTime()));

        Calendar actualDate = Calendar.getInstance();
        dateFormat.applyPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dateFormat.format(actualDate.getTime()));

        //Français
        System.out.println(actualDate.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.FRANCE) + " " +
                actualDate.get(Calendar.DAY_OF_MONTH) + " " +
                actualDate.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.FRANCE) + " " +
                actualDate.get(Calendar.YEAR));

        Locale russe = new Locale("ru");

        //Russe
        System.out.println(actualDate.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, russe) + " " +
                actualDate.get(Calendar.DAY_OF_MONTH) + " " +
                actualDate.getDisplayName(Calendar.MONTH, Calendar.LONG, russe) + " " +
                actualDate.get(Calendar.YEAR));

        //Chinois
        System.out.println(actualDate.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.CHINESE) + " " +
                actualDate.get(Calendar.DAY_OF_MONTH) + " " +
                actualDate.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.CHINESE) + " " +
                actualDate.get(Calendar.YEAR));

        //Allemand
        System.out.println(actualDate.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.GERMAN) + " " +
                actualDate.get(Calendar.DAY_OF_MONTH) + " " +
                actualDate.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.GERMAN) + " " +
                actualDate.get(Calendar.YEAR));
    }
}