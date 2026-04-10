/* 
 * QUESTION: What is the difference between static and instance variables?
 * ANSWER: Static variables belong to the class (one copy shared by all). 
 * Instance variables belong to specific objects (each object gets its own copy).
 */
class Counter {
    static int count = 0; // Shared by all instances
    int instanceCount = 0; // Unique to each instance

    Counter() {
        count++;
        instanceCount++;
    }
}
