import java.util.Scanner;

public class oddEven16 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int a = input.nextInt();
         if ( a%2==0) {
            System.out.println("your no is even");

         } else {
            System.out.println("Your no is odd");
         }
    }
    
}
