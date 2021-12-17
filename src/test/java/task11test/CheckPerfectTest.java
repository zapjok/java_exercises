package task11test;/*
6) Create a function that tests whether or not an integer is a perfect number. A
perfect number is a number that can be written as the sum of its factors, (equal to
sum of its proper divisors) excluding the number itself.
For example, 6 is a perfect number, since 1 + 2 + 3 = 6, where 1, 2, and 3 are all
factors of 6. Similarly, 28 is a perfect number, since 1 + 2 + 4 + 7 + 14 = 28.
checkPerfect(6) ➞ true
checkPerfect(28) ➞ true
checkPerfect(496) ➞ true
checkPerfect(12) ➞ false
checkPerfect(97) ➞ false
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import task11.CheckPerfect;

public class CheckPerfectTest {
    CheckPerfect checkperfect = new CheckPerfect();
    @ParameterizedTest
    @ValueSource(ints = {6, 28, 496})
    public void isPerfectTestTrue (int testData) {
        Assertions.assertTrue(checkperfect.isPerfect(testData));
    }
    @ParameterizedTest
    @ValueSource(ints = {12, 97} )
    public void isPerfectTestFalse (int testData) {
        Assertions.assertFalse(checkperfect.isPerfect(testData));
    }
}
