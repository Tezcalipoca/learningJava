package Theory.Sesson11_Inheritance_version3.Main;

import Theory.Sesson11_Inheritance_version3.Data.*;

public class Main {
    public static void main(String[] args) {
        playWithTriangle();
    }

    public static void playWithTriangle(){
        // Khai CHA new CHA (CHA cụ thể - concrete class) <> abstract class (trừu tượng)
        // gọi đúng chuẩn tên, TG là TG
        Triangle t1 = new Triangle("Chính", "pink", 3, 4, 5);
        t1.paint(); // hàm paint này của CHA

//        RightTriangle rt1 = new Triangle("Hạnh", "black", 3, 4); => Khai con new Cha -> Gãy
        // Khai CON new CON, gọi tên object đúng là nó, TGV là TGV
        RightTriangle rt1 = new RightTriangle("Hạnh", "black", 6, 8);
        rt1.paint(); // hàm paint này của CON

        // Khai CHA new CON, đọc kiểu IS-A, dùng 2 danh nghĩa, CON nhưng phiên bản CHA
        // TGV là một TG, nó vần là TGV như câu lệnh ngay trên.
        Triangle rt2 = new RightTriangle("Bình", "white", 6, 8 );
        // khai báo gì thì hành xử như thế, vì mình đặt tên cho obj kèm theo data type
        // obj sẽ thuộc nhóm gì, khuôn nào, theo khuôn
        // Theo khuồn nhìn hành xử, nhìn hàm
        rt2.paint(); // hàm paint này sẽ là của CON
        // Nếu hàm của CON trùng tên hàm của CHA thì CHA sẽ ngồi im để con lo -> Overide qua mặt cha
        // Khi con có hành động giống cha thì ưu tiên chạy cho con (hiện tượng qua mặt)
    }
}
