package animals;

import java.util.ArrayList;

public class Farm {
  ArrayList<Animal> farmAnimals;
  int limit;

  public Farm() {
    this.farmAnimals = new ArrayList<>();
  }

  public Farm(ArrayList<Animal> farmAnimals, int limit) {
    this.farmAnimals = farmAnimals;
    this.limit = limit;
  }


}



