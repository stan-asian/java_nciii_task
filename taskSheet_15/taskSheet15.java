package taskSheet_15;

public class taskSheet15 {

    public static void main(String[] args) {
        Circle c = new Circle("pink", 10);
        Rectangle r = new Rectangle("red", 15, 15);

        System.out.println("CIRCLE");
        System.out.println(c.calculateArea());
        System.out.println(c.calculatePerimeter());
        System.out.println("RECTANGLE");
        System.out.println(r.calculateArea());
        System.out.println(r.calculatePerimeter());
    }

}

interface Shape {
    double calculateArea();

    double calculatePerimeter();
}

abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return 0.0;
    }

    public double calculatePerimeter() {
        return 0.0;
    }
}

class Circle extends AbstractShape {
    int radius;

    public Circle(String color, int radius) {
        super(color, 0.0, 0.0);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (Math.PI * radius);
    }

}

class Rectangle extends AbstractShape {

    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        if (length == width) {
            System.out.println("Square");
        }
        return 2 * calculateArea();
    }

}
