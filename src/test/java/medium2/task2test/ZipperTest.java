package medium2.task2test;

import medium2.task2.Zipper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZipperTest {
    @Test
    public void zipItTestNull() {
        String[][] expectedResult = null;
        String[] testArray1 = {"Ana", "Amy", "Lisa"};
        String[] testArray2 = {"Bob", "Josh"};
        Zipper zip = new Zipper();
        try {
            Thread.sleep(15000);  //jenkins miatt
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assertions.assertArrayEquals(null,zip.zipIt(testArray2,testArray1));
    }
    @Test
    public void zipItTest1() {
        String[][] expectedResult = {new String[] {"Tesha", "Deep"}, new String[] {"Tesh", "Xavier"}, new String[] {"Shang", "Dex"} };
        String[] testArray1 = {"Tesha", "Tesh", "Shang"};
        String[] testArray2 = {"Deep", "Xavier", "Dex"};
        Zipper zip = new Zipper();
        Assertions.assertArrayEquals(expectedResult,zip.zipIt(testArray1,testArray2));
    }
}
