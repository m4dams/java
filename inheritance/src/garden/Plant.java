package garden;

public class Plant {
  boolean isThirsty = true;
  final String color;
  double waterCurrentValue;
  final double waterMaxCapacity;
  final double waterAbsorptionRate;

  public Plant(String color, double waterMaxCapacity, double waterAbsorptionRate) {
    this.color = color;
    this.waterMaxCapacity = waterMaxCapacity;
    this.waterAbsorptionRate = waterAbsorptionRate;
    this.waterCurrentValue = 0;
  }

  protected void thirstStatusSet() {
    if (this.waterCurrentValue >= this.waterMaxCapacity) {
      this.isThirsty = false;
    }
  }

  @Override
  public String toString() {
    return "The "+color+ " "
        +this.getClass().getSimpleName()+" "
        +(isThirsty ? "needs" : "doesn't need")+ " water.";
  }
}

