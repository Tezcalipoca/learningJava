package Theory.Sesson12_AbstractClass;

/* Ta phát hiện được một mối quan hệ giữa nhiều khuôn "khác biệt" nhưng lại tương đồng.
* Ví dụ: ae trong nhà: trai-gái, cao-thấp, ngăm đen-trắng trẻo
* Tương đồng: Con của ba má.
* Ta đang nói về khuôn tổ mà sinh ra nhiều khuôn khác
* Shape đại diện, cha của đám vuông, tròn, chữ nhật, ...*/
public abstract class Shape {
    // Đặc tính của hình học là gì?
    protected String ower;
    protected String color;
    protected String borderColor; // Màu đường viền
    //protected double a,b,c, radius; //...
    // Giả sử thằng con hình tròn kế thừa shape, thế thì nó có cạnh
    // lúc get, set xổ ra 1 đồng cạnh
    // Phía khác, HCN lần đầu tiên có bán kết.
    // Cha có nhiều con, Cha là nhân tử chung của các con.
    // Chung cho các con kế thừa, phần dị biệt mỗi đứa thì mỗi đứa giữ
    // TUYỆT ĐỐI KHÔNG ĐỂ DỊ BIỆT LÊN CHA, DỊ BIỆT LÊN TỪNG ĐỨA CON


    public Shape(String ower, String color) {
        this.ower = ower;
        this.color = color;
    }

    public String getOwer() {
        return ower;
    }

    public void setOwer(String ower) {
        this.ower = ower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    //hành động tiếp theo, hàm của tui??
    // tính diện tích, chu vi
    // hàm để xử lý data, ai có nhiều inf thì kẻ đó phải xử lý
    // ở đây không có data nhiều để tính toán, data thuộc về dị biệt
    // KHÔNG CẦN HÀM getS(), getP() được không?
    // Cấm bỏ hàm tính S(), P(), vì logic về mặt hình học, tư duy hình học (tích phân hình phức tạp)
    // hành động, hành vi của một hình học nói chung chắc chắn có chu vi, diện tích
    // nó là bao nhiêu, tính sao, từ từ nhưng chắc chắn phải có khái niệm này
    // Chốt hạ, Hình học luôn bàn về màu sắc, chu vi, diện tích

//    public double getArea(){
//
//        //return ???, không tính được vì thiếu cạnh, kích thước, nhưng không cho bỏ hàm đi vì nó là thứ đi kèm hình học
//        // return 0. sai vì không có hình nào diện tích bằng 0, new Shape() chấm getArea() là toang.
//    }
//
//    public double getPerimiter(){
//
//    }

    /*CHỐT HẠ 2: TÍNH S VÀ P LÀ KHÁI NIỆM GẮN KÈM HÌNH HỌC, NÓI Ý TƯỞNG RẰNG:
     *      - Sẽ đo được đường bo, biên, tính được độ rộng bề mặt
     *      - Chỉ nói đó là ý tưởng, khái niệm hình học thì có diện tích, chu vi cụ thể ra sao, thì tùy hình mà tính
     * S, P của hình học là khái niệm nói nói về 1 con số đại diện cho đường biên, bề mặt, tùy mỗi hình sẽ đo tính khác
     * nhau.
     * Hình học cũng chỉ là một khái niệm chung chung, chung chung thì không tính được
     * Cái chung chung ở đó, nhưng không cụ thể, chúng tôi gọi là trừu tượng => ABSTRACT*/
    /* Cái gì tồn tại nhưng không chạm, nắm được, chỉ mang ý nghĩa khái niệm, nói về 1 ý tưởng, cái đó hữu nhưng mà vô
     * có thấy nhưng không chạm được, - ABSTRACT: TRỪU TƯỢNG - MA QUỶ, MÔN HỌC KHÓ NẮM BẮT, TÌNH YÊU, ...*/
    /* S, P của Shape là trừu tượng, tồn tại để nói về thứ cần đo đạc, chưa cụ thể được vì ngay cả "hình học" cũng chỉ là
     * 1 khái niệm trừu tượng chưa cụ thể, biết hình gì đâu. Ví dụ nếu nói vẽ cho tao 1 cái hình thì biết vẽ hình gì đâu?
     * chúng là những khái niệm sẽ đuược nạp vào đầu mình để biết rằng sẽ có gì đó diễn ra tiếp theo
     * KHÁI NIỆM - ABSTRACT - TÍNH TRỪU TƯỢNG CHÍNH LÀ NÓI VỀ 1 Ý TƯỞNG*/

    public abstract double getArea(); // diện tích là khái niệm hen

    public abstract double getPerimiter(); // ý tưởng đo cạnh hen, từ từ tính
}
    // 2 khái niệm S, P là hình nào chả có
