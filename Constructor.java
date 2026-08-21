enum Level {
  LOW("Low level"),
  MEDIUM("Medium level"),
  HIGH("High level");

  private String description;
  private Level(String description) {
    this.description = description;
  }
  public String getDescription() {
    return description;
  }
}

public class Main {
  public static void main(String[] args) {
    Level myVar = Level.MEDIUM; // Pick one enum constant
    System.out.println(myVar.getDescription()); // Prints "Medium level"
  }
}
