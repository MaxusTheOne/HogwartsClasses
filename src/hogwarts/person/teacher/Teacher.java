package src.hogwarts.person.teacher;

import src.hogwarts.person.Person;

import java.util.Date;

public class Teacher extends Person {

  public EmpType employment;

  public Date employmentStart;
  public Date employmentEnd;

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

  public enum EmpType {
    Teacher,
    Headmaster,
    other,
  }
}
