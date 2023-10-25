package Theory.Sesson11_Inheritance_version2.Data;

// OOP: Object Oriented Programing/Paradigm
public class Rectangle {
    protected String owner; //__________
    protected String color; //__________
    protected double width; //__________
    private double length; //__________

    //area được tính toán bởi những đặc tính khác, area -> derived attribute/field (đặc điểm/đặc tính dẫn xuất)
    // ví dụ soLuong * donGia = trị giá
    // age = current year(2023) - yob
    // Khi chơi với field dẫn xuất, coi chừng tính bất đồng bộ, inconsistency (dữ liệu không nhất quán)
    // dữ liệu không nhất quán: đổ qua phễu w 5, l 10, area = 300
    // nếu không đổ từ phễu, ghi area = w * l lúc khai báo, nhưng khi ta cập nhật lại W (cạnh mới)
    //mà quên cập nhật lại S => toang

    // bản chất: area là liên quan tới tính toán, không có sẵn
    // tức là hàm xử lý data, 

    // Nếu ta xem S là đặc điểm của miếng đất hoặc hình chữ nhật, không sai nhưng

    public Rectangle(String owner, String color, double width, double length) { //area
        this.owner = owner;                                                     // kiểm tra tương thích
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
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

    @Override
    public String toString() {
        return "Rectangle{" +
                "owner='" + owner + '\'' +
                ", color='" + color + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
    // hàm trả về giá trị nên ưu tiên được sử dụng để reuse ở các câu lệnh khác
    public double getArea(){
        return width * length;
    }
    public void paint(){
        System.out.printf("|RECTANGLE |%-10s|%-10s|%4.1f|%4.1f|%7.2f|\n",
                owner, color, width, length, getArea());
    }
}
