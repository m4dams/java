package garden;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden(Arrays.asList(
        new Flower("yellow"),
        new Flower("blue"),
        new Tree("purple"),
        new Tree("orange")
    ));
    garden.showGarden();
    garden.water(40);
    garden.water(70);
  }

}
