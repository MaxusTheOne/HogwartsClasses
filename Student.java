public class Student extends Person {

  protected int enrollmentYear;
  protected int graduationYear;
  protected boolean graduated;

  public Student() {
    enrollmentYear = 0;
    graduationYear = 0;
    graduated = false;
  }

  public Student(String fullName, int enrollmentYear, int graduationYear) {
    setFullName(fullName);
    this.enrollmentYear = enrollmentYear;
    this.graduationYear = graduationYear;
    this.graduated = false;
  }

  public void setGraduated(boolean graduated) {
    this.graduated = graduated;
  }
}
