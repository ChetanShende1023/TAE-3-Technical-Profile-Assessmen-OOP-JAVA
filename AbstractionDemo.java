/* 
 * QUESTION: 
 * Create an abstract class 'Shape' with an abstract method 'draw()'. 
 * Implement this in 'Circle' and 'Rectangle' classes to show 
 * how implementation details are hidden.
 */

abstract class Shape {
    abstract void draw(); // No body
}

class Circle extends Shape {
    void draw() { System.out.println("Drawing a Circle"); }
}

class Rectangle extends Shape {
    void draw() { System.out.println("Drawing a Rectangle"); }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.draw();
        s2.draw();
    }
}
