import java.util.Scanner;

public class evenOddBitwiesOperator27 {
     public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to the Even Odd Cheacker: ");
    System.out.println("Please enter your number: ");
        int a = input.nextInt();
        if ((a & 1 )== 1) {
            System.out.println("your no is odd");
        }else{
            System.out.println("your no is even");
        }
        // int result = a << 4;
        // System.out.println(result);
    }
}
