import java.util.Scanner;

public class digitReverser35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reverse World");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();
        int reverseDigit = digitReverser(num);
        System.out.println("Reverse of your Digit is: " + reverseDigit);
        
    }
    public static int digitReverser(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = (newNum * 10 ) +digit;
            num /=10;   
        }
        return newNum;
    }
}
