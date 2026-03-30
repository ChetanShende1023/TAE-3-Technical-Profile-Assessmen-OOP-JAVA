import java.util.Scanner;

/* 
 * 3. Define a class StudentNameComparison.
 * • Accept two student names.
 * • Compare them using case-sensitive comparison.
 * • Compare them using case-insensitive comparison.
 * • Display appropriate message.
 */
public class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept two student names.
        System.out.print("Enter first student name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter second student name: ");
        String name2 = sc.nextLine();

        // Compare them using case-sensitive comparison.
        if (name1.equals(name2)) {
            System.out.println("Case-sensitive: The names match exactly.");
        } else {
            System.out.println("Case-sensitive: The names do not match.");
        }

        // Compare them using case-insensitive comparison.
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Case-insensitive: The names are the same.");
        } else {
            System.out.println("Case-insensitive: The names are different.");
        }
    }
}
