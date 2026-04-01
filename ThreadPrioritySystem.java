/* 
 * 20. Thread Priority System
 * Create a class ThreadPrioritySystem. Create multiple threads and assign 
 * different priorities and observe execution order.
 * Output: Thread execution messages.
 */
class ThreadPrioritySystem {
    public void runPriorityDemo() {
        Thread low = new Thread(() -> System.out.println("Low Priority Thread running"), "Low-Thread");
        Thread high = new Thread(() -> System.out.println("High Priority Thread running"), "High-Thread");

        low.setPriority(Thread.MIN_PRIORITY); // 1
        high.setPriority(Thread.MAX_PRIORITY); // 10

        low.start();
        high.start();
    }
}
