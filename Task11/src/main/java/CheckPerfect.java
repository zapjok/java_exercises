import java.util.ArrayList;

public class CheckPerfect {
    public boolean isPerfect (int toCheckNum) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = toCheckNum - 1; i > 0; i--) {
            if (toCheckNum % i == 0) factors.add(i);
        }
        return toCheckNum == factors.stream().mapToInt(Integer::intValue).sum();
    }
}
