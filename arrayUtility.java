import java.util.Scanner;

public class arrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the number of Elements: ");
        int size = input.nextInt();
        int[] num = new int[size];
        int i = 0;
        while (i<size) {
            System.out.println("Please Enter Element Number " + (i+1) + ": ");
            num[i] = input.nextInt();
            i++;
        }
        return num;
        
    }
    }