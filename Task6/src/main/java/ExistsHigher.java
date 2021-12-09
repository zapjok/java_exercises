public class ExistsHigher {
    public boolean existsHigher(int[] Array, int bottomLimit){
        for (int actualNumber : Array) {
            if (actualNumber >= bottomLimit) return true;
        }
        return false;
    }
}
