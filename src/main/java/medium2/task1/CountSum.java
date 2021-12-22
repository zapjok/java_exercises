package medium2.task1;
/*
1) Positive Count / Negative Sum
Create a function that takes an array of positive and negative numbers. Return an array
where the first element is the count of positive numbers and the second element is the sum
of negative numbers.
Examples
 countPositivesSumNegatives([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15]) ➞
[10, -65]
// There are a total of 10 positive numbers.
// The sum of all negative numbers equals -65.
 countPositivesSumNegatives([92, 6, 73, -77, 81, -90, 99, 8, -85, 34]) ➞ [7, -252]
 countPositivesSumNegatives([91, -4, 80, -73, -28]) ➞ [2, -105]
 countPositivesSumNegatives([]) ➞ []
Notes
If given an empty array, return an empty array: []
0 is not positive.
 */

public class CountSum {
    public int[] countPositivesSumNegatives(int[] inputArray) {
        if (inputArray.length == 0) {
            return inputArray;
        } else {
            int countPositives = 0, sumNegatives = 0;
            for (int actual: inputArray) {             //0 is considered to be unsigned: neither positive nor negative
                if (actual < 0) {
                    sumNegatives += actual;
                } else if ( actual > 0) {
                    countPositives++;
                }
            }
            return new int[] {countPositives,sumNegatives};
        }
    }
}

