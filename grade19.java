import java.util.Scanner;

public class grade19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter you Percentage: ");
        int num = input.nextInt();
        if (num>=90) {
            System.out.println("Grade A");

        }else if (num>=75) {
            System.out.println("Grade B");
        }else if (num>=60) {
            System.out.println("Grade C");
        }else if (num>=30) {
            System.out.println("Grade D");
        }else if (num<30) {
            System.out.println("Grade F");
        }
    }
}
