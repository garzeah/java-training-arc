public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");

        // Since dog extends Animal, we inherited its properties unless we override it
        // dog.eat();
        // dog.walk();

        // Will either refer to override or not depending on whether it's commented out or not
        dog.run();
    }
}
