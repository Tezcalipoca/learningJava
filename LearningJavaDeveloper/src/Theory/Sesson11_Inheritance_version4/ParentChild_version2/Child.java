package Theory.Sesson11_Inheritance_version4.ParentChild_version2;

/* 1. Phát hiện IS A, extends
*  2. Khai báo các đặc điểm của con
*       - Nếu con trùng với cha thì không cần khai báo, không cần làm, cha lo
*       - Con có quyền dị biệt về đặc điểm so với cha, dị biệt hành động so với cha (không bàn tới @Overide)
*  3. Phễu con, giữ bản sắc nếu cần*/
public class Child extends Parent {
    private String childAsset;

    public Child(String assetOne, String assetTwo, String childAsset) {
        super(assetOne, assetTwo); // super (nếu có xuất hiện) luôn đứng đầu trong Contructor của con.
        // Logic đơn giản: CHA chưa tồn tại, lấy gì cho CON mở rộng (extends)
        // Có cha rồi mới có con.
        // new CHA mở rộng vùng nhớ CHA, mới có chỗ cho con
        this.childAsset = childAsset;
    }

    public String getChildAsset() {
        return childAsset;
    }

    public void setChildAsset(String childAsset) {
        this.childAsset = childAsset;
    }

    @Override
    public void showProfile() {
        System.out.println("CHILD:\n\t- AssetOne: " + assetOne + "\n\t- AssetTwo: " + assetTwo);
        System.out.println("By the way, here is my own asset: " + childAsset);
    }
}
