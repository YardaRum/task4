import java.util.Scanner;

public class task4_3 {
    public static void main(String[] args) {
        System.out.println("Введите дату в формате 'дд.мм.гггг'");
        Scanner scan = new Scanner(System.in);
        String STR = scan.nextLine();

        STR = STR.replace("."," ");//у меня не получилось с помощью split разделить дату между "."
        String nums[] = STR.split(" ");
        System.out.println(nums[2] + "-" + nums[1] + "-" + nums[0]);
    }
}
