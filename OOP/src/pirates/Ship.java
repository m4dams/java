package pirates;

import java.util.ArrayList;
import java.util.Random;


public class Ship {
  ArrayList<Pirate> theShip;
  private boolean isDead;

  public Ship() {
    this.theShip = new ArrayList<Pirate>();
  }

  @Override
  public String toString() {
    if (this.isDead) {
      return "**********************************************\n" +
          "\tShip has been sunk\n" +
          "**********************************************";
    } else if (theShip.size() == 0) {
      return "**********************************************\n" +
          "\tShip is still unmanned\n" +
          "**********************************************";
    } else {
      return "**********************************************\n" +
          "\tCaptain intoxication: " + theShip.get(0).getRumDrunk() +
          "\tCrew: " + this.crewAlive() + "\n" +
          "**********************************************";
    }

  }

  public void fillShip() {
    Random random = new Random();
    int crewNumber = random.nextInt(113) + 1;
    Pirate captain = new Pirate(true, false, 0);
    this.theShip.add(captain);
    for (int i = 1; i < crewNumber; i++) {
      Pirate pirate = new Pirate();
      this.theShip.add(pirate);
    }
  }

  public boolean battle(Ship ship) {
    int bound = Math.min(this.crewAlive(), ship.crewAlive());
    Random random = new Random();
    int deadCount=random.nextInt(bound)+1;
    if (this.crewAlive() - this.theShip.get(0).getRumDrunk()
        >
        ship.crewAlive() - ship.theShip.get(0).getRumDrunk()) {
      casualtySetter(ship,deadCount);
      party(this);
      return true;
      } else {
      casualtySetter(this,deadCount);
      party(ship);
      return false;
    }
  }

  private int crewAlive() {
    int alive = 0;
    for (Pirate pirate : theShip) {
      if (!pirate.isDead()) {
        alive++;
      }
    }
    return alive;
  }



  private void casualtySetter(Ship ship, int deadCount) {
    if (ship.crewAlive()==deadCount) {
      ship.isDead=true;
    } else {
      for (int i = 0; i < deadCount; i++) {
        ship.theShip.get(i).setDead(true);
      }
    }
  }

  private void party(Ship ship){
    Random random = new Random();
    int partyPortion = random.nextInt(4)+1;
    for (Pirate pirate : theShip) {
      pirate.setRumDrunk(pirate.getRumDrunk()+partyPortion);
    }
  }

  public boolean isDead() {
    return isDead;
  }

}

