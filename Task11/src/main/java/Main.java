/*
6) Create a function that tests whether or not an integer is a perfect number. A
perfect number is a number that can be written as the sum of its factors, (equal to
sum of its proper divisors) excluding the number itself.
For example, 6 is a perfect number, since 1 + 2 + 3 = 6, where 1, 2, and 3 are all
factors of 6. Similarly, 28 is a perfect number, since 1 + 2 + 4 + 7 + 14 = 28.
checkPerfect(6) ➞ true
checkPerfect(28) ➞ true
checkPerfect(496) ➞ true
checkPerfect(12) ➞ false
checkPerfect(97) ➞ false
 */
public class Main {
    public static void main(String[] args) {
        CheckPerfect checkperfect = new CheckPerfect();
        System.out.println("Perfect number: " + checkperfect.isPerfect(28));

    }
}
