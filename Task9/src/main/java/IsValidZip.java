public class IsValidZip {
    // How about implementing it with if-s? :)
    public boolean zipValidator (String input) {
        return input.matches("\\d{5}");
    }
}
