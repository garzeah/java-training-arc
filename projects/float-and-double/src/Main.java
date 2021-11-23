public class Main {
    // Nowadays, float isn't used much. double is frequently used.

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE; // 1.4 E-45
        float myMaxFloatValue = Float.MAX_VALUE; // 3.4028235 E38
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " +myMaxFloatValue);

        // Double has a longer precision than a float
        double myMinDoubleValue = Double.MIN_VALUE; // 4.9 E-324
        double myMaxDoubleValue = Double.MAX_VALUE; // 1.7976931348623157 E308
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " +myMaxDoubleValue);

        // Can use f or d to case
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms= " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
