import medium2.task1.CountSum;
import medium2.task2.Zipper;
import medium2.task3.BoolBit;
import medium2.task4.RemoveReChar;
import medium2.task5.Youtuber;
import medium2.task6.OddReverser;
import shopshop.FileOps;
import shopshop.Input;
import shopshop.StatOps;
import task10.MinMax;
import task11.CheckPerfect;
import task12.War;
import task13.Spacer;
import task14.Concatenator;
import task15.NameGame;
import task3.LongestWord;
import task4.ContainsW;
import task5.NumberOfTrue;
import task6.ExistsHigher;
import task7.BombFinder;
import task8.ReverseString;
import task9.IsValidZip;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        //Task3
        System.out.println("Task3");
        LongestWord longestWord = new LongestWord();
        System.out.println(longestWord.longestWord("Write a method which displays the following pattern using the alphabet."));
        //Task4
        System.out.println("Task4");
        ContainsW containsw = new ContainsW();
        System.out.println(containsw.containsw("w3resoure"));
        //Task5
        System.out.println("Task5");
        boolean[] boolArray = {true, false, true, true, false};
        NumberOfTrue numberOfTrue = new NumberOfTrue();
        System.out.println(numberOfTrue.numberOfTrue(boolArray));
        //Task6
        System.out.println("Task6");
        ExistsHigher existshigher = new ExistsHigher();
        int[] array = {4, 3, 3, 3, 2, 2, 2};
        System.out.println(existshigher.existsHigher(array, 4));
        //Task7
        System.out.println("Task7");
        BombFinder bombfinder = new BombFinder();
        System.out.println(bombfinder.bombFinder("How let the bomb out?"));
        //Task8
        System.out.println("Task8");
        ReverseString reversestring = new ReverseString();
        System.out.println(reversestring.reverseString("Hey, did you think there is a BOMB?"));
        //Task9
        System.out.println("Task9");
        IsValidZip isvalidzip = new IsValidZip();
        System.out.println("12345 is a valid ZIP code:" + isvalidzip.zipValidator("12345"));
        //Task10
        System.out.println("Task10");
        MinMax minmax = new MinMax();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println("Array: " + Arrays.toString(sampleArray) + "\nMin and Max values are:" + Arrays.toString(minmax.minAndMax(sampleArray)));
        //Task11
        System.out.println("Task11");
        CheckPerfect checkperfect = new CheckPerfect();
        System.out.println("Perfect number: " + checkperfect.isPerfect(28));
        //Task12
        System.out.println("Task12");
        War war = new War();
        int[] intArray = {2,8,7,5};
        System.out.println("The winner is: " + war.warOfNumbers(intArray));
        //Task13
        System.out.println("Task13");
        Spacer spacer = new Spacer();
        System.out.println("Result: " + spacer.capSpace("hello world"));
        //Task14
        System.out.println("Task14");
        Concatenator concat= new Concatenator();
        String[] input = {"G","F","C"};
        System.out.println("Result: " + Arrays.toString(concat.jazzify(input)));
        //Task15
        System.out.println("Task15");
        NameGame namegame = new NameGame();
        System.out.println(namegame.nameScore("PUBG"));
        //Medium 2 - Task 1
        System.out.println("Medium 2 - Task 1");
        CountSum counts = new CountSum();
        System.out.println(Arrays.toString(counts.countPositivesSumNegatives(new int[] {92, 6, 73, -77, 81, -90, 99, 8, -85, 34})));
        //Medium 2 - Task 2
        System.out.println("Medium 2 - Task 2");
        Zipper zip = new Zipper();
        System.out.println(Arrays.deepToString(zip.zipIt(new String[] {"Ana", "Amy", "Lisa"}, new String[] {"Bob", "Josh", "Tim"})));
        //Medium 2 - Task 3
        System.out.println("Medium 2 - Task 3");
        BoolBit bolbi = new BoolBit();
        System.out.println(Arrays.toString(bolbi.toBoolArray(bolbi.toBitString("tesh"))));
        //Medium 2 - Task 4
        System.out.println("Medium 2 - Task 4");
        RemoveReChar remover = new RemoveReChar();
        System.out.println(remover.unrepeated("WWWEEE!"));
        //Medium 2 - Task 5
        System.out.println("Medium 2 - Task 5");
        Youtuber tuber = new Youtuber();
        System.out.println(tuber.likeOrDislike(new String[] {"Like", "Dislike", "Dislike"}));
        //Medium 2 - Task 6
        System.out.println("Medium 2 - Task 6");
        OddReverser odder = new OddReverser();
        System.out.println(odder.reverseOdd("Make sure uoy only esrever sdrow of ddo length"));
        //-------------Shop-shop
        System.out.println("----------------Shop Shop Challenges----------------");
        //Task 2
        FileOps reader = new FileOps();
        String fileContent = reader.fileToString("src/main/resources/penztar.txt");
        System.out.println("Task 2 - Read the content of File. Content:");
        System.out.println(fileContent);
        //Task 3
        StatOps statter = new StatOps();
        System.out.println("Task 3 - How many times did the customers pay in the shop?");
        System.out.println(statter.sumOfPaysInFile(fileContent));
        //Task 4,5
        System.out.println("Task 4,5");
        Input inputter = new Input();
        String item = inputter.getItemName();
        System.out.println("The entered item is :" + item);
        System.out.println("The item was first bought in purchase #" + statter.firstTime(item, fileContent));
        System.out.println("The item was last bought in purchase #" + statter.lastTime(item, fileContent));
        System.out.println("The item was bought " + statter.countOfItem(item, fileContent)+ " times until now.");
        //Task 6
        //Task 7 Details of Purchase number
        System.out.println("Task 7 Details of Purchase number");
        System.out.println(statter.getPurchase(inputter.getInt("Please enter the purchase number:"),fileContent));
        //Task 8
        System.out.println("Task 8 Sum of the buys in a File");
        statter.sumAndToFile(fileContent, "src/main/resources/sum.txt");
    }
}
