import java.util.Arrays;

public class MinMax {
    public int[] minAndMax(int[] inputArray) {
        int[] minMaxArray = new int[2];
        /*return minMaxArray = new int[] {
                // Perfect using streams, How about implementing the max and min and use them ?
            Arrays.stream(inputArray).min().getAsInt(), Arrays.stream(inputArray).max().getAsInt()};
    }   */
        // Proposed implementation with for
        minMaxArray[0] = inputArray[0];
        minMaxArray[1] = inputArray[0];
        for (int actual : inputArray) {
            if (actual < minMaxArray[0]) {
                minMaxArray[0] = actual;
            }
            else if (actual > minMaxArray[1]) {
                minMaxArray[1] = actual;
            }
        }
        return minMaxArray;
    }
}
