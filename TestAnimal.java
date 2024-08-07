// Superclass
class Animal{
    /*----- Method to be overridden -----*/
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}
// Subclass 1: Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}
// Subclass 2: Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}
// Main class to test the functionality
public class TestAnimal {
    public static void main(String[] args) {
        // Creating objects of each subclass
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling the overridden method
        System.out.println("Calling makeSound() for Dog:");
        myDog.makeSound();
        System.out.println("Calling makeSound() for Cat:");
        myCat.makeSound();
    }
}

