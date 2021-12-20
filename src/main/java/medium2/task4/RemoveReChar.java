package medium2.task4;

/*
Remove Repeated Characters
Create a function that will remove any repeated charcter(s) in a word passed to the function.
Not just consecutive characters, but characters repeating anywhere in the string.
Examples
 unrepeated("teshahset") ➞ "tesha"
 unrepeated("hello") ➞ "helo"
 unrepeated("aaaaa") ➞ "a"
 unrepeated("WWE!!!") ➞ "WE!"
 unrepeated("call 911") ➞ "cal 91"
Notes
No more than two words will be passed.
Notice that a string is iterable.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveReChar {
    public String unrepeated(String words) {
        char[] charsOfWords = words.toCharArray();
        String returnString = new String();
        for (int i = 0; i < charsOfWords.length; i++) {
            if (!returnString.contains(String.valueOf(charsOfWords[i]))) {
                returnString += charsOfWords[i];
            }
        }
        return returnString;
    }
}
