package Theory.Sesson11_Inheritance.Craftsman;

import Theory.Sesson11_Inheritance.Data.Rectangle;
import Theory.Sesson11_Inheritance.Data.Circle;
import Theory.Sesson11_Inheritance.Data.Square;

public class Craftsman {
    public static void main(String[] args) {
//        cutShape();
        sortShapes();
    }

    public static void cutShape(){
        Rectangle r1 = new Rectangle("Chính","black",1.0, 2.0);
        r1.paint();
        Square s1 = new Square("Chính", "blue", 3.0);
        s1.paint();

        Circle c1 = new Circle("Chính", "red", "<3", 3.0);
        c1.paint();
    }

    public static void sortShapes(){
        Rectangle r1 = new Rectangle("Chính","black",1.0, 2.0);
        Rectangle rectangle[] = new Rectangle[9];
        // Có 9 biến, bàn có 9 chỗ ngồi, nhưng chưa có ai ghé/chưa có object cụ thể
        rectangle[0] = r1; // 2 biến object trỏ vào cùng một vùng new -> Chứng minh:
//        rectangle[0].paint();
//        rectangle[0].setOwner("Hanh");
//        r1.paint();
        rectangle[1] = new Rectangle("Hanh","pink",2.0, 3.0);
        rectangle[2] = new Rectangle("An","blue",2.0, 2.0);

        //rectangle[3] = new Square("Chính", "black", 3.0);
        /*Mảng là kĩ thuật khai báo các biến cùng kiểu, Hình vuông và Hình CN khác kiểu nên không thể nào vào chung 1
        mảng. Về lý thuyết: Chỉ sắp xếp CN, V, T riêng không sort chung được vì khác data type, không chung mảng
        không sort chung được*/
        System.out.println("Before softing");
//        for (Rectangle x: rectangle) { // x chạy từ 0 -> rec.length => Gây ra null pointer
//            x.paint();
//        }
        for (int i = 0; i < 3; i++) {
            rectangle[i].paint();
        }

        for (int i = 0; i < 3-1; i++) { //  selection sort: vòng ngoài Lấy tới áp chót
            for (int j = i+1; j < 3; j++) {
                if (rectangle[i].getArea() > rectangle[j].getArea()){
                    Rectangle t = rectangle[i];
                    rectangle[i] = rectangle[j];
                    rectangle[j] = t;
                }
            }
        }
        System.out.println("After sorting ascending by area");
        for (int i = 0; i < 3; i++) {
            rectangle[i].paint();
        }
    }

    //rectangle[3] = new Square("Chính", "black", 3.0);
        /*Mảng là kĩ thuật khai báo các biến cùng kiểu, Hình vuông và Hình CN khác kiểu nên không thể nào vào chung 1
        mảng. Về lý thuyết: Chỉ sắp xếp CN, V, T riêng không sort chung được vì khác data type, không chung mảng
        không sort chung được*/

    /*Vậy ta giả sử sẽ có một datatype như nào đó, dạng
    ??? arr[] = new ??? [9];
    arr[0] = new Square(...);
    arr[1] = new Rectangle(...);
    ....
    => Như vậy ta mới có thể for được, sort được.*/
    /* Vậy Vuông, Chữ nhật chung mảng của ai?*/

    /* Object -> chung 1 mức Class/Khuôn có 1 mức nhận thức, thiết kế
    * - nhưng ta thấy Khuôn A, khuôn B, khuôn C lại có nét tương đồng, ví dụ ca sĩ và diễn viên đều có đặc điểm chung là
    *   tên, và tuôi
    * - Đứng trên vai người khổng lồ: Có sẵn rồi, làm thêm cho hay, phát huy thêm, ai đó dọn đường, ta đi tiếp
    * - Đừng làm lại cái bánh xe: kế thừa cái sẵn, làm tiếp cái mới
    * - Phiên bản limited, phiên bản đặc biệt, bản "độ" từ xe máy kỉ niệm 20 năm thành lập, thay tem
    * => Ngầm hiểu 1 câu chuyện, từ cái có sẵn, ta làm ra cái mới, một phiên bản mới từ cái cũ, cần có cái sẵn, nền để
    *   ta đi tiếp
    * => Chế tạo món mới từ món cũ, độ, điều chỉnh một chút ít, để ta có sản phẩm nhanh
    * Muốn có object ta cần khuôn X, khuôn X làm từ đầu thì mắc công, ta độ từ khuôn Y nào đó
    * -> Khuôn X là một bản điều chỉnh từ khuôn Y, có nguồn gốc, có dính dáng từ ... dung lại ưu thế, thứ có sẵn từ Y*/
}
