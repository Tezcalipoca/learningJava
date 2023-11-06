package Theory.Sesson13_Interface.Data;

import java.util.Random;

// Dog ngoan ngoãn ban ngày, tối chủ đi ngủ, nó trốn nhà đi hoang
// đi đua thì nó phải chạy vượt tốc độ bình thường, runToDead() như mọi đua thủ
// Mình vẫn là dòng họ con cháu họ Nguyễn, Lê, Phạm như bình thường, nhưng tham gia clb Đua thủ thì phải có hành động của clb
// IMPLEMENT ALL ABSTRACT METHODS, NỘI QUY CLB, @OVERRIDE

public class Dog extends Pet implements DeathRacer{
    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n", "DOG", name, yob, weight, run());
    }


    // Phần hoang dã trong ta, chỉ bộc lộ khi đi đua
    // mình là sv, ngoan ngoãn ở nhà giãn cách, vào SG, chắc chắn thêm phần bộc lộ khác: nhậu nhẹt, game, shisha, ...
    @Override
    public double runToDead() {
        return run() * 5; // Chạy hơn 5 lần so với bth
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-20s|%-15s|%8d|%11.1f|%4.1f|\n", "DOG-RACER", name, yob, weight, runToDead());
    }
}
