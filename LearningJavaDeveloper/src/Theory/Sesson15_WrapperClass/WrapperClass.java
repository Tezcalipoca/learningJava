package Theory.Sesson15_WrapperClass;

public class WrapperClass {
    public static void main(String[] args) {
//        playWithInteger();
//        playWithPointers();
        platWithPool();
    }



    public static void playWithInteger(){
        int n1 = 2003; // 4 byte thôi
        Integer n2 = new Integer("2003"); // Tốn 2 vùng RAM
        Integer n3 = new Integer(2003); // Tốn 2 vùng RAM
        Integer n4 = 2003; // new ngầm, vẫn 2 vùng ram. Cách này tự nhiên hơn, nhưng vẫn phải new ngầm.
        /* n2, n3, n4 trỏ 3 vùng ram new Integer, lõi vùng new là int 2003 */
        // IN THÌ SAO?
        System.out.println("n1: " + n1); // primitive, xài luôn
        System.out.println("n2: " + n2); // Gọi thầm tên em
        System.out.println("n3: " + n3.toString()); //
        System.out.println("n4: " + n4.intValue()); // getAnInteger(), getADouble();

        Integer n5 = n1; // -> Tương tự như câu dưới, CPU xử lý như nhau, new ngầm Integer, nhét vào trong lõi Integer
        // Integer n5 = 2003 // vùng new, con số int 2003  core/lõi
        /* CƠ CHẾ BOXING/ĐÓNG HỘP/WRAPPING: KHI TA GÓI CÁI PRIMITIVE -> OBJECT*/
        System.out.println("n5: " + n5); // Gọi thầm tên em

//        int n6 = 2001; -> primitive như bình thường
        int n6 = n5; // á đù, chuyện gì
        /* -> UNBOXING/MỞ HỘP: khi ta mở hộp, lấy value lõi gán ra primitive, vẫn tương thích, phù hợp.
        * UNBOXING: OBJECT -> PRIMITIVE*/
        System.out.println("n6: " + n6);

//        Integer n5 = n1; // TRỎ VÙNG NEW 2003 RIÊNG CỦA NÓ
        n5 = 2000; // Điều gì diễn ra trong ram?
        /* -> Xuất hiện vùng new mới (lõi là 2k), không quan tâm vùng new cũ (lõi 2003). Khác với yob = 2003; yob = 2000
        * vẫn là vùng ram cũ, ON-OFF lại
        * => Vậy Integer không có khái niệm set(), tức là mỗi lần gán value là 1 vùng new mới, không xài vùng new cũ.
        *    Vậy tức là không có cơ chế set() lại cái gì đã new. Không cho phép thay đổi value của lõi, READ-ONLY.
        * => Integer chỉ có hàm get() không có hàm set()
        * => MỘT CLASS NÀO KHÁC, KỂ CẢ INTEGER MÀ CHỈ CÓ HÀM GET(), KHÔNG CÓ HÀM SET() (HÀM THAY ĐỔI GIÁ TRỊ BÊN TRONG)
        *    NGOẠI TRỪ LÚC ĐÚC - CLASS READ-ONLY - THÌ CLASS NÀY GỌI LÀ IMMUTABLE CLASS. NGƯỢC LẠI CLASS NÀO THAY ĐỔI
        *    VALUE ĐÃ ĐƯỢC ĐÚC, GỌI LÀ MUTABLE CLASS*/

        /* Có tổng cộng 8 cái WRAPPER/TRAI BAO CLASS ỨNG VỚI 8 THẰNG PRIMITIVE:
        *   - byte -> Byte
        *   - short -> Short
        *   - int -> Integer
        *   - long -> Long
        *   - float -> Float
        *   - double -> Double
        *   - boolean -> Boolean
        *   - char -> Character*/
    }

    public static void playWithPointers(){
        int n0 = 2003;
        int n00 = 2003;
        /* Hỏi: n0 có bằng n00 không?
        * Trả lời: Primitive nên giá trị n0 và n00 hoàn toàn bằng nhau */
        if (n0 == n00)
            System.out.println("2 thằng n0 và n00 bằng nhau");
        else
            System.out.println("2 thằng n0 và n00 không bằng nhau");

        Integer n1 = new Integer("2003");
        Integer n2 = new Integer(2003); // Không khuyến khích
        Integer n3 = 2003; // Khuyến khích
        Integer n4 = 2003;

        /* Hỏi: n3 có bằng n4 không?
        * Trả lời: So sánh 2 tọa độ, 2 địa chỉ vùng new khác nhau nên không bằng nhau
        *          So sánh 2 biến con trỏ, giống như đi so sánh 2 số nhà -> Không bằng nhau
        */
        if (n3 == n4)
            System.out.println("2 thằng n3 và n4 bằng nhau");
        else
            System.out.println("2 thằng n3 và n4 không bằng nhau");
        /* Tuy nhiên, bản chất lõi của n3 và n4 là bằng nhau.
        * -> Không được dùng các toán tử so sánh truyển thống: >, >=, ==, <=, < khi so sánh 2 biến con trỏ.
        * -> Muốn so sánh 2 biến, không nên, mà phải vào bên trong vùng trỏ đó coi có value gì để so sánh mới hợp lí.
        * Ví dụ: An và Bình cùng trong 1 lớp học, nếu nói An bằng Bình, An nhỏ hơn Bình là vô nghĩa. Mà phải dùng đặc
        * điểm để so sánh, ví dụ cân nặng của An bằng cân nặng của Bình, An có điểm cao hơn Bình, Bình có tài sán nhiều
        * hơn An.
        * -> n3 ơi, m có value gì vậy, tao muốn so sánh với value của n4 -> Đi vào vùng new và so sánh.
        * => So bên trong vùng new mới đúng, vì so sánh đặc điểm, chứ không so nick name
        *
        * Đi vào vùng new tức là phải chấm (.) để lấy value lõi, câu hỏi euquals(), compareTo()
        * n3. ; n4.
        * (?) Việc so sánh nên diễn ra ở đâu - hàm so sánh đặt ở đâu?*/
        System.out.println("n3 với n4 (core): " + n3.equals(n4));
        System.out.println("n3 với n4 (core): " + n3.compareTo(n4));
        Integer n5 = 2001;
        Integer n6 = 2003;
        System.out.println("n5 với n6 (core): " + n5.equals(n6));
        System.out.println("n5 với n6 (core): " + n5.compareTo(n6));
    }

    /* Pool - là 1 vùng ram chứa các obj, chứa các vùng new của Wrapper, String, giống HỒ BƠI ngoài đời, nhiều obj tắm
    * chung. Chỉ áp dụng cho String và Wrapper, và chỉ áp dụng trong một số trường hợp đặc biệt*/
    public static void platWithPool(){
        Integer n1 = new Integer("2000");
        Integer n2 = new Integer(2000); // ít dùng, từ JDK10 trở lên không nên -> boxing
        Integer n3 = 2000; // -> boxing
        Integer n4 = 2000;

        /* Câu hỏi: n3 có bằng n4 hay không?*/
        System.out.println("n3 == n4? " + (n3 == n4)); // Không bằng vì đây là 2 vùng new khác nhau
        /* Không bằng con trỏ nhưng bằng về value bên trong, vào trong mà so sánh */
        System.out.println("n3 == n4 (core)? " + n3.equals(n4)); // value lõi bằng nhau -> true

        /* Câu hỏi 2: n2 có bằng n3 hay không? n1 có bằng n2 không?
        * Trả lời: 4 thằng không bằng nhau về mặt con trỏ, value của card, thẻ bài, mỗi thằng là 1 thẻ bài ghi địa chỉ
        *          vùng new , trỏ new khác nhau nên không bằng nhau về con trỏ. nhưng bằng nhau về con trỏ*/
        System.out.println("n1 == n2? " + (n1 == n2)); // -> false
        System.out.println("n2 == n3? " + (n2 == n3)); // -> flase
        /* Gán mới là trỏ mới vì READ-ONLY, IMMUTABLE CLASS*/

        /* VI DIỆU: */
//        Integer n5 = 127;
//        Integer n6 = 127;
//        Integer n5 = 128;
//        Integer n6 = 128;
//        Integer n5 = 0;
//        Integer n6 = 0;
//        Integer n5 = -128;
//        Integer n6 = -128;
        Integer n5 = 127;
        Integer n6 = 127;
        /* n5 có bằng n6 không? So con trỏ thôi, lõi thì bằng nhau rồi
        * Kết quả: 127 -> true
        *          128 -> false
        *          0 -> true
        *          -129 -> false
        *          -128 -> false*/
        /* Quy luật: [-128  0   127]: true
        * nếu new ngầm trong đoạn -128-127 thì xài pool, nghĩa là thằng nào đã tạo ra vùng new này rồi thì thằng
        * vào sau xài ké luôn.
        * n5 = 127 -> ~~~ new ngầm Integer(127); n6 = 127 -> Không new ngầm, xài ké 127 của n5: 2 CHÀNG 1 NÀNG
        * n7 = 127 -> Mình tắm chung luôn, 3 chàng 1 nàng*/
        System.out.println("n5 == n6? " + (n5 == n6)); // true
        Integer n7 = 127;
        System.out.println("n5 == n7? " + (n5 == n7)); // true vì chung pool
        /* -> Có 256 vùng new [-128; 127] dùng chung cho n biến Integer nếu xài kiểu Boxing NEW NGẦM */
        Integer n8 = new Integer(127);
        /* Hỏi n7 và n8 có bằng nhau không?*/
        System.out.println("n7 == n8? " + (n7 == n8)); // false vì không xài pool, n8 đã là 1 vùng new mới, tọa độ khác
        Integer n9 = new Integer("127");
        /* Hỏi n8 và n9 có bằng nhau không?*/
        System.out.println("n8 == n9? " + (n8 == n9)); // false tương tự n8

        /* CHỐT HẠ:
        * Vậy chỉ BOXING NEW NGẦM thì mới xài Pool trong đoạn [-128, 127]
        * CẤM TUYỆT ĐỐI SO SÁNH 2 BIẾN OBJECT QUA TOÁN TỬ == vì đi so sánh 2 địa chỉ, lúc bằng lúc không do có pool
        * Chính xách phải so sánh 2 object qua dấu chấm vào trong lấy data mà so
        * => CHẤM ĐỂ SO SÁNH OBJECT
        */
    }
}
