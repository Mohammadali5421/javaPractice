import java.util.Scanner;

public class GreatestOfThree17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if ( a > b && a>c) {
            System.out.println(a + " is greatest no.");
        }else if ( b>a && b > c) {
            System.out.println(b + " is the greatest no.");
        }else{
        System.out.println(c + " is the greatest no.");

    }
}
}
