import java.util.Date;

public class HogwartsTeacher extends Teacher {

  public House house;
  public boolean headOfHouse;

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

  public HogwartsTeacher() {
    this.house = null;
    this.headOfHouse = false;
    setFullName("");
    this.employment = null;
    this.employmentStart = new Date();
    this.employmentEnd = new Date();
  }
}
