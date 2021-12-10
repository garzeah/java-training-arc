public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(101));
    }

    public static boolean isPalindrome(int number) {
        String str = Integer.toString(Math.abs(number));

        for (int i = 0; i < str.length(); i++) {
            char charNumStart = str.charAt(i);
            char charNumEnd = str.charAt(str.length() - 1 - i);

            if (charNumStart != charNumEnd) return false;
        }

        return true;
    }
}
