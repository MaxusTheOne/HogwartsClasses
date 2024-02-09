public class HogwartsStudent extends Student implements HogwartsPerson {

  public House house;
  public boolean prefect;
  public String[] teams;
  

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
}
