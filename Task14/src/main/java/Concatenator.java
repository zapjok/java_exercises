import java.util.Arrays;

/*
Create a function which concatenates the number 7 to the end of every chord in
an array. Ignore all chords which already end with 7.
 jazzify(["G", "F", "C"]) ➞ ["G7", "F7", "C7"]
 jazzify(["Dm", "G", "E", "A"]) ➞ ["Dm7", "G7", "E7", "A7"]
 jazzify(["F7", "E7", "A7", "Ab7", "Gm7", "C7"]) ➞ ["F7", "E7", "A7", "Ab7",
"Gm7", "C7"]
 jazzify([]) ➞ []
Notes:
Return an empty array if the given array is empty.
You can expect all the tests to have valid chords.
 */
public class Concatenator {
    public String[] jazzify (String[] input) {
        // It's null not empty
        // Corrected with the function .isEmpty()
        if (input.isEmpty()) return input;
        else {
            for (int i = 0; i < input.length; i++) {
                if (!input[i].endsWith("7"))input[i] += '7';
            }
            return input;
        }
    }
}
