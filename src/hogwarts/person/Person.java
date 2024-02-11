package src.hogwarts.person;

public class Person {

  public String firstName;
  public String middleName;
  public String lastName;

  public Person() {
    this.firstName = null;
    this.middleName = null;
    this.lastName = null;
  }

  public Person(String fullName) {
    this.setFullName(fullName);
  }

  public void setFullName(String fullName) {
    String[] parts = fullName.split(" ");
    this.firstName = parts[0];
    if (parts.length >= 3) {
      this.middleName = parts[1];
    } else {
      this.middleName = null;
    }
    this.lastName = parts[parts.length - 1];
  }

  public String getFullName() {
    if (this.middleName == null) {
      return this.firstName + " " + this.lastName;
    } else {
      return this.firstName + " " + this.middleName + " " + this.lastName;
    }
  }
}
