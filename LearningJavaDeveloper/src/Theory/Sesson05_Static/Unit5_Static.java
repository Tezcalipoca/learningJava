package Theory.Sesson05_Static;

import ptit.util.MyToys;
// Giống như Java.Utils.Scanner
public class Unit5_Static {
    // Ở thư mục ptit.util -> My Toys
    public static void main(String[] args) {
        //  Ghi chú về Static
        /* Vùng nhớ static dùng chung cho các Object - giống như WC tập thể
        * - Object nào phía trên kia cũng nghĩ là của "riêng mình" nhưng thực ra là của cả Họ class.
        * - Mọi object tặng để xài chung cho cả họ, nên biến/hàm ở vùng này thuộc LEVEL CLASS, thuộc về mức CLASS.
        * - Vì chung cho cả họ, nên nếu cần dùng thì phải qua CLASS chấm trực tiếp, vì đây là dùng chung, không dùng
        * chung được cho riêng object nào.
        * ví dụ: Student.name, Student.sayHi()
        * - Dùng qua tên/biến object chấm thì không sai nhưng không nên tại vì đây là đã dùng chung
        * ví dụ: an.name, an.sayHi() không đúng, tuy không lỗi nhưng không nên theo kiểu này
        * - STATIC CHỈ DÙNG VỚI STATIC.
        * - Vùng static chung cho mọi Object, cho nên giá trị của vùng này chung cho tất cả Object hiện tại và tương lai.
        * - Dùng STATIC cho những gì không của riêng Object mà là của cả họ.
        * - Nên dùng Static cho những gì tiện ích/Utility/Helper chỉ cần một vùng RAM với mục đích cung cấp
        * dịch vụ/service cho các Object khác.
        */

        // Ghi chú về Non-static
        /* - Đây là vùng nhớ riêng của từng OBJECT - WC riêng
        * - Thuộc OBJECT LEVEL, thuộc về mức Object
        * - Non-static dùng với Non-static vì cùng một khu vực RAM, cùng Object
        * - Non-static chơi luôn với Static vì vẫn nghĩ là của mình (giống việc mình có quyền xài WC công cộng)
        * - Dùng non-static cho những gì thuộc riêng object, đặc điểm riêng của từng object
        * - Bạn không muốn toàn bộ sinh viên cùng tên, cùng năm sinh khi xài các đặc điểm name, yob là static,
        * hậu quả là thông tin ăn theo người cuối cùng được tạo ra, do chỉ có chung 1 vùng RAM cho các name, yob, ...
        * mà đáng lẽ của riêng từng ai đó, từng object sinh viên. */
        System.out.println("PI: " + MyToys.PI);
        MyToys.PI = 4.0;
        System.out.println("PI again: "+MyToys.PI);
        // *final thì sẽ không cho sửa
        // Nhập từ bàn phím
        int length = MyToys.getAnInteger("Nhập chều dài: ");
        int width = MyToys.getAnInteger("Nhập chều rộng: ");
        System.out.println("chiều rộng: "+width);
        System.out.println("chiều dài: "+length);
    }
}
