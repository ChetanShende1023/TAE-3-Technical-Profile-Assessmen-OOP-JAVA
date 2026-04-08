/* 
 QUESTION: Demonstrate Method Overriding. Create a parent class 'Bank' with a 
 getInterest() method, and override it in a subclass 'SBI' to return a specific rate.
*/
class Bank {
    double getInterest() { return 0; }
}

class SBI extends Bank {
    @Override
    double getInterest() { return 7.5; }
}

public class PolyTest {
    public static void main(String[] args) {
        Bank myBank = new SBI(); // Upcasting
        System.out.println("SBI Interest Rate: " + myBank.getInterest() + "%");
    }
}
