import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[length];

        System.out.println("Enter " + length + " integer values.\r");

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        scanner.close();
        return values;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.printf("Element %d contents %d\n", i, array[i]);
        }
    }

    public static int[] sortIntegers(int[] arr) {
        int pos;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            pos = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[pos]) { // Find the index of the maximum element
                    pos = j;
                }
            }

            temp = arr[pos]; // Swap the current element with the minimum element
            arr[pos] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
