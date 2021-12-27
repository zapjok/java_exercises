/*
3) Word to Bitstring to Boolean Array
Create two functions that convert a word to a bitstring and then to a boolean array based on
the following criteria:
Locate the position of the letter in the English alphabet (from 1 to 26).
Odd positions will be represented as 1 and 0 otherwise.
Convert the represented positions to boolean values, 1 for true and 0 for false.
Store the conversions into an array.
Examples
 toBoolArray(toBitString("deep")) ➞ [false, true, true, false]
// deep converts to 0110
// d is the 4th alphabet - 0
// e is the 5th alphabet - 1
// e is the 5th alphabet - 1
// p is the 16th alphabet - 0
 toBoolArray(toBitString("loves")) ➞ [false, true, false, true, true]
 toBoolArray(toBitString("tesh")) ➞ [false, true, true, false]
Notes
The letter A is at position 1 and Z at 26.
All input strings are in lowercase letters of the English alphabet.
 */

package medium2.task3;

import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BoolBit {
    public byte[] toBitString(String word) {
        byte[] bitString = new byte[word.length()];
        char[] lettersOfWord = word.toCharArray();
        Map<Character, Integer> indexesOfAlphabetLetters = Stream.of(new Object[][] {
                { 'a', 1 },
                { 'b', 2 },
                { 'c', 3 },
                { 'd', 4 },
                { 'e', 5 },
                { 'f', 6 },
                { 'g', 7 },
                { 'h', 8 },
                { 'i', 9 },
                { 'j', 10 },
                { 'k', 11 },
                { 'l', 12 },
                { 'm', 13 },
                { 'n', 14 },
                { 'o', 15 },
                { 'p', 16 },
                { 'q', 17 },
                { 'r', 18 },
                { 's', 19 },
                { 't', 20 },
                { 'u', 21 },
                { 'v', 22 },
                { 'w', 23 },
                { 'x', 24 },
                { 'y', 25 },
                { 'z', 26 }
        }).collect(Collectors.toMap(data -> (Character) data[0], data -> (Integer) data[1]));
        for ( int i = 0; i < word.length(); i++) {
            if ( indexesOfAlphabetLetters.get(lettersOfWord[i]) % 2 == 0) {
                bitString[i] = 0;
            }
            else {
                bitString[i] = 1;
            }
        }
        return bitString;
    }

    public boolean[] toBoolArray(byte[] bitString) {
        boolean[] boolArray = new boolean[bitString.length];
        for (int i = 0; i < bitString.length; i++) {
            boolArray[i] = bitString[i] == 1;
        }
        return boolArray;
    }
}
