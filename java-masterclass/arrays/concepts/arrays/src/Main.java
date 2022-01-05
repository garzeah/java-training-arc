public class Main {
    public static void main(String[] args) {
        // Method 1 of initialization
        int[] myIntArray1;

        // Method 2 of initialization
        int[] myIntArray2 = new int[25];

        // Method 3 of initialization
        int[] myIntArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        double[] myDoubleArray = new double[10];

        printArray(myIntArray);
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = i * 10;
        }
    }
}
