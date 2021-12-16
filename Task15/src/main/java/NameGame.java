/*
Create a function that takes a string of name and checks how much good is the
given name. A preloaded dictionary of alphabet scores is available in the Code tab.
Add up the letters of your name to get the total score.
// array
const scores = {"A": 100, "B": 14, "C": 9, "D": 28, "E": 145, "F": 12, "G": 3,
"H": 10, "I": 200, "J": 100, "K": 114, "L": 100, "M": 25,
"N": 450, "O": 80, "P": 2, "Q": 12, "R": 400, "S": 113,
"T": 405, "U": 11, "V": 10, "W": 10, "X": 3, "Y": 210, "Z": 23}
score <= 60: "NOT TOO GOOD"
61 <= score <= 300: "PRETTY GOOD"
301 <= score <= 599: "VERY GOOD"
score >= 600: "THE BEST"
 nameScore("MUBASHIR") ➞ "THE BEST"
 nameScore("YOU") ➞ "VERY GOOD"
 nameScore("MATT") ➞ "THE BEST"
 nameScore("PUBG") ➞ "NOT TOO GOOD"
 */

import java.util.AbstractMap;
import java.util.Map;

public class NameGame {
    public String nameScore (String input) {
        int score = 0;
        Map<String, Integer> scoreTable = Map.ofEntries(
                new AbstractMap.SimpleEntry<String, Integer>("A", 100),
                new AbstractMap.SimpleEntry<String, Integer>("B", 14),
                new AbstractMap.SimpleEntry<String, Integer>("C", 9),
                new AbstractMap.SimpleEntry<String, Integer>("D", 28),
                new AbstractMap.SimpleEntry<String, Integer>("E", 145),
                new AbstractMap.SimpleEntry<String, Integer>("F", 12),
                new AbstractMap.SimpleEntry<String, Integer>("G", 3),
                new AbstractMap.SimpleEntry<String, Integer>("H", 10),
                new AbstractMap.SimpleEntry<String, Integer>("I", 200),
                new AbstractMap.SimpleEntry<String, Integer>("J", 100),
                new AbstractMap.SimpleEntry<String, Integer>("K", 114),
                new AbstractMap.SimpleEntry<String, Integer>("L", 100),
                new AbstractMap.SimpleEntry<String, Integer>("M", 25),
                new AbstractMap.SimpleEntry<String, Integer>("N", 450),
                new AbstractMap.SimpleEntry<String, Integer>("O", 80),
                new AbstractMap.SimpleEntry<String, Integer>("P", 2),
                new AbstractMap.SimpleEntry<String, Integer>("Q", 12),
                new AbstractMap.SimpleEntry<String, Integer>("R", 400),
                new AbstractMap.SimpleEntry<String, Integer>("S", 113),
                new AbstractMap.SimpleEntry<String, Integer>("T", 405),
                new AbstractMap.SimpleEntry<String, Integer>("U", 11),
                new AbstractMap.SimpleEntry<String, Integer>("V", 10),
                new AbstractMap.SimpleEntry<String, Integer>("W", 10),
                new AbstractMap.SimpleEntry<String, Integer>("X", 3),
                new AbstractMap.SimpleEntry<String, Integer>("Y", 210),
                new AbstractMap.SimpleEntry<String, Integer>("Z", 23)
        );
        char[] inputChars = input.toCharArray();
        for (char actual : inputChars) {
            // Can be confusing
            // Tha naming convention or the algorithm, choosen objects?
            score += scoreTable.get(actual+"");
        }
        if (score <= 60) {
            return "NOT TOO GOOD";
        }
        else if (score <= 300) {
            return "PRETTY GOOD";
        }
        else if (score <= 599) {
            return "VERY GOOD";
        }
        else {
            return "THE BEST";
        }
    }
}
