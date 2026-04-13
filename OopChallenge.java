/* 
 * Name: [Your Name Here]
 * Date: April 2024
 * Question: Create a System for a Library that demonstrates 
 * Encapsulation, Inheritance, and Polymorphism.
 * File Name: OopChallenge.java
 */

// 1. ABSTRACTION: Interface defining what every library item must do
interface LibraryItem {
    void displayDetails();
}

// 2. ENCAPSULATION: Base class with private fields and getters/setters
class Item {
    private String title;
    private int id;

    public Item(String title, int id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }
}

// 3. INHERITANCE: Book "is-a" type of Item and implements LibraryItem
class Book extends Item implements LibraryItem {
    private String author;

    public Book(String title, int id, String author) {
        super(title, id); // Calls the parent (Item) constructor
        this.author = author;
    }

    // 4. POLYMORPHISM: Providing a specific implementation for displayDetails
    @Override
    public void displayDetails() {
        System.out.println("Book ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + author);
        System.out.println("---------------------------");
    }
}

// The main class name must match the filename (OopChallenge)
public class OopChallenge {
    public static void main(String[] args) {
        // Using the interface type to demonstrate Polymorphism
        LibraryItem myBook = new Book("Java Programming", 101, "James Gosling");
        
        System.out.println("--- Library Management System ---");
        myBook.displayDetails();
    }
}
