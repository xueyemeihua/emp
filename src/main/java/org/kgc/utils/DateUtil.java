package org.kgc.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-04-16:42
 */
public class DateUtil {


    public static String format(String date) {
        String result="";
        try {
            if (date!=null){
                DateFormat dateFormat = new SimpleDateFormat("yyyy--MM--dd");
                result = dateFormat.format(date);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

}
