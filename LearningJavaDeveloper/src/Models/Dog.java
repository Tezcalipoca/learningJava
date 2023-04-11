// Đây là KHUÔN chứa các chi tiết mô tả object Dog (Class Dog), gồm các đặc điểm như: tên:____, cân nặng:____, chiều cao:____, ...
/* Khuôn là template/mẫu/form, để đổ các vật liệu/giá trị vào */
/* Ví dụ: Tượng có chiều cao, chất liệu, bán kính đế, ...
*         CCCD là khuôn chứa các thông tin cá nhân của công dân */
/* Khuôn thì phải kín, code thì phải viết trong class, thông tin nào có thể show thì sử dụng public, muốn giấu đi thì dùng private   */
/* Khuôn là hình dáng của một object trong tương lai  */
/*-----------------------------------------------------------------------------------------------------------------------------------*/
/* Kĩ thuật đóng gói/gom đặc tính, và hành vi xử lý đặc tính đó hình thành nên 1 object riêng biệt */
/* Kĩ thuật cô lập hàm và biến vào một khu vực (Object, class) tạo thành một thực thể riêng biệt có đặc điểm */
/* Kĩ thuật gói mọi thứ lại thành một đơn vị (object) gọi là ENCAPSULATION (Tính đóng gói) */
/* Ngoài ra còn có 3 nguyên lí thiết kế cơ bản trong OOP là ABSTRACTION (tính trừu tượng), INHERITANCE (tính kế thừa), POLYMORPHISM (tính đa hình) */
/*-----------------------------------------------------------------------------------------------------------------------------------*/
/* Lưu ý Khuôn khác phễu, Khuôn là class, phễu là hàm khởi tạo */
/*-----------------------------------------------------------------------------------------------------------------------------------*/


package Models;

public class Dog {
    /* Access Specifier/Access Modifier/ Quyền được sử dụng:
    *       - private: không thấy từ bên ngoài
    *       + public: Có thể thấy từ bên ngoài và sử dụng nếu muốn
    *       # protected: họ hàng bà con thì không phải giấu
    *       ~ default: bạn thân cùng phòng */
    private String name;
    private int yob;
    private double weight;

    // Đây là phễu để đổ/rót/chế vật liệu vào, lấp đầy các chi tiết chừa sẵn chỗ. Khuôn rỗng ở các chi tiết
    // Phễu là một hàm đặc biệt, xử lý ép các dữ liệu chảy vào đúng chỗ/vị trí bên trong -> Có xử lý -> Đây là hàm.
    // Mỗi lần gọi phễu tức là tạo một Object mới, giống như nhận về một con chó mới newDog{Tên, tuổi, cân nặng}
    // Hàm phễu này phải trùng tên 100% với class: chữ đầu không hoa, không giá trị trả về, không void, vì sẽ nhầm lẫn với objects
    // Hàm phễu nhận vật liệu vào để trả về một objects thuộc class đang đề cậu, trả về đúng object sẽ được tạo trong tương lai, nên không cần giá trị trả về
    public Dog(String iName, int iYoub, double iWeight){
        name = iName;
        yob = iYoub;
        weight = iWeight;
    }

    //sủa() là hành động của chó
    // nói() là hành động của con người
    //scanChanel() là hành động của tivi

    public void bark(){
//        System.out.println("Gâu gâu gâu, my name is " + name);
//        System.out.println("Gâu gâu gâu, my yob is " + yob);
        System.out.printf("|GOGO|%-10s|%4d|%4.1f|\n",name,yob,weight);
    }

    public void updateWeight(double newWeight){
        weight = newWeight;
    }

    // Giống ai đó hỏi ai đó infor
    // Cho tôi biết năm sinh của bạn: you.namSinh
    //you.getNamSinh(), bạn lấy năm sinh của bạn đưa cho mình
    public int getYob(){
        return yob;
    }
}
