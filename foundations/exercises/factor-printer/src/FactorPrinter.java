public class FactorPrinter {
    public static void main(String[] args) {}

    public static void printFactors(int num){
        if (num < 1) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = num; i > 0; i--){
            if (num % i == 0) {
                System.out.println(num / i);
            }
        }

        return;
    }
}
