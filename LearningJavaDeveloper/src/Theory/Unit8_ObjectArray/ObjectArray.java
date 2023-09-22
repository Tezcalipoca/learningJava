package Theory.Unit8_ObjectArray;

public class ObjectArray {
    public static void main(String[] args) {
        playWithObjectArray();
    }
    public static void playWithAnObject(){
        /* Muốn lưu hồ sơ 1 sinh viên cần 2 thứ:
            - Biến con trỏ/refrence
            - Vùng new clone đổ giá trị vào hàm constructor */
        /* Muốn lưu một giá trị bình thường, ta cần 2 thứ:
        *   - Biến primitive
        *   - Value đơn*/
        int a = 100;
        Student x; //em với thầy cùng nói xấu 1 đứa kia -> Chưa có giá trị thì chưa biết là vùng nào
        // x.showProfile(); -> báo lỗi vì x chưa được đổ thông tin, tuy nhiên vẫn chấm được vì đã là object thì phải
        //                      thế nào cũng phải có thông tin, nhưng chưa biết là object nào với thông tin gì. Ví dụ:
                                // Sinh viên nào cũng phải có thông tin, hay công dân  nào cũng phải có CCCD
        x = new Student("N19DCCN024", "Nguyễn Bảo Chính", 2001, 6.67);
        Student y = x;
        x.showProfile(); // -> Không còn báo lỗi vì đã được đổ thông tin đầy đủ
        x.showProfile();
        y.showProfile();
        Student z = new Student("N19DCCN024", "La Ngọc Hạnh", 2002, 9.8);
        z = null; // Trỏ vùng đáy RAM (vùng null), gán địa chỉ 0 vào biến con trỏ, biến con trỏ lưu tọa độ đáy RAM, byte null
        /*----------------- VÙNG NULL ---------------------
         * 1. Trong RAM, byte đầu tiên/byte thứ 0 gồm các transitor luôn luôn có giá trị là 0, tức là không có dữ liệu để xử
         * lý, do đó Java sẽ báo lỗi. byte này còn gọi là byte null
         * 2. Trỏ vào null là một kĩ thuật để cắt con trỏ. Khi ta muốn cắt con trỏ muốn trỏ vào một vùng RAM nhưng không
         * muốn new một vùng RAM mới, thì trỏ null là một cách để cắt con trỏ mà không tốn vùng RAM
         * Ví dụ: ta không muốn x tiếp tục trỏ vào "Nguyễn Bảo Chính" nhưng cũng không muốn new một vùng mới là "La Ngọc Hạnh",
         * thì ta sẽ dùng cách x = null.*/
        // z.showProfile(); -> báo lỗi vì đang trỏ vào vùng RAM, không có chứa thông tin
    }

    public static void playWithObjectArray(){
        /* Giả sử muốn lưu hồ sơ 50 sinh viên, cần:
        *       - 50 biến/tên tắt
        *       - 50 value - 50 vùng new */
        Student s[] = new Student[50]; // 50 biến sinh viên, chưa có value, chưa có object thực
                                        // s[0],s[1], s[2], ... ~~ như khai báo lẽ từng biến
        // s. sẽ sổ ra lenght()
        // s[0]. sẽ sổ ra showProfile(), vì là biến sinh viên
        // s[0] = 100; -> Báo lỗi vì s[0] là biến object, không phải biến Primitive
        s[0] = new Student("N19DCCN024", "Nguyễn Bảo Chính", 2001, 6.67);
        s[1] = new Student("N19DCCN024", "Nguyễn Bảo Chân", 1993, 9.8);
        s[2] = new Student("N19DCCN024", "Nguyễn Văn Chí", 1974, 10.0);

        System.out.println("The Student list: ");
        s[0].showProfile();
        s[1].showProfile();
        s[2].showProfile();
        for (int i = 0; i < s.length ; i++) {
            s[i].showProfile();
            // sinh viên X showProfile();

        }
        // Những biến sinh viên còn lại (từ s[3] -> s[49]) Giá trị default là null
        // Những biến object/ biến reference không được gán giá trị thì nó trỏ về đáy RAM (byte null)
        // => Nguyên tắc khi dùng mảng Object cấm tuyệt đối for hết nếu mảng chưa được gán full vì phần chưa được gán value
        //      trỏ vào null
        // MẢNG OBJECT BẮT BUỘC PHẢI FOR ĐẾN COUNT LÀ SỐ PHẦN TỬ ĐÃ GÁN
    }
}
