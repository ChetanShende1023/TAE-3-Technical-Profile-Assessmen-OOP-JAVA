import java.util.Scanner;

/* 
 * 1. Create a class called UsernameValidator.
 * • Accept a username from the user.
 * • Remove leading and trailing spaces.
 * • Convert the username to lowercase.
 * • Display the cleaned username.
 */
public class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept a username from the user.
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        // Remove leading and trailing spaces and convert to lowercase.
        String cleanedUsername = username.trim().toLowerCase();

        // Display the cleaned username.
        System.out.println("Cleaned username: " + cleanedUsername);
    }
}
