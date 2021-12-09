import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    @Test
    public void reverseStringTest1() {
        ReverseString reversestring = new ReverseString();
        String expectedResult = "!lufpleh yllaer si tibadE";
        Assertions.assertEquals(expectedResult, reversestring.reverseString("Edabit is really helpful!"));
    }
    @Test
    public void reverseStringTest2() {
        ReverseString reversestring = new ReverseString();
        String expectedResult = "";
        Assertions.assertEquals(expectedResult, reversestring.reverseString(""));
    }
    @Test
    public void reverseStringTest3() {
        ReverseString reversestring = new ReverseString();
        String expectedResult = ".xof nworb kciuq ehT";
        Assertions.assertEquals(expectedResult, reversestring.reverseString("The quick brown fox."));
    }
}
