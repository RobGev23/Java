public class Circle implements Area,Perimeter {
    private double pi = Math.PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return  pi * (radius * radius);
    }

    public double getPerimeter() {
        return 2 * pi * radius;
    }
}
