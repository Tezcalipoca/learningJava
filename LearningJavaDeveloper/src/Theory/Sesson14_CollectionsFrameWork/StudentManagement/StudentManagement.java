package Theory.Sesson14_CollectionsFrameWork.StudentManagement;

import Theory.Sesson14_CollectionsFrameWork.Data.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentManagement {
    public static void main(String[] args) {
//        playWithArrayList();
//        sortArrayListManually();
//        playWithSet();
        Student xxx = searchStudent("SE1234567");
        if (xxx != null) // null được quyền kết hợp với == và != để coi có trỏ đáy RAM không
            xxx.showProfile();
        else
            System.out.println("Not found");
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

    /* Một cái túi List CHA (Có nhiều con, có ArrayList, Vector, ...) có 1 cơ chế sort tự động QUA GỌI LỆNH các
    * thẻ bài/biến tham chiếu biến con trỏ bên trong. Cơ chế này thì phải xài interface (Comparable và Comparator - học sau).
    * Tuy nhiên, cuối cùng vẫn là so sánh và đảo thứ tự. Ta dùng trước cơ chế tự viết, so sánh và đổi thứ tự trỏ  */
    public static void sortArrayListManually(){
        List<Student> arr = new ArrayList<>(); /* new là có túi, có hành động, có chỗ chứa đồ*/
        Student binh = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);
       arr.add( new Student("SE123456", "AN NGUYỄN", 2003, 7.8));
       /* Mở khóa dây của giỏ, nhét một thẻ bài vào, thẻ bài ghi thông tin trỏ tới sinh viên AN NGUYỄN. thẻ bài này nằm
       * ở vị trí đầu tiên trong giỏ (0) ([0] trong mảng).
       * Bệnh nhân cứ nằm ở phòng, new nằm trong HEAP, thông tin bệnh nhân + số phòng ghi vào trong danh sách mà BS cầm
       * arr là cái túi, cái excel chứa tọa độ của bệnh nhân */
        arr.add(binh); // 1 thẻ bài được thêm vòa giỏ trỏ Binh
        arr.add(binh); /* add trùng, đã có trước đó 1 thẻ bài trỏ vào vùng new, thêm 1 thẻ bài nữa ghi info Binh */
        /* => Danh sách đếm 3 người nhưng có 1 người ghi trùng 2 lần.*/
        // IN DANH SÁCH
//        binh.setName("AHUHU");
        System.out.println("The Student List");
        for (Student x: arr
             ) {
            /* x = con trỏ/thẻ bài thứ 0, thẻ bài thứ 1, thẻ bài thứ n. x lưu tọa độ nằm trong thẻ bài thứ i, tức trỏ
            * vùng new thứ i */
            x.showProfile();
        }

//        LẤY TRỰC TIẾP TỪNG CON TRỎ, KHÔNG CHƠI TRÒ QUÉT FOR EACH ~ [i] bên mảng, vị trí thứ i, biến thứ i, chính là chứa trong đó tọa đô vùng new
        System.out.println("The Student List (printed by using fori)");
        for (int i = 0; i < arr.size() ; i++) {
//            Student tmp = arr.get(i); /*Trả về thẻ bài thứ i, chứa tọa độ new Student. Cất tọa độ này vào một biến Std khác oke*/
//            tmp.showProfile();
            arr.get(i).showProfile();
            /* Lấy thẻ bài thứ i trên đó có tọa độ, chấm luôn*/

        }
//        XÓA BÌNH CUỐI TRONG GIỎ, TỨC LÀ LOẠI BỎ HẲN ĐI 1 THẺ BÀI, BIẾN MẤT MỘT CON TRỎ LUÔN, SIZE() GIẢM 1 ĐƠN VỊ
        // Mảng không có trò này, xin bao nhiêu, fix bấy nhiêu
        arr.remove(2);
        System.out.println("The Last Student List (printed by using fori)");
        for (int i = 0; i < arr.size() ; i++) {
            arr.get(i).showProfile();
        }

        /* Thẻ bài 0 get(0) luôn có ghi trên thẻ bài info của SV an 7.8 ở xa */
        /* Thẻ bài 1 get(1) luôn có ghi trên thẻ bài info của SV binh 4.9 ở xa */
        /* Muốn sắp xếp tăng dần theo điểm -> phải đổi lại info trỏ, cách trỏ, ghi lại cái thẻ bài trỏ lại đi*/
        /* Thẻ bài 0 phải trỏ vào binh 4.9 */
        /* Thẻ bài 1 phải ghi lại trỏ, trỏ vào an 7.8 */
        /* [i] = [j] đổi info trỏ
        * hàm .set(thẻ nào vị trí thẻ bài, thông tin tọa độ mới)*/

        Student tmpStudent = arr.get(0); // Lấy tọa độ vùng new an 7.8 thảy vào tmp
        arr.set(0, arr.get(1)); // get(1) được tọa độ BINH 4.9, thảy tọa độ vào 0.
        arr.set(1, tmpStudent); // sửa đồng thời thẻ 1, trỏ vùng mới vùng tmp đang trỏ là vùng an 7.8

        System.out.println("The student list sorting ascending by gpa");
        for (int i = 0; i < arr.size() ; i++) {
            arr.get(i).showProfile(); // Binh -> an, 4.9 -> 7.8
        }
    }

    public static void playWithSet(){
        /* Set: Collection hàng hiệu, mỗi món một lần tính, xuất hiện 1 lần
        * Không có 2-n thẻ bài trong giỏ cùng trỏ 1 vùng new, mỗi thẻ bài trong giỏ này trỏ duy nhất 1 vùng new
        * Set chia thành 2 loại giỏ nhỏ hơn:
        *   - HashSet: Đồ đưa vào lộn xộn thứ tự, arrayList đưa vào giữ nguyên thứ tự, vào ra đúng thứ tự
        *   - TreeSet: Đồ đưa vào tự động sắp xếp*/
        Set<Student> arr = new HashSet<>();
        Student binh = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);
        arr.add( new Student("SE123456", "AN NGUYỄN", 2003, 7.8));
        arr.add( new Student("SE123456", "AN NGUYỄN", 2003, 7.8));
        // Đây là vùng nhớ mới, chưa có ai trỏ, không quan tâm nội dung trùng bên trong, vùng RAM này khác hoàn toàn vùng RAM ở trên
        arr.add(binh);
        arr.add(binh); // add trùng, có 1 thẻ bài đã trỏ binh 4.9 trước rồi
        // Âm thầm loại bỏ add trùng
        // vào và ra không theo đúng thứ tự, add() vào thì oke nhưng không có hàm get() ra
        // Muốn lấy thông tin trong Set chỉ còn cách lấy Foreach lấy ra hết
        System.out.println("Student list");
        for (Student x : arr
             ) {
            x.showProfile();
        }
    }

    /*TÌM KIẾM 1 SINH VIÊN MỚI, HÀM TRẢ VỀ OBJ - 7 VIÊN NGỌC RỒNG
    * ĐỌC ĐÚNG: HÀM TRẢ VỀ THAM CHIẾU ĐẾN 1 VÙNG NEW
    *           HÀM TRẢ VỀ CÁI THẺ BÀI, BÊN TRÊN CÓ KHẮC TỌA ĐỘ VÙNG NEW
    *           HÀM TRẢ VỀ ĐỊA CHỈ OBJECT NEW ĐANG NẰM */

    public static Student searchStudent(String id){ // tên hàm là một tọa độ searchStudent()
//              ~ Student x, cần một tọa độ new Student
        /* Mò trong ArrayList, mảng [] để lấy được cái thẻ bài, thảy ra ngoài hàm tọa độ ghi trong thẻ bài, chính là
        * tọa độ trỏ đến OBJ */
        List<Student> arr = new ArrayList<>();
        Student binh = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);
        arr.add(new Student("SE1234567", "AN NGUYỄN", 2003, 9.0));
        arr.add(binh);

         /*quét đầu giỏ tới cuối giỏ, lôi từng thẻ bài ra, get(i), hỏi tiếp ê mày, mssv là mấy, get(i).getId()
         * if(id cần tìm ==  id vừa lấy ra), return thẻ bài khớp info, return tọa độ ghi trong thẻ bài, return vùng
         * new Sinh viên tìm thấy*/
        Student tmp = arr.get(0);
        String idTmp = tmp.getId(); //tmpId = arr.get(0).getId()
//        if (idTmp == id) thì return, không thấy thì return null
        if (idTmp.equalsIgnoreCase(id))
            return tmp; //Trả về tọa đồ vùng new trong thẻ bài 0
        return null;
    }
}
