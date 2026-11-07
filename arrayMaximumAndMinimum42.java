public class arrayMaximumAndMinimum42 {
    public static void main(String[] args) {
        System.out.println("Welcome to max and min finder");
        int[] numArray = arrayUtility.inputArray();
        int minimum = min(numArray);
        int maximum = max(numArray);
        System.out.println("The Minimum is: " + minimum);
        System.out.println("The Maximum is: " + maximum);

    }
    public static int min(int[] numArray) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < numArray.length) {
            if(min > numArray[i]) {
                min = numArray[i];
            }
            i++;
        }
        return min;
    }
    public static int max(int[] numArray) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        while (i < numArray.length) {
            if(max < numArray[i]) {
                max = numArray[i];
            }
            i++;
        }
        return max;
    }
}
