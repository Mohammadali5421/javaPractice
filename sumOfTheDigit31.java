import java.util.Scanner;

public class sumOfTheDigit31 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Multiplication World");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum of your digit is " + sum);
     }
    public static int sumOfDigits(int num) {
        int sum = 0;
        while(num>0) {
        sum += num % 10;
        num /=10;
        }
      return sum;
}
}
