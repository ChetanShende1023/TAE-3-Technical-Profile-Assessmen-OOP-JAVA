/* 
 QUESTION: Design an 'Account' class with a private balance. 
 Implement public getter and setter methods to access and modify the balance securely.
*/
public class Account {
    private double balance;

    public void setBalance(double balance) {
        if(balance >= 0) this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(5000);
        System.out.println("Balance: " + acc.getBalance());
    }
}
