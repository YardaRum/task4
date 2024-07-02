import java.text.DateFormat;
import java.text.*;
import java.util.Date;


public class task4_4 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Текущее время в формате 'дд.мм.гггг'");
        SimpleDateFormat SDF= new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(SDF.format(date));
        System.out.println("Текущее время в формате 'гггг-мм-дд'");
        SimpleDateFormat SDF1= new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(SDF1.format(date));




    }
}
