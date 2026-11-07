import java.util.Scanner;

public class armStrong37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reverse World");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();
        boolean isArmStrong = isArmStrong(num);
        if (isArmStrong) {
            System.out.println("Your number is ArmStrong Number");
        }else {
            System.out.println("Your number is Not ArmStrong Number");
        }
    }
    public static boolean isArmStrong(int num) {
        int numDigits = noOfDigits(num);
        int numCopy = num;
        int finalNumber = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit, numDigits);
        }
        return finalNumber == numCopy;
    }


    public static int noOfDigits(int num) {
        int digit = 0;
        while (num > 0) {
            digit++;
            num /=10;
        }
        return digit;
    }


    public static int pow (int num1 , int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }
        return result;
    }
}
