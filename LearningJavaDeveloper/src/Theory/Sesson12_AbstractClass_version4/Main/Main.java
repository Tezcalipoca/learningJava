package Theory.Sesson12_AbstractClass_version4.Main;

import Theory.Sesson12_AbstractClass_version4.Data.Shape;

public class Main {
    public static void main(String[] args) {
        playWithAnonymousClass();
    }

    /*Kĩ thuật tạo obj/ vùng new mà không cần khuôn cụ thể dành cho những obj vô định hình, không có công thức cụ thể
    * để tính toán và nhân bản, không có khuôn cố định, cắt hình ngẫu nhiên, không biết nhóm con cụ thể nào cả nhưng
    * vẫn là hình: Có Color, Border, cạnh, bề mặt
    * Không có công thức tính chung, nhân bản lại được nhanh chóng
    * -> Obj vãng lai, không quen, không thường sử dụng
    * Dù là hình kiểu gì, công thức chung: super()(~new CHA(...)) + @Override cho tất cả các hàm của cha*/
    public static void playWithAnonymousClass(){
        Shape hinhVangLai = new Shape("Chính mình", "Blue", "Red") {
            // Cắt ngẫu nhiên nên không biết có bao nhiêu cạnh để đưa vào

            @Override
            public double getArea() {
                return 50;
                /* Vì hình cụ thể, không theo hình dạng nào, ta tự đo*/
            }

            @Override
            public double getPerimeter() {
                return 40;
            }

            @Override
            public void paint() {
                // Khai báo là con Main vẫn kế thừa như bth
                System.out.printf("|NGẪU NHIÊN|%-10s|%-10s|%-10s|%4.1f|\n", owner, color, borderColor, getArea());
            }
        };
        /* Mày là hình, thoải mái vào mảng Main sort nếu muốn
        * Mày vẫn là Main, kiểu Main, có đủ code cho hàm cha
        * Kĩ thuật này là mượn gió bẻ măng, mượn cha tạo con, mượn Main new CON
        * new Abstract class sẽ bung rộng màn hình gõ code Override
        * Thỏa công thức CON  = new CHA + @Override
        * Chỉ xài cách này nêu chỉ cần làm 1 obj ON THE GO, mà làm biếng làm khuôn con riêng lẻ, theo công thức nhân bản*/
        hinhVangLai.paint();
    }
}
