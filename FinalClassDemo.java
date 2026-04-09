/* 
 * QUESTION: What happens if a class is declared as 'final'?
 * ANSWER: A final class cannot be inherited (extended) by any other class.
 * It prevents subclasses from being created.
 */
final class ImmutableBase {
    void secureMethod() { System.out.println("Cannot be overridden"); }
}

// class Extension extends ImmutableBase { } // This would cause a COMPILE ERROR
