package Theory.Sesson12_AbstractClass_version2.Data;

public class Circle extends Shape {
    public static final double PI = 3.14;
    private String smile;
    private double radius;

    public Circle(String owner, String color, String borderColor, String smile, double radius) {
        super(owner, color, borderColor);
        this.smile = smile;
        this.radius = radius;
    }

    public String getSmile() {
        return smile;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2*PI+radius;
    }

    @Override
    public void paint() {
        System.out.printf("|CIRCLE    |%-10s|%-10s|%-10s|%4.1f|%7.2f|\n",
                owner, color, borderColor, radius, getArea());
    }
}
