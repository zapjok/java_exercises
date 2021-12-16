/*
5) Create a function that takes an array of numbers and return both the minimum and
maximum numbers, in that order.
Examples
minMax([1, 2, 3, 4, 5]) ➞ [1, 5]
minMax([2334454, 5]) ➞ [5, 2334454]
minMax([1]) ➞ [1, 1]
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MinMax minmax = new MinMax();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println("Array: " + Arrays.toString(sampleArray) + "\nMin and Max values are:" + Arrays.toString(minmax.minAndMax(sampleArray)));

    }
}
