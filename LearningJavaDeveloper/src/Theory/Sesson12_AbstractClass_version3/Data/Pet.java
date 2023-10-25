package Theory.Sesson12_AbstractClass_version3.Data;

// Mày không cụ thể vì new pet chả biết nó là con gì???
public abstract class Pet {
    protected String name;
    protected int yob;
    protected double weight;
    // ...

    public Pet(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", yob=" + yob +
                ", weight=" + weight +
                '}';
    }

    // Hàm, hành động là gì???
    // Đua và gáy thành tích
    // run() là cụ thể hay abstract: Mỗi con chạy là hoàn toàn khác nhau, dáng chạy, tốc độ chạy, ...
    // Chạy là xử lý, và lại khác nhau ở mỗi loại
    // nhưng động vật thì chắc chắn phải biết run() -> abstract rồi
    public abstract double run();
//    public abstract void showRecord();
    public abstract void showRecord(double speed);

}
