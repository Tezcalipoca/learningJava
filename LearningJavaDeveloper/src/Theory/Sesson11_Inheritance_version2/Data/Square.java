package Theory.Sesson11_Inheritance_version2.Data;

// Phát hiện ra điều thú vị: Hình vuông là một dạng đặc biệt của hình chữ nhật (kind of)
// Nói ngắn gọn, hình vuông là hình chữ nhật (không có chiều ngược lại), dư sức tham gia vào mảng của hình chữ nhật
// => Độ lại 1 khuôn mới từ khuôn cũ, mới có được câu hình vuông là một phiên bản của hình chữ nhật.
// Hình vuông là hình hình chữ nhật, rõ ràng khuôn hình vuông là một dạng của khuôn hình chữ nhật.
// => Hình vuông và hình chữ nhật chung nhà, chung mảng, for sắp xếp được
// cách tiếp cận sự tương đồng giữ các khuôn, kế thừa, dùng lại = INHERIT/INHERITANCE
// Viết theo cách cũ: 2 khuôn độc lập, không chung mảng
// Kế thừa: 2 anh em chung một nhà
// Kế thừa chỉ dành cho gần gũi với người nhà, series phiên bản.
// Class HCN được gọi là class CHA, parent, super, base, phiên bản gốc\
// class hình vuông được gọi là class CON, children, sub, derived
// Vì hình vuông là hình chữ nhật, nên hình vuông có tất cả các thứ mà hình chữ nhật có, không cần viết lại, hàm xài lại luôn
// KẾ thùa không phải copy paste, đây là cách lười gõ.
// KẾ THỪA LÀ XÀI LẠI 100% KHÔNG CẦN GÕ LẠI CODE - GIỐNG NGOÀI ĐỜI.
// *) Khi chơi với kế thừa, phải tôn trọng phễu con
// Vuông trước khi kế thừa rectangle, vuông vẫn là vuông, phễu có 3 tham số để đúc một hình vuông: owner, color, edge
// Phếu vuông vẫn cần, khuôn luôn cần có phễu để nhận vật liệu, nhưng lúc này phễu chạy thẳng lên HCN, vì vuông là hình chữ nhật
// Dữ liệu của hình vuông là dữ liệu của HCN
// TÔN TRỌNG CONSTRUCTOR CỦA CON, ĐỘ LẠI MỘT TÍ PHỄU CON
public class Square extends Rectangle {
    // Hình vuông là hình chữ nhật, ko cần làm lại những gì hình chũ nhật đã làm, ko cần field vì HCN có rồi

    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge);
        // Super chính là ~~~ new Rectangle (...)
        // Sper cũng là câu lệnh thể hiện Square là một con của Rectangle
        // Đổ vật liệu lên cho cha giữ, vì không cần làm lại
        // new Square() -> cắt hình vuông = cắt hình chữ nhật
        // new Square() chính là new Rectangle(), new hình chữ nhật
        // => DUNG HÒA CHA-CON
        // HÌNH VUÔNG CÓ CẠNH EDGE CHÍNH LÀ HCN CÓ CẠNH EDGE, EDGE
    }


    // CON QUA MẶT CHA, ĐẶC TRƯNG CHO MỘT THỨ GỌI LÀ TÍNH ĐA HÌNH, ĐA ÁNH XẠ, ĐA NHÂN CÁCH, POLYMORPHISM
    @Override // ĐA HÌNH: CON CÓ HÀM TRÙNG TÊN 100% CỦA CHA
    public void paint(){
        System.out.printf("|Square   |%-15s|%10s|%4.1f|  -  |%7.2f|\n",
                owner, color, width, getArea());
    }
}
