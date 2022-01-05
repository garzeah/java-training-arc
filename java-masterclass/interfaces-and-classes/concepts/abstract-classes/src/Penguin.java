public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    // Want to override bc default is set to a bird can fly
    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not very good at that, can I got for a swim instead?");
    }
}
