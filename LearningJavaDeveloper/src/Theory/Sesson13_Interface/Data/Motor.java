package Theory.Sesson13_Interface.Data;

import java.util.Random;

// MOTOR MUA VỀ CHẠY ĐI HỌC, CHUYỆN BTH, HÀM RUN()
// NHƯNG TRÊN ĐƯỜNG THẰNG VỚ VẨN NÀO ĐÓ NẸT PÔ, MINHF KÉO TAY GA MẠNH HƠN, BỐC ĐẦU, VỌT XE, TỐC ĐỘ DỮ HƠN BTH, LÚC NÀY
// NGOÀI VIỆC MOTOR THÔNG THƯỜNG THÌ TA CÒN LÀ ĐUA THỦ NỮA, PHẢI LÀ ĐUA THỦ MỚI CÓ TỐC ĐỘ CAO
// GIA NHẬP HỘI ĐUA THÔI, CHỈ ĐUA THÔI
// TỚ CÒN LÀ ĐUA THỦ, KHÔNG DÙNG  TỪ KHÓA EXTENDS, XÀI TỪ "LÀ 1 MEMBER CỦA" - IMPLEMENT, TỚ THAM GIA CLB, TRIỂN KHAI VIỆC ĐUA
// THAM GIA CLB NÀO THÌ PHẢI CÓ HÀNH ĐỘNG CỦA CLB ĐÓ
//IMPLEMENTS ALL ABSTRACT METHODS BÊN CLB, CHỌN ĐI ĐUA MÀ KHÔNG CHỊU ĐUA SAO ĐƯỢC
// CLASS CHÍNH CỦA CHÚNG TA CÓ ĐẶC ĐIỂM, HÀNH VI NHƯ BÌNH THƯỜNG
// CHÚNG TA THAM GIA CLB THÌ CÓ THÊM HĐ CỦA CLB ĐÓ -> @OVERRIDE HĐ ĐÓ
// TRONG TA CÓ NHIỀU HĐ ỨNG VỚI TỪNG CLB TA THAM GIA, HỢP LÝ Ở NGOÀI ĐỜI
// -> ĐI VỚI BỤT MẶC ÁO CÀ SA MÀ ĐI VỚI MA MẶC ÁO GIẤY
// VỀ LOGIC, TA CÓ THAM GIA ĐẾN n clb nhưng ta chỉ có 1 dòng họ.
/* => TRONG JAVA, 1 CON TỐI ĐA 1 CHA (ĐƠN KẾ THỪA), NHƯNG 1 CON THAM GIA n CLB
* lưu ý; Trong C++, 1 con có nhiều cha (đa kế thừa), tuy nhiên điều này có nguy hiểm riêng*/
public class Motor implements DeathRacer{
    public static final double MAX_SPEED = 180;
    private String model; //Exciter 2021, Winner 2020
    private String volumme; // Số phân khối 125.0cm3
    private String vin; // Biển số, số khung, Vehicle Identifier Number

    public Motor(String model, String volumme, String vin) {
        this.model = model;
        this.volumme = volumme;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVolumme() {
        return volumme;
    }

    public void setVolumme(String volumme) {
        this.volumme = volumme;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "model='" + model + '\'' +
                ", volumme='" + volumme + '\'' +
                ", vin='" + vin + '\'' +
                '}';
    }

    /* Hành vi xe máy là chạy, có tốc độ được ghi nhận*/
    public double run(){
        return new Random().nextDouble() * MAX_SPEED; // Chạy ngẫu nhiên không quá 180km
    }

    // Quay video và gáy tốc độ
    public void showRecord(){
        System.out.printf("|%-10s|%-15s|%-8s|%-11s|%5.1f|\n", "MOTOR", model, volumme, vin, run());
    }

    @Override
    public double runToDead() {
        // Chạy tốc độ cao, đôn nòng, xoáy nòng, ép sên, đôn sên
        return run() * 3; // Giả sử được 150 x 3, đua đến chết còn gì?
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-20s|%-15s|%-8s|%-11s|%5.1f|\n", "MOTOR-RACER", model, volumme, vin, runToDead());
    }
}
