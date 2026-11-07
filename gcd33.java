import java.util.Scanner;

public class gcd33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to GCD 🌎");
        System.out.println("Please enter your 1st number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter your 2nd number: ");
        int num2 = input.nextInt();
        int gcd = gcd(num1,num2);
        System.out.println("GCD of the numbers is: " + gcd);

    }
    public static int gcd(int num1 , int num2) {
        int gcd = 1;
        int i = 2;
        while (i <= num1 && i <= num2) {
            if (num1 % i <= 0 && num2 % i <= 0){
            gcd = i;
            }
        i++;
        }
        return gcd;

    }
}
