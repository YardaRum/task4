import java.util.Scanner;

public class task4_2 {
    public static void main(String[] args) {

        System.out.println("Введите строку");
        Scanner scan = new Scanner(System.in);
        String STR = scan.nextLine();

        STR = STR.replace("бяка","вырезано цензурой");
        STR = STR.replace("кака","вырезано цензурой");
        System.out.println(STR);
    }
}
