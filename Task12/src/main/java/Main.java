/*
There's a great war between the even and odd numbers. Many numbers already
lost their life in this war and it's your task to end this. You have to determine which
group sums larger: the even, or the odd. The larger group wins.
Create a function that takes an array of integers, sums the even and odd numbers
separately, then returns the difference between sum of even and odd numbers.
warOfNumbers([2, 8, 7, 5]) ➞ 2
// 2 + 8 = 10
// 7 + 5 = 12
// 12 is larger than 10
// So we return 12 - 10 = 2
warOfNumbers([12, 90, 75]) ➞ 27*/
public class Main {
    public static void main(String[] args) {
        War war = new War();
        int[] intArray = {2,8,7,5};
        System.out.println("The winner is: " + war.warOfNumbers(intArray));
    }
}
