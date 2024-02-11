package src.ui;

import src.InitData;
import src.hogwarts.House;

import java.util.Scanner;

public class UserInterface {

    public InitData data;
    public void start() {

        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        while (choice != 5) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enroll a student");

                    System.out.println("Enter full name: ");
                    String sFullName = scanner.nextLine();
                    System.out.println("Enter house: ");
                    String house = scanner.nextLine();
                    // Check if house exists
                    while (true) {
                        if (house.equals("Gryffindor") || house.equals("Hufflepuff") || house.equals("Ravenclaw") || house.equals("Slytherin")) {
                            break;
                        } else {
                            System.out.println("Invalid house. Please enter a valid house: ");
                            house = scanner.nextLine();
                        }
                    }
                    System.out.println("Enter enrollment year: ");
                    int enrollmentYear = scanner.nextInt();
                    System.out.println("Enter graduation year: ");
                    int graduationYear = scanner.nextInt();

                    //this much dry code is not good
                    break;
                case 2:
                    System.out.println("Enroll a teacher");

                    System.out.println("Enter full name: ");
                    String tFullName = scanner.nextLine();
                    System.out.println("Enter house: ");
                    String tHouse = scanner.nextLine();
                    // Check if house exists
                    while (true) {
                        if (tHouse.equals("Gryffindor") || tHouse.equals("Hufflepuff") || tHouse.equals("Ravenclaw") || tHouse.equals("Slytherin")) {
                            break;
                        } else {
                            System.out.println("Invalid house. Please enter a valid house: ");
                            tHouse = scanner.nextLine();
                        }
                    }
                    System.out.println("Enter subject: ");
                    String subject = scanner.nextLine();
                    System.out.println("Enter employment start: ");
                    int employmentStart = scanner.nextInt();
                    System.out.println("Enter employment end: ");
                    int employmentEnd = scanner.nextInt();


                    break;
                case 3:
                    // I'm done after this one(2)
                    System.out.println("View all students");
                    data.studentController.getAllStudents();
                    System.out.println("Students: ");
                    for (var student : data.studentController.getAllStudents()) {
                        System.out.println(student.getFullName() + " " + student.getHouse().getName());
                    }
                    break;
                case 4:
                    System.out.println("View all teachers");
                    data.teacherController.getAllTeachers();
                    System.out.println("Teachers: ");
                    for (var teacher : data.teacherController.getAllTeachers()) {
                        System.out.println(teacher.getFullName());
                    }
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    public void displayMenu() {
        System.out.println("Welcome to Hogwarts School of Witchcraft and Wizardry");
        System.out.println("1. Enroll a student");
        System.out.println("2. Enroll a teacher");
        System.out.println("3. View all students");
        System.out.println("4. View all teachers");
        System.out.println("5. Exit");
    }

    public UserInterface(InitData givenData){
        data = givenData;
    }

    public UserInterface(){
    }

    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        userInterface.displayMenu();
        userInterface.start();
    }
}
