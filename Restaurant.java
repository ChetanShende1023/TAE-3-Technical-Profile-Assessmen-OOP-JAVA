/* 
 * 21. Producer Consumer System
 * Create a class Restaurant. Chef prepares food and waiter serves it using wait() and notify().
 * Output: 'Chef prepared food' and 'Waiter served food'
 */
class Restaurant {
    private boolean isFoodReady = false;

    public synchronized void prepareFood() throws InterruptedException {
        while (isFoodReady) wait(); // Wait if food is already there
        System.out.println("Chef prepared food");
        isFoodReady = true;
        notify(); // Tell waiter food is ready
    }

    public synchronized void serveFood() throws InterruptedException {
        while (!isFoodReady) wait(); // Wait if no food is prepared
        System.out.println("Waiter served food");
        isFoodReady = false;
        notify(); // Tell chef to prepare more
    }
}
