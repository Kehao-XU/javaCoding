/** Task 1: JavaExercises
 JavaExercises.java has 4 different methods for you to complete:

 makeDice: This method takes returns a new array of integers [1, 2, 3, 4, 5, 6].

 takeOrder: This method takes in a String and returns a new array containing the orders of the customer.
 If the customer is Ergun, you should return an array of Strings ["beyti", "pizza", "hamburger", "tea"]
 in that order. If the customer is Erik, you should return an array of Strings ["sushi", "pasta", "avocado",
 "coffee"]. In any other case, return an empty String array of size 3.
 NOTE: == behaves strangely with Strings for reasons we’ll see later in the course. You should check
 strings s1 and s2 for equality using s1.equals(s2) in Java.

 findMinMax: This method takes an int[] array and returns the the positive difference between the maximum
 element and minimum element of the given array. You may assume the input array is nonempty.

 hailstone: This method takes an int n as input and returns its hailstone sequence as a list of integers.
 The hailstone sequence is defined by the following procedure: pick a positive integer n as the start.
 If n is even, divide n by 2. If n is odd, multiply n by 3 and add 1. Continue this process until n is 1.
 You should compute this using recursion with the provided helper method hailstoneHelper.
 For this part, you can import List and ArrayList.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaExercises {
    public static int[] makeDice() {
        int[] dice = {1, 2, 3, 4, 5, 6};
        return dice;
    }

    public static String[] takeOrder(String name) {
        if (name.equals("Ergun")) {
            String[] order1 = {"beyti", "pizza", "hamburger", "tea"};
            return order1;
        } else if (name.equals("Erik")) {
            String[] order2 = {"sushi", "pasta", "avocado", "coffee"};
            return order2;
        } else {
            return new String[3];
        }
    }

    public static int findMinMax(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i : array) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max - min;
    }

    public static List<Integer> hailstone(int n) {
        List<Integer> sequence = new ArrayList<>();
        return hailstoneHelper(n,sequence);
    }

    public static List<Integer> hailstoneHelper(int n, List<Integer> sequence) {
        if (n == 1) {
            return sequence;
        } else if (n % 2 == 0) {
            return hailstoneHelper(n/2, sequence);
        } else {
            return hailstoneHelper(n * 3 + 1, sequence);
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeDice()));
    }
}