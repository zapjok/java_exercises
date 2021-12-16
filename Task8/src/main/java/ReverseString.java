public class ReverseString {
    public String reverseString(String sentence) {
        char[] charsOfsentence = sentence.toCharArray();
        char[] revcharsOfsentence = new char[charsOfsentence.length];
        // Perfect
        //Thanks!
        for (int i = charsOfsentence.length - 1, j = 0; j < charsOfsentence.length; i--, j++) {
            revcharsOfsentence[j] = charsOfsentence[i];
        }
        return String.valueOf(revcharsOfsentence);
    }
}
