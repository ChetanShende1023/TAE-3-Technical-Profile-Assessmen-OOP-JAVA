/* 
 * QUESTION: 
 * Demonstrate Single Inheritance. Create a 'Vehicle' parent class 
 * and a 'Car' child class. Use the 'super' keyword to call the 
 * parent constructor and parent method.
 */

class Vehicle {
    String brand = "Generic Vehicle";

    void displayInfo() {
        System.out.println("This is a " + brand);
    }
}

class Car extends Vehicle {
    String model = "Mustang";

    @Override
    void displayInfo() {
        super.displayInfo(); // Calls parent method
        System.out.println("Model: " + model);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.displayInfo();
    }
}
