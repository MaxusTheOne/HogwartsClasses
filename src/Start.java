package src;

import src.hogwarts.person.student.controller.StudentController;
import src.hogwarts.person.teacher.controller.TeacherController;
import src.ui.UserInterface;

public class Start {
    public void start() {

        // Create the student and teacher controllers
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();

        // Initialize the data with given controllers
        var data = new InitData(studentController, teacherController);
        data.initData();


        // Print the student and teacher count
        System.out.println("Student count: " + studentController.studentCount);
        System.out.println("Teacher count: " + teacherController.teacherCount);

        // Print full list of students and teachers
        System.out.println("Students: ");
        for (var student : studentController.getAllStudents()) {
            System.out.println(student.getFullName() + " " + student.getHouse().getName());
        }
        System.out.println("Teachers: ");
        for (var teacher : teacherController.getAllTeachers()) {
            System.out.println(teacher.getFullName());
        }
        UserInterface ui = new UserInterface(data);
        ui.start();

    }
    public static void main(String[] args) {
        Start start = new Start();
        start.start();
    }
}
