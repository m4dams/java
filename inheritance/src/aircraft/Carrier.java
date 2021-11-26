package aircraft;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private int ammoStorage;
  private int healthPoints;
  private List<Aircraft> aircrafts;

  public Carrier(int ammoStorage, int healthPoints) {
    this.ammoStorage = ammoStorage;
    this.healthPoints = healthPoints;
    this.aircrafts = new ArrayList<>();
  }

  public void add(Aircraft aircraft) {
    this.aircrafts.add(aircraft);
  }

  public void fill() {
    if (this.ammoStorage <= 0) {
      throw new UnsupportedOperationException();
    } else {
      armAircraft(this.ammoStorage);
    }
  }

  public void getStatus() {
    if (this.healthPoints <= 0) {
      System.out.println("It's dead Jim :()");
    } else {
      System.out.printf("HP: %s, Aircraft count: %s, Ammo Storage: %s, Total damage: %s\n" +
              "Aircrafts:\n",
          this.healthPoints,
          this.aircrafts.size(),
          this.ammoStorage,
          this.damageCapability());
      for (Aircraft aircraft : this.aircrafts) {
        System.out.println(aircraft);
      }
    }
  }

  private int damageCapability() {
    int damageCapability = 0;
    for (Aircraft aircraft : this.aircrafts) {
      damageCapability += aircraft.getBaseDamage() * aircraft.getCurrentAmmo();
    }

    return damageCapability;
  }

  private void armAircraft(int ammoStorage) {
    List<Aircraft> sortedList = sortAircraft();
    for (Aircraft aircraft : sortedList) {
      if (ammoStorage > 0) {
        ammoStorage = aircraft.refill(ammoStorage);
        this.ammoStorage = ammoStorage;

      }
    }
  }

  private List<Aircraft> sortAircraft() {
    List<Aircraft> aircraftList = new ArrayList<>();
    for (Aircraft aircraft : this.aircrafts) {
      if (aircraft.isPriority()) {
        aircraftList.add(aircraft);
      }
    }
    for (Aircraft aircraft : this.aircrafts) {
      if (!aircraft.isPriority()) {
        aircraftList.add(aircraft);
      }
    }
    return aircraftList;
  }
  public void fight(Carrier carrier){
    carrier.healthPoints-=totalDamage();
  }

  private int totalDamage() {
    int totalDamage=0;
    while (this.ammoStorage>0){
      this.fill();
      for (Aircraft aircraft : this.aircrafts) {
        totalDamage+=aircraft.fight();
      }
    }
    return totalDamage;
  }
}

