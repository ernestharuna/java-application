package Shapes;

public class Rectangle extends TestShapes {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.breadth = breadth;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle with breadth " + breadth + " and length " + length;
    }
}
