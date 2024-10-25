import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pattern for SSN
        String ssnPattern = "^\\d{3}-\\d{2}-\\d{4}$";
        String ssn = SafeInput.getRegExString(scanner, "Enter your SSN (format: xxx-xx-xxxx): ", ssnPattern);
        System.out.println("You entered a valid SSN: " + ssn);

        // Pattern for UC Student M number
        String mNumberPattern = "^(M|m)\\d{5}$";
        String mNumber = SafeInput.getRegExString(scanner, "Enter your UC Student M number (format: Mxxxxx): ", mNumberPattern);
        System.out.println("You entered a valid M number: " + mNumber);

        // Pattern for menu choice
        String menuChoicePattern = "^[OoSsVvQq]$";
        String menuChoice = SafeInput.getRegExString(scanner, "Enter your menu choice (O/S/V/Q): ", menuChoicePattern);
        System.out.println("You entered a valid menu choice: " + menuChoice);
    }
}
