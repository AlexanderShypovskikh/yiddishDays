package yiddishdays;

import java.util.Date;

/**
 * Created by User7 on 25.10.2017.
 */
public class Test {
   enum number{
       One
   }
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(YiddishDays.getCurenDay());
    }
}
