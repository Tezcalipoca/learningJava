package Theory.Sesson13_Interface.Data;

// CLB của những gã thích đua đến chết, gom những class, object mà có chung hành động đua, không care chuyện gì khác.
// CLB là nơi tập hợp của những người chung tiếng nói, hành động, giao tiếp/interface
// Interface cũng là hình thức gom khuôn, gom object phân loại về cái gì đó, nhóm gì đó
// hình thức gom nhóm này lỏng lẻo hơn kế thừa, không care đặc điểm, di truyền đặc điểm, chung hành động vào chơi chung
// MOTOR, DOG, ... IS A MEMBER OF, IS A DEADRACER
// ANH EM MÌNH LÀ STUDENT, SINH RA LÀ SV, ANH EM MÌNH CÒN LÀ CẦN THỦ, CỜ THỦ, SÁT THỦ, GAME THỦ
// ANH EM NHÌN THEO DÒNG HỌ: CHÁU Ở NHÀ NGOAN LẮM
/*=> 1 OBJECT, KHUÔN HỘI NHẬP THEO 2 NHÓM:
*   -   NHÓM BÀ CON: DI TRUYỀN VÀ KẾ THỪA
*   -   NHÓM XÃ HỘI: CÙNG NHAU CHIẾN, LÀM GÌ ĐI*/

// CLB CHỈ QUAN TÂM HÀNH ĐỘNG, TRONG INTERFACE CHỈ CHỨA HÀNH ĐỘNG
// CLB ĐỂ ANH EM TỰ HÀNH ĐỘNG THEO CÁCH CỦA MÌNH, VÍ DỤ VÀO CLB TIẾNG ANH THÌ NÓI TIẾNG ANH THEO CÁCH CỦA MÌNH
// ĐUA THÌ ĐUA THEO CÁC CỦA MÌNH: LẠNG LÁCH, THÁO THẮNG, TUNG MÌNH TRÊN XE, CÀ CHÂN CHỐNG TÓE LỬA
// INTERFACE CLB LÀ NƠI ĐỂ MỌI NGƯỜI TỰ CHƠI THEO CÁCH CỦA MÌNH - CHƠI - HĐ LÀ ABSTRACT
// CHỈ NÓI NỘI QUY CLB THÔI HEN, MỌI NGƯỜI THEO ĐÓ MÀ LÀM, TỰ MỖI NGƯỜI
/*CHỐT HẠ: INTERFACE CHỨA HÀM ABSTRACT, nhưng không cần ghi từ khóa abstract ở cả tên clb và tên hàm, vì clb hàm ý chỉ có
* nội quy để mọi người theo, nội quy chung để mọi người theo - IMPLEMENT - ngầm hiểu Interface là abstract
*   - ABSTRACT LÀ NÊU Ý TƯỞNG*/
// NHỮNNG PHIÊN BẢN JDK SAU CHO PHÉP INTERFACE CÓ HÀM CÓ CODE NHƯNG ...!!!

/* 1. Biến, Field trong Interface mặc định là public static final, và phải được gán giá trị ngay sau khi khai báo biến
*  2. Không tạo Constructor cho interface*/
public interface DeathRacer {
    // Phàm ai đã chọn nghề đua thủ, thì phải đua!!
//    public abstract double runToDead(); // không cần từ abstract
    public double runToDead();
    public void showHowToDead();
}
