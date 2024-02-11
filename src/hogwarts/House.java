package src.hogwarts;

public class House {

  public String name;
  public String founder;
  public String[] colors;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFounder() {
    return founder;
  }

  public void setFounder(String founder) {
    this.founder = founder;
  }

  public String[] getColors() {
    return colors;
  }

  public void setColors(String[] colors) {
    this.colors = colors;
  }

  public House(String name, String founder, String color) {
    this.name = name;
    this.founder = founder;
    this.colors = new String[4];
    this.colors[0] = color;
  }
}
