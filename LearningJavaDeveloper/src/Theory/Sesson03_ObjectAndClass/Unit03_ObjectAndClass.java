//Unit 3: Object and Class
/* Object là là những thứ xung quanh ta, hữu hình/vô hình, chứa nhiều thông tin giúp ta mô tả được chúng,
 * nhận diện được chúng, đếm được chúng */

/* Object chứa nhiều thông tin giúp ta mô tả/phân biệt/nhận diện được chúng:
 *      - Tên gọi tắt/định danh (biến phức tạp, biến object
 *      - Các đặc điểm (biến & value)
 *      - Các hành vi/hành động/behavior/method/hàm/phương thức */

/* Class là một đại diện cho các object có những đặc điểm chung, ví dụ class Xe, class Ca sĩ, class Diễn viên */

/* Lập trình OOP: ban đầu hướng về đối tượng, tìm các đặc điểm chung rồi gom lại thành một class */

/* Nhân bản/Đúc/Clone/Tạo/Construct Đối tượng:
 *       - Khuôn (kèm phễu)
 *       - Đúc: Tạo vật thể/object - construct(), đổ vật liệu vào
 *       - Xem sản phẩm: getter()
 *       - Chỉnh sửa sản phẩm: setter() */

/* Ví dụ Class Dog:
 * Đặc điểm (biến & value):
 *       - name: ???
 *       - weight: ???
 *       - hairColor: ???
 *       - breed: ???
 *       - ...
 * Hành vi/hành động (behavior/method/phương thức):
 *       - rượtMèo(): ???
 *       - sủa(): ???
 *       - ăn(): ???
 *       - ... */
/*-----------------------------------------------------------------------------------------------------------------------------------*/
/* Khi run app, hàm phễu sẽ ở một vùng ram riêng, sau đó cứ mỗi toán tử new sẽ clone ra một vùng ram mới,
 * vì vậy sẽ không có việc 2 object bị đè lên nhau */
/*-----------------------------------------------------------------------------------------------------------------------------------*/
/* Biến object là biến con trỏ/reference/tham chiếu
 * Một object tốn 2 vùng RAM, một vùng chứa toàn bộ dữ liệu của object, một vùng chứa địa chỉ (tên) của object */
/*-----------------------------------------------------------------------------------------------------------------------------------*/

package Theory.Sesson03_ObjectAndClass;

// Mượn cái khuôn Dog ở ngăn Models ~ #include<stdio.h> bên C;

import Models.Dog;

public class Unit03_ObjectAndClass {
    public static void main(String[] args) {
        int             yob          =          2001;
        //dataType      Variable                Value, singleValue
        Dog         chiHu =         new Dog("chiHu", 2015, 49.32);
                                    // new trong java = malloc() (memory allocation), calloc() trong C

        //dataType  Variable                Object, phức tạp
        // Có bao nhiêu data types: 2
        // Có bao nhiêu primitive data types: 8
        Dog chiPUU = new Dog("chiPUU", 2021, 50);
        chiHu.bark();

        // Kiểm tra khi đổ vào khuôn, đứa sau có đè đứa trước không?
        System.out.println("Testing chiPu again");
        chiHu.bark();
        // Trong Java, một biến tại một thời điểm chỉ lưu một value:
        int x = 68;
        System.out.println("x: " + x);
        x = 79;
        System.out.println("x again: " + x);

        // UpdateWeight
        chiHu.updateWeight(5.9);
        System.out.println("after update");
        chiHu.bark();
        chiPUU.bark();

        System.out.println("chiHuYob: " + chiHu.getYob());
        System.out.println("chiPUUYob: " + chiPUU.getYob());
    }

}
