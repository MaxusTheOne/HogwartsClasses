public class Course {

  public Subject subject;
  public Teacher teacher;
  public Student[] students;
  public TeachingMaterial[] materials;

  public Course(
    Subject subject,
    Teacher teacher,
    Student[] students,
    TeachingMaterial[] materials
  ) {
    this.subject = subject;
    this.teacher = teacher;
    this.students = students;
    this.materials = materials;
  }

  public Course() {
    this.subject = new Subject();
    this.teacher = new Teacher();
    this.students = new Student[0];
    this.materials = new TeachingMaterial[0];
  }

  public void addStudent(Student student) {
    // Fk this
    Student[] newStudents = new Student[students.length + 1];
    for (int i = 0; i < students.length; i++) {
      newStudents[i] = students[i];
    }
    newStudents[students.length] = student;
    students = newStudents;
  }
}
