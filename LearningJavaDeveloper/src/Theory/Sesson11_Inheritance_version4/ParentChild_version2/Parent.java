package Theory.Sesson11_Inheritance_version4.ParentChild_version2;

public class Parent {
    protected String assetOne; // (Tài sản)
    protected String assetTwo;
    // Cha có 2 món tài sản

    public Parent(String assetOne, String assetTwo) {
        this.assetOne = assetOne;
        this.assetTwo = assetTwo;
    }

    public String getAssetOne() {
        return assetOne;
    }

    public void setAssetOne(String assetOne) {
        this.assetOne = assetOne;
    }

    public String getAssetTwo() {
        return assetTwo;
    }

    public void setAssetTwo(String assetTwo) {
        this.assetTwo = assetTwo;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "assetOne='" + assetOne + '\'' +
                ", assetTwo='" + assetTwo + '\'' +
                '}';
    }

    public void showProfile(){
        System.out.println("PARENT:\n\t- AssetOne: " + assetOne + "\n\t- AssetTwo: " + assetTwo);
    }
}
