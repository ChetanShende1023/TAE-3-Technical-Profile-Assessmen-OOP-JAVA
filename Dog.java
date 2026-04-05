/**
 * 12. Create a superclass Animal and a subclass Dog.
 * • Animal should have a method makeSound().
 * • Override makeSound() in the Dog class to print "Bark".
 * • Use the super keyword to call the parent's version of the method.
 */
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Override makeSound() method
    @Override
    void makeSound() {
        super.makeSound(); // Calls the parent method
        System.out.println("Dog barks: Woof Woof!");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
    }
}
