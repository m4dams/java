package sharpie;

import java.util.ArrayList;

public class SharpieSet {
  ArrayList<Sharpie> listOfSharpies;


  public SharpieSet() {
    this.listOfSharpies = new ArrayList<>();
  }


  @Override
  public String toString() {
    return "SharpieSet{" +
        "listOfSharpies=" + listOfSharpies +
        '}';
  }

  public void addSharpie(Sharpie sharpie) {
    this.listOfSharpies.add(sharpie);
  }



  public int countUsable() {
    int counter = 0;
    for (Sharpie listOfSharpy : listOfSharpies) {
      if (listOfSharpy.getInkAmount() > 0) {
        counter++;
      }
    }
    return counter;
  }

  public void removeTrash() {
   listOfSharpies.removeAll(collectTrash());
  }

  private ArrayList<Sharpie> collectTrash() {
    ArrayList<Sharpie> trash = new ArrayList<>();
    for (Sharpie listOfSharpy : listOfSharpies) {
      if (listOfSharpy.getInkAmount() <= 0) {
        trash.add(listOfSharpy);
      }
    }
    return trash;
  }
}
