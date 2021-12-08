public class Main {
    public static void main(String[] args) {}

    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public static boolean isTeen(int teenAge){
        return teenAge >= 13 && teenAge <= 19;
    }
}
