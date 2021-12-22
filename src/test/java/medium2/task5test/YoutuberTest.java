package medium2.task5test;

import medium2.task5.Youtuber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YoutuberTest {
    @Test
    public void likeOrDislikeTest_Dislike() {
        Youtuber tuber = new Youtuber();
        char[] expectedResult = {'D','i','s','l','i','k','e'};
        Assertions.assertArrayEquals(expectedResult, tuber.likeOrDislike(new String[] {"Dislike"}).toCharArray());
    }
    @Test
    public void likeOrDislikeTest_Like() {
        Youtuber tuber = new Youtuber();
        char[] expectedResult = {'L','i','k','e'};
        Assertions.assertArrayEquals(expectedResult, tuber.likeOrDislike(new String[] {"Dislike","Like"}).toCharArray());
    }
    @Test
    public void likeOrDislikeTest_Nothing_Empty() {
        Youtuber tuber = new Youtuber();
        char[] expectedResult = {'N','o','t','h','i','n','g'};
        Assertions.assertArrayEquals(expectedResult, tuber.likeOrDislike(new String[] {""}).toCharArray());
    }
    @Test
    public void likeOrDislikeTest_Nothing_NoActive() {
        Youtuber tuber = new Youtuber();
        char[] expectedResult = {'N','o','t','h','i','n','g'};
        Assertions.assertArrayEquals(expectedResult, tuber.likeOrDislike(new String[] {"Like", "Like"}).toCharArray());
    }
}
