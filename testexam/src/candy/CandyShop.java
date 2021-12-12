package candy;

import java.util.ArrayList;
import java.util.List;

public class CandyShop {
 private List<Candy> inventory;
 private double sugar;
 private double income;

  public CandyShop(double sugar) {
    this.inventory = new ArrayList<>();
    this.sugar = sugar;
    this.income = 0;
  }

  public void createCandy(Candy candy) {
    if (this.sugar - candy.getSugar() >= 0) {
      this.sugar -= candy.getSugar();
      if (candy instanceof Lollipop) {
        this.inventory.add(new Lollipop());
      } else {
        this.inventory.add(new HardCandy());
      }
    } else {
      throw new UnsupportedOperationException("Not enough sugar to create desired candy");
    }
  }

  public void raisePrice(double priceRaise) {
    for (Candy candy : this.inventory) {
      candy.setPrice(candy.getPrice() + priceRaise);
    }
  }

  public void sell(int amount) {
    int sellAmount = Math.min(amount, this.inventory.size());
    for (int i = 0; i < sellAmount; i++) {
      this.income += this.inventory.remove(0).getPrice();
    }
  }

  private int countCandy(String candyName) {
    int counter = 0;
    for (int i = 0; i < this.inventory.size(); i++) {
      if (candyName.equals(this.inventory.get(i).getClass().getSimpleName())) {
        counter++;
      }
    }
    return counter;
  }

  public void buySugar(double amount) {
    if (amount * 600 > this.income) {
      throw new UnsupportedOperationException("Not enough money to buy that much sugar");
    } else {
      this.sugar += amount * 1000;
      this.income -= amount * 600;
    }
  }

  @Override
  public String toString() {
    return String.format("Készlet: %s cukorka, %s nyalóka; Bevétel: %s Ft; Cukor: %s gramm",
        countCandy("HardCandy"),
        countCandy("Lollipop"),
        this.income,
        this.sugar);
  }
}

