import java.util.Scanner;

public class sumOfOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Sum");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();
        int sum = OddSum(num);
        System.out.println("your Total odd sum of " + num + "is " + sum);
    }
      public static int OddSum(int num) {
       int sum = 0;
       int i = 1;
       while (i<=num) {
          sum +=i;
          i+=2;
       }
    return sum;
   }
}
