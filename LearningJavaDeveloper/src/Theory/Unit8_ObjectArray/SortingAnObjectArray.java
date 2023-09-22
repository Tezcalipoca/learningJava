package Theory.Unit8_ObjectArray;

public class SortingAnObjectArray {
    public static void main(String[] args) {
        sortObjectArray();
    }
    public static void playWithObjectArray(){
        Student s[] = new Student[2];
        s[0] = new Student("N19DCCN024", "Nguyễn Bảo Chân", 2001, 9.0);
        s[1] = new Student("N19DCCN024", "Nguyễn Bảo Chính", 1993, 8.0);
        // in mảng
        System.out.println("The student list before sorting:");
        /*for (int i = 0; i < s.length ; i++) {
            //s[i].showProfile();
            System.out.print(s[i] + " ");
        }*/
        for (Student x: s // x duyệt qua từng phần tử của s, lấy giá trị từng phần tử
             ) {
            x.showProfile();
            System.out.print(x + "");
        }
        // in mảng tăng dần ascending về điểm, về lí Chính 8.0 | Chân 9.0
        // s[0] đang trở sai, đầu mảng thì phải trỏ Chính
        // s[1] đang trỏ sai, nhì mảng phải trỏ Chân
        // => Cần hoán đổi việc trỏ: s[0] cần trỏ Chân, s[1] cần trỏ Chính
        s[0] = s[1];
        System.out.println("The student list after sorting:");
        for (Student x: s) {
            x.showProfile();
        }
    }

    public static void sortObjectArray(){
        Student s[] = new Student[2];
        s[0] = new Student("N19DCCN024", "Nguyễn Bảo Chân", 2001, 9.0);
        s[1] = new Student("N19DCCN024", "Nguyễn Bảo Chính", 1993, 8.0);
        // in mảng
        System.out.println("The student list before sorting:");
        for (Student x: s // x duyệt qua từng phần tử của s, lấy giá trị từng phần tử
        ) {
            x.showProfile();
        }
        Student tmp = s[0];
        s[0] = s[1];
        s[1] = tmp;
        System.out.println("The student list after sorting ascending by gpa:");
        for (Student x: s) {
            x.showProfile();
        }
    }

    public static void sortObjectArrayV2(){
        Student s[] = new Student[2];
        s[0] = new Student("N19DCCN024", "Nguyễn Bảo Chân", 2001, 9.0);
        s[1] = new Student("N19DCCN024", "Nguyễn Bảo Chính", 1993, 8.0);
        // in mảng
        System.out.println("The student list before sorting:");
        for (Student x: s // x duyệt qua từng phần tử của s, lấy giá trị từng phần tử
        ) {
            x.showProfile();
        }
        Student tmp = s[0];
        s[0] = s[1];
        s[1] = tmp;
        System.out.println("The student list after sorting ascending by gpa:");
        for (Student x: s) {
            x.showProfile();
        }
    }
}
