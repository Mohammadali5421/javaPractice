import java.util.Scanner;

public class fabonacciseries36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci World");
        System.out.println("Please enter number till you want series: ");
        int num = input.nextInt();
        System.out.println("Here is you Fibonacci Series: ") ;
        printFibonacci(num);

    }
    public static void printFibonacci(int num) {
        if (num < 0) return;
        System.out.println("0 ");
        if (num == 0) return;
        System.out.println("1 ");

        int first = 0 , second = 1;
        while (first + second <=num) {
            int third = first + second;
            System.out.println(third);
            first = second;
            second = third;
        }
    }
}
