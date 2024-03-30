package Exercise;

/**
 * Quinn Epstein
 * Quiz 1
 * CS 123
 */
public class Exercise1 {
    public static void main(String[] args) {

        int x = 123, y = 567;

        /*
        Task: swap the values in two variables   //Done
        Input: two Integer variables
        Output: nothing
        Logic: the values of the 2 variables should be exchanged
        Validation: 5 test cases at least
        Additional improvement: Is it possible to not use any other variable at all for the swap? //yes with a simple 3 line calculation
         */
        //TODO: add your code
        //test 1
        int temp = x;
        x = y;
        y = temp;
        System.out.println(STR."x = \{x}, y = \{y}");
        //test 2
        x = 11;
        y = 33;
        temp = x;
        x = y;
        y = temp;
        System.out.println(STR."x = \{x}, y = \{y}");
        // test 3
        x = 131;
        y = 133;
        temp = x;
        x = y;
        y = temp;
        System.out.println(STR."x = \{x}, y = \{y}");
        //test 4
        x = 76;
        y = 33;
        temp = x;
        x = y;
        y = temp;
        System.out.println(STR."x = \{x}, y = \{y}");
        //test 5
        x = 44;
        y = 21;
        temp = x;
        x = y;
        y = temp;
        System.out.println(STR."x = \{x}, y = \{y}");
    }
}
