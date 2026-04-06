/* 
 * QUESTION: 
 * Write a program that demonstrates both Compile-time Polymorphism 
 * (Method Overloading) and Runtime Polymorphism (Method Overriding).
 */

class Calculator {
    // Overloading: Same name, different parameters
    int add(int a, int b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
}

class Animal {
    void sound() { System.out.println("Animal makes a sound"); }
}

class Dog extends Animal {
    @Override // Overriding: Different behavior in child class
    void sound() { System.out.println("Dog barks"); }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of 2: " + calc.add(5, 10));
        
        Animal myDog = new Dog(); // Upcasting
        myDog.sound(); // Calls Dog's version
    }
}
