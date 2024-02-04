public class House {

  public String name;
  public String founder;
  public String[] colors;

  public House(String name, String founder, String color) {
    this.name = name;
    this.founder = founder;
    this.colors = new String[4];
    this.colors[0] = color;
  }
}
