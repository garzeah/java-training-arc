import java.lang.Math;

public class Point {
    private int x;
    private int y;

    public Point () {
        this(0, 0);
    }

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX () {
        return this.x;
    }

    public int getY () {
        return this.y;
    }

    public void setX (int x) {
        this.x = x;
    }

    public void setY (int y) {
        this.y = y;
    }

    public double distance () {
        return Math.sqrt(
            ((0 - this.getX()) * (0 - this.getX())) +
            ((0 - this.getY()) * (0 - this.getY()))
        );
    }

    public double distance (int x, int y) {
        return Math.sqrt(
            ((x - this.getX()) * (x - this.getX())) +
            ((y - this.getY()) * (y - this.getY()))
        );
    }

    public double distance (Point B) {
        return Math.sqrt(
            ((B.getX() - this.getX()) * (B.getX() - this.getX())) +
            ((B.getY() - this.getY()) * (B.getY() - this.getY()))
        );
    }
}
