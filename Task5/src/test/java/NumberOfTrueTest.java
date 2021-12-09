import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfTrueTest {
    @Test
    public void numberOfTrueTest3true() {
        boolean[] testArray = {true, true, false, true};
        short expectedResult = 3;
        NumberOfTrue numberoftrue = new NumberOfTrue();
        short actualResult = numberoftrue.numberOfTrue(testArray);
        Assertions.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void numberOfTrueTest1true() {
        boolean[] testArray = {false, false, false, true};
        short expectedResult = 1;
        NumberOfTrue numberoftrue = new NumberOfTrue();
        short actualResult = numberoftrue.numberOfTrue(testArray);
        Assertions.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void numberOfTrueTestEmpty() {
        boolean[] testArray = {};
        short expectedResult = 0;
        NumberOfTrue numberoftrue = new NumberOfTrue();
        short actualResult = numberoftrue.numberOfTrue(testArray);
        Assertions.assertEquals(actualResult, expectedResult);
    }
}
