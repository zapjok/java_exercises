package task13;

public class Spacer {
    public String capSpace(String input) {
        char[] inputChars = input.toCharArray();
        String result = String.valueOf(inputChars[0]);
        for (int i = 1; i < inputChars.length; i++) {
            if (Character.isUpperCase(inputChars[i])) result += " ";
            result += inputChars[i];
        }
        return result.toLowerCase();
    }
}
