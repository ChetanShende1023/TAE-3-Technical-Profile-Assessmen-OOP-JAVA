/* 
 QUESTION: Create an abstract class 'Appliance' with an abstract method 'turnOn()'. 
 Implement it in a 'Fan' class.
*/
abstract class Appliance {
    abstract void turnOn();
}

class Fan extends Appliance {
    void turnOn() { System.out.println("Fan is spinning..."); }
}

public class ApplianceTest {
    public static void main(String[] args) {
        Appliance myFan = new Fan();
        myFan.turnOn();
    }
}
