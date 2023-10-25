package Theory.Sesson12_AbstractClass_version2.Data;

public class Rectangle extends Shape{
    protected double width, length;

    public Rectangle(String owner, String color, String borderColor, double width, double length) {
        super(owner, color, borderColor);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /* - Vì class này là HCN có rõ ràng 2 cạnh rất cụ thể, tính được ngay S, P, sợ gì không viết code.
     *  - Con phải có trách nhiệm hoàn tất những điều ba nói, viết code cho hàm abstract, vì nếu không làm thì nó VÔ SINH
     * không new được do không hoàn hảo. Ví dụ như new xong mà chấm getS() thi làm gì có code mà chạy.
     *  - Con hk muốn vô sinh thì phải viết code thay cho hàm abstract của cha
     * -> IMPLEMENT ALL OF PARENT'S ABSTRACT METHODS
     * Nguyên tắc: Ta không đem bán, sử dụng điều không hoàn hảo
     * implement the body of a function, the body of parent's abstract methods
     * Viết hàm cho cha -> @Override
     * - Phần dị biệt CON phải làm
     * BA: TAO CHỈ NÓI VẬY, MÀY MUỐN LÀM SAO THÌ LÀM, ĐÂY, CON LÀM NÈ*/
    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return (width + length)*2;
    }

    @Override
    public void paint() {
        System.out.printf("|RECTANGLE |%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|\n",
                owner, color, borderColor, width, length, getArea());
    }

}
