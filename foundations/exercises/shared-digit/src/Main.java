public class Main {
    public static void main(String[] args) {

    }

    public static boolean hasSharedDigit(int num1, int num2){
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) return false;

        String str1 = Integer.toString(num1);
        String str2 = Integer.toString(num2);

        for(int i = 0; i < str1.length(); i++){
            char elem1 = str1.charAt(i);
            for(int j = 0; j < str2.length(); j++){
                char elem2 = str2.charAt(j);
                if (elem1 == elem2) return true;
            }
        }

        return false;
    }
}
