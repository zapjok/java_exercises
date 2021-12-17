/*
Create a function which adds spaces before every capital in a word. Uncapitalize
the whole string afterwards.
 capSpace("helloWorld") ➞ "hello world"
 capSpace("iLoveMyTeapot") ➞ "i love my teapot"
 capSpace("stayIndoors") ➞ "stay indoors"
Note: The first letter will stay uncapitalized.
*/
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task13.Spacer;

public class SpacerTest {
    @Test
    public void capSpaceTest1() {
        Spacer spacer = new Spacer();
        Assertions.assertEquals("hello world", spacer.capSpace("helloWorld"));
    }
    @Test
    public void capSpaceTest2() {
        Spacer spacer = new Spacer();
        Assertions.assertEquals("i love my teapot", spacer.capSpace("iLoveMyTeapot"));
    }
    @Test
    public void capSpaceTest3() {
        Spacer spacer = new Spacer();
        Assertions.assertEquals("stay indoors", spacer.capSpace("stayIndoors"));
    }
}
