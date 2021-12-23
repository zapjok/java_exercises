package shopshop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.File;

public class FileOpsTest {
    @ParameterizedTest
    @ValueSource(strings = {"This is a test String.", "pdijptiqu34j","Another String  ", "  String,,,"})
    public void fileOpsTest(String testData) {
        File file = new File("src/main/java/shopshop/test.txt");
        if(file.exists() && !file.isDirectory()) {
            file.delete();
        }
        FileOps filer = new FileOps();
        filer.stringToFile(testData,"src/main/java/shopshop/test.txt");
        Assertions.assertEquals(testData+",", filer.fileToString("src/main/java/shopshop/test.txt"));
        file.delete();
    }
}
