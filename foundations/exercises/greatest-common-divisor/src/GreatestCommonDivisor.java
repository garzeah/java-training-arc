public class GreatestCommonDivisor {
    public static void main(String[] args) {}

    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10) { return -1; }
        int i = 1, gcf = 1;

        while (i <= first && i <= second) {
            if (first % i == 0 && second % i == 0) {
                gcf = i;
            }
            i++;
        }

        return gcf;
    }
}
