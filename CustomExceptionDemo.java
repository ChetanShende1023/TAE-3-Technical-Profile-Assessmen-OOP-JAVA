/* 
 * QUESTION: How do you create and throw a custom exception?
 * ANSWER: Extend the 'Exception' class and use the 'throw' keyword 
 * to trigger it based on specific business logic.
 */
class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) { super(msg); }
}

class Voter {
    void checkAge(int age) throws InvalidAgeException {
        if (age < 18) throw new InvalidAgeException("Must be 18+ to vote.");
        else System.out.println("Voter Verified!");
    }
}
