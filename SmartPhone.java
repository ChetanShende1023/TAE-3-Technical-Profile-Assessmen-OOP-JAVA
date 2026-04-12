/* 
 QUESTION: Create a base class 'Phone' with a 'call' method. 
 Create a subclass 'SmartPhone' that adds a 'browseInternet' method.
*/
class Phone {
    void call() { System.out.println("Making a call..."); }
}

public class SmartPhone extends Phone {
    void browseInternet() { System.out.println("Browsing the web..."); }

    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.call();           // Inherited
        sp.browseInternet(); // Own method
    }
}
