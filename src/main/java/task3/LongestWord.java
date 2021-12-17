package task3;

public class LongestWord {
    public String longestWord(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";
        for (String actualWord : words) {
            if (actualWord.length() > result.length()) result = actualWord;
        }
        return result;
    }
}
