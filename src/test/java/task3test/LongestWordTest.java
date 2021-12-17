import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task3.LongestWord;

public class LongestWordTest {
    @Test
    public void longestWordTest() {
        String expectedResult = "following";
        LongestWord longestWord = new LongestWord();
        String actualResult = longestWord.longestWord("Write a method which displays the following pattern using the alphabet.");
        Assertions.assertEquals(expectedResult,actualResult);
    }
}
