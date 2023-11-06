package Theory.Sesson14_CollectionsFrameWork.StudentManagement;

import Theory.Sesson14_CollectionsFrameWork.Data.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    public static void main(String[] args) {
        playWithArrayList();
    }

    public static void playWithArrayList() {
//        Student[] arr = new Student[500]; -> arr là 1 cái túi chứa sẵn 500 chỗ, 500 món đồ có thể bỏ vô
        // Món đồ phải đi mua, new, thảy vào. Tên mảng chính là má mì, quản lý nhiều đồ, tên túi luôn

//        List arr = new ArrayList<>(); -> Đựng lộn xộn đủ loại con trỏ, món gì cũng đựng (đựng tham chiếu)
//                                         nhét được SinhVien, GiangVien, Animal, Dog, ... -> Lộn xộn

        List<Student> arr = new ArrayList<>();
        /* 1. arr là cái túi chứa vô hạn chỗ, vô hạn con trỏ
         *  2. Túi đồng nhất chỉ lưu con trỏ Student
         *  3. Nhét đồng nhất món đồ mới dễ chấm chung, đa hình được*/

//        MỞ NGĂN TỦ, NHÉT ĐỒ VÔ
        // arr[i] = new Student(...); -> Mảng
        //  arr.add(new Student(...)); -> Lưu con trỏ thôi, new Student(...) thoải mái bên ngoài vùng HEAP
        Student s1 = new Student("SE123456", "AN NGUYỄN", 2003, 7.8);
        Student s2 = new Student("SE123457", "BÌNH LÊ", 2003, 9.0);
        arr.add(s1); // Giỏ vùng [ new ArrayList ], tủ có thêm 1 con trỏ, sinh ra 1 con trỏ
        arr.add(s2); // Sinh ra thêm con trỏ nữa,
        // add() vô tận, còn nếu là mảng thì chỉ đến [length-1] là hết mức
        arr.add(s1); // add trùng vào danh sách, 2 chàng 1 nàng
        // set không báo lỗi, nhưng chỉ lấy 1
        arr.add(new Student("SE999999", "CHÍNH NGUYỄN", 2003, 8.9));
        // new cứ nằm ở HEAP, sinh viên cứ ở nhà, công nhân cứ ở xưởng, bệnh nhân cứ ở phòng
        // add() mở khóa kéo, khóa dây, nhét đồ vô, nhét tham chiếu vô, sinh ra 1 con trỏ

//        HỎI XEM TÚI ĐANG CÓ BAO NHIÊU ĐỒ
//        arr.length() -> Mảng
        System.out.println("The bag has: " + arr.size() + " món đồ.");
        // 4 sinh viên in ra, nhưng thực ra chỉ có 3 sinh viên, do có người đếm trùng

//        IN MỌI NGƯỜI RA
        /* 1. Tủ có gì, chứa bên trong một đống con trỏ
        *  2. Mảng: [i].showProfile()
        *  3. Tủ ArrayList [con trỏ 1, con trỏ 2, con trỏ 3, con trỏ 4, ...]
        *  4. add() đẩy vào 1 con trỏ, tọa độ
        * 5. get(vị trí con trỏ muốn lấy), trả về tọa độ của con trỏ thứ i, trả về địa chỉ vùng new đang trỏ
        * 6. [i] lấy được tham chiếu bạn thứ i (Mảng)
        * 7. get(i) lấy được chỗ ngồi tham chiếu con trỏ thứ i*/

        //in bạn đầu tiên
//        arr[i].showProfile() phần tử đầu tiên của mảng
        Student xxx = arr.get(0); // trả về tọa độ con trỏ của bạn thứ 0, gán vào biến Student khác là oke.
        xxx.showProfile();
        // bạn 1 get(1), có tọa độ chấm luôn cho rôi, thêm biến con trỏ trỏ cùng làm gì?
        arr.get(1).showProfile();

//        IN XỊN XÒ
        System.out.println("In xịn sò");
        for (Student x: arr // khong sợ null pointer vì add() đến đâu thêm con trỏ đến đó
                //x = arr.get(i) = arr[i]
             ) {
            x.showProfile();
        }

        System.out.println("In xịn sò theo for truyền thống");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }

        /*CÓ HÀNH ĐỘNG XÓA 1 CON TRỎ, LOẠI BỎ 1 CON TRỎ, MÓN ĐỒ, GẠCH TÊN 1 NGƯỜI KHỎI DANH SÁCH
        * Vùng new Student() có bị mất hay không tùy vào mấy con trỏ trỏ nó
        * Khi xóa thì size() giảm liền, bên mảng bị không giảm được mà bị fix cứng số con trỏ.
        * set() đảo con trỏ, trỏ sang vùng khác (get() và set() xưa nay của các object)*/
    }
}
