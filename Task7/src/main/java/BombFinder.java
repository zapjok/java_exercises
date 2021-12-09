import java.util.Locale;

/*
Write a function that finds the word "bomb" in the given string. Return "DUCK!" if found,
otherwise,"Relax, there's no bomb.".
Examples:
bomb("There is a bomb.") ➞ "DUCK!"
bomb("Hey, did you think there is a BOMB?") ➞ "DUCK!"
bomb("This goes boom!!!") ➞ "Relax, there's no bomb."
Notes
The string
 */
public class BombFinder {
    public String bombFinder (String sentence) {
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.toLowerCase().matches("(\\W?)bomb(\\W?)")) return "DUCK!";
        }
        return "Relax, there's no bomb.";
    }
}
