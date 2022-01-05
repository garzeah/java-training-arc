public class Main {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }

    public static int getEvenDigitSum(int num) {
        if (num < 0) return -1;
        int sum = 0;
        String numStr = Integer.toString(num);

        for (int i = 0; i < numStr.length(); i++) {
            int elem = Character.getNumericValue(numStr.charAt(i));

            if (elem % 2 == 0) sum += elem;
        }

        return sum;
    }
}
