public class PerfectNumber {
    public static void main(String[] args) {
//        System.out.println(isPerfectNumber(9));
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int num) {
        if (num < 1) return false;
        int perfectNumber = 0;

        for (int i = 1; i < num; i++) {
            boolean isDivisible = (num % i == 0);

            if (isDivisible) perfectNumber += i;
        }

        if (perfectNumber == num) return true;
        return false;
    }
}
