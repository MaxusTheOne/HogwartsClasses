package src.hogwarts;

public class Subject {

  public String name;
  public int schoolYear;
  public boolean elective;

  public Subject(String name, int schoolYear, boolean elective) {
    this.name = name;
    this.schoolYear = schoolYear;
    this.elective = elective;
  }

  public Subject() {
    this.name = "";
    this.schoolYear = 0;
    this.elective = false;
  }

  public String getName() {
    return name;
  }
}
