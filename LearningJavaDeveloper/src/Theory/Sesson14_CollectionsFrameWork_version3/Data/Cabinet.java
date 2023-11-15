package Theory.Sesson14_CollectionsFrameWork_version3.Data;

import Theory.Sesson14_CollectionsFrameWork_version3.Utils.MyToys;
import kotlin.jvm.JvmOverloads;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Theory.Sesson14_CollectionsFrameWork_version3.Utils.MyToys.getID;

public class Cabinet {
    // Màu sắc, giá tiền, nhãn tủ là đặc trưng, mình không quan tâm
    // Mua tủ đựng nhiều đồ
    private List<Student> arr = new ArrayList<>(); // = new ArrayList() là đủ, add SV vào tính sau
    private Scanner sc = new Scanner(System.in);

    /* Phễu rỗng - Empty Constructor/default Constructor*/
    public Cabinet() {

    }

    /* Tủ có hành động cơ bản: Mở khóa kéo ra, bỏ đồ vô, loại bỏ món đồ, thêm món đồ, chỉnh sửa, ...*/
    public void addAStudent(){
        String id, name;
        int yob;
        double gpa;
        System.out.println("Input student profile #" + (arr.size() + 1) + ":");
        /* Vừa nhập id là kiểm tra có trùng không, nếu có thì yêu cầu nhập lại, còn sai thì còn yêu cầu nhập lại*/
        while (true){
            id = MyToys.getID("Input ID(ex: N19DCCN024): ", "Your input must be under "
                            + "the format of NaaBBBBccc, a & c stands for a digit, b stands for one letter",
                    "^[N|n]\\d{2}\\w{4}\\d{3}$");
            Student xxx = searchAStudent(id);
            if (xxx == null)
                break; // không thấy id nào trùng với id vừa nhập, break để nhập inf còn lại
            // Không trùng id chính là khái niệm Primary key bên database
            else
                System.out.println("Duplicated id. Try with another one!");

        }
        name = MyToys.getString("Input name: ", "The name does not contain numbers or special characters, please!");
        yob = MyToys.getAnInteger("Input year of birth: ", "Input an Interger, please");
        gpa = MyToys.getADouble("Input gpa: ", "Input an Double , please!");
        arr.add(new Student(id, name, yob, gpa));
        System.out.println("Add a new student successfully");
    }

    public void printStudentList(){
        if (arr.isEmpty()){
            System.out.println("There are no student to print");
            return;
        }
        if(arr.size() != 1)
            System.out.println("There are " + arr.size() + " students: ");
        else
            System.out.println("There is " + arr.size() + " student: ");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
    }

    /* CRUD: Create/Retrieve(Read)/Update/Delete */
    /* Viết hàm search là quan trọng vì nó không chỉ là search cho nhu cầu tìm hồ sơ mà còn giúp cho các hành động khác:
    *  xóa hồ sơ, sửa hồ sơ, giúp việc tạo mới hoàn hảo (tìm xem mã SV thêm mới có trùng không, tương đương đăng ký 1
    *  member, gõ acc báo trùng rồi, còn trùng thì không cho đi tiếp). Ta sẽ viết hàm search giải quyết được nhiều
    *  chuyện thì tốt hơn*/
    public Student searchAStudent(String id){
        if (arr.isEmpty())
            return null;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equalsIgnoreCase(id))
                return arr.get(i);
        }
        return null;
    }
//    Overloading xáy ra
    /*Hàm này bao hàm trên lại - dùng lại, cung cấp id. Nhìn ra ngoài tủ thấy có 2 cách search, bạn đưa id trực tiếp
    * hoặc bạn nhập id */
    public void searchAStudent(){
        String id;
        id = MyToys.getID("Input Student id that you want to search: ", "Your input must be under the" +
                        " format of NaaBBBBccc, a & c stands for a digit, b stands for one letter",
                "^[N|n]\\d{2}\\w{4}\\d{3}$");
        Student x = searchAStudent(id);
        if (x == null){
            System.out.println("NOT FOUND!");
            return;
        }
        System.out.println("STUDENT FOUND! Here he/she is: ");
        x.showProfile();
    }



    public void updateAStudent(String id, double newGPA){
        Student x = searchAStudent(id);
        if (x == null)
            System.out.println("STUDENT NOT FOUND! Nothing to Update");
        else {
            System.out.println("Before updating");
            x.showProfile();
            x.setGpa(newGPA);
            System.out.println("After updating");
            x.showProfile();
        }
    }

    public void updateAStudent(){
        String id;
        double newGpa; // Có ai đó làm price kiểu int -> ăn đòn
        id = MyToys.getID("Input Student id that you want to update: ", "Your input must be under the" +
                        " format of NaaBBBBccc, a & c stands for a digit, b stands for one letter",
                "^[N|n]\\d{2}\\w{4}\\d{3}$");
        Student x = searchAStudent(id); // Có tham chiếu trỏ đến vùng new Student có id cần tìm
        if (x == null)
            System.out.println("STUDENT NOT FOUND! Nothing to Update");
        else {
            System.out.println("Before updating");
            x.showProfile();
            // Mời nhập điểm số mới
            newGpa = MyToys.getADouble("Input new gpa: ", "Please input a double! Try again!");
            x.setGpa(newGpa);
            System.out.println("After updating");
            x.showProfile();
        }
    }

    public void updateAStudent(Student x, double newGPA){
        // Đưa t tham chiếu đến sinh viên x, t xét luôn
        if (x != null)
            x.setGpa(newGPA);
        else
            System.out.println("Student not Found!");
    }

    public void removeAStudent(){
        String id = MyToys.getID("Input Student id that you want to update: ", "Your input must be under the" +
                        " format of NaaBBBBccc, a & c stands for a digit, b stands for one letter",
                "^[N|n]\\d{2}\\w{4}\\d{3}$");
        if (searchAStudent(id) == null)
            System.out.println("STUDENT NOT FOUND!");
        else
            for (int i = 0; i < arr.size() ; i++) {
                if (arr.get(i).getId().equalsIgnoreCase(searchAStudent(id).getId()))
                {
                    arr.remove(i);
                    System.out.println("Remove Student Successfully!");
                    break;
                }
            }
    }
}
