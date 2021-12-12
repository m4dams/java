package candy;

public abstract class Candy {
  private double price;
  private int sugar;

  public Candy(double price, int sugar) {
    this.price = price;
    this.sugar = sugar;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getSugar() {
    return sugar;
  }

  public void setSugar(int sugar) {
    this.sugar = sugar;
  }


}
