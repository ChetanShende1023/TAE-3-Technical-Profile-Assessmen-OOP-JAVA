/**
 * 14. Create an abstract class Shape.
 * • Define an abstract method draw().
 * • Create a subclass Circle that implements the draw() method.
 * • Create an object of Circle and call draw().
 */
abstract class Shape {
    // Abstract method (no body)
    abstract void draw();
}

class Circle extends Shape {
    // Implementing the abstract method
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }

    public static void main(String[] args) {
        // Shape s = new Shape(); // This would cause an error
        Shape s = new Circle();
        s.draw();
    }
}
