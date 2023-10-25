package Theory.Sesson12_AbstractClass_version3.AmazingRace;

import Theory.Sesson12_AbstractClass_version3.Data.Cat;
import Theory.Sesson12_AbstractClass_version3.Data.Dog;
import Theory.Sesson12_AbstractClass_version3.Data.Hamster;
import Theory.Sesson12_AbstractClass_version3.Data.Pet;

public class Main {
    public static void main(String[] args) {
        showRecords();
    }

    public static void showRecords(){
        Hamster h = new Hamster("Nhắt", 2020, 0.3);
        Pet racer[] = new Pet[] {
                new Dog("ChiHUHU", 2021, 0.5),
                new Dog("VANGOI", 1950, 10.0),
                new Cat("TOM", 1960, 15.0),
                new Cat("Kitty", 1990, 5.0),
                new Hamster("Jerry", 1960, 0.5),
                h
        };
        /* Phần tử của mảng Pet thì phải gán một con pet nào đó, Cat, Dog, HT
        * gán = new Dog(...); [i] = cần bằng tọa độ vùng new Con Nào Đó()
        * new Dog(...): bố trí vùng RAM trong HEAP, gọi phễu đổ vào, lấy mốc*/

        /* Đa hình quay trở lại:
        *   - Vì mảng Pet, mọi việc chấm là của CHA, của PET, CHA hoàn toàn là Abstract
        *   - Hoàn toàn không đáng lo, vì con đã IMPLEMENT, 3 đứa con chạy theo tốc độ của riêng chúng*/
//        for (Pet x: racer
//             ) {
//            x.showRecord();
//        }
        /* Tại thời điểm viết code như thế này, ta không sort thành tích được vì mỗi lần gọi run() để so sánh thì tốc
        * độ sẽ khác*/
//        for (int i = 0; i < racer.length - 1; i++) {
//            for (int j = i + 1; j < racer.length ; j++) {
//                if (racer[i].run() > racer[j].run()){
////                    ...
//                }
//            }
//        }
//        Ta nên bắt chạy 1 lượt để ghi nhận thành tích, sau đó sắp xếp trên thành tích chạy này
        System.out.println("The records table: ");
        double arr[] = new double[6];
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
