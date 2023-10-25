package Theory.Sesson11_Inheritance_version4.ParentChild_version2;

public class ParentChild {
    public static void main(String[] args) {
        playWithPointer();
    }

    public static void playWithPointer(){
        Parent p = new Parent("Biệt thự", "1000 tỷ đồng");
        p.showProfile();
        // p. xổ ra tất cả của cha

        Child c1 = new Child("Căn hộ", "100 tỷ đồng", "Xe mới tự mua");
        c1.showProfile();

        Parent c2 = new Child("Nhà mặt tiền", "115 tỷ đồng", " Xe máy mới con tự mua");
        c2.showProfile();


    }
}
