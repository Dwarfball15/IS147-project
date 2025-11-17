import java.util.Scanner;

/**
 * The PasswordValidator class provides functionality to verify whether
 * a password meets specific strength requirements.
 *
 * <p>The program checks if a password:</p>
 * <ul>
 *     <li>Has at least 8 characters</li>
 *     <li>Contains at least one numerical digit</li>
 *     <li>Contains at least one special character</li>
 * </ul>
 *
 * <p>Users are prompted to enter a password, and the program validates it
 * using the {@link #isValidPassword(String)} method.</p>
 *
 * @author Wuraola
 * @version 1.0
 */
public class PasswordValidator {

    /**
     * Main method for running the PasswordValidator program.
     * <p>
     * Prompts the user to enter a password and displays whether it meets
     * the required strength conditions.
     * </p>
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is strong.");
        } else {
            System.out.println("Password does not meet the required conditions.");
        }

        scanner.close();
    }

    /**
     * Validates whether a given password meets the minimum strength criteria.
     *
     * <p>A valid password must satisfy all of the following:</p>
     * <ul>
     *     <li>Be at least 8 characters long</li>
     *     <li>Contain at least one digit</li>
     *     <li>Contain at least one special character (from a predefined set)</li>
     * </ul>
     *
     * @param password The password string to validate.
     * @return {@code true} if the password meets all requirements,
     *         {@code false} otherwise.
     */
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false; // Must be at least 8 characters
        }

        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        String specialCharacters = "!@#$%^&*()_+-=[]{};:'\"\\|,.<>?/";

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            if (specialCharacters.indexOf(ch) != -1) {
                hasSpecialChar = true;
            }
            if (hasDigit && hasSpecialChar) {
                return true; // Requirements are met
            }
        }

        return false;
    }
}

