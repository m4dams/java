package pirates;

import java.util.Random;

public class Pirate {
  private boolean isCaptain;
  private boolean isDead;
  private int rumDrunk;

  public Pirate() {
    this(false, false, 0);
  }

  public Pirate(boolean isCaptain, boolean isDead, int rumDrunk) {
    this.isCaptain = isCaptain;
    this.isDead = isDead;
    this.rumDrunk = rumDrunk;
  }

  public void drinkSomeRum() {
    if (isDead) {
      System.out.println("he's dead");
    } else {
      this.rumDrunk++;
    }
  }

  public void howsItGoingMate() {
    if (isDead) {
      System.out.println("he's dead");
    } else {
      if (this.rumDrunk < 4) {
        System.out.println("Pour me anudder!");
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        this.sleep();
      }
    }
  }



  @Override
  public String toString() {
    return "Pirate{" +
        "isCaptain=" + isCaptain +
        ", isDead=" + isDead +
        ", rumDrunk=" + rumDrunk +
        '}';
  }

  public void brawl(Pirate pirate) {
    Random random = new Random();
    int chance= random.nextInt(3)+1;
    System.out.println(chance);
    if (chance==1){
      this.die();
      System.out.println("Attacker died");
    } else if (chance==2){
      pirate.die();
      System.out.println("Defender died");
    } else {
      this.sleep();
      pirate.sleep();
      System.out.println("Both passed out");
    }
  }

  private void sleep() {
    this.rumDrunk = 0;
  }

  private void die() {
    this.isDead = true;
  }
  public boolean isCaptain() {
    return isCaptain;
  }

  public boolean isDead() {
    return isDead;
  }

  public int getRumDrunk() {
    return rumDrunk;
  }

  public void setDead(boolean dead) {
    isDead = dead;
  }

  public void setRumDrunk(int rumDrunk) {
    this.rumDrunk = rumDrunk;
  }
}


