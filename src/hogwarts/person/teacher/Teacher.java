package src.hogwarts.person.teacher;

import src.hogwarts.person.Person;

import java.util.Date;

public class Teacher extends Person {

  public EmpType employment;
  public int teacherId;
  public Date employmentStart;
  public Date employmentEnd;

  public EmpType getEmployment() {
    return employment;
  }

  public void setEmployment(EmpType employment) {
    this.employment = employment;
  }

  public int getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(int teacherId) {
    this.teacherId = teacherId;
  }

  public Date getEmploymentStart() {
    return employmentStart;
  }

  public void setEmploymentStart(Date employmentStart) {
    this.employmentStart = employmentStart;
  }

  public Date getEmploymentEnd() {
    return employmentEnd;
  }

  public void setEmploymentEnd(Date employmentEnd) {
    this.employmentEnd = employmentEnd;
  }

  public Teacher() {
    employment = EmpType.other;
    employmentStart = new Date();
    employmentEnd = new Date();
  }

  public Teacher(
    String fullName,
    EmpType employment,
    Date employmentStart,
    Date employmentEnd
  ) {
    setFullName(fullName);
    this.employment = employment;
    this.employmentStart = employmentStart;
    this.employmentEnd = employmentEnd;
  }

    public Teacher(Teacher teacher){
        setFullName(teacher.getFullName());
        this.employment = teacher.getEmployment();
        this.employmentStart = teacher.getEmploymentStart();
        this.employmentEnd = teacher.getEmploymentEnd();
    }

  public enum EmpType {
    Teacher,
    Headmaster,
    other,
  }
}
