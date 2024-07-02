import java.util.Scanner;


public class task4_1 {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner scan = new Scanner(System.in);
        String STR = scan.nextLine();

        System.out.println("Введите подстроку");
        String STR1 = scan.nextLine();

        int count = 0, i = 0;
        while ((i = STR.indexOf(STR1, i)) != -1 ){
            count++;
            i++;
        }
        System.out.println("Подстрока '"+STR1+"' встречается " +count);





    }
}