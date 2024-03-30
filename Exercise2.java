package Exercise;
/**
 * Quinn Epstein
 * Quiz 1
 * CS 123
 */
public class Exercise2 {
    public static void main(String[] args) {
        int[] ints = {2, 4, 8, 16, 32, 64, 128};
        exercise2(ints);
        ints = new int[]{2, 4, 8, 16, 32, 64, 127};
        exercise2(ints);
    }

    //had to do some research for this method, as I didn't know how these bitwise things worked
    private static boolean isPowerOfTwo(int num) {
        return num > 0 && (num & (num - 1)) == 0;
    }

    private static void exercise2(int[] ints) {
        for (int num : ints) {
            System.out.println(num + " is power of 2: " + isPowerOfTwo(num));
        }
    }
}
