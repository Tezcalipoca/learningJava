package Theory.Sesson12_AbstractClass_version2.Data;

public class Triangle extends Shape{
    // Triangle hoàn toàn dị biệt với Main
    private double a, b, c;

    public Triangle(String owner, String color, String borderColor, double a, double b, double c) {
        super(owner, color, borderColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = getPerimeter()/2;
        return Math.sqrt(p * (p - a) * (p  - b) * (p - c)) ;
    }

    @Override
    public double getPerimeter() {
        return (a + b + c);
    }

    @Override
    public void paint() {
        System.out.printf("|TRIANGLE |%-10s|%-10s|%-10s|%4.1f|%4.1f|%4.1f|%7.2f|\n",
                owner, color, borderColor, a, b, c, getArea());
    }
}
