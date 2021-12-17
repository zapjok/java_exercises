import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task5.NumberOfTrue;

public class NumberOfTrueTest {
    @Test
    public void numberOfTrueTest3true() {
        boolean[] testArray = {true, true, false, true};
        int expectedResult = 3;
        NumberOfTrue numberoftrue = new NumberOfTrue();
        int actualResult = numberoftrue.numberOfTrue(testArray);
        Assertions.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void numberOfTrueTest1true() {
        boolean[] testArray = {false, false, false, true};
        int expectedResult = 1;
        NumberOfTrue numberoftrue = new NumberOfTrue();
        int actualResult = numberoftrue.numberOfTrue(testArray);
        Assertions.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void numberOfTrueTestEmpty() {
        boolean[] testArray = {};
        int expectedResult = 0;
        NumberOfTrue numberoftrue = new NumberOfTrue();
        int actualResult = numberoftrue.numberOfTrue(testArray);
        Assertions.assertEquals(actualResult, expectedResult);
    }
}
