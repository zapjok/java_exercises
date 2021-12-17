/*
Create a function which concatenates the number 7 to the end of every chord in
an array. Ignore all chords which already end with 7.
 jazzify(["G", "F", "C"]) ➞ ["G7", "F7", "C7"]
 jazzify(["Dm", "G", "E", "A"]) ➞ ["Dm7", "G7", "E7", "A7"]
 jazzify(["F7", "E7", "A7", "Ab7", "Gm7", "C7"]) ➞ ["F7", "E7", "A7", "Ab7",
"Gm7", "C7"]
 jazzify([]) ➞ []
Notes:
Return an empty array if the given array is empty.
You can expect all the tests to have valid chords.
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task14.Concatenator;

public class ConcatenatorTest {
    @Test
    public void jazzifyTestwo7() {
        Concatenator concat = new Concatenator();
        String[] expectedResult = {"G7","F7","C7"};
        String[] testData = {"G","F", "C"};
        Assertions.assertArrayEquals(expectedResult,concat.jazzify(testData));
    }
    @Test
    public void jazzifyTestw7() {
        Concatenator concat = new Concatenator();
        String[] expectedResult = {"F7", "E7", "A7", "Ab7", "Gm7", "C7"};
        String[] testData = {"F7", "E7", "A7", "Ab7", "Gm7", "C7"};
        Assertions.assertArrayEquals(expectedResult,concat.jazzify(testData));
    }
}
