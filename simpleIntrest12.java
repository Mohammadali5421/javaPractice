import java.util.Scanner;

public class simpleIntrest12 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("P");
         int P = input.nextInt();
         System.out.println("T");
         int T  = input.nextInt();
         System.out.println("R");
         double R = input.nextDouble();
         double n = (P*T*R)/100;
         System.out.println(n);
         
    }
}
