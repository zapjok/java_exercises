package medium2.task1test;

import medium2.task1.CountSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountSumTest {
    @Test
    public void countPositivesSumNegativesTestEmpty() {
        int[] expectedResult = {};
        CountSum counts = new CountSum();
        int[] testArray = {};
        Assertions.assertArrayEquals(expectedResult, counts.countPositivesSumNegatives(testArray));
    }
    @Test
    public void countPositivesSumNegativesTest1() {
        int[] expectedResult = {7, -252};
        CountSum counts = new CountSum();
        int[] testArray = {92, 6, 73, -77, 81, -90, 99, 8, -85, 34};
        Assertions.assertArrayEquals(expectedResult, counts.countPositivesSumNegatives(testArray));
    }
    @Test
    public void countPositivesSumNegativesTest2() {
        int[] expectedResult = {10, -65};
        CountSum counts = new CountSum();
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        Assertions.assertArrayEquals(expectedResult, counts.countPositivesSumNegatives(testArray));
    }
}
