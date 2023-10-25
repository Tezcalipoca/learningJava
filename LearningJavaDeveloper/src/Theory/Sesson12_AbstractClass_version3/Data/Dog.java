package Theory.Sesson12_AbstractClass_version3.Data;

import java.util.Random;

public class Dog extends Pet{
    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        return new Random().nextDouble() * Dog.MAX_SPEED;
    }

    @Override
    public void showRecord(double speed) {
        System.out.printf("|DOG       |%-10s|%4d|%4.1f|%4.1f|\n", name, yob, weight, speed);
    }


}
