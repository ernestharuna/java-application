package Shapes;

public class Circle extends TestShapes {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }

    public static void main(String[] args) {

    }
}
