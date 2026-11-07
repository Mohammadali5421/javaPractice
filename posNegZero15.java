import java.util.Scanner;

public class posNegZero15 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to number cheacker: ");
         System.out.println("Please Enter the no.: ");
         int n = input.nextInt();
         if (n<0) {
            System.out.println("No is negetive ");
         }else if (n==0) {
            System.out.println("No. is zero: ");
         }else if (n>0) {
            System.out.println("no is positive");
         }
      
    }
}
