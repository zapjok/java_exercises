public class IsValidZip {
    public boolean zipValidator (String input) {
        return input.matches("\\d{5}");
    }
}
