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

    }
}
