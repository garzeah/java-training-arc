import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        // We have to create an int class bc we can't assign primitive types
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(50));
        Integer integer = new Integer(54);

        // LONG WAY
        // Autoboxing helps us get around the above problem by creating a wrapper
        ArrayList<Integer> intArrayList2 = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++) {
            // Taking the value of i that's a primitive type and let's us use it inside the class
            // This is autoboxing where we convert the primitive type to a class type/object wrapper
            intArrayList2.add(Integer.valueOf(i));
        }

        for(int i = 0; i <= 10; i++) {
            // Unboxing is when we get the value from the class/object wrapper and turn it back
            // into a primitive type
            System.out.println(i + " --> " + intArrayList2.get(i).intValue());
        }

        // SHORT WAY
        // Autoboxing
        Integer myIntValue = 56; // Integer.valueOf(56) happens in the background
        // Unboxing
        int myInt = myIntValue; // myInt.intValue() happens in the background

        // Double Example
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for(int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }

        // Double Example Shortcut
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(dbl);
        }

        for(int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }
    }
}
