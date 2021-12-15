import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameGameTest {
    @Test
    public void nameScoreTestNotGood() {
        NameGame namegame = new NameGame();
        Assertions.assertEquals(namegame.nameScore("WVWVWV"), "NOT TOO GOOD");
    }
    @Test
    public void nameScoreTestPretty() {
        NameGame namegame = new NameGame();
        Assertions.assertEquals(namegame.nameScore("WVWUWV"), "PRETTY GOOD");
    }
    @Test
    public void nameScoreTestVery() {
        NameGame namegame = new NameGame();
        Assertions.assertEquals(namegame.nameScore("IOVU"), "VERY GOOD");
    }
    @Test
    public void nameScoreTestBest() {
        NameGame namegame = new NameGame();
        Assertions.assertEquals(namegame.nameScore("III"), "THE BEST");
    }
}
