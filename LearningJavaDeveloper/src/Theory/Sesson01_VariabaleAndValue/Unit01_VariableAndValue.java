package Theory.Sesson01_VariabaleAndValue;

public class Unit01_VariableAndValue {
    public static void main(String[] args) {
//        worksWithInterger();
//        worksWithVariables();
//        worksWithDouble();
//        worksWithCharacters();
//        worksWithBoolean();
        printIntergerList();
    }

    // A comparison expression, a proposition, a statement will have 2 states: true or false -> boolean (1 bit, 1 byte)
    public static void worksWithBoolean() {
        boolean marriedStatus = false;
        if (marriedStatus)
            System.out.println("Đã cưới");
        else
            System.out.println("Chưa cưới");

        System.out.println("Luôn có hi vọng");
    }


    // static only works with static -  learn in after lesson
    public static void worksWithVariables() {
        /* Biến là một vùng RAM được đặt tên/định danh/identifier,
        chiếm một số byte nhất định tùy vào hình thái dữ liệu mà nó chứa,
        dùng để chứa một giá trị (value) nào đó */
        // hình thái dữ liệu được gọi là datatype, có 2 hình thái: primitive(giá trị đơn), object
        // primitive: int, long, double, float
        //Biến là cách đặt tên cho một đại lượng, một giá trị
        int yob = 2001;
        int a = 79, b;
        b = 39;

        System.out.println("yob = " + yob);

        int age = 2023 - yob;
        System.out.println("age = " + age + " years old");
        System.out.println("age = " + (2023 - yob) + " years old");
        System.out.printf("age: %d\n", age);
    }

    // Mọi giá trị/value xuất hiện trong code (số nào đó, chữ nào đó, chuỗi nào đó)
    // Ví dụ 3.14 xuất hiện trong code, 0.1 xuất hiện trong code, "age" xuất hiện trong code
    // Được gọi là literal value
    // Mọi literal value của số nguyên trong code, mọi số nguyên xuất hiện trong code được xem là 4 byte int
    public static void worksWithInterger() {
        int n = 2_100_000_000;
        System.out.println("n = " + n);

        long money = 15_000_000_000L;
        System.out.println("money = " + money);

        int status = 0xFA;
        int phone = 070;

        System.out.println("status = " + status);
        System.out.println("phone = " + phone);

    }

    // Java by default works with Double more than with Float
    // Every Real Numbers in Java are treated as Double
    public static void worksWithDouble() {
        double PI = 3.14; // 8 bytes
        System.out.println("PI = " + PI);
        System.out.printf("PI: %f\n ", PI); // %lf isn't supported in Java, use %f
        System.out.printf("PI: %.2f\n ", PI);

        float vat = 0.1F;
        System.out.println("vat = " + vat);
        System.out.printf("vat: %.2f\n ", vat);

    }

    // Java Character use 2 bytes, use '' denote a single symbol
    public static void worksWithCharacters() {
        char unit = '$';
        System.out.println("unit = " + unit);

        // Save name, a line, a paragraph, ... consists of many characters combined
        // In java, processing in the string must use the function, because ArrayName isn't primitive
        // Java provides a new data type for storing strings
        // String for storage, names for complex things, co-characters, type Objects
        String name = "Nguyễn Bảo Chính";
        System.out.println("name = " + name);

        System.out.println("1st letter in my name: " + name.charAt(1));
        System.out.println("my name as in a lowercase form: " + name.toLowerCase());

    }

    public static void printIntergerList() {
        System.out.println("The list of 100 first integers");

        for (int i = 1; i <= 100; i++)
            System.out.print(" " + i);
    }
}
