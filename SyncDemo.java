/* 
 * QUESTION: Why is the 'synchronized' keyword important in multithreading?
 * ANSWER: It prevents multiple threads from accessing a shared resource 
 * at the same time, avoiding "Race Conditions" or data corruption.
 */
class SharedResource {
    synchronized void printData(int n) { // Lock object for this thread
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
        }
    }
}
