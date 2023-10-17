package ptit.util;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Class này chứa các đồ chơi dùng chung cho họ MyToys, còn cho các nơi khác
* vì MyToys không có ý định lưu lại cái gì của riêng nó, ta chơi toàn static
* hàm ý 1 vùng RAM: thường nó sẽ là những hàm trả veef giá trị, không cần nhớ riêng data
* Nên nhớ, một class có quyền vừa static vừa non-static, tùy mục đích.
* Ví dụ Math. hầu hết là static, String vừa static vừa non-static.
* Ví dụ String.format() =>static ; String name = "BaoChinh" => name. => non static*/
public class MyToys {
    private static Scanner scanner = new Scanner(System.in);
    public static double PI = 3.1415;
    public static final double  PI2 = 3.14156;
    public static final int MAX_ELEMENTS = 500;
    // final thì sẽ không cho sửa, biến chỉ được gán một lần duy nhất, không được thay đổi về sau

    public static int getAnInteger(String caption){
        int n;
        do {
            try {
                System.out.print(caption);
                // n = sc.nextInt(); // câu lệnh này dùng buffer để lại rác
                n = Integer.parseInt(scanner.nextLine());
                return n; // break
            } catch (Exception e){
                System.out.println("Vui lòng nhập số nguyên");
            }
        }
        while(true); // Điều gì đúng thì vòng lên do làm tiếp
    }
    // hàm nhập số nguyên từ bàn phím, nhập số thực (hàm khác)
    // Hình chữ nhật: 2 cạnh, mỗi int: trôi lệnh, nhập lại
    // Tam giác: 3 cạnh
    // Tròn: Bán kính, ...
    // Điểm thi: R, L, H, ..., cột điểm ...
    //Menu: lựa chọn 1 2 3 4 5 6
    /* Công việc nhập số lặp đi lặp lại ở nhiều chương trình, sao chúng ta không tách hàm nhập số ra riêng để khi cần
    * thì gọi một lần? */
    // => Gói tất cả trong một hàm, return lại một số
    public static Integer inputAnInterger(String caption){
        int n;
        do {
            try {
                System.out.print(caption);
                n  = Integer.parseInt(scanner.nextLine());
                return n;
            } catch (Exception ex){
                System.out.println("Lựa chọn của bạn không hợp lệ, vui lòng nhập số nguyên");
            }
        } while (true);
    }

    public static Double inputAnDouble(String caption){
        double n;
        do {
            try {
                System.out.print(caption);
                n  = Double.parseDouble(scanner.nextLine());
                return n;
            } catch (Exception ex){
                System.out.println("Giá trị bạn nhập không hợp lệ, vui lòng nhập số thực");
            }
        } while (true);
    }

    public static String inputString(String caption){
        String n;
        String regex = ".*\\d.*";
        System.out.print(caption);
        do {
            n = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(n);
            if (!n.matches(regex)){
                return n;
            } else {
                System.out.println("Vui lòng chỉ nhập các kí tự chữ cái không bao gồm số!");
            }
        } while (true);
    }
}
