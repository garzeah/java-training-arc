import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        // Local Class Example (uncommon)
        // A local class is declared locally within a block of Java code,
        // rather than as a member of a class. Typically, a local class
        // is defined within a method, but it can also be defined within
        // a static initializer or instance initializer of a class.
        //class ClickListener implements Button.OnClickListener {
        //    public ClickListener() {
        //        System.out.println("I've been attached");
        //    }
        //
        //    @Override
        //    public void onClick(String title) {
        //        System.out.println(title + " was clicked");
        //    }
        //}
        // btnPrint.setOnClickListener(new ClickListener());

        // Anonymous Class Example
        // Anonymous classes enable you to make your code more concise.
        // They enable you to declare and instantiate a class at the same time.
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();

        // Inner class example
        // A nested class is a member of its enclosing class.
        // Non-static nested classes (inner classes) have
        // access to other members of the enclosing class,
        // even if they are declared private. Static
        // nested classes do not have access to other
        // members of the enclosing class.
        //Gearbox mcLaren = new Gearbox(6);
        //
        //mcLaren.operateClutch(true);
        //
        //mcLaren.changeGear(1);
        //mcLaren.operateClutch(false);
        //System.out.println(mcLaren.wheelSpeed(1000));
        //
        //mcLaren.changeGear(2);
        //System.out.println(mcLaren.wheelSpeed(3000));
        //
        //mcLaren.operateClutch(true);
        //mcLaren.changeGear(3);
        //mcLaren.operateClutch(false);
        //System.out.println(mcLaren.wheelSpeed(6000));
    }

    private static void listen() {
        boolean quit = false;

        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
