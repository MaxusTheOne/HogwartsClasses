package src.hogwarts.person.teacher;

import src.hogwarts.House;

import java.util.Date;

public class HogwartsTeacher extends Teacher {

  public House house;
  public boolean headOfHouse = false;

  public House getHouse() {
    return house;
  }

  public void setHouse(House house) {
    this.house = house;
  }

  public boolean isHeadOfHouse() {
    return headOfHouse;
  }

  public void setHeadOfHouse(boolean headOfHouse) {
    this.headOfHouse = headOfHouse;
  }

  public HogwartsTeacher(
    House house,
    String fullName,
    EmpType employment,
    Date employmentStart,
    Date employmentEnd
  ) {
    this.house = house;
    setFullName(fullName);
    this.employment = employment;
    this.employmentStart = employmentStart;
    this.employmentEnd = employmentEnd;
    this.headOfHouse = false;
  }

  public HogwartsTeacher(HogwartsTeacher hogwartsTeacher) {
    this.house = hogwartsTeacher.house;
    setFullName(hogwartsTeacher.getFullName());
    this.employment = hogwartsTeacher.employment;
    this.employmentStart = hogwartsTeacher.employmentStart;
    this.employmentEnd = hogwartsTeacher.employmentEnd;
    this.headOfHouse = hogwartsTeacher.headOfHouse;
  }

  public HogwartsTeacher() {
    this.house = null;
    this.headOfHouse = false;
    setFullName("");
    this.employment = null;
    this.employmentStart = new Date();
    this.employmentEnd = new Date();
  }
}
