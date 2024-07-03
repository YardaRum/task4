import java.text.*;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

public class task4_4 {
    public static void main(String[] args) {
        System.out.println("Введите дату в формате 'дд.мм.гггг'");
        Scanner scan = new Scanner(System.in);
        String STR = scan.nextLine();
        Date date = new Date();
        SimpleDateFormat SDF= new SimpleDateFormat("dd.MM.yyyy");
        try {
            date = SDF.parse(STR);
        } catch(ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat SDF1= new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(SDF1.format(date));

    }
}
