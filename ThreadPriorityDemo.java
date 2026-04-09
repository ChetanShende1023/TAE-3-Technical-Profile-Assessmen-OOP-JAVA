/* 
 * QUESTION: How can you influence the execution order of threads?
 * ANSWER: By setting thread priorities (1 to 10), though the 
 * final decision depends on the OS thread scheduler.
 */
class PriorityTask extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }
}
// Usage: t1.setPriority(Thread.MAX_PRIORITY);
