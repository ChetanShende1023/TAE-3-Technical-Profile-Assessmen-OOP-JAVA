/* 
 * 22. Banking System
 * Create a class BankingSystem. Multiple threads access shared account balance using synchronized block.
 * Output: Balance deduction messages.
 */
class BankingSystem {
    private int balance = 5000;

    public void withdraw(int amount) {
        synchronized (this) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
            } else {
                System.out.println("Insufficient balance for withdrawal of " + amount);
            }
        }
    }
}
