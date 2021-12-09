import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMaxTest {
    @Test
    public void minAndMaxTest1() {
        MinMax minmax = new MinMax();
        int[] expectedResult = {1,5};
        int[] testData = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(expectedResult,minmax.minAndMax(testData));
    }
    @Test
    public void minAndMaxTest2() {
        MinMax minmax = new MinMax();
        int[] expectedResult = {-35, 45105};
        int[] testData = {655, -35, 45105, 1, 0};
        Assertions.assertArrayEquals(expectedResult,minmax.minAndMax(testData));
    }
    @Test
    public void minAndMaxTest3() {
        MinMax minmax = new MinMax();
        int[] expectedResult = {1, 1};
        int[] testData = {1};
        Assertions.assertArrayEquals(expectedResult,minmax.minAndMax(testData));
    }
    @Test
    public void minAndMaxTest4() {
        MinMax minmax = new MinMax();
        int[] expectedResult = {5, 2334454};
        int[] testData = {2334454, 5};
        Assertions.assertArrayEquals(expectedResult, minmax.minAndMax(testData));
    }
}
