package Theory.Sesson14_CollectionsFrameWork_version2.Main;

import Theory.Sesson14_CollectionsFrameWork_version2.Data.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        sortStudentList();
        List<Student> arr = initData(); // arr here trỏ thẳng vào túi có 5 sinh viên
//        System.out.println("The student list");
//        for (Student x: initData()
//             ) {
//            x.showProfile();
//        }
//        for (Student x: arr
//             ) {
//            x.showProfile();
//        }
        Student x = searchAStudent(arr, "SE888888");
        if (x == null)
            System.out.println("Not found!!!");
        else{
            x.showProfile();
            /* Nếu tìm thấy sẽ update dữ liệu luôn, sửa điểm bạn TÁM thành 6789*/
            x.setGpa(6.789);
        }
        System.out.println("The student list after updating SE8");
        for (Student xxx:arr
             ) {
            xxx.showProfile(); // 8.8 thành 6.789
        }
    }

    /*--- CÁC HÀM XỊN SÒ, SORT, SEARCH, CHUẨN BỊ KHO DATA
    * 3 hàm này đều là static cho mục tiêu thử nghiệm, chưa có tư duy OOP
    * tư duy OOP là: các hàm nằm trong Object nào đó
    *                chế tạo cái tủ, thùng chứa mà trong đó các hành động thêm, xóa, tìm,  */
    public static void sortStudentList(){
        /* Cần chuẩn bị danh sách sinh viên:
        *       - mua cái túi -> new Túi(...)
        *       - có các hồ sơ sinh viên -> new SinhVien(...) */
        List<Student> arr = new ArrayList<>();
        arr.add(new Student("SE555555", "NĂM LÊ", 2003, 5.5));
        arr.add(new Student("SE999999", "CHÍN PHẠM", 2003, 9.9));
        arr.add(new Student("SE444444", "BỐN VÕ", 2003, 4.4));
        arr.add(new Student("SE222222", "HAI TRẦN", 2003, 2.2));
        arr.add(new Student("SE888888", "TÁM LÝ", 2003, 8.8));
        /* -> Túi đang chứa 5 thẻ bài, 5 biến con trỏ, thông tin trên thẻ bài là địa chỉ vùng new Student nằm trên HEAP
        * bệnh nhân cứ nằm phòng bệnh, bác sĩ giữ danh sách Ex. Bác sĩ nhìn danh sách, thấy số phòng - địa chỉ phòng
        * từng bệnh nhân.
        * -> Thẻ bệnh nhân 1, thẻ bệnh nhân 2, ... chính là biến con trỏ, trên đó có địa chỉ OBJ ~ get(i) - lấy thẻ */
        System.out.println("The Student list before sorting ascending by gpa: ");
        for (Student x:arr
             ) {
            x.showProfile(); // x = arr.get(i) -> Lấy tọa độ địa chỉ ghi trên thẻ thứ i cất vào x.
        }

        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).getGpa() > arr.get(j).getGpa()){
                    Student studentTmp = arr.get(i); //Cất tọa độ bạn i
                    arr.set(i, arr.get(j)); // Thẻ, card i khắc lại địa chỉ j
                    arr.set(j, studentTmp); // Thẻ j khắc lại địa chỉ thẻ i
                }
            }
        }

        System.out.println("The Student list after sorting ascending by gpa: ");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
    }

    /* HÀM CHUẨN BỊ DATA. HÀM TRẢ VỀ MỘT CÁI TÚI/ARRAYLIST/DS SINH VIÊN.
    * ĐỌC ĐÚNG: HÀM TRẢ VỀ 1 TỌA ĐỘ VÙNG NEW ARRAYLIST, MÀ BÊN TRONG CÓ SẴN MỘT ĐỐNG THẺ GHI ĐỊA CHỈ SINH VIÊN
    * -> HÀM TRẢ VỀ VỊ TRÍ 1 CÁI NÚT CÓ SẴN RỒI.TRONG TÚI CÓ DANH SÁCH CÁC THẺ GHI ĐỊA CHỈ CỦA VÙNG NEW SINH VIÊN*/
    public static List<Student> initData(){
//                List<Student> arr; = new cái gì đó
//                              initData = new ArrayList nào đó
        List<Student> arr = new ArrayList<>();
        arr.add(new Student("SE555555", "NĂM LÊ", 2003, 5.5));
        arr.add(new Student("SE999999", "CHÍN PHẠM", 2003, 9.9));
        arr.add(new Student("SE444444", "BỐN VÕ", 2003, 4.4));
        arr.add(new Student("SE222222", "HAI TRẦN", 2003, 2.2));
        arr.add(new Student("SE888888", "TÁM LÝ", 2003, 8.8));
        return arr; // initData() = arr = new ArrayList()
        // Tên hàm cùng trỏ vào giỏ vừa new
    }
    public static Student searchAStudent(List<Student> arr, String id){
//         Hàm trả về giá trị thì tên hàm ~~ 1 giá trị. Ví dụ: double r = sqrt(4) -> sqrt(4) là một giá trị
//        ~~      Student        x      = new Student(...)
//                            -> Tên hàm là 1 biến sinh viên, tên hàm này cần trỏ một vùng new SV
//         arr trỏ một cái giỏ có sẵn, giỏ ArrayList new ở đâu, trong giỏ có gì không quan tâm
/*      Khi ta xài hàm này thì ta cần chuẩn bị giỏ ở một cái túi/giỏ ở đâu đó trước rồi, có đồ bên trong, đưa vị trí
        giỏ có sẵn đó vào hàm. Giống như y tá đưa bác sĩ danh sách bệnh nhân nằm sẵn ở các phòng*/
/*         Đưa mảng/túi arraylist có sẵn từ main vào hàm này. Nhưng như vậy thì không hay, lập trình là mọi thứ nằm trong
           hàm (C++), mà hàm thì nằm trong OBJECT -> OOP.
           BÀI NÀY ĐANG THỬ NGHIỆM, TA ĐƯA TOÀN BỘ DATA VÀO TRONG HÀM TRƯỚC -> HÀM CHUẨN BỊ DATA*/
        /* Xử lý hàm:
        *   - Rà qua các phần tử trong Giỏ/Mảng
        *   - Lôi từng thẻ/con trỏ để kiểm tra SV có id mấy -> (i).getId()
        *   - if (id mới tìm == id cần tìm đưa vào) return Tọa độ/Địa chỉ trên thẻ
        *   - Nếu không thấy thì return null -> tên hàm trỏ vào null, không tìm thấy Sinh viên, chấm thì bị Exception
        *                                                            vì sinh viên không tìm thấy thì chấm là vô nghĩa*/

        if (arr.isEmpty()) //đưa túi rỗng mới mua thì không có dữ liệu để search
            return null; // -> Cho tọa độ null
        for (int i = 0; i < arr.size() ; i++) {
            /* Lôi từng thẻ ra, hỏi id của mỗi sinh viên */
/*            Student t = arr.get(i);
            String tId = t.getId(); // Định luật bắt cầu arr.get(i).getId()
//            if (tId == id) // id vừa lấy của sinh viên bằng id đưa vòa thì return thông tin sinh viên đó
            if(tId.equalsIgnoreCase(id))
                return t; // arr.get(i);*/
            if(arr.get(i).getId().equalsIgnoreCase(id)) // .equals so sánh có phân biệt hoa thường
                return arr.get(i);
        }
        /* Đi hết for mà không return được, chắc chắn không thấy, return null*/
        return null;
    }

}
