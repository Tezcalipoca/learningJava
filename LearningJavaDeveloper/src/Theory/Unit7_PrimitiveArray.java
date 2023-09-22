package Theory;

/* --------------------------- MẢNG NGUYÊN THỦY -----------------------------------
 * - Biến (data) không chấp nhận trùng tên, nếu có nhiều biến thì có nhiều tên khác nhau
 * - Có 2 cách khai báo biến:
 *       + Khai báo lẻ: a, b, c (phải khác tên nhau)
 *       + Khai báo nhiều: mảng (ví dụ ở ngoài khi đi mua 1 lốc sữa thì thực chất có 4 hộp sữa trong 1 lốc -> mảng)
 * 1. Mảng là kĩ thuật khai báo nhiều biến (biến sẽ ứng với value sau đó) - nhiều biến, nhiều value
 *   Mảng có nhiều phần tử (element), nhiều value tương ứng.
 *   => Mảng là kĩ thuật khai báo nhiều biến cùng kiểu, ở sát nhau trong RAM, và CÙNG TÊN
 * 2. Khi các biến cùng tên, phải có cách để phân biệt biến này với biến kia -> dùng tên phụ [index]. ví dụ:
 * Student[1], Student[2], An[Cao], An [Thấp]
 * Lý do vòng lặp for dùng chữ i vì đó là viết tắt của index
 * 3. Có 3 cách khai báo biến trong JAVA:
 *      - Không khai báo số lượng phần tử: data_type arr_name[]( = {value1, value2,...});
 *          ví dụ: int arr[]; int arr[] = null, int arr[] = {1, 2, 3, 4, 989, 421}
 *      - Khai báo số lượng phần tử: data_type arr_name[] = new data_type[numberOfElements]
 *          ví dụ: int arr[] = new int[365];
 * 3. Hệ quả:
 *      - QUAN TRỌNG: Tên mảng là một biến reference trỏ vào đầu một dãy rất nhiều biến khác
 *      - Khai báo biến nhanh hơn, nhưng tên biến phức tạp hơn, đi kèm (số thứ tự do tội trùng têm biến cần có cách
 *           phân biệt)*/
public class Unit7_PrimitiveArray {
    public static void main(String[] args) {
        playWithPrimitiveArray3();
    }

    public static void playWithPrimitiveArray() {
        // double vol[365]; -> Báo lỗi
        // double v[365] = {0, 5, 10, 15, 20, 25, 30}; -> Báo lỗi
        // -> JAVA KHÔNG CHO PHÉP KHAI BÁO KÍCH THƯỚC MẢNG, MẢNG TRONG JAVA LUÔN LÀ MẢNG DYNAMIC
        double v[] = {0, 5, 10, 15, 20, 25, 30}; // Có sẵn value:v[0] = 0, v[1] = 5, v[2] = 10, ...
        // biến v[] nằm trong STACK             // Các phần tử này nằm trong HEAP, gồm 7 phần tử nằm trong HEAP
        // v[7] = 6868; -> Lỗi vì mảng chỉ có 7 phần tử, tức là phần tử cuối cùng sẽ là v[6]
        v[6] = 6868;
        System.out.println("v[0] = " + v[0] + " | v[1] = " + v[1]);
        System.out.printf("Element 0: %f\n", v[0]);
        /* for (int i = 0; i < 10; i++){ -> Báo lỗi vì mảng chỉ có 7 phần tử -> i < 7 mới chính xác
             System.out.println(v[i] + " ");
        }*/
        for (int i = 0; i < 7; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("\n\nThe array v has values of (using for each)");
        for (double x : v) { // -> Với mọi biến x nó sẽ quét qua toàn bộ phần tử của mảng
            // x thuộc tập hợp v, x có quyền bằng v thứ nhất, x = v[0], x = v[1], ... x = v[i]
            // sout(x) ~~~~~~~~~~~~~~~ sout(v[i])
            // phần tử thứ i của mảng double là 1 biến double v[i] -> x biến thành double.
            System.out.print(x + " ");

        }

        // Toán tập hợp:
        // N = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}
        // Với mọi x thuộc N, tức là x sẽ là mấy? Có value mấy? Vì tập hợp toàn là số nguyên
        // x = -5 -> sai, vì x thuộc N.
        // x = 0, x =1 , x = 2, x = 3, x = 4, ...
        // x chắc chắn phải là số tự nhiên, lấy value trong N
        // Với mọi x là integer thuộc N
        // => x = N[0] = 0, x có thể là số tự nhiên đầu tiên
        // => x = N[1] = 1, x có thể là số tự nhiên kế tiếp
        // => Chữ với mọi, với mỗi chính là kĩ thuật giúp ta duyệt qua toàn bộ value của một tập hợp.
    }

    public static void playWithPrimitiveArray2() {
        // float* arr = calloc(7, sizeof(float));
                //STACK         // HEAP
        // biến con trỏ     trỏ vùng RAM,28  byte chia thành 7 cụm 7 biến
        //              = lưu tọa độ vùng bắt đầu
        //              = new bên Java
        double arr[] = new double[365]; // ngoặc [] là mảng, xin số biến
                                        // ngoặc () gọi là phễu của khuôn (constructor)
        // arr[0] là 1 biến double. arr[i] là biến double, primitive
        // primitive giá trị đơn nên sử dụng luôn mà không cần chấm. ví dụ double pi = 3.14; pi. là sai
        arr[0] = 68;
        arr[1] = 79;
        arr[2] = 100;
        // in mảng bình thường
        System.out.println("The array arr has");
        for (int i = 0; i < 365; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n\n");
        for (double x: arr
             ) {
            System.out.print(x + " ");
        }
        // Sử dụng arr_name.length để lấy số lượng phần tử của mảng
        double arr1[] = new double[5];
        System.out.println("\nThe number of elements of array: " + arr1.length); // output: 5
        System.out.println("The array arr has:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void playWithPrimitiveArray3() {
        int a = 10;
        // a. sai cú pháp, a là 10 rõ ràng rồi.
        int a1 = 10, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        // System.out.println(a11 + ""); -> Báo lỗi vì a11 chưa được khởi tạo giá trị
        //int arr = {5, 10, 15, 20, 25, 30};  -> Báo lỗi vì thiếu ngoặc vuông, java hiểu arr chỉ là tên 1 biến
        int arr[] = {5, 10, 15, 20, 25, 30};  // implicit new
        // -> Khai báo arr là mảng có nhiều biến chung
        // cụ thể là arr[0], arr[1], arr[2], ...
        int arr2[] = new int[] {5, 10, 15, 20, 30}; // explicit new
        int [] arr3 ={5, 10, 15, 20, 30}; // Đưa nhiều value thì phải có nhiều biến tương ứng
        // trong java ngoặc vuông trước hoặc sau không quan trọng. Có thể hiểu câu đó là: Có nhiều biến và value tương ứng
        int [] array; // array là biến con trỏ, trỏ vùng object chứa rất nhiều biến int khác
        array = new int[30];
        System.out.println("teh array arr has");
        System.out.println(array[0]);
        System.out.println(array[1]);
        for (int x: array) {
            // x = array[0], xin value phần tử đầu tiên
            // x = array[1], xin value phần tử kế tiếp
            System.out.print(x + " ");
        }
        // array[0]. là không hợp lệ vì array[i] là primitive, xài thẳng không cần chấm
        System.out.println("");
        //for (int i = 0; i < 100; i++) { sai cú pháp vì vượt biên, vì array.length = 30 < 100
        for (int i = 0; i < array.length; i++) {
            System.out.println(arr[i] + " ");

        }
    }
}

