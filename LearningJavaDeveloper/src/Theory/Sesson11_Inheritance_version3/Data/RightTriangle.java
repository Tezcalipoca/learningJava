package Theory.Sesson11_Inheritance_version3.Data;

/* 1. Phát hiện  được IS A đọc 1 chiều (ví dụ hình vuông là một hình chữ nhật đặc biệt nhưng hình chữ nhật không phải là
*       hình vuông) lập tức tiếp cận làm khuôn kiểu mới:
*   - Gõ extends class CHA
*   - Khai báo các đặc tính cho CON, nếu trùng lại với CHA, tương đồng với CHA thì để CHA giữ, không cần khai báo lại
*  đặc tính CON nếu CHA tương đương
*   - Làm phễu cho con, giữ bản sắc cho CON, tôn trọng phễu đầu vào của con
*   - Sự khác biệt góc nhìn CHA và CON, CHA (tam giác thường) cần 3 cạnh, con (tam giác vuông) chỉ cần 2 cạnh vuông*/
public class RightTriangle extends Triangle{ // Tam giác vuông
    public RightTriangle(String owner, String color, double a, double b) {
        // new CON chính là new CHA
        //Tạo một tam giác vuông là tạo một tam giác (0 có chiều ngược lại) => new CON chính là new một phiên bản CHA.
        super(owner, color, a, b, Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));
        // => Diễn dịch: TGV là TG có 2 cạnh a, b và cạnh còn lại bằng căn bậc 2 của (a^2 + b^2)
    }

    @Override
    public void paint(){
        System.out.printf("|R.Triangle|%-15s|%10s|%4.1f|%4.1f| -  |%4.1f|%7.2f|\n",
                owner, color, a, b,getPerimiter(), getArea());
    }

     /*Liên quan đến kề thừa có 2 điều:
     *  - Di truyền: Cha có gì con xài nấy, cha thêm thì con thêm, cha bớt thì con bớt, cha xóa thì con mất
     *  - Biến dị: Con có thể khác cha, điều gi xảy ra - kĩ thuật Drift, rê bánh*/
}
