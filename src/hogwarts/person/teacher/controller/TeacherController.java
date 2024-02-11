package src.hogwarts.person.teacher.controller;

import src.hogwarts.person.teacher.Teacher;

import java.util.TreeMap;

public class TeacherController {
    public int teacherCount = 0;

    public TreeMap<Integer, Teacher> teachers = new TreeMap<Integer, Teacher>();

    public void start() {
        System.out.println("Teacher Controller started");
    }
    public TeacherController(){
    }
    public void createTeacher(Teacher recievedTeacher){
        Teacher teacher = new Teacher(recievedTeacher);
        teacher.setTeacherId(teacherCount);
        teachers.put(teacherCount, teacher);
        teacherCount++;
    }
    public Teacher[] getAllTeachers() {
        return teachers.values().toArray(new Teacher[0]);
    }
}
