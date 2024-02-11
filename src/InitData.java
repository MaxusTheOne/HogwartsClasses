package src;

import src.hogwarts.House;
import src.hogwarts.person.student.HogwartsStudent;
import src.hogwarts.person.student.Student;
import src.hogwarts.person.teacher.HogwartsTeacher;
import src.hogwarts.person.teacher.Teacher;

import java.util.Date;

public class InitData {
    House gryffindor = new House("Gryffindor", "Godric Gryffindor", "scarlet");
    House hufflepuff = new House("Hufflepuff", "Helga Hufflepuff", "yellow");
    Student s1 = new HogwartsStudent(gryffindor,"Harry Potter", 1991, 1998);
    Student s2 = new HogwartsStudent(gryffindor,"Hermione Granger", 1991, 1998);
    Student s3 = new HogwartsStudent(hufflepuff, "Hannah Abbott", 1991, 1998);

    Teacher t1 = new HogwartsTeacher(gryffindor, "Severus Snape", Teacher.EmpType.Teacher, new Date(1981, 9, 1), new Date(1998, 6, 30));
    HogwartsTeacher t2 = new HogwartsTeacher(gryffindor, "Neville Longbottom", Teacher.EmpType.Teacher, new Date(1998, 7, 1), new Date(2005, 6, 30));
    t2.setHeadOfHouse(true);
}
