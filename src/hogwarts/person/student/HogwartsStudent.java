package src.hogwarts.person.student;

import src.hogwarts.House;
import src.hogwarts.person.HogwartsPerson;

public class HogwartsStudent extends Student implements HogwartsPerson {

  public House house;
  public boolean prefect;
  public String[] teams;

  public House getHouse() {
    return house;
  }

  public void setHouse(House house) {
    this.house = house;
  }

  public boolean isPrefect() {
    return prefect;
  }

  public void setPrefect(boolean prefect) {
    this.prefect = prefect;
  }

  public String[] getTeams() {
    return teams;
  }

  public void setTeams(String[] teams) {
    this.teams = teams;
  }

  public HogwartsStudent(
    House house,
    String fullName,
    int enrollmentYear,
    int graduationYear
  ) {
    this.house = house;
    setFullName(fullName);
    this.enrollmentYear = enrollmentYear;
    this.graduationYear = graduationYear;
    this.graduated = false;
    this.prefect = false;
  }

  public HogwartsStudent() {
    this.house = null;
    this.prefect = false;
    this.teams = null;
    setFullName("");
    this.enrollmentYear = 0;
    this.graduationYear = 0;
    this.graduated = false;
  }

  public HogwartsStudent(HogwartsStudent student){
    this.house = student.getHouse();
    this.prefect = student.isPrefect();
    this.teams = student.getTeams();
    setFullName(student.getFullName());
    this.enrollmentYear = student.getEnrollmentYear();
    this.graduationYear = student.getGraduationYear();
    this.graduated = student.isGraduated();
  }
}
