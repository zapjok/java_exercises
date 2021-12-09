public class NumberOfTrue {
    public short numberOfTrue(boolean[] boolArray) {
        short result = 0;
        if (boolArray.length == 0) return result;
        else {
            for (boolean actualValue : boolArray) {
                if (actualValue == true) ++result;
            }
        }
        return result;
    }
}
