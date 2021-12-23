package shopshop;

import java.util.Scanner;

public class Input {
    public String getItemName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter item name: ");
        return scanner.nextLine();
    }
    public int getInt(String whatToGet) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(whatToGet);
        int scannedInt = -1;
        do {
            try {
                scannedInt = scanner.nextInt();
                if (scannedInt < 0) {
                    System.out.println("Please enter 0 or a positive value.");
                }
            } catch (java.util.InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Invalid type of input. Please enter whole number / integer.");
            }
        }while(scannedInt < 0);
        return scannedInt;
    }
}
