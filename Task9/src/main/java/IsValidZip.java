public class IsValidZip {
    // How about implementing it with if-s? :)
    public boolean zipValidator (String input) {
        //Implemented with If
        if (input.matches("\\d{5}")) {
            return true;
        }
        else {
            return false;
        }
    }
}
