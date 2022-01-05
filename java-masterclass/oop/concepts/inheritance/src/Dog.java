public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // super passes it down to the Animal class
        super(name, 1, 1, size, weight);

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override // Overriding a method in the super class (Animal)
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();

        // Can still call the Animal.eat() method using this
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        // Better to call it this way rather than super.move() in case we want to override
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        // Better to call it this way rather than super.move() in case we want to override
        move(10);
    }

    private void moveLegs (int speed) {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
