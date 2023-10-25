
package Theory.Sesson06_InputAndTryCatch;

import java.util.Scanner;

/* ---------------------------- BÀI 6: NHẬP DỮ LIỆU TỪ BÀN PHÍM -------------------------
 * 1. Nhập ngoài biên:
 * - ví dụ giới hạn yêu cầu nhập ngày sinh từ 1990-2001 mà ta nhập 2005
 * - App yêu cầu nhập khác rỗng, khác rỗng, theo định dạng nào đó, ta dùng if() và các hàm liên quan để kiểm tra dữ
 * liệu nhập và thông báo lỗi (+ bắt nhập lại)
 * - Đùng định dạng, sai value cần -> Ngoài biên -> Dùng if + kết hợp do-while để yêu cầu nhập lại
 * 2. Lệnh nhập bị trôi:
 * - Nguyên nhân:
 *       + Do lệnh số chỉ dùng đúng phần số trong buffer (bộ nhớ đệm nhập xuất), và để lại
 * dấu cách, kí tự khác, và enter trong buffer (gọi là rác buffer).
 *       + Lệnh liền kề nhập kí tự/chuỗi thấy có "char" trong buffer, và nó lấy rác này gán vào biến kí tự/chuỗi
 *       + Và hiện tượng trôi lệnh xảy ra, cảm giác lệnh nhập kí tự/ chuỗi không chạy, không cho mình chạy nhưng thực
 *  chất là do nó đã hốt rác buffer gán vào.
 * - Giải pháp: Xóa bộ nhớ đệm nhập/xuất trước lệnh nhập kí tự, chuỗi dùng Scanner
 *       + dùng sc.nextLine().
 *       + dùng Integer.parseInt(sc.nextLine());
 * 3. Nhập khiến chương trình không xử lý được (không xài if được): Ví dụ yêu cầu nhập số nhưng lại nhập kí tự chữ
 * - Nguyên nhân: Mặc định, JVM phát hiện dữ liệu sai lệch, không thể convert chuỗi thành số hoặc ngược lại, để đảm bảo App xử lý
 * data an toàn, JVM gửi một Exception object cho app, báo rằng có tình huống "bất thường", không như dự kiến - gọi
 * chung là Exception, và nó xảy ra, và giết luôn app (end process). Nếu đưa chuỗi vào số, không thể dùng lệnh if được
 * nếu tiếp tục dùng cái sai để làm thì là sai luôn, sẽ giết app.
 * - Giải pháp: Nếu không muốn bị JVM giết khi có tình huống bất thường, hãy ra hiệu với JMV đừng giết app, cứ thông
 * báo có ngoại lệ là được, gửi cho app biết cái chi tiết tình huống bất thường để app tự tính toán, xử lý. Khi đó
 * JVM sẽ không giết app nữa, nhưng JVM muốn rằng có cơ chế cam kết đảm bảo xử lý cà chớn. JVM muốn thấy app phải nhốt
 * các lệnh có nguy cơ gây bất thường vào giám sát, đó là cơ chế TRY-CATCH
 * try {
 *   * Các lệnh cần giám sát
 *   .nextInt();
 *   . parseInt();
 * } catch (Exception ex) {
 *   * ex chính là đối tượng, tình hình cà chớn mà JVM nắm bắt được gồm chi tiết nguyên nhân gây ra cà chớn. Hãy ex.
 *    (dùng chấm) để xem sự vụ việc xảy ra.
 * }
 * 4. Nhập tử tế, nhập đúng yêu cầu:
 * Chương trình ổn và không có gì xảy ra*/

/*  -------------NHỮNG TRƯỜNG HỢP NÊN SỬ DỤNG TRY-CATCH -------------
* 1. convert data không thành công (chuỗi -> số)
* 2. Chia cho 0 mà không chặn số chia qua if
* 3. Đi vượt quá số phần tử mảng (out of bound)
* 4. Null Pointer - Chưa gán giá trị cho biến object mà sử dụng chấm.
* 5. Kết nối mạng, truyền dữ liệu qua mạng, database ở xa, server chết, mạng rớt (Sql injection)
* 6. I/O nhập xuất với tập tin. Bắt buộc phải nhốt lệnh vào try-catch
* 7. Nhiều tình huống khác, ...*/
public class Unit6_Input_TryCatch {
    public static void main(String[] args) {
        //inputProfile();
        //inputProfile02();
        inputProfile03();
    }
    /*// Bài thì nghiệm về việc nhập xuất, làm đơn giản, không OOP, không class
    public static void inputProfile(){
        // Nhập vào thông tin sinh viên, năm sinh, địa chỉ và in ra
        String name, address;
        int yob;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name, please: ");
        name = scanner.nextLine().toUpperCase();

        System.out.print("Input year of birth, please: ");
        // ------------- Sử dụng nextLine() để xóa Buffer --------------------
        yob = scanner.nextInt();
        // nextInt() để lại rác trong buffer, ít nhất là Enter, cách dư Enter -> Xóa bộ đệm trước khi vào chuỗi
        // Ta lợi dụng lệnh nextLine() để lấy sạch buffer trước khi tới lệnh mới
        scanner.nextLine(); // Mục tiêu là hốt sạch buffer
        *//* Sử dụng parseInt()*//*
        yob = Integer.parseInt(scanner.nextLine()); // parseInt(String s): Convert một chuỗi thành một số
            // parseInt() là hàm static, sử dụng chấm để dùng, không cần new, không cần nhớ data
        System.out.print("Input address, please: ");
        address = scanner.nextLine().toUpperCase();

        System.out.println();
        System.out.println("Your profile:");
        System.out.println("Your name: "+name);
        System.out.println("Your yob: "+yob);
        System.out.println("Your address: "+address);
        System.out.println("--------- end of profile ---------");

        *//* lệnh nextLine() sẽ lấy hết dữ liệu và vùng buffer (có cả dấu enter), tuy nhiên, lệnh nextInt() chỉ lấy đúng
        * giá trị là số nguyên, nếu nhập xong yob và nhấn enter, mặc định lệnh nextInt() chỉ lấy giá trị số (đúng định dạng)
        * và nút enter sẽ còn lưu trong buffer. tiếp theo, lệnh "address = scanner.nextLine().toUpperCase();" sẽ lấy giá
        * trị là dấu enter còn lưu trong buffer => gây ra hiện tượng trôi lệnh*//*
    }*/
    public static void inputProfile02() {
        String name, address;
        int yob;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name, please: ");
        name = scanner.nextLine().toUpperCase();
        try {
            System.out.print("Input year of birth, please: ");
            yob = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            // e là tin nhắn/ object màu đr mà JVM gửi app lưu ý có ngoại lệ.
            // Ngầm phía sau JVM Excaption e = new Exception ("Câu báo lỗi)
            // thường ta quan tậm có ngoại lệ, lúc này ta tự xử lý, JVM không giết app
            // Có 2 cách:
            //      - default
            //      - bắt vòng lên nhập lại
        }
        System.out.print("Input year of birth, please: ");
        yob = Integer.parseInt(scanner.nextLine());
        /* Nếu ta nhập sai định dạng như có kí tự vào nơi đang yêu cầu nhập số (nextInt()), mặc định JAVA sẽ crack app ngay
        tại chỗ ta nhập sai, và nó gửi cho app một object thông báo rằng data nhập vào bị sai/dính ngoại lệ/exception.
        Sau khi gửi Exeception's message, Java sẽ giết app ngay lập tức.
        (?) Nếu người dùng lỡ tay nhập sai, thì ta nên cho phép nhập lại, không nên giết app luôn
        -> Không nên giết app khi bị dính exception
        -> chỗ nào có thể dính ngoại lệ thì chỗ đó có nguy cơ app bị giết, ta cần thay đổi code để nếu gặp ngoại lệ
        thì bắt người dùng làm lại (ví dụ nhập lại) -> Báo với JVM đoạn code này có thể có ngoại lệ, nếu có ngoại ệ thì báo
        cho app biết, không giết app, để ta tự xử lý -> Ta nhốt câu lệnh có khả năng dính ngoại lệ vào cụm TRY-CATCH để xử
        lý cho an toàn.
        */
        System.out.print("Input address, please: ");
        address = scanner.nextLine().toUpperCase();

        System.out.println();
        System.out.println("Your profile:");
        System.out.println("Your name: " + name);
        System.out.println("Your yob: " + yob);
        System.out.println("Your address: " + address);
        System.out.println("--------- end of profile ---------");
    }
    public static void inputProfile03() {
        String name, address;
        int yob;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name, please: ");
        name = scanner.nextLine().toUpperCase();
        while (true){ // Đây là lặp vô tận
            try {
                System.out.print("Input year of birth, please: ");
                yob = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) { // Còn nhập sai thì còn nhắc
                System.out.println("Bạn nhập sai định dạng, vui lòng nhập lại");
            }
        }
        System.out.print("Input address, please: ");
        address = scanner.nextLine().toUpperCase();

        System.out.println();
        System.out.println("Your profile:");
        System.out.println("Your name: " + name);
        System.out.println("Your yob: " + yob);
        System.out.println("Your address: " + address);
        System.out.println("--------- end of profile ---------");
    }
}
