import java.util.Scanner;

public class multiplicationTable28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Multiplication World");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();
        multiplicationtable(num);

    }
    private static void multiplicationtable(int num) {
        int i = 1;
        while (i<=10) {
            System.out.println(num  + " x " + i + " = " + i * num);
            i++;
        }

    }
}
