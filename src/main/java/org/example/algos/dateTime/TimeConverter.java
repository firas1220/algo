package org.example.algos.dateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TimeConverter {

    /**
     * Takes date in format such 00:00:00 AM/PM and return it 
     * @param s
     * @return
     */
public static String timeConversion(String s) {
    
    StringBuilder sb = new StringBuilder(s);
    
    DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
    
    LocalTime localTime = LocalTime.parse(s,f);
    
    String result = localTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
    
    return result;
}

    public static void main(String[] args) {
       
        String s = "12:00:00AM";
        // result must be : 19:05:45
        
        s = timeConversion(s);

        System.out.println("result is: " + s);
    }
    
}
