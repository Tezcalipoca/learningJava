package Theory.Sesson04_RecipeForCreateAJavaApp;
/*----------------------------------------------------LÝ THUYẾT-------------------------------------------------------*/
/* 1. NHẬN DIỆN, MÔ TẢ được các objetc xuất hiện trong bài toán qua đặc điểm (biến-value kèm theo) và hành vi/hành động
* xử lý các đặc điểm đó. Ví dụ: đặc điểm yob thì có hàm getAge(). Đối tượng student X thì có các đặc điểm id, name,
yob, gpa, hành vi doQuiz(), showProfile() */
/* 2. NHẬN DIỆN, GOM NHÓM CLASS-OBJECT, là những cụm object chia sẻ chung các đặc điểm, hành vi nổi bật khác với các
* nhóm khác. Ví dụ Singer có đặc điểm nổi bật là hits.
* NHÓM chính là một dạng phân loại hoặc còn gọi là CLASS. Đặt tên, thiết kế cho Nhóm/Class này gồm đặc điểm
* (biến chừa chỗ cho value) và hành vi (hàm xử lý tổng quát trên biến) */
/* 3. TẠO MỚI PROJECT | TẠO MỚI CLASS/KHUÔN bắt buộc đặt ở một PACKAGE/ngăn tủ/kho nào đó */
/* 4. TẠO KHOẢNG TRỐNG CHỪA CHỖ TRONG CLASS/KHUÔN. Khoảng trống là các đặc điểm của object trong tương lai sẽ được tạo
* ra hay đúc từ KHUÔN/CLASS. Chúng được gọi là field/instance variable/ property/attribute/state/characteristic. Nên
* để chúng là private */
/* 5. Tạo CONSTRUCTOR(Hàm khởi tạo)/Phễu dùng để nhận vật liệu từ bên ngoài đổ vào các khoảng trống field trong
* khuôn/class để đúc đối tượng. Có thể có nhiều constructor tuương ứng với nhiều cách đúc tượng khác nhau. Gọi phễu kèm
* lệnh new. Mỗi lần gọi phễu, mỗi lần new là một lần object mới được sinh ra */
/* 6. TẠI CÁC HÀNH ĐỘNG get(), set(): Cho phép xem/lấy và sửa/cập nhật thông tin-value của đối tượng đã được tạo. Các
* hàm này được gọi đi gọi lại nhiều lần nhưng phải đi kèm biến object và dấu .*/
/* 7. TẠO HÀM toString() để trả về/show hết value đang có sẵn của các field đã được gán giá trị đang nằm trong object.
* Có thể tùy ý sữa lại hàm này theo ý mình, nhưng tuyệt đối KHÔNG được đổi tên hàm và kiểu trả về.*/
/* 8. TẠO CÁC HÀM CỦA RIÊNG CLASS. các hàm này để xử lý các đặc điểm, value mà object này sở hữu hay được gán vào.
* Nguyên tắc ENCAPSULATION - hàm thuộc về object. Ví dụ Object có đặc điểm soDuTaiKhoan thì có hàm rutTien() ^^*/
/* 9. TẠO OBJECT. trong main(), khai báo trực tiếp hoặc gọi hàm, khai báo biến/object thuộc class vừa tạo. Dùng new để
* tạo vùng nhớ mới dùng chứa thông tin object, gọi constructor để đổ value vào */
/*--------------------------------------------------------------------------------------------------------------------*/

/*--------------------------------------------------------------------------------------------------------------------*/
/* 1. BIẾN LÀ TÊN GỌI ĐẠI DIỆN CHO MỘT GIÁ TRỊ ĐƠN GIẢN (PRIMITIVE) HOẶC PHỨC TẠP (COMPOSITE-COMPLEX-OBJECT)*/
/* 2. CÓ BIẾN LÀ CÓ VÙNG NHỚ ĐƯỢC CẤP TRONG RAM */
/* 3. CÓ NEW LÀ CÓ VÙNG NHỚ MỚI ĐƯỢC CẤP TRONG RAM. Toán tử new... trả về địa chỉ/tọa độ vùng nhớ OBJECT vừa tạo, và
* gửi địa chỉ này cho biến OBJECT/biến con trỏ giữ giùm */
/* 4. BIẾN PRIMITIVE LƯU VALUE NGAY TRONG VÙNG NHỚ ĐƯỢC CẤP. ON/OFF của transitor của vùng RAM sẽ biểu diễn giá trị cần
* lưu trữ */
/* 5. BIẾN OBJECT THAM CHIẾU VÀO VÙNG OBJECT*/
/* 6. LẤY GIÁ TRỊ, THÔNG TIN VÙNG OBJECT QUA BIẾN CON TRỎ BẰNG DẦU CHẤM (.) */
/* 7. AI CÓ NHIỀU THÔNG TIN NHẤT, KẺ ĐÓ NÊN XỬ LÝ THAY VÌ KẺ KHÁC: hàm gắn với đối tượng/class để xử lý chính là những
* thông tin mà nó đang chauws - ENCAPSULATION*/
/*--------------------------------------------------------------------------------------------------------------------*/

import Models.Dog;

/*-----------------------------------------------HỆ QUẢ---------------------------------------------------------------*/
/* 1. BIẾN PRIMITIVE CHỈ TỐN 1 CÙNG RAM: ON-OFF vùng RAM này chứa luôn value cần lưu trữ.Tên biến chính là Value cần
 * dùng. KHÔNG DÙNG CHẤM (.)*/
/* 2. OBJECT TỐN 2 VÙNG RAM: 1 vùng Ram là vùng chứa OBJECT gồm các đặc điểm và hành vi. 1 vùng Ram khác là biến con
 * trỏ/biến OBJECT, trỏ đến vùng OBJECT. Biến OBJECT dùng chấm(.) để chạm vào vùng OBJECT, value của biến con trỏ
 * là tọa độ vùng RAm chứa địa chỉ vùng OBJECT.*/
/* 3. BIẾN NÀO KHAI BÁO TRONG HÀM THÌ NẰM TRONG STACK-SEGMENT*/
/* 4. OBJECT NẰM TRONG HEAP-SEGMENT*/
/*--------------------------------------------------------------------------------------------------------------------*/
public class Unit4_RecipeForCreateAJavaApp {
    public static void main(String[] args) {
        int             yob          =          2001;
        Dog chiHu =         new Dog("chiHu", 2015, 49.32);

        Dog chiPUU = new Dog("chiPUU", 2021, 50);
        chiHu.bark();
        Dog pig = new Dog("Pig", 2013, 40);
        pig.bark();

        /* Mọi object quanh qua tiềm ẩn 1 hành động cơ bản: show toàn bộ info chi tiết ở mức cơ bản. Ví dụ: show CMND */
        // Mặc định Java cung cấp một hàm tự sinh code sẵn, show ra toàn bộ info mà đã được đổ
        // hành động này trong Java là hàm toString(), biến mọi thông tin thành chuỗi
        System.out.println(chiHu.toString());
        // output: Dog{name='chiHu', yob=2015, weight=49.32}
        /*Nếu không toString() mà ngoan cố gọi nó để in ra
        * Java sẽ in ra con số Hex, mã băm vùng RAM, hash number, gom data thành một con số đại diện vùng RAM
        * HASH-NUMBER, THUẬT TOÁN MD5,SHA-1, SHA-256 */
        /* public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }   */
        System.out.println(chiHu);
        // output: Models.Dog@13a57a3b
    }

}
