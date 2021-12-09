import java.util.Arrays;

public class MinMax {
    public int[] minAndMax (int[] inputArray) {
        int[] minMaxArray = new int[2];
        return minMaxArray = new int[] {
            Arrays.stream(inputArray).min().getAsInt(), Arrays.stream(inputArray).max().getAsInt()};
    }
}
