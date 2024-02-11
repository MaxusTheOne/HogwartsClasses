package src.hogwarts.person.student;

import src.hogwarts.person.Person;

public class Student extends Person {

  protected int enrollmentYear;
  protected int graduationYear;
  protected boolean graduated;
  protected int studentId;

  public Student() {
    enrollmentYear = 0;
    graduationYear = 0;
    graduated = false;
  }

  public int getEnrollmentYear() {
    return enrollmentYear;
  }

  public void setEnrollmentYear(int enrollmentYear) {
    this.enrollmentYear = enrollmentYear;
  }

  public int getGraduationYear() {
    return graduationYear;
  }

  public void setGraduationYear(int graduationYear) {
    this.graduationYear = graduationYear;
  }

  public boolean isGraduated() {
    return graduated;
  }

  public int getStudentId() {
    return studentId;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  public Student(String fullName, int enrollmentYear, int graduationYear) {
    setFullName(fullName);
    this.enrollmentYear = enrollmentYear;
    this.graduationYear = graduationYear;
    this.graduated = false;
  }

  public Student(Student student){
    setFullName(student.getFullName());
    this.studentId = student.getStudentId();
    this.enrollmentYear = student.getEnrollmentYear();
    this.graduationYear = student.getGraduationYear();
    this.graduated = student.isGraduated();
  }

  public void setGraduated(boolean graduated) {
    this.graduated = graduated;
  }
}
