package src.hogwarts.person.student.controller;

import src.hogwarts.person.student.HogwartsStudent;
import src.hogwarts.person.student.Student;

import java.util.TreeMap;

public class StudentController {
    public int studentCount = 0;

    public TreeMap<Integer, HogwartsStudent> students = new TreeMap<Integer, HogwartsStudent>();

    public void start() {
        System.out.println("Student Controller started");
    }
    public StudentController(){
    }
    public void createStudent(HogwartsStudent receivedStudent){
        HogwartsStudent student = new HogwartsStudent(receivedStudent);
        student.setStudentId(studentCount);
        students.put(studentCount, student);
        studentCount++;
    }
    public HogwartsStudent[] getAllStudents() {
        return students.values().toArray(new HogwartsStudent[0]);
    }

}
