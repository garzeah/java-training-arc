import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // This can contain anything which is a generic
        // where we haven't specified what we wanted
        // in our array list
//        ArrayList items = new ArrayList();
//        items.add(1);
//        items.add(2);
//        items.add(3);
//        items.add("tim");
//        items.add(4);
//        items.add(5);

        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("tim");
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n) {
        // Object is a generic type
//        for(Object i : n) {
//            // Casting it as an integer
//            System.out.println((Integer)i * 2);
//        }
        for(int i : n) {
            System.out.println(i * 2);
        }
    }
}
