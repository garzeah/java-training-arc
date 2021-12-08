import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {}

    public static double area(double radius) {
        if (radius < 0) { return -1.0; }

        return radius * radius * PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) { return -1.0; }

        return x * y;
    }
}
