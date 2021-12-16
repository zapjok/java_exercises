public class ExistsHigher {
    // lowercase char array
    public boolean existsHigher(int[] Array, int bottomLimit) {
        for (int actualNumber : Array) {
            if (actualNumber >= bottomLimit) return true;
        }
        return false;
    }
}
