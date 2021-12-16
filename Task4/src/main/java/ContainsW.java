/*
Write a method which finds if a given string contains ‘w’ character between 1 and 3 times.
Test Data:
Input a string (contains at least one 'w' char) : w3resource
Test the string contains 'w' character between 1 and 3 times:
Sample Output: True
 */
public class ContainsW {
    public boolean containsw (String word) {
        char[] wordChars = word.toCharArray();
        // It can be an integer int numberOfW = 0;
        // modified
        int numberOfW = 0;
        for (char actualChar : wordChars) {
            if (actualChar == 'w') numberOfW++;
        }
        return numberOfW <= 3 && numberOfW >= 1;
    }
}
