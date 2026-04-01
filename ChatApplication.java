/* 
 * 23. Chat Application
 * Create a class ChatApplication. Create threads for sending and receiving messages. 
 * Demonstrate thread lifecycle.
 * Output: Sending and receiving messages.
 */
class ChatApplication {
    public void chatDemo() {
        Thread sender = new Thread(() -> System.out.println("Sending message: Hello!"));
        Thread receiver = new Thread(() -> System.out.println("Receiving message: Hi there!"));

        System.out.println("Initial State: " + sender.getState()); // NEW
        
        sender.start();
        receiver.start();
        
        System.out.println("After Start State: " + sender.getState()); // RUNNABLE/BLOCKED/TERMINATED
    }
}
