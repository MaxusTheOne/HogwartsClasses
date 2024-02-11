package src.hogwarts;

import src.hogwarts.person.student.Student;
import src.hogwarts.person.teacher.Teacher;

public class Course {

  public Subject subject;
  public Teacher teacher;
  public Student[] students;


  public Course(
    Subject subject,
    Teacher teacher,
    Student[] students

  ) {
    this.subject = subject;
    this.teacher = teacher;
    this.students = students;

  }

  public Course() {
    this.subject = new Subject();
    this.teacher = new Teacher();
    this.students = new Student[0];

  }

  public void addStudent(Student student) {
    // Fk this
    Student[] newStudents = new Student[students.length + 1];
    for (int i = 0; i < students.length; i++) {
      newStudents[i] = students[i];
    }
    newStudents[students.length] = student;
    students = newStudents;
  }
}
