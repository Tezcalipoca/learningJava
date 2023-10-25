package Theory.Sesson11_Inheritance_version2.Data;

public class Circle {
    private String owner;
    private String color;
    private String smile;
    private double radius;

    public Circle(String owner, String color, String smile, double radius) {
        this.owner = owner;
        this.color = color;
        this.smile = smile;
        this.radius = radius;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
    public String toString() {
        return "Circle{" +
                "owner='" + owner + '\'' +
                ", color='" + color + '\'' +
                ", smile='" + smile + '\'' +
                ", radius=" + radius +
                '}';
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
    public void paint(){
        System.out.printf("|Circle    |%-15s|%10s|%4.1f| -  |%7.2f|\n",
                owner, color, radius, getArea());
    }
}
