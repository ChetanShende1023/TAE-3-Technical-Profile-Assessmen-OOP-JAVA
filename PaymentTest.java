/* 
 QUESTION: Create a 'Payment' class with a 'pay()' method. 
 Override 'pay()' in 'UPI' and 'CreditCard' classes to show different behaviors.
*/
class Payment {
    void pay() { System.out.println("Processing payment..."); }
}

class UPI extends Payment {
    @Override
    void pay() { System.out.println("Paid using UPI QR Scan."); }
}

class CreditCard extends Payment {
    @Override
    void pay() { System.out.println("Paid using Credit Card Chip."); }
}

public class PaymentTest {
    public static void main(String[] args) {
        Payment myPay = new UPI(); 
        myPay.pay(); // Calls UPI version
    }
}
