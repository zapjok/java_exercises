package task6;

public class ExistsHigher {
    // lowercase char array
    // corrected lowercase first character
    public boolean existsHigher(int[] array, int bottomLimit) {
        for (int actualNumber : array) {
            if (actualNumber >= bottomLimit) return true;
        }
        return false;
    }
}
