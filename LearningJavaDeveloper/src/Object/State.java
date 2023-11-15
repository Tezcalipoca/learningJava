package Object;

public class State {
    public static void main(String[] args) {
        Student x = checkObjectV7(); //  x = tọa độ của một vùng new, đã được new qua tên hàm
        x.showProfile(); // output: |  SE6789|Nguyễn Bảo Chính         |2001| 9,0|
        x.setName("La Ngọc Hạnh");
        x.showProfile(); // |  SE6789|La Ngọc Hạnh             |2001| 9,0|

        checkObjectV7().showProfile(); // sau khi dùng câu lệnh này thì vùng new checkObjectV7() được sinh ra sẽ biến mất
                                        // do bị java dọn dẹp
        // -> output: |  SE6789|Nguyễn Bảo Chính         |2001| 9,0|
    }
    public static void checkObjectV1() {
        Student s1 = new Student("N19DCCN024", "Bảo Chính", 2001, 9.0);

        Student s2 = new Student("N19DCCN024", "Bảo Chính", 2001, 9.0);

//        s1.showProfile();
//        s2.showProfile();
        /* ---------------Chứng minh 2 new là 2 obj khác nhau, 2 vùng clone khác nhau, dù đổ thông tin như nhau------*/
        // ~ ở ngoài đời: 2 tượng giống nhau, 2 quyển sách giống nhau, ...
        s1.setName("Nguyễn Bảo Chính");
        s1.showProfile(); // output: Nguyễn Bảo Chính
        s2.showProfile(); // output: Bảo Chính
        System.out.println("Check duplication if any??");
        System.out.println(s1); // Nguyễn Bảo Chính
        System.out.println(s2); // Bảo Chính
        // Nếu không sử dụng toString() trong Student, 2 câu lệnh trên sẽ in ra địa chỉ của 2 vùng RAM này
    }

    // -------------- Kiểm tra mất tọa độ, mất dấu vùng new, có thể có điều này hay không, nếu co thì hậu trường là gì?
    // -> BIẾN CÓ QUYỀN THAY ĐỔI CHỖ NÓ TRỎ ĐẾN
    public static void checkObjectV2() {
        Student             s1 =                            new Student("N19DCCN024", "Bảo Chính", 2001, 9.0);
        // s1 là con trỏ, lưu tọa độ vùng new                           // object/instance/ đủ value được đổ, nằm vùng nào đó trong HEAP
        // biến obj, lưu toa độ vùng clone                              // new trả về tọa độ vùng clone
        // reference variable, chiếu tọa độ vùng khác                   // nguyên cả dòng từ sau new trở đi được xem là tọa độ/giá trị phức tạp
        // -> Vậy biến con trỏ/biến object/ biến reference bản chất là cần trỏ, cần lưu 1 tọa độ vùng new clone
        // -> Vậy không ai cấm mình trỏ vùng new mới
         s1 = new Student("N19DCCN030", "Nguyễn Bảo Chính", 2001, 7.5);
         // s1 đổi "Bảo Chính" sang "Nguyễn Bảo Chính"
        // -> Biến object thay đổi trỏ, vùng chiếu, tọa độ
         s1.showProfile(); // output: Nguyễn Bảo Chính
        // Lúc này, vùng "Bảo Chính" bị mất dấu, vậy làm sao để lấy lại?
        // Lưu ý: Khi một obj/vùng new clone không được trỏ tới do con trỏ gán qua vùng new khác, thì ta bị mất dấu tọa độ vùng new
        // trong Java, có JVM là máy ảo java giám sát vùng RAM app được viết bằng Java
        // JVM:
        //      - giám sát có ngoại lệ không để giết app hoặc cảnh báo Exception nếu ta sử dụng try-catch
        //      - Kiểm tra trong HEAP có object nào không được trỏ tới không, bộ phận giám sát này của máy ảo trong Java
        //      gọi là GARBAGE COLLECTOR, để nó dọn dẹp, clear, avaiable vùng RAm cho object khác sắp được new clone
        //      - Việc clear ram HEAP của java diễn ra định kì, tuy nhiên chúng ta có thể gọi trực tiếp
        System.gc();
        // Biến có quyền thay đổi value nó lưu trữ, vì thay đổi value nó mới là biến
        //varibale - sự biến đổi, đang từ 10 -> 100

//        int a = 10;
//        a = 100;
//        System.out.println(a);

    }

    // --> BACKUP OBJECT, TỨC LÀ GIỮ LẠI TỌA ĐỘ
    public static void checkObjectV3() {
        Student s1 = new Student("N19DCCN024", "Bảo Chính", 2001, 9.0);
        // Trước khi s1 nhận giá trị mới mà không mất giá trị cũ, thì cần lưu lại tọa độ cũ của s1
        Student x = s1;
//        ~~ int a = 10; int b = a; giống như gán giá trị 2 biến cho nhau
        // x là biến object, cần tọa độ một vùng new, ta lấy vùng đã được new trước đó, tức là tọa độ của s1
        // -> x lúc này trỏ đến s1 ban đầu
        s1.setName("Bùi Tuấn Trường");
        s1 = new Student("N19DCCN030", "Nguyễn Bảo Chính", 2001, 7.5);
        // lúc này s1 đã thay đổi tọa độ, còn x đang trỏ đến tọa độ của s1 cũ
        s1.showProfile(); // output: |N19DCCN030|Nguyễn Bảo Chính         |2001| 7,5|
        x.showProfile(); // output: |N19DCCN024|Bùi Tuấn Trường          |2001| 9,0|
    }

    // --> HAI OBJECT TRỎ CÙNG MỘT TỌA ĐỘ - 2 CHÀNG TRỎ 1 NÀNG
    public static void checkObjectV4() {
        Student s1 = new Student("N19DCCN024", "Bảo Chính", 2001, 9.0);
        Student s2 = s1; // 2 object cùng trỏ đến một tọa độ
        // s1, s2 cùng lưu một tọa độ, cùng trỏ vùng new clone "Bảo Chính"
        s1.setName("Nguyễn Bảo Chân");

        s2.showProfile();
        s1.showProfile();
        // Ví dụ ngoài đời: sếp, sky, đạo sĩ --> đểu trỏ đến ca sĩ Sơn Tùng
    }

    // OBJECT VÔ DANH
    public static void checkObjectV5() {
        // Student s1 = new Student("SE6789", "Bùi Minh Kha", 2001, 9.0);
        // Object vô danh, sinh ra mà không được đặt tên
        //s1.showProfile();
        // s1 chấm tức là vào vùng tọa độ chấm làm gì đó.
        // new ... cũng chính là tọa độ, đẩy cho s1, s1 và new là như nhau
        // -> s1 chấm cũng như new chấm
        new Student("SE6789", "Bùi Minh Kha", 2001, 9.0).showProfile();
        // Không có con trỏ, chỉ show được 1 lần rồi bị dọn dẹp bởi Garbage Collector.
        // -> Đây gọi là object vô danh, anonymous object
        // Muốn re-use object (sử dụng lại nhiều lần) phải có tên gọi, tức là cần một biến object để lưu vùng tọa độ
        System.gc();
    }

    // KHAI BÁO BIẾN RỒI GÁN SAU
    public static void checkObjectV6() {
        int a;
        a = 10; // ~~~~ int a = 10;
        // -> Khai báo trước, gán giá trị sau
        Student s1;
        // s1 rất cần trỏ một vùng new nào đó
        s1 = new Student("SE6789", "Nguyễn Bảo Chính", 2001, 9.0);

        s1.showProfile();
    }

    // HÀM TRẢ VỀ OBJECT, KHÔNG TRẢ VỀ PRIMITIVE
    // Hàm này trả về tọa độ của một object đã được new
    //      Student x = ....
    //      Student x = ....
    //      int a;
    //      int f(); -> Tên hàm là một biến vì nó tương đương một giá trị
    public static Student checkObjectV7() { // -> Tên hàm này là một biến (object), vì giá trị của hàm này là tọa độ của
        //                                          một vùng nào đó
        Student s1 = new Student("SE6789", "Nguyễn Bảo Chính", 2001, 9.0);

        // s1 đang nằm tọa đồ vùng new clone trong HEAP
        return s1; // ta để tọa độ đó vào tên hàm
        // tên hàm là tọa độ, Student f(), f() là tọa độ
        // -> 2 object trỏ 1 vùng new f() và s1 cũng trỏ new
        // từ trong hàm đã đưa được tọa độ vùng new clone HEAP ra ngoài.
        // sau khi chạy hàm xong, mất biến s1 vì s1 nằm trong STACK
    }
    public static void checkObject() {
        Student an = new Student("N19DCCN024", "Bảo Chính", 2001, 9.0);
        // an: biến OBJECT            vùng phía sau OBJECT, complex
        // an: biến con trỏ           instance, thể hiện, ...
        // an: biến tham chiếu
        // an: reference variable
        // an: lưu tọa độ vùng OBJECT
        /* new ... nghĩa là:
        * 1. Clone vùng RAM từ khuôn (static ra, riêng 1 chỗ)
        * 2. gọi phễ đổ vào vùng clone, full info gọi là object
        * 3. Chốt lại tọa độ vùng vừa new, lấy tọa độ đưa cho biến object/biến con trỏ
        *   giữ*/
        an.showProfile();
        // biến không final thì có quyền thay đổi value
        // sếp => Ca sĩ Sơn Tùng
        // sếp => Người trả lương, tác động lương mình
        int a = 10;
        a = 100;
        // mỗi biến chỉ lưu một thời điểm, lấy giá trị mới nhất
        an = new Student("N19DCCN024", "Chính", 2001, 9.0);
        an.showProfile();
        // an đi đâu rồi?? còn đó không??
        // Những vùng RAM không còn con trỏ thì sẽ được dọn
        // ~ Free (con trỏ) bên C xóa vùng nhớ HEAP
    }
}
