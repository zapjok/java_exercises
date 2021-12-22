package medium2.task6;
/*
Reverse the Odd Length Words
Given a string, reverse all the words which have odd length. The even length words are not
changed.
Examples
 reverseOdd("Bananas") ➞ "sananaB"
 reverseOdd("One two three four") ➞ "enO owt eerht four"
 reverseOdd("Make sure uoy only esrever sdrow of ddo length")
➞ "Make sure you only reverse words of odd length"
Notes
There is exactly one space between each word and no punctuation is used.
 */

import task8.ReverseString;

public class OddReverser {
    public String reverseOdd(String sentence) {
        ReverseString wordReverser = new ReverseString();
        String[] substrings = sentence.trim().split(" ");
        String returnString = new String();
        for (String actual: substrings) {
            if (actual.length() % 2 != 0) {
                returnString += wordReverser.reverseString(actual) + " ";
            }
            else {
                returnString += actual + " ";
            }
        }
        return returnString.trim();
    }
}

