/* 
 * Question 8: Create a class TextProcessingBuilder.
 * - Use StringBuilder to create a string.
 * - Append additional text.
 * - Display modified string.
 * - Write a comment comparing StringBuilder and StringBuffer.
 */
public class TextProcessingBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Base Text");
        
        sb.append(" -> Appended Content");
        
        System.out.println("Result: " + sb);
        
        /* 
         * COMPARISON:
         * 1. StringBuffer: Thread-safe (synchronized). Use it if multiple threads access the same string.
         * 2. StringBuilder: Not thread-safe. It is faster and preferred for most single-threaded tasks.
         * 3. Both: Mutable, unlike the standard String class which is immutable.
         */
    }
}
