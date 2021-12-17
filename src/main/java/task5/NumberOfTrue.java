package task5;

public class NumberOfTrue {
    public int numberOfTrue(boolean[] boolArray) {
        // can be an int as well
        // modified
        int result = 0;
        if (boolArray.length == 0) return result;
        else {
            for (boolean actualValue : boolArray) {
                // if (actualValue)
                // corrected
                if (actualValue) ++result;
            }
        }
        return result;
    }
}
