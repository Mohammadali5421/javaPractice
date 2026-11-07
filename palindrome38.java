import java.util.Scanner;

public class palindrome38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Palindrome Checker");
        System.out.println("Please Enter Your Number: ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println("Your Number is Palindrome");
        }else {
            System.out.println("Your Number is Not Palindrome");
        }

    }
    public static boolean isPalindrome(int num) {
        return num == reverse(num);
    }
    public static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /=10; 
        }
        return newNum;
    }
}
