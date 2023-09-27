package Theory.Unit10_StudentManagement;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise; // Lưu lựa chọn menu gõ từ bàn phím
        Shelf shelfPTIT = new Shelf("BLACK", "PTIT");

        do {
            printMenu();
            System.out.println("Please input your choise");
            choise = Integer.parseInt(scanner.nextLine());
            switch (choise){
                case 1:
                    shelfPTIT.inputStudentList();
                    break;
                case 2:
                    shelfPTIT.printStudentList();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;

                case 6:
                    System.out.println("Bye, See You Next Time");
                    break;
                default:
                    System.out.println("Please choose 1 to 6, please!");
                    break;
            }
        } while (choise != 6); // Còn chưa chọn 6 thì còn lặp lại
                                // còn đúng thì còn làm - do
                                // đúng là chưa bằng 6 thì còn làm
    }
    public static void testu() {
        // Nên tạo một menu: 1. Tạo hồ sơ, 2. Show danh sách sinh viên
        Shelf shelfPTIT = new Shelf("BLACK", "PTIT");
        Shelf shelfUEF = new Shelf("PINK", "UEF");
        shelfPTIT.inputStudentList();
        shelfPTIT.inputStudentList();
        shelfPTIT.printStudentList();
    }

    public static void printMenu(){
        /* ----------------------- MENU -----------------------------------*/
        /* 1. Add ...
         *  2. Print ...
         *  3. Search ...
         *  4. ...
         *  n. Thoát*/
        // Yêu cầu người dùng nhập số lựa chọn -> Dùng if, try-catch, do-while để bắt các lỗi.
        /* - Lỗi nhập sai định dạng
         *  - Nhập ngoài biên
         *  - Chỉ thoát khi chọn quit */
        System.out.println("Welcome to PTIT-HCM Academy");
        System.out.println("1. Add a student profile");
        System.out.println("2. Print Student list");
        System.out.println("3. Search a student list");
        System.out.println("4. Update a student profile");
        System.out.println("5. Remove a student"); // Thao tác xóa cần hết sức cẩn thận, xóa không hẳn là xóa, mà xóa là ẩn
        System.out.println("6. Quit");
    }
}
