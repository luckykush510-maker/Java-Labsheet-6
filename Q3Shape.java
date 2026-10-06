class Shape {
    double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    double getArea() {
        return length * width;
    }
}

public class Q3Shape {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println("Area = " + r.getArea());
    }
}
