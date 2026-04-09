/* 
 * QUESTION: How do you call a parent class method if it's overridden?
 * ANSWER: Use the 'super' keyword to access parent class 
 * members (variables or methods).
 */
class Parent {
    void show() { System.out.println("Parent's show()"); }
}

class Child extends Parent {
    @Override
    void show() {
        super.show(); // Calls Parent's version
        System.out.println("Child's show()");
    }
}
