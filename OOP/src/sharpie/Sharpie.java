package sharpie;

public class Sharpie {
  private String color;
  private double width;
  private double inkAmount;

  public Sharpie(String color, double width) {
    this(color, width, 100);
  }

  public Sharpie(String color, double width, double inkAmount) {
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount;
  }

  public double getInkAmount() {
    return inkAmount;
  }

  @Override
  public String toString() {
    return "{" +
        "color='" + color + '\'' +
        ", width=" + width +
        ", inkAmount=" + inkAmount +
        '}';
  }

  public void use() {
    inkAmount -= 10;
  }
}
