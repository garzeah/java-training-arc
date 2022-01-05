public class Main {
    // A Java abstract class is a class which cannot be
    // instantiated, meaning you cannot create new instances
    // of an abstract class. The purpose of an abstract class
    // is to function as a base for subclasses.

    // Use interfaces when you expect that unrelated classes will
    // implement your interface.

    // Use abstract when you want to share code among several
    // closely related classes.
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Penguin");
        penguin.fly();
    }
}
