package shopshop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

public class StatOpsTest {
    StatOps statter = new StatOps();
    @Test
    public void sumOfPaysInFileTest1() {
        Assertions.assertEquals(2,statter.sumOfPaysInFile(new String("apple,banana,F,banana,F,")));
    }
    @Test
    public void sumOfPaysInFileTest2() {
        Assertions.assertEquals(3,statter.sumOfPaysInFile(new String("apple,banana,F,banana,F, ,F,")));
    }
    @Test
    public void firstTimeTest1() {
        Assertions.assertEquals(1,statter.firstTime("banana",new String("apple,banana,F,banana,lemon,F, ,F,")));
    }
    @Test
    public void firstTimeTest2() {
        Assertions.assertEquals(2,statter.firstTime("lemon",new String("apple,banana,F,banana,lemon,F, ,F,")));
    }
    @Test
    public void lastTimeTest1() {
        Assertions.assertEquals(2,statter.lastTime("banana",new String("apple,banana,F,banana,lemon,F, ,F,")));
    }
    @Test
    public void lastTimeTest2() {
        Assertions.assertEquals(2,statter.lastTime("lemon",new String("apple,banana,F,banana,lemon,F, ,F,")));
    }
    @Test
    public void countOfItemTest1() {
        Assertions.assertEquals(2,statter.countOfItem("banana",new String("apple,banana,F,banana,lemon,F, ,F,")));
    }
    @Test
    public void countOfItemTest2() {
        Assertions.assertEquals(1,statter.countOfItem("lemon",new String("apple,banana,F,banana,lemon,F, ,F,")));
    }
    @Test
    public void getPurchaseTest1() {
        Assertions.assertEquals("{banana:1, apple:1}",statter.getPurchase(1,new String("apple,banana,F,banana,banana,lemon,F, ,F,")));
    }
    @Test
    public void getPurchaseTest2() {
        Assertions.assertEquals("{banana:2, lemon:1}",statter.getPurchase(2,new String("apple,banana,F,banana,banana,lemon,F, ,F,")));
    }
    @Test
    public void calculateTest950() {
        Assertions.assertEquals(950,statter.calculate(2));
    }
    @Test
    public void calculateTest4150() {
        Assertions.assertEquals(4150,statter.calculate(10));
    }
    @Test
    public void sumAndToFileTest() {
        File file = new File("src/main/java/shopshop/sumtest.txt");
        FileOps filer = new FileOps();
        if(file.exists() && !file.isDirectory()) {
            file.delete();
        }
        statter.sumAndToFile("apple,banana,F,banana,banana,lemon,F, ,F,","src/main/java/shopshop/sumtest.txt");
        Assertions.assertEquals("1. purchase: 1000,2. purchase: 1450,3. purchase: 500,",filer.fileToString("src/main/java/shopshop/sumtest.txt"));
        file.delete();
    }
}
