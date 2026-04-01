/* 
 * 19. Online Shopping System
 * Create a class OnlineShoppingSystem. Create threads for payment and order processing.
 * Output: 'Processing payment...' and 'Order confirmed...'
 */
class OnlineShoppingSystem {
    public void startTransaction() {
        Thread payment = new Thread(() -> System.out.println("Processing payment..."));
        Thread order = new Thread(() -> System.out.println("Order confirmed..."));

        payment.start();
        order.start();
    }
}
