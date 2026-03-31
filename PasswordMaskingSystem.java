/* 
 * Question 10: Create a class PasswordMaskingSystem.
 * - Accept password from the user.
 * - Replace all characters except last two using replace() method.
 * - Display masked password.
 */
import java.util.Scanner;

public class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.next();

        if (password.length() > 2) {
            // Get the part to be masked (everything except last 2)
            String toMask = password.substring(0, password.length() - 2);
            String lastTwo = password.substring(password.length() - 2);

            // Create masking string of same length using repeat (Java 11+) 
            // or a simple loop/regex for older versions
            String masked = toMask.replaceAll(".", "*") + lastTwo;
            
            System.out.println("Masked Password: " + masked);
        } else {
            System.out.println("Password too short to mask: " + password);
        }
    }
}
