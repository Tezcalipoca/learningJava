package Theory.Sesson10_StudentManagement;

import java.util.Scanner;

public class Shelf {
    // Đặc điểm của một kệ
    private String color; // Tủ có màu sắc gì (xanh, đỏ, vàng, ...)
    private String label; // Tủ gì? Tủ chén, tủ đựng hồ sơ, tủ

    // Biến được đưa value lúc nào? => Qua phễu hoặc gán trực tiếp lúc khai báo
    //      - Gán trực tiếp: private String color = "PINK"
    private Student arr[] = new Student[300]; // Chứa cái gì? -> Chừa không gian để chứa hồ sơ sinh viên, mới tạo thì chưa có.
    // arr là biến mảng nên cần phải khai báo giá trị
    // new Student[300] = đặt sẵn cái tủ có 300l
    // Nhưng ta nên đặt hàng linh hoạt theo kích thước, dung tích size 500, 1000, 2000, ...
    // Có cách nâng cao tủ linh hoạt về khả năng chứa. Học sau
    private int count = 0; // Tủ mới có thì số lượng hồ sơ = 0, thêm 1 hồ sơ thì count++, duyệt for từ 0 -> count

    private Scanner scanner = new Scanner(System.in);

    public Shelf(String color, String label/*, int size*/) { //size: Kích thước tủ
        this.color = color;
        this.label = label;
        //arr = new Student[size]; // linh hoạt hơn trong lúc tạo danh sách mảng
    }
    // DATA + HÀM XỬ LÝ CỦA TỦ NHÂN CÁCH HÓA, TOÀN BỘ SẼ LÀ NON-STATIC
    // NẾU KHÔNG CÁC TRƯỜNG ĐẠI HỌC, BỘ MÔN SẼ XÀI CHUNG DSSV
    // ĐỒ ĐẠC, HÀNH XỬ THỘC VỀ OBJECT

    //Thêm hồ sơ, rút hồ sơ, sắp xếp -> Hành động của tủ, đối tượng thùng chứa
    // new Tu() để sắp ngăn trống để bỏ sách, hồ sơ, ... new HoSo()
    public void inputStudentList() {
        String id, name;
        int yob;
        double gpa;

        System.out.println("Please input student #" + (count + 1) + "/" + " /" + arr.length); // mảng đếm từ 0, ta cần đếm từ 1
        System.out.print("Input id: ");
        id = scanner.nextLine(); // TODO: kiểm tra id trùng
        System.out.print("Input name: ");
        name = scanner.nextLine();
        System.out.print("Input yob: ");
        yob = Integer.parseInt(scanner.nextLine()); //Mytoys
        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(scanner.nextLine()); //MyToys

        // Phải dùng Regular Expression: Kiểm tra chuỗi nhập vào có đúng định dạng hay không
        arr[count] = new Student(id, name, yob, gpa);
        count ++;
        System.out.println("Add Student successfully!");
    }

    public void printStudentList(){
        System.out.println("The Student List");
        for (int i = 0; i < count; i++) { // Nếu for tới arr.length sẽ bị báo lỗi vì mảng object default các phần tử trỏ vùng RAM null
            arr[i].showProfile();
        }
    }
    public void searchStudent(){
        //search là quét từ trái sang phải để lấy từng s[i] ra để xem mã sinh viên là bao nhiêu, so sánh với mã muốn tìm
        // -> Giống như sv[i].getMaSV(), nếu có thì báo tìm thấy, ngược lại thì báo not found.
        System.out.print("input the id that you want to search: ");
        String id = scanner.nextLine();
        for (int i = 0; i < count ; i++) {
            if (arr[i].getId().equalsIgnoreCase(id)){
                // Tìm thấy tại vị trí thứ i
                System.out.println("Student found! Here he/she is");
                arr[i].showProfile();
                return; // tìm thấy thì dừng hàm luôn
            }
        }
        // Nếu không tìm thấy thì thông báo
        System.out.println("Student not found!!");
        // Cách 2: Dùng biến flag nếu thấy và không, if() in ra câu thông báo
    }
}
