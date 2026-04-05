/**
 * 11. Create a class Person.
 * • Make age and name private attributes.
 * • Provide public getter and setter methods to access them.
 * • Ensure the setter for age does not allow negative values.
 */
public class Person {
    private String name;
    private int age;

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for Age
    public int getAge() {
        return age;
    }

    // Setter for Age with validation
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("John");
        p.setAge(25);
        System.out.println(p.getName() + " is " + p.getAge() + " years old.");
    }
}
