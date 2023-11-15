package Theory.Sesson15_WrapperClassVersionMini;

public class StringClass {
    public static void main(String[] args) {
        playWithString();
    }

    public static void playWithString(){
        String s1 = new String("HELLO"); // Cảnh báo giống new Integer("2003")
        String s2 = new String("HELLO");
        String s3 = "HELLO"; //Khuyến khích viết cách này vì tự nhiên
        String s4 = "HELLO"; // new String ngầm
        String s5 = "Hello";

        /* Hỏi:
        * s1 có bằng s2 không? */
        System.out.println("s1 vs. s2? " + (s1 == s2)); //false
        /* s2 có bằng s3 không?*/
        System.out.println("s2 vs. s3? " + (s2 == s3)); // false
        /* s3 có bằng s4 không?*/
        System.out.println("s3 vs. s4? " + (s3 == s4)); //true

        // => CHUỖI NEW NGẦM LÀ POOL
        /* s4 có bằng s5 không?*/
        System.out.println("s4 vs. s5? " + (s4 == s5)); // false
        // => POOL STRING CÓ PHÂN BIỆT HOA-THƯỜNG
        /*CHỐT HẠ:
        * Không so sánh 2 chuỗi qua toán tử bằng bằng ==, vì lúc đúng lúc sai do có sài Pool hay không
        * So 2 biến Obj là vô nghĩa
        * Bắt buộc phải chấm, vào vùng new mà so sánh.
        * .equals(), .compareTo()
        * Mọi Obj mình tạo ra hay người ta tạo ra sẵn thì luôn nên có 2 hàm ứng với 2 loại câu hỏi:
        *   - tao bằng m không? tao.equals(mày)
        *   - tao so với mày thì như thế nào? tao.compareTo(mày)
        * Chấm để so bên trong và hàm ở chỗ có data thì tiện xử lý*/
        System.out.println("s4 vs. s5 (core)? " + s4.equalsIgnoreCase(s5)); //true
        System.out.println("s4 vs. s5 ? " + s4.equals(s5)); //false
    }
}
