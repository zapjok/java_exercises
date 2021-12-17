/*
Write a function that finds the word "bomb" in the given string. Return "DUCK!" if found,
otherwise,"Relax, there's no bomb.".
Examples:
bomb("There is a bomb.") ➞ "DUCK!"
bomb("Hey, did you think there is a BOMB?") ➞ "DUCK!"
bomb("This goes boom!!!") ➞ "Relax, there's no bomb."
Notes
The string "bomb" may appear in different character cases (i.e. uppercase, lowercase,
mixed).
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import task7.BombFinder;

public class BombFinderTest {
    @ParameterizedTest
    @ValueSource(strings = {"There is a bomb.","Hey, did you think there is a BOMB?","There is a bomb", "What ?bOmb?"})
    public void bombFinderTestBomb (String sentence) {
        BombFinder bombfinder = new BombFinder();
        Assertions.assertEquals("DUCK!", bombfinder.bombFinder(sentence));
    }

    @ParameterizedTest
    @ValueSource(strings = {"This goes boom!!!","BigBang was just the beginning","Black hand called, it's gonna explode","B0mb","","What wbomb?"})
    public void bombFinderTestNoBomb (String sentence) {
        BombFinder bombfinder = new BombFinder();
        Assertions.assertEquals("Relax, there's no bomb.", bombfinder.bombFinder(sentence));

    }
}
