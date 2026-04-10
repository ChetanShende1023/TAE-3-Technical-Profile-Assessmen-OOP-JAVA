/* 
 * QUESTION: What is the use of the join() method?
 * ANSWER: It allows one thread to wait until another thread 
 * completes its execution before continuing.
 */
class Worker extends Thread {
    public void run() { 
        System.out.println("Worker thread finishing..."); 
    }
}
// Usage in main: Worker w1 = new Worker(); w1.start(); w1.join();
