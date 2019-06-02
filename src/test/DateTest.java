package test;

import net.mindview.util.New;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date  = new  Date();

        String sdf = new SimpleDateFormat("yyyy-MM-dd").format(date);
        Date   dates = null;

        {
            try {
                dates = new SimpleDateFormat("yyyy-MM-dd").parse(sdf);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            String  xingQi = new SimpleDateFormat("E").format(dates);
            System.out.println("-----------"+sdf+"------是"+xingQi);
        }
    }

}
