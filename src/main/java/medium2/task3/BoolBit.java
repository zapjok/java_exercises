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

public class BoolBit {
    public byte[] toBitString(String word) {
        byte[] bitString = new byte[word.length()];
        char[] lettersOfWord = word.toCharArray();
        Map<Character, Integer> indexesOfAlphabetLetters = Map.ofEntries(
                new AbstractMap.SimpleEntry<Character, Integer>('a', 1),
                new AbstractMap.SimpleEntry<Character, Integer>('b', 2),
                new AbstractMap.SimpleEntry<Character, Integer>('c', 3),
                new AbstractMap.SimpleEntry<Character, Integer>('d', 4),
                new AbstractMap.SimpleEntry<Character, Integer>('e', 5),
                new AbstractMap.SimpleEntry<Character, Integer>('f', 6),
                new AbstractMap.SimpleEntry<Character, Integer>('g', 7),
                new AbstractMap.SimpleEntry<Character, Integer>('h', 8),
                new AbstractMap.SimpleEntry<Character, Integer>('i', 9),
                new AbstractMap.SimpleEntry<Character, Integer>('j', 10),
                new AbstractMap.SimpleEntry<Character, Integer>('k', 11),
                new AbstractMap.SimpleEntry<Character, Integer>('l', 12),
                new AbstractMap.SimpleEntry<Character, Integer>('m', 13),
                new AbstractMap.SimpleEntry<Character, Integer>('n', 14),
                new AbstractMap.SimpleEntry<Character, Integer>('o', 15),
                new AbstractMap.SimpleEntry<Character, Integer>('p', 16),
                new AbstractMap.SimpleEntry<Character, Integer>('q', 17),
                new AbstractMap.SimpleEntry<Character, Integer>('r', 18),
                new AbstractMap.SimpleEntry<Character, Integer>('s', 19),
                new AbstractMap.SimpleEntry<Character, Integer>('t', 20),
                new AbstractMap.SimpleEntry<Character, Integer>('u', 21),
                new AbstractMap.SimpleEntry<Character, Integer>('v', 22),
                new AbstractMap.SimpleEntry<Character, Integer>('w', 23),
                new AbstractMap.SimpleEntry<Character, Integer>('x', 24),
                new AbstractMap.SimpleEntry<Character, Integer>('y', 25),
                new AbstractMap.SimpleEntry<Character, Integer>('z', 26)
        );
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
