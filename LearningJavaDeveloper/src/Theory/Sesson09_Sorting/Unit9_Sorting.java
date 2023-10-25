package Theory.Sesson09_Sorting;

import Theory.Sesson08_ObjectArray.Student;

import java.util.Scanner;

public class Unit9_Sorting {
    public static void main(String[] args) {
        inputStudentList();
    }

    public static void sortIntegerList() {
        int arr[] = new int[]{1000, -1000, 50, 30, -20, 3, -3000};
        // Sử dụng selection sort
        System.out.println("The array before sorting");
        for (int x : arr
        ) {
            System.out.print(x + " ");
        }

        /*for (int i = 1; i < arr.length; i++) { // -> Hoán đổi lần đầu tiên
            if (arr[0] > arr[i]) {
                int t = arr[0];
                arr[0] = arr[i];
                arr[i] = t;
            }
        }*/
        /* --- Tổng quát sắp xếp cả mảng: */
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }

        System.out.println("\nThe array after first sorting: ");
        for (int x : arr
        ) {
            System.out.print(x + " ");
        }
        // Duyệt mảng từ đầu đến cuối
    }

    public static void sortStudentList() {
        /*Student arr[] = new Student[5];
        arr[0] = new Student("N19DCCN024", "Nguyễn Bảo Chính", 2001, 9);
        arr[1] = new Student("N19DCCN022", "Nguyễn Bảo Chân", 1993, 6);
        arr[2] = new Student("N19DCCN023", "Nguyễn Văn Chí", 1995, 8);
        arr[3] = new Student("N19DCCN050", "La Ngọc Hạnh", 1986, 2);
        arr[4] = new Student("N19DCCN0109", "Nguyễn Tấn Vương", 1998, 7);*/
        Student arr[] = new Student[]{
                new Student("N19DCCN024", "Nguyễn Bảo Chính", 2001, 9),
                new Student("N19DCCN022", "Nguyễn Bảo Chân", 1993, 6),
                new Student("N19DCCN023", "Nguyễn Văn Chí", 1995, 8),
                new Student("N19DCCN050", "La Ngọc Hạnh", 1986, 2),
                new Student("N19DCCN0109", "Nguyễn Tấn Vương", 1998, 7)
        };
        System.out.println("The Student list before sorting:");
        for (Student x : arr
        ) {
            x.showProfile();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getGpa() > arr[j].getGpa()) {
                    Student studentTmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = studentTmp;
                }
            }
        }

        System.out.println("The student list after sorting ascending by gpa:");
        for (int i = 0; i < arr.length; i++) {
            arr[i].showProfile();
        }
    }

    // Nhập danh sách nhân viên từ bàn phím: Mảng sinh viên, Scanner, biến trung gian id, name, ...
    // new Student (...) -> gán [i] vào mảng
    // mảng[bao nhiêu sinh viên thì vừa]? -> Hỏi muốn nhập kích thước bao nhiêu
    // for để nhập đến khi xong
    // Trong java có loại mảng đặc biệt, không yêu cầu bạn khai báo bao nhiêu phần tử, ta cứ new Student() rồi thảy vào
    // mảng, vào con trỏ ta đang cất giữ.
    // -> Mảng co giãn COLLECTIONS FRAMEWORK
    public static void inputStudentList(){
        // BÀI NÀY CHƯA ĐẠT 100% OOP, ĐẠT 50% VÌ CÓ CLASS STUDENT
        // STATIC HÀM, BIẾN NHƯNG THỰC CHẤT LÀ ĐỒ XÀI CHUNG
        // HÀM inputStudentList():
        //      - Nhập dữ liệu sinh viên từ bàn phím, tạo hồ sơ sinh viên, lưu lại hồ sơ (mảng)
        //      - Hàm này tức là hàm xử lý data, tức là các hồ sơ sinh viên, object
        // Các hồ sơ sinh viên là của ai đó, data của ai
        // Việc nhập hồ sơ là việc của ai?
        // Lưu dữ liệu, lập hồ sơ là việc của object nào đó??? OOP là dựa trên object

        // TƯ DUY OOP: PHẢI TÌM RA OBJECT CHƯA ĐẶC ĐIỂM VÀ HÀNH VI
        // trong bài toán này đã có dữ liệu tập hồ sơ sinh viên, hành vi nhập, xóa, sửa, sắp xếp,...
        // Danh sách sinh viên không là của chung -> việc nhập data sinh viên, xử lý nhập xuất thuộc về một object nào dó
        /* Ví dụ class TU {
        *           mauSac: _______
        *           gia:_______
        *           monDo[]: _____
        *       themHoSo()
        *       rut()
        *       sapXep()
        *        }*/
        Scanner scanner = new Scanner(System.in);
        int yob, count; // count: Số lượng sinh viên cần nhập
        String id, name;
        double gpa;
        System.out.print("How many students do you want to input? ");
        count = Integer.parseInt(scanner.nextLine());
        Student arr[] = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Please input student #" + (i+1) + "/" + count); // mảng đếm từ 0, ta cần đếm từ 1
            System.out.print("Input id: ");
            id = scanner.nextLine(); // Trong ptit.util.MyToys, có code chặn rỗng, nhập sai định dạng (Regular Expression)
            System.out.print("Input name: ");
            name = scanner.nextLine();
            System.out.print("Input yob: ");
            yob = Integer.parseInt(scanner.nextLine()); //Mytoys
            System.out.print("Input gpa: ");
            gpa = Double.parseDouble(scanner.nextLine()); //MyToys
            arr[i] = new Student(id, name, yob, gpa);
        }
        System.out.println("The student list: ");
        for (Student x: arr
             ) {
            x.showProfile();
        }
    }
}
