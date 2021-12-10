public class Main {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(44));
    }

    public static int sumFirstAndLastDigit(int num){
        if (num < 0) return -1;

        String numStr = Integer.toString(num);
        int first = Character.getNumericValue(numStr.charAt(0));
        int last = Character.getNumericValue(numStr.charAt(numStr.length()- 1));

        return first + last;
    }
}
