abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    double radius = 5;

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    double a = 3;
    double b = 4;
    double c = 5;

    double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    double calculatePerimeter() {
        return a + b + c;
    }
}

public class Q7Shape {
    public static void main(String[] args) {
        Circle c = new Circle();
        Triangle t = new Triangle();

        System.out.println("Circle Area = " + c.calculateArea());
        System.out.println("Circle Perimeter = " + c.calculatePerimeter());
        System.out.println("Triangle Area = " + t.calculateArea());
        System.out.println("Triangle Perimeter = " + t.calculatePerimeter());
    }
}
