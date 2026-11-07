import java.util.Scanner;

public class swap7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swaping station: ");
        System.out.println("please enter the a: ");
        int a = input.nextInt();
        System.out.println("please enter the b: ");
        int b = input.nextInt();
        System.out.println("before swaping" + a);
        System.out.println("before swaping" + b);
        int c = 0;
        c = b;
        b = a;
        a = c;
        System.out.println("after swaping:" + a);
        System.out.println("after swaping:" + b);
    }
}
