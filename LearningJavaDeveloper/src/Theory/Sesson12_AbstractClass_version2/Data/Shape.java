package Theory.Sesson12_AbstractClass_version2.Data;

public abstract class Shape {
    // Đặc tính của hình học là gì?
    protected String owner;
    protected String color;
    protected String borderColor; // Màu đường viền

    public Shape(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;
    }

    public Shape() {

    }

    public String getOwer() {
        return owner;
    }

    public void setOwer(String ower) {
        this.owner = ower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea(); // diện tích là khái niệm hen

    public abstract double getPerimeter(); // ý tưởng đo cạnh hen, từ từ tính

    public abstract void paint();
    // Vì thao tác vẽ mỗi hình là khác nhau, chưa kể in là khác nhau
    // Chuỗi in ra khác nhau Rectangle, Square, Triangle, ...
    // Diện tích tính toán khác nhau
}
