/* 
 * 15. Bank Application
 * Create a class BankApplication. Define method that throws
 * exception using throws. Call method in main and handle
 * exception.
 * Output: 'Transaction processed' or 'Exception handled in main'
 */
class BankApplication {
    public void processTransaction(int amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Invalid balance");
        }
        System.out.println("Transaction processed");
    }

    public static void main(String[] args) {
        BankApplication bank = new BankApplication();
        try {
            bank.processTransaction(-100); 
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}
