package Theory.Sesson11_Inheritance_version4.ParentChild;

public class Child extends Parent{

    public Child(String assetOne, String assetTwo) {
        super(assetOne, assetTwo);
    }

    @Override
    public void showProfile() {
        System.out.println("CHILD:\n\t- AssetOne: " + assetOne + "\n\t- AssetTwo: " + assetTwo);
    }

    // Biến dị hoàn toàn, tức là CON có hàm mà CHA không có.
    // Nếu CHA thêm hàm, bớt hàm thì CON bị ảnh hưởng liền.

    public void sayHello(){
        System.out.println("Hey, I am a rich kid!!!");
    }
}
