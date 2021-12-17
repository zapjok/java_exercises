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
package task7;

public class BombFinder {
    public String bombFinder(String sentence) {
        String[] words = sentence.split(" ");
        for (String word : words) {
            // why not use contains?
            // contains() only is not sophisticated enough: "?bOmb?" would be false, which is true with the regexp under. See Unit tests for more example. Need for clarification regarding the word "bomb" :))

            if (word.toLowerCase().matches("(\\W?)bomb(\\W?)")) return "DUCK!"; //if (word.toLowerCase().contains("bomb")) return "DUCK!"
        }
        return "Relax, there's no bomb.";
    }
}
