/* 
 * Question 5: Define a class FileExtensionExtractor.
 * - Accept a file name (example: "report.pdf").
 * - Extract file extension using substring() method.
 * - Display extracted extension.
 */
public class FileExtensionExtractor {
    public static void main(String[] args) {
        String fileName = "report.pdf";
        int dotIndex = fileName.lastIndexOf('.');
        
        // Extract substring starting from the character after the dot
        String extension = fileName.substring(dotIndex + 1);
        
        System.out.println("File Extension: " + extension);
    }
}
