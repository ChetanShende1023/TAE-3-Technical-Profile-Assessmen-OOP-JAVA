/* 
 QUESTION: Create an abstract class 'Shape' with an abstract method draw(). 
 Implement this method in a subclass 'Circle'.
*/
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class AbsTest {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
