public class Main {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        // Turning the decimal places into a whole number
        num1 = num1 * 1000;
        num2 = num2 * 1000;

        int intNum1 = (int) num1;
        int intNum2 = (int) num2;

        return intNum1 == intNum2;
    }
}
