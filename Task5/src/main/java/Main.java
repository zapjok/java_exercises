/*
Create a function which returns the number of true values there are in an array.
Return 0 if given an empty array.
All array items are of the type bool (true or false).
 */
public class Main {
    public static void main(String[] args) {
        boolean[] boolArray = {true, false, true, true, false};
        NumberOfTrue numberOfTrue = new NumberOfTrue();
        System.out.println(numberOfTrue.numberOfTrue(boolArray));
    }
}
