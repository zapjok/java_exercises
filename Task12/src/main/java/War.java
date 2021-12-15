public class War {
    public int warOfNumbers(int[] intArray) {
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for (int actual : intArray) {
            if (actual % 2 == 0) sumOfEven += actual;
            else sumOfOdd += actual;
        }
        if (sumOfEven > sumOfOdd) return sumOfEven - sumOfOdd;
        else return sumOfOdd - sumOfEven;
    }
}
