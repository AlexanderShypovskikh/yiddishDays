package yiddishdays;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by User7 on 25.10.2017.
 */
public class YiddishDays implements Days {
   private static Date date = null;
   private static Map<String, String> yDays = new HashMap();
    private static Map<String, String> yMonth = new HashMap();


    public static String getCurenDay(){
          date = new Date();
          initDays();
          initMonth();
          String yDate = parseDate(date);
        return yDate;
    }

    enum Days {
        Mon, Tue, Wed, Thu, Fri, Sat, Sun;
    }

    enum  Month {
        Jan, Feb, Mar, Apr, May, June,
        July, Aug, Sept, Oct, Nov, Dec;
    }


    private static void initDays(){
        yDays.put("Mon", "יוֹם שֵנִי — ב");
        yDays.put("Tue", "יוֹם שלִישִי — ג");
        yDays.put("Wed", "יוֹם רְבִיעִי — ד");
        yDays.put("Thu", "יוֹם חֲמִישִי — ה");
        yDays.put("Fri", "יוֹם שִישִי — ו");
        yDays.put("Sat", "שַבָּת — ש");
        yDays.put("Sun", "יוֹם רִאשוֹן — א");
    }

    private static void initMonth(){
        yMonth.put("Jan", "יָנוּאַר");
        yMonth.put("Feb", "פֶבּרוּאַר");
        yMonth.put("Mar", "מֶרץ");
        yMonth.put("Apr", "אַפּרִיל");
        yMonth.put("May", "מַאי");
        yMonth.put("June", "יוּנִי");
        yMonth.put("July", "יוּלִי");
        yMonth.put("Aug", "אוֹגוּסט");
        yMonth.put("Sept", "סֶפּטֶמבֶּר");
        yMonth.put("Oct", "אוֹקטוֹבֶּר");
        yMonth.put("Nov", "נוֹבֶמבֶּר");
        yMonth.put("Dec", "דֶצֶמבֶּר");
    }

     private static String parseDate(Date date){
        String currentDate = date.toString();
        String[] days = currentDate.split(" ");
        StringBuilder sb = new StringBuilder();
        String yday = getDay(days[0]);
        String ymonth = getMonth(days[1]);
         sb.append(days[5]+" ");
         sb.append(ymonth+" ");
         sb.append(days[2]+" ");
         sb.append(yday+" ");

         return sb.toString();
     }

     private static String getDay(String day){
         return yDays.get(day);
     }

    private static String getMonth(String month){
           return yMonth.get(month);
    }

}











