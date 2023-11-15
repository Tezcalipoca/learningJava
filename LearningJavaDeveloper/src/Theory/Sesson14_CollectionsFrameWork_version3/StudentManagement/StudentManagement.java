package Theory.Sesson14_CollectionsFrameWork_version3.StudentManagement;

import Theory.Sesson14_CollectionsFrameWork_version3.Data.Cabinet;
import Theory.Sesson14_CollectionsFrameWork_version3.Utils.MyToys;

public class StudentManagement {
    /*public static void main(String[] args) {
        // Ráp thêm menu là đẹp
        Cabinet it = new Cabinet();
        Cabinet mr = new Cabinet();

        System.out.println("ADD IT");
        it.addAStudent(); // #1

        System.out.println("ADD MR");
        mr.addAStudent(); // #1
        mr.addAStudent(); // #2

        System.out.println("IT Students");
        it.printStudentList();

        System.out.println("MR Students");
        mr.printStudentList();
    }*/
    public static void main(String[] args) {
        int choice;
        Cabinet cabinet = new Cabinet();
        showMenu();
        do {
            choice = MyToys.getAnInteger("-----Input your choice: ", "Please input a Interger! Try Again!");
            switch (choice){
                case 1:
                    cabinet.addAStudent();
                    break;
                case 2:
                    cabinet.printStudentList();
                    break;
                case 3:
                    cabinet.searchAStudent();
                    break;
                case 4:
                    cabinet.updateAStudent();
                    break;
                case 5:
                    cabinet.removeAStudent();
                    break;
                case 6:
                    System.out.println("Thank you and see you!");
                    break;
                default:
                    System.out.println("Your choice is invalid, please try again!");
                    break;
            }
        } while (choice != 6);
    }

    public static void showMenu(){
        System.out.println("-------------------------------  WELCOME TO PTITHCM ---------------------------");
        System.out.println("1. Add a student");
        System.out.println("2. Print student list");
        System.out.println("3. Search a student");
        System.out.println("4. Update a student");
        System.out.println("5. Remove a student");
        System.out.println("6. Quit");
    }
}