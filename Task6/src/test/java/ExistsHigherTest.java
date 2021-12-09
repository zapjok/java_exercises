/*
1) Write a function that returns true if there exists at least one number that is larger than or
equal to n.
Examples
existsHigher([5, 3, 15, 22, 4], 10) ➞ true
existsHigher([1, 2, 3, 4, 5], 8) ➞ false
existsHigher([4, 3, 3, 3, 2, 2, 2], 4) ➞ true
existsHigher([], 5) ➞ false
Notes
Return false for an empty array [].
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ExistsHigherTest {
    @ParameterizedTest
    @ValueSource(ints = {22,2})
    public void existsHigherTestTrue(int testData) {
        int[] testArray = {5, 3, 15, 22, 4};
        ExistsHigher existshigher = new ExistsHigher();
        Assertions.assertTrue(existshigher.existsHigher(testArray, testData));
    }
    @ParameterizedTest
    @ValueSource(ints = {23,Integer.MAX_VALUE})
    public void existsHigherTestFalse(int testData) {
        int[] testArray = {5, 3, 15, 22, 4};
        ExistsHigher existshigher = new ExistsHigher();
        Assertions.assertFalse(existshigher.existsHigher(testArray, testData));
    }
}
