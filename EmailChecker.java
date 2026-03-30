import java.util.Scanner;

/* 
 * 2. Design a program EmailChecker.
 * • Accept an email address from the user.
 * • Check whether the email contains "@gmail.com".
 * • Display "Valid Gmail Address" or "Invalid Email".
 */
public class EmailChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept an email address from the user.
        System.out.print("Enter email address: ");
        String email = sc.nextLine();

        // Check whether the email contains "@gmail.com".
        if (email.toLowerCase().endsWith("@gmail.com")) {
            // Display "Valid Gmail Address"
            System.out.println("Valid Gmail Address");
        } else {
            // Display "Invalid Email"
            System.out.println("Invalid Email");
        }
    }
}
