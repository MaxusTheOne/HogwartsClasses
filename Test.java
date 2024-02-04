import java.util.Date;

public class Test {

  public void start() {
    // Create an array of HogwartsStudents
    HogwartsStudent[] students = new HogwartsStudent[4];
    House gryffindor = new House("Gryffindor", "Godric Gryffindor", "scarlet");
    students[0] = new HogwartsStudent(gryffindor, "Harry Potter", 1991, 1998);
    students[1] =
      new HogwartsStudent(gryffindor, "Hermione Granger", 1991, 1998);
    students[2] = new HogwartsStudent(gryffindor, "Ron Weasley", 1991, 1998);
    students[3] = new HogwartsStudent(gryffindor, "Ginny Weasley", 1992, 1999);
    // Print the full names of the students
    System.out.println(students[0].getFullName());
    System.out.println(students[1].getFullName());
    System.out.println(students[2].getFullName());
    System.out.println(students[3].getFullName());
    // Init 2 teachers
    // syntax:  House house, String fullName, EmpType employment, Date employmentStart, Date employmentEnd
    Teacher snape = new HogwartsTeacher(
      gryffindor,
      "Severus Snape",
      Teacher.EmpType.Teacher,
      new Date(1981, 9, 1),
      new Date(1998, 6, 30)
    );
    Teacher horace = new HogwartsTeacher(
      gryffindor,
      "Horace Slughorn",
      // I should not use this here, sue me
      Teacher.EmpType.Teacher,
      new Date(1974, 9, 1),
      new Date(1981, 6, 30)
    );
    // Print the full names of the teachers
    System.out.println("Teachers:");
    System.out.println(snape.getFullName());
    System.out.println(horace.getFullName());

    //POTIONS
    // Instance a new class for the subject Potions
    Subject potions = new Subject("Potions", 3, false);
    System.out.println("Subject instance: " + potions.getName());
  }

  public static void main(String[] args) {
    Test test = new Test();
    test.start();
  }
}
