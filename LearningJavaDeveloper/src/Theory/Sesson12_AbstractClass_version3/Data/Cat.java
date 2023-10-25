package Theory.Sesson12_AbstractClass_version3.Data;

import java.util.Random;

public class Cat extends Pet{
    public static final double MAX_SPEED = 50;

    public Cat(String name, int yob, double weight) {
        super(name, yob, weight);
    }
    // dị biệt hay không thì tùy

    @Override
    public double run() {
        /* Máy ném ra đĩa tập bắn, máy đk bia tập bắn di động
        * máy ném banh nhiều hướng, mua Vietlot theo số máy đưa ra
        * -> Chúng mày có cái chung là, gom nhóm nè, chúng mày thuộc cái nhóm Máy ngẫu nhiên, class Random xuất hiện
        *   giải quyết câu chuyện random*/

        return new Random().nextDouble() * Cat.MAX_SPEED; // Con số ngẫu nhiên 0...50
        // object không đặt tên, xài vùng new 1 lần rồi bỏ luôn
        // Cty Môi trường đô thị, Garbage Collector, System.gc();
        // (0...1) sát 1                    * 50 sát 50
                                            // Object không đặt tên
                                            // anonymous object, không nhầm lẫn với Anonymous Class
    }

    @Override
    public void showRecord(double speed) {
        System.out.printf("|CAT       |%-10s|%4d|%4.1f|%4.1f|\n", name, yob, weight, speed);
    }

}
