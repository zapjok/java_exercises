public class NumberOfTrue {
    public short numberOfTrue(boolean[] boolArray) {
        // can be an int as well
        short result = 0;
        if (boolArray.length == 0) return result;
        else {
            for (boolean actualValue : boolArray) {
                // if (actualValue)
                if (actualValue == true) ++result;
            }
        }
        return result;
    }
}
