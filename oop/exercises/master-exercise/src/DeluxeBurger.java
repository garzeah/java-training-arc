public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super( "Deluxe Burger", "Beef", 19.10, "Premium");
    }


    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }
}
