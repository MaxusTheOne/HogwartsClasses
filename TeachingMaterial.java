abstract class TeachingMaterial {

  private String name;
  private boolean onShoppingList;
  private boolean required;
  private boolean provided;
  private String notes;

  public TeachingMaterial(
    String name,
    boolean onShoppingList,
    boolean required,
    boolean provided,
    String notes
  ) {
    this.name = name;
    this.onShoppingList = onShoppingList;
    this.required = required;
    this.provided = provided;
    this.notes = notes;
  }

  public TeachingMaterial() {
    this.name = "";
    this.onShoppingList = false;
    this.required = false;
    this.provided = false;
    this.notes = "";
  }
}
