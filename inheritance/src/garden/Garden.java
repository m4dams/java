package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> theGarden;

  public Garden() {
    this.theGarden = new ArrayList<>();
  }

  public Garden(List<Plant> theGarden) {
    this.theGarden = theGarden;
  }

  public void addPlant(Plant plant) {
    this.theGarden.add(plant);
  }

  public void water(int amount) {
    List<Plant> wateringList = wateringList();
    double distributed = (double) amount / wateringList.size();
    for (Plant plant : wateringList) {
      plant.waterCurrentValue += distributed * plant.waterAbsorptionRate;
      plant.thirstStatusSet();
    }
    System.out.println("\nWatering with: "+amount);
    this.showGarden();
  }

  private List<Plant> wateringList() {
    List<Plant> wateringList = new ArrayList<>();
    for (Plant plant : theGarden) {
      if (plant.isThirsty) {
        wateringList.add(plant);
      }
    }
    return wateringList;
  }
  public void showGarden(){
    for (Plant plant : theGarden) {
      System.out.println(plant);
    }
  }

}

