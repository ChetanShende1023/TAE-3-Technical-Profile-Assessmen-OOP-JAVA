/* 
 * Question 9: Define a class Student with attributes id and name.
 * - Override toString() method.
 * - Create object of class.
 * - Display object details using toString().
 */
public class Student {
    int id;
    String name;

    // Constructor to initialize attributes
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding the default toString() method
    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }

    public static void main(String[] args) {
        // Creating object
        Student s1 = new Student(101, "Aryan");

        // Displaying object details using toString()
        System.out.println(s1.toString());
    }
}
