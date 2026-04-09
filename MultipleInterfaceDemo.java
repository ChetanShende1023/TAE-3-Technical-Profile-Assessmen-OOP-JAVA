/* 
 * QUESTION: Can a class implement multiple interfaces?
 * ANSWER: Yes. This is how Java achieves multiple inheritance 
 * of behavior without the diamond problem.
 */
interface Flyable { void fly(); }
interface Swimmable { void swim(); }

class Duck implements Flyable, Swimmable {
    public void fly() { System.out.println("Duck is flying"); }
    public void swim() { System.out.println("Duck is swimming"); }
}
