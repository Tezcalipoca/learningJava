package Theory.Sesson11_Inheritance_version3.Data;

public class Triangle {
    protected String owner;
    protected String color;
    protected double a, b, c;
    // Tam giác: Tổng 2 cạnh bất kì phải lớn hơn cạnh thứ 3


    public Triangle(String owner, String color, double a, double b, double c) {
        this.owner = owner;
        this.color = color;
        this.a = a;
        this.b = b;
        this.c = c;
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
    public String toString() {
        return "Triangle{" +
                "Chủ: '" + owner + '\'' +
                ", Màu sắc='" + color + '\'' +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
    // Có thể thay thế đoạn code sử dụng thư viện lombox

    // Các hàm tự code (hàm tự tui tạo):
    public double getPerimiter(){
        return a + b + c;
    }

    public double getArea(){
        double p = getPerimiter()/2;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }

    public void paint(){
        System.out.printf("|Triangle  |%-15s|%10s|%4.1f|%4.1f|%4.1f|%4.1f|%7.2f|\n",
                owner, color, a, b, c, getPerimiter(), getArea());
    }

}
