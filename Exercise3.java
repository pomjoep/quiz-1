package Exercise;

import java.util.Arrays;
/**
 * Quinn Epstein
 * Quiz 1
 * CS 123
 */
public class Exercise3 {
    public static void main(String[] args) {
        exercise3();
    }
    private static void exercise3() {
        /*
        Task: write code to check whether a given array contains a valid fibonacci sequence
        Input: an array of arrays
        Output: true or false for each array
        Logic: return TRUE if a given array contains a valid fibonacci sequence, and FALSE otherwise
        Validation: validate with array of length of at least 10
         */
        int[][] arrays = {
                {}, //false
                {0, 1, 1, 2, 3}, // true
                {0, 1, 1, 2, 3, 5, 8, 13, 21, 34}, // true
                {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610}, //true
                {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 611}, //false
                {1}, //false
                {0, 2, 1, 2, 3}, //false
                {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 611}, //false
        };

        for (int[] array : arrays) {
            System.out.println(Arrays.toString(array) + ": " + isValidFib(array));
        }
    }

    private static boolean isValidFib(int[] array) {
        //TODO: add your code
        if(array.length < 3){
            return false;
        }
        for(int i = 2; i < array.length; i++){
            if(!(array[i-2] + array[i-1] == array[i])){
                return false;
            }
        }
        return true;
    }
}


