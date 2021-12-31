package shopshop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOps {
    public String fileToString(String filePath) {
        String returnString = new String();
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                returnString += scanner.nextLine() + ",";
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File cannot be read.");
            e.printStackTrace();

        }
        return returnString;
    }

    public void stringToFile(String toWrite, String filePath) {
        try {
            File file = new File(filePath);
            if (file.createNewFile())   {
                FileWriter myWriter = new FileWriter(filePath);
                myWriter.write(toWrite + System.lineSeparator());
                myWriter.close();
            }
            else {
                FileWriter myWriter = new FileWriter(filePath,true);
                myWriter.write(toWrite + System.lineSeparator());
                myWriter.close();
            }
        } catch (IOException e) {
            System.out.println("An error occurred. File was not created.");
            e.printStackTrace();
        }
    }
}
