package medium2.task2;
/*
2) Zip It, If You Can?
Given an array of women and an array of men, either:
Return null if the two arrays are of different sizes.
If the sizes match, return an array of pairs, with the first woman paired with the first man,
second woman paired with the second man, etc.
Examples
 zipIt([["Tesha", "Tesh", "Shang"], ["Deep", "Xavier", "Dex"]])
➞ [["Tesha", "Deep"],["Tesh", "Xavier"],["Shang", "Dex"]]
 zipIt(["Elise", "Mary"], ["John", "Rick"])
➞ [["Elise", "John"], ["Mary", "Rick"]]
 zipIt(["Ana", "Amy", "Lisa"], ["Bob", "Josh"]) ➞ null
 zipIt(["Ana", "Amy", "Lisa"], ["Bob", "Josh", "Tim"])
➞ [["Ana", "Bob"], ["Amy", "Josh"],["Lisa", "Tim"]]
 */

public class Zipper {
    public String[][] zipIt (String[] women, String[] men) {
        if (women.length != men.length) {
            return null;
        }
        String[][] pairs = new String[women.length][];
        for (int i = 0; i < men.length; i++) {
            pairs[i] = new String[] {women[i],men[i]};
        }
        return pairs;
    }
}

