/* 
 * Question: Write a Java program to find the largest number 
 * in an integer array.
 * Example: {10, 5, 20, 8} -> 20
 */

public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 23, 56, 89, 2};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The largest element is: " + max);
    }
}
