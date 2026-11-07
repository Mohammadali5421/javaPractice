import java.util.Scanner;

public class arrayNumberOfOccurences41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Occourences\n");
        int[] numArray = arrayUtility.inputArray();
        System.out.println("Now enter the number you want to find: ");
        int num = input.nextInt();
        int occ = noOfOccurences(num, numArray);
        System.out.println("Total no of Occurences are: " + occ);
    }
    public static int noOfOccurences(int num , int[] numArray) {
        int occ = 0;
        int i = 0;
        while (i < numArray.length) {
            if (numArray[i] == num) {
                occ++;
            }
                i++;
        }
        return occ;
    }
}
