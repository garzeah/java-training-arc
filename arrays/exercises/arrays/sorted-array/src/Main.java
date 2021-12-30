public class Main {
    public static void main(String[] args) {
        SortedArray sortedArray = new SortedArray();

        int[] array = sortedArray.getIntegers(5);
        sortedArray.printArray(array);

        int[] unsortedArray = { 106, 26, 81, 5, 15 };
        unsortedArray = sortedArray.sortIntegers(unsortedArray);
        sortedArray.printArray(unsortedArray);
    }

}
