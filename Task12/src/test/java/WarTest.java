import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class WarTest {
    @Test
    public void warOfNumbersEven(){
        War war = new War();
        int[] testData = {2,8,7,5};
        Assertions.assertEquals(2,war.warOfNumbers(testData));
    }
    @Test
    public void warOfNumbersOdd(){
        War war = new War();
        int[] testData = {12,90,75};
        Assertions.assertEquals(27, war.warOfNumbers(testData));
    }
}
