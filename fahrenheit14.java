import java.util.Scanner;

public class fahrenheit14 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("enter fah");
         float fah = input.nextFloat();
         float n = (fah-32)*5/9;
         System.out.println(n);
    }
}
