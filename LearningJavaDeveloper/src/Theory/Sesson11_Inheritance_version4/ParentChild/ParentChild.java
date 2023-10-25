package Theory.Sesson11_Inheritance_version4.ParentChild;

public class ParentChild {
    public static void main(String[] args) {
        playWithPointer();
    }

    public static void playWithPointer(){
        Parent p = new Parent("Biệt thự", "1000 tỷ đồng");
        p.showProfile();
        // p. xổ ra tất cả của cha

        Child c1 = new Child("Căn hộ", "100 tỷ đồng");
        c1.showProfile();
        c1.sayHello();
        // p. xổ ra tất cả của cha cho + @Overide + thêm khác của riêng con

        Parent c2 = new Child("Nhà mặt tiền", "115 tỷ đồng");
        c2.showProfile(); // Gọi cha nhưng chạy con (hiện tượng overide)
//        c2.sayHello(); -> Chắc chắn không được vì không xố ra của riêng con dù đã new CON và có sẵn trong RAM.
        // Mình đang cư xử như CHA, dùng danh nghĩa CHA.
        // Mày biết ba tao là ai không -> hù theo kiểu của CHA, tuân theo hành động của CHA.
        // Khai báo kiểu CHA, chấm theo CHA
        // Hình vuông đang cư xử như Hình chữ nhật.
        // Con đang dùng danh nghĩa của CHA, thì phải cư xử như CHA
        // Tổ lái con trỏ xuống đáy vùng new CON sẽ lấy được hàm sayHello();
        //Child x = cần trỏ vùng new CON
        // Cách 1:
        Child x = (Child) c2; // c2 trỏ vùng new CHA, super
        // Mày hãy ráng xuống vùng new Child để lấy cho tao tọa độ vùng new, tao giữ lại trong x.
        x.sayHello(); // -> x cùng trỏ vùng new Nhà mặt tiền

        // Cách 2:
//        (Child) c2. -> Không xổ vì  dấu chấm có độ ưu tiên cao, ăn theo dataType.
        ((Child)c2).sayHello(); // Dấu ngoặc thay đổi độ ưu tiên, ép xong rồi hãy chấm
        // Miễn là lấy được tọa độ thì chấm. Tọa độ gán vào biến chấm, quá tầm thường


    }
}
