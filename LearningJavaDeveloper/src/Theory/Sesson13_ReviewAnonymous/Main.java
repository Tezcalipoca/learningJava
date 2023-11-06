package Theory.Sesson13_ReviewAnonymous;

import Theory.Sesson12_AbstractClass_version2.Data.Circle;
import Theory.Sesson12_AbstractClass_version2.Data.Rectangle;
import Theory.Sesson12_AbstractClass_version2.Data.Square;
import Theory.Sesson12_AbstractClass_version2.Data.Triangle;
import Theory.Sesson12_AbstractClass_version3.Data.Cat;
import Theory.Sesson12_AbstractClass_version3.Data.Dog;
import Theory.Sesson12_AbstractClass_version3.Data.Hamster;
import Theory.Sesson12_AbstractClass_version3.Data.Pet;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        sortShapesWithAnonymous();
        showRecords();
    }

    public static void sortShapesWithAnonymous(){
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0);
        Theory.Sesson12_AbstractClass_version2.Data.Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 5.0, 6.0);

        Square s1 = new Square("MÁ", "PINK", "MAGENTA", 7.0);
        Rectangle s2 = new Square("MÁ", "PINK", "MAGENTA", 8.0);
        Theory.Sesson12_AbstractClass_version2.Data.Shape s3 = new Square("MÁ", "PINK", "MAGENTA", 9.0);

        Circle c1 = new Circle("CHÍNH", "RAINBOW", "BORDEAUX", "<3", 6.0);
        Theory.Sesson12_AbstractClass_version2.Data.Shape c2 = new Circle("CHÍNH", "RAINBOW", "BORDEAUX", ":x", 8.0);

        Triangle t1 = new Triangle("HẠNH", "RAINBOW", "PINK", 3, 4, 5);
        Theory.Sesson12_AbstractClass_version2.Data.Shape t2 = new Triangle("HẠNH", "PINK", "RAINBOW", 6, 8, 10);

        //Anonymous here
        Theory.Sesson12_AbstractClass_version2.Data.Shape onTheGo = new Theory.Sesson12_AbstractClass_version2.Data.Shape("TAKEAWAY","RANDOM", "RANDOM") {
            @Override
            public double getArea() {
                /* Cắt ngẫu nhiên, không gọi được là hình gì -> S tự do*/
                return 50;
            }

            @Override
            public double getPerimeter() {
                return 40;
            }

            @Override
            public void paint() {
                System.out.printf("|TAKEAWAY  |%-10s|%-10s|%-10s%7.2f|\n",
                        owner, color, borderColor, getArea());
            }
        };

        Theory.Sesson12_AbstractClass_version2.Data.Shape array[] = new Theory.Sesson12_AbstractClass_version2.Data.Shape[] {r1, r2, s1, s2, s3, c1, c2, t1, t2, onTheGo}; // hình ngẫu nhiên vẫn là hình
        System.out.println("The list of shapes before sorting: \n");




        for (Theory.Sesson12_AbstractClass_version2.Data.Shape x: array) {
            x.paint();
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i].getArea() > array[j].getArea()){
                    Theory.Sesson12_AbstractClass_version2.Data.Shape t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }

        System.out.println("The list of shapes after sorting: \n");

        for (Theory.Sesson12_AbstractClass_version2.Data.Shape x: array) {
            x.paint();
        }
    }

    /* AMAZING RACE*/
    public static void showRecords(){
        // Đường đua đông vui, có nhiều racer, và có 1 con gì đó k nhìn rõ
        // Mình k biết, k xác dịnh được nhóm của nó là gì, chưa biết class gì
        // -> Chơi trò take away, mượn gió bẻ măng
        Pet ufo = new Pet("UFO", 2021, 0.2) {
            @Override
            public double run() {
                return new Random().nextDouble() * 30;
            }

            @Override
            public void showRecord(double speed) {
                System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n", "UFO", name, yob, weight, speed);
            }
        };

        Hamster h = new Hamster("Nhắt", 2020, 0.3);
        Pet racer[] = new Pet[] {
                new Dog("ChiHUHU", 2021, 0.5),
                new Dog("VANGOI", 1950, 10.0),
                new Cat("TOM", 1960, 15.0),
                new Cat("Kitty", 1990, 5.0),
                new Hamster("Jerry", 1960, 0.5),
                h, ufo // obj được tạo thì anonymous vẫn là pet, vẫn vào mảng
        };
        System.out.println("The records table: ");
        double arr[] = new double[7];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = racer[i].run();
            racer[i].showRecord(arr[i]);
        }

        // Sắp xếp
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    Pet p = racer[i];
                    racer[i] = racer[j];
                    racer[j] = p;
                }
            }
        }
        System.out.println("The records table after sorting: ");
        for (int i = 0; i < arr.length ; i++) {
            racer[i].showRecord(arr[i]);
        }

    }
}
