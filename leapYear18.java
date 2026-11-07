import java.util.Scanner;

public class leapYear18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the No: ");
        int year = input.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("your year is leap year");
        }else {
            System.out.println("Your year is not leap year");
        }

    }
}
