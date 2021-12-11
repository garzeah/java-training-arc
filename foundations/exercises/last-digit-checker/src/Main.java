public class Main {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9, 99, 19));
    }

    public static boolean isValid(int num) {
        return num >= 10 && num <= 1000;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if (!(isValid(num1) && isValid(num2) && isValid(num3))) return false;

        String str1 = Integer.toString(num1);
        String str2 = Integer.toString(num2);
        String str3 = Integer.toString(num3);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        return (
            (str1.charAt(str1.length() - 1) == str2.charAt(str2.length() - 1)) ||
            (str1.charAt(str1.length() - 1) == str3.charAt(str3.length() - 1)) ||
            (str3.charAt(str3.length() - 1) == str2.charAt(str2.length() - 1))
        );
    }
}
