import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Concatenator concat= new Concatenator();
        String[] input = {"G","F","C"};
        System.out.println("Result: " + Arrays.toString(concat.jazzify(input)));
    }
}
