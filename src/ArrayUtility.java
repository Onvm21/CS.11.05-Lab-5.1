import java.math.BigDecimal;
import java.math.RoundingMode;

public class ArrayUtility {

    public static void print(int[] array) {
        for (int i:array){
            System.out.println(i);
        }
    }

    public static int sum(int[] array) {
        int num = 0;
        for (int i:array){
            num += i;
        }
        return num;
    }

    public static double average(int[] array) {
        double num = 0;
        for (int i:array){
            num += i;
        }
        BigDecimal _avg = new BigDecimal(num/(array.length)).setScale(2, RoundingMode.DOWN);
        return _avg.doubleValue();


    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int n:array){
            if (n < min){
                min = n;
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int n:array){
            if (n > max){
                max = n;
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int n:array){
            if (n % 2 == 0){
                count += 1;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int length = array.length;
        int[] reversedArr = new int[length];
        int start = 0;
        int end = array.length - 1;

        /* simpler
        for (int i = 0; i < length; i++) {
            reversedArr[i] = array[length - 1 - i];
        }
        */

        // more convoluded way that works for one and 2
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array [end] = temp;
            reversedArr[start] = array[start];
            reversedArr[end] = array[end];

            start++;
            end--;
        }
        return reversedArr;
    }

    public static void reverseTwo(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array [end] = temp;

            start++;
            end--;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int n:array){
            if (n==num){
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (String n:array){
            if (n.equals(str)){
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }


    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= n;
        }
    }

    public static String toString(int[] array) {
        String word = "";
        for (int n:array){
            word += n + ", ";
        }
        word = word.substring(0,word.length()-2);
        return word;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        if (array.length < 2) {
            return;
        }
        int last = array[array.length-1];

        for (int i = array.length -1; i > 0; i--){
            array[i] = array[i-1];
            System.out.println(array[i]);
        }
        array[0] = last;

    }

    public static void shiftLeft(int[] array) {
        if (array.length < 2) {
            return;
        }
        int first = array[0];

        for (int i = 0; i < array.length-1; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = first;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for (int i = 0; i<n; i++){
            shiftRight(array);
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for (int i = 0; i<n; i++){
            shiftLeft(array);
        }
    }


}
