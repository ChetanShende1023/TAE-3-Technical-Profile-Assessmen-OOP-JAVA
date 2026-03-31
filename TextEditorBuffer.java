/* 
 * Question 7: Define a class TextEditorBuffer.
 * - Create a string using StringBuffer.
 * - Append text to the string.
 * - Insert text at a specific position.
 * - Reverse the final string and display it.
 */
public class TextEditorBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        
        sb.append(" World");           // Appends at the end
        sb.insert(6, "Java ");         // Inserts "Java " at index 6
        sb.reverse();                  // Reverses characters in place
        
        System.out.println("Final String: " + sb);
    }
}
