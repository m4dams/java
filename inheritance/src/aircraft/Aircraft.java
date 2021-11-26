package aircraft;

public class Aircraft {
  private Type type;
  private int maxAmmo;
  private int baseDamage;
  private int currentAmmo;


  public Aircraft(Type type) {
    if (type.equals(Type.F35)) {
      this.maxAmmo = 12;
      this.baseDamage = 50;
    } else if (type.equals(Type.F16)) {
      this.maxAmmo = 8;
      this.baseDamage = 30;
    }
    this.type = type;
    this.currentAmmo = 0;
  }


  private String getStatus() {
    return String.format("Type %s Ammo: %s, Base Damage: %s, All Damage: %s"
        , this.type.toString(),
        this.currentAmmo,
        this.baseDamage,
        this.currentAmmo * this.baseDamage);
  }

  public int fight() {
    int damageDone = this.currentAmmo * this.baseDamage;
    this.currentAmmo = 0;
    return damageDone;
  }

  public String getType() {
    return this.type.toString();
  }

  public boolean isPriority() {
    return this.type.equals(Type.F35);
  }

  public int refill(int ammoStorage) {
    int refillAmount = Math.min(ammoStorage, this.maxAmmo - this.currentAmmo);
    this.currentAmmo += refillAmount;
    return ammoStorage - refillAmount;
  }


  @Override
  public String toString() {
    return getStatus();
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public int getCurrentAmmo() {
    return currentAmmo;
  }
}
