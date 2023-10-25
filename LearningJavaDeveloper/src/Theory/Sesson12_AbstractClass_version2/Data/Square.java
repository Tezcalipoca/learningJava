package Theory.Sesson12_AbstractClass_version2.Data;

// Shape Ông nội, con HCN, cháu Square -> Cây gia phả
public class Square extends Rectangle {
    // Đoạn này học rồi, không cần khai báo gì thêm: V là HCN có 2 cạnh kề bằng nhau.
    // Muốn biến dị thì cứ làm, đã học ở bài Parent Child
    // Muốn in riêng, không muốn in chung với cha
    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    }

    // Muốn in riêng, không muốn in chung với cha

    @Override
    public void paint() {
        System.out.printf("|SQUARE    |%-10s|%-10s|%-10s|%4.1f| -  |%7.2f|\n",
                owner, color, borderColor, width, getArea());
    }

    public void sayHi(){
        System.out.println("Hello");
    }
}
