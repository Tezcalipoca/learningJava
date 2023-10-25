package Theory.Sesson02_FunctionAndMethod;

import java.util.Scanner;

public class Unit02_FunctionAndMethod {
    public static void main(String[] args) {
//        int x = getAninteger();
//        System.out.println("x from keyboard: "+x);
//        printIntergerList(x); // pass by value, lấy value có trong x, x thảy xuống hàm gốc ở dưới, x thảy cho n
//        inputFromKeyboard();
        testMathFunction();
    }

    public static void testMathFunction() {
        //sqrt(4);
        double result = Math.sqrt(25);
        System.out.println("result: "+result);
        System.out.println(Math.sqrt(100));
    }

    public static void inputFromKeyboard(){
        int yob;
        System.out.println("please enter year of birth: ");
        Scanner scanner = new Scanner(System.in);
        yob = scanner.nextInt();
        System.out.println("yob = "+yob);
    }

    /* Function is a rule/how to process input to get output
       example: smoothie = compressor(fruit) */
    /* Use function: Call funtion to get output
       example: mango smoothie = compressor(mango) */
    /* structure of the function */


    /* Hiện tượng trong một class bất kỳ có 2 hàm trùng tên nhau nhưng khác tham số đầu vào (khác trên Data Type)
     * Hiện tượng này được gọi là overload/overloading (quá tải hàm) */

    // Loại 1: Không có input và không có output(void): void name_function(void) =  void name_function()
    /* Nên scanf để nhận data xử lý
    * Cần printf để in ra kết quả xử lý */
    public static void printIntergerList() {
        System.out.println("The list of 100 first integers");

        for (int i = 1; i <= 100; i++)
            System.out.print(" " + i);
    }


    // Loại 2: Có input nhưng không có output: void name_function(...)
    /* Không nên scanf vì đã có input
    * Cần printf để in ra kết quả xử lý */
    public static void printIntergerList(int n) {
        System.out.println("the list of " + n + " first intergers");
        for (int i = 0; i < n; i++)
            System.out.print(" " + i);

        System.out.print("\n");

    }

    public static int getAninteger(){
        int a;
        System.out.println("please enter a positive integer: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        return a;
    }
    // Loại 3: Không có input nhưng có output: (...) name_function()
    /* nên scanf để lấy dữ liệu để xử lý
     * không nên printf vì đã có output
     * bắt buộc return xxx-value ra ngoài qua tên hàm
     * Tên hàm là một biến được gán value từ return */

    // Loại 4: Có input và có cả output: (...) name_function(...)
    /* Không nên scanf vì đã có input
     * không nên printf vì đã có output
     * bắt buộc return xxx-value ra ngoài qua tên hàm
     * Tên hàm là một biến được gán value từ return */

}
