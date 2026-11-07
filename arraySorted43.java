public class arraySorted43 {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sorted Checker");
        int[] numArray = arrayUtility.inputArray();
        boolean isInc = isIncreasing(numArray);
        boolean isDec = isDecreasing(numArray);
        if(isInc||isDec){
            System.out.println("Your Array is Sorted");
        }else {
            System.out.println("Your Array is Not Sorted");
        }
    }
    public static boolean isDecreasing(int[] numArray) {
         
        return false;
    }
     public static boolean isIncreasing(int[] numArray) {
        int i = 1;
        while (i < numArray.length) {
            if ( numArray[i] >= numArray[i-1]){
                
            }
            i++;
        }
        return true;
     }
}

