package src;

import src.hogwarts.House;
import src.hogwarts.person.Person;
import src.hogwarts.person.student.HogwartsStudent;
import src.hogwarts.person.student.Student;
import src.hogwarts.person.student.controller.StudentController;
import src.hogwarts.person.teacher.HogwartsTeacher;
import src.hogwarts.person.teacher.Teacher;
import src.hogwarts.person.teacher.controller.TeacherController;

import java.util.Date;

public class InitData {

    public StudentController studentController;
    public TeacherController teacherController;

    public void initData() {
        House gryffindor = new House("Gryffindor", "Godric Gryffindor", "scarlet");
        House hufflepuff = new House("Hufflepuff", "Helga Hufflepuff", "yellow");
        HogwartsStudent s1 = new HogwartsStudent(gryffindor, "Harry Potter", 1991, 1998);
        HogwartsStudent s2 = new HogwartsStudent(gryffindor, "Hermione Granger", 1991, 1998);
        HogwartsStudent s3 = new HogwartsStudent(hufflepuff, "Hannah Abbott", 1991, 1998);

        HogwartsTeacher t1 = new HogwartsTeacher(gryffindor, "Severus Snape", Teacher.EmpType.Teacher, new Date(1981, 9, 1), new Date(1998, 6, 30));
        HogwartsTeacher t2 = new HogwartsTeacher(gryffindor, "Neville Longbottom", Teacher.EmpType.Teacher, new Date(1998, 7, 1), new Date(2005, 6, 30));
        t2.setHeadOfHouse(true);

        // Add students and teachers to the controllers
        studentController.createStudent(s1);
        studentController.createStudent(s2);
        studentController.createStudent(s3);
        teacherController.createTeacher(t1);
        teacherController.createTeacher(t2);

    }

    public void setControllers(StudentController studentController, TeacherController teacherController) {
        this.studentController = studentController;
        this.teacherController = teacherController;
    }

    public InitData(StudentController studentController, TeacherController teacherController) {
        setControllers(studentController, teacherController);
    }

}
