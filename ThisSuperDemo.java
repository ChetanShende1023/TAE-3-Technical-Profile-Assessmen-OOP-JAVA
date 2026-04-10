/* 
 * QUESTION: What is the difference between 'this' and 'super'?
 * ANSWER: 'this' refers to the current class instance/constructor. 
 * 'super' refers to the immediate parent class instance/constructor.
 */
class Base {
    Base() { System.out.println("Parent Constructor"); }
}

class Derived extends Base {
    Derived() {
        super(); // Call parent constructor
        System.out.println("Child Constructor");
    }
}
