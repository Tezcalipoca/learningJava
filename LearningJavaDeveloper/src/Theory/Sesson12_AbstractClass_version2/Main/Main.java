package Theory.Sesson12_AbstractClass_version2.Main;

import Theory.Sesson12_AbstractClass_version2.Data.*;

public class Main {
    public static void main(String[] args) {
//        playWithShapes();
        sortShapes();
    }

    public static void playWithShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 5.0, 6.0);

        Circle c1 = new Circle("MÁ", "PINK", "MAGENTA", "<3", 6.0);
        Shape c2 = new Circle("MÁ", "MAGENTA", "PINK", ":x", 6.0);

        r1.paint(); // Paint của ai?? -> CON - Rectangle, Khi chạy chạy của con
        r2.paint(); // paint của ai?? -> CHA - Main, khi chạy chạy của con vì @Override (qua mặt)
        c1.paint(); // paint của ai?? -> CON - Rectangle, Khi chạy chạy của con
        c2.paint(); // paint của ai?? -> CHA - Main, khi chạy chạy của con vì @Override (qua mặt)
        // -> Cha không có code, không lo vì con qua mặt @Override, dù khai CHA new CON, CON new CON
        // -> Không lo lắng CHA không hoàn hảo vì CON cân hết.
        // Paint() ở trên chính là hiện tượng đa hình - POLYMORPHISM
        // KHAI CHA NEW CHA, CHUYỆN MỚI HOÀN TOÀN (LV3)
    }

    public static void sortShapes(){
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 5.0, 6.0);

        Square s1 = new Square("MÁ", "PINK", "MAGENTA", 7.0);
        Rectangle s2 = new Square("MÁ", "PINK", "MAGENTA", 8.0);
        Shape s3 = new Square("MÁ", "PINK", "MAGENTA", 9.0);
        // Main hết cũng dc

        Circle c1 = new Circle("CHÍNH", "RAINBOW", "BORDEAUX", "<3", 6.0);
        Shape c2 = new Circle("CHÍNH", "RAINBOW", "BORDEAUX", ":x", 8.0);
        // Main hết cũng oke

        Triangle t1 = new Triangle("HẠNH", "RAINBOW", "PINK", 3, 4, 5);
        Shape t2 = new Triangle("HẠNH", "PINK", "RAINBOW", 6, 8, 10);
        //Main cũng oke

//        // paint() của ai và chạy thế nào?
//        r1.paint(); // Khai con, new con, chạy paint() của Rect
//        r2.paint(); // Khai cha, new con, paint() của Main, Chạy của Rect (qua mặt Main)
//
//        s1.paint(); // Khai con, new con, chạy paint() của Square
//        s2.paint(); // Khai cha, new con, paint() của Rect, Chạy của Square (qua mặt Rect)
//        s3.paint(); // Khai ông nội, new con, paint() của Main, Chạy của Square (qua mặt Main)
//
//        c1.paint(); // Khai con, new con, chạy paint() của Circle
//        c2.paint(); // Khai cha, new con, paint() của Main, Chạy của Circle (qua mặt Main)
//
//        t1.paint(); // Khai con, new con, chạy paint() của Triangle
//        t2.paint(); // Khai cha, new con, paint() của Main, Chạy của Triangle (qua mặt Main)

        // Chấp cha, chấp ông nội, luôn chạy paint() đúng ngữ cảnh

        // Sắp xếp luôn
//        Main arr[] = new Main[9];
        // Có 9 biến shape đặt tên là arr[0], arr[1], arr[2], ..., arr[8]
        // mới có 9 con trỏ, chưa có object nào
        // arr[0], arr[1], arr[i] =  cần lắm luôn bằng, trỏ, tọa độ vùng new Rectangle(), new Circle(), ...
        // là một shape, is a shape, cùng họ, cùng kiểu chung mảng
        // Cần tọa độ new nào đó thả vào arr[i]
        /*arr[0] = new Rectangle(...);
        arr[1] = new Square(...);
        arr[2] = new Circle(...);
        arr[3] = r1;
        arr[4] = t1;
        Đã học rồi, không thèm làm*/

//        Main arr[] = new Main[] {new Rectangle(...), new Square(...), new Circle(...)}
        Shape array[] = new Shape[] {r1, r2, s1, s2, s3, c1, c2, t1, t2};
        System.out.println("The list of shapes before sorting: \n");

        for (Shape x: array) {
            x.paint();
            // Gọi ông nội, nhưng con cháu qua mặt tùy tình huống
            // hiện tượng 1 hàm paint() nhưng có n cách viết code khác nhau ở mức con cháu, có n cách chạy khác nhau
            // lúc run-time.
            // từ một hàm paint() mà có nhiều cách cài đặt, thực thi
            // từ một biến hình, đa hình dạng, đa cách thức, đa nhân cách, 50 sắc thái, biến hóa khôn lường
            // từ 1 biến hóa ra nhiều qua hình dạng @Override
            // => kĩ thuật đa hình dạng, đa ánh xạ, đa hình dạng, đa sắc thái, POLYMORPHISM
            //1 hàm cha mà có n hàm con @override, hiện tượng đa hình dạng
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i].getArea() > array[j].getArea()){ // Đa hình, hàm cha k có code, chạy hàm con qua mặt cha
                    Shape t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }

        System.out.println("The list of shapes after sorting: \n");

        for (Shape x: array) {
            x.paint();
        }
    }
}
