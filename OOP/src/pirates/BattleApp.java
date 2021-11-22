package pirates;

public class BattleApp {
  public static void main(String[] args) {

    Ship firstShip = new Ship();
    Ship secondShip = new Ship();

    firstShip.fillShip();
    secondShip.fillShip();
    System.out.println(firstShip);
    System.out.println(secondShip);
    System.out.println(firstShip.battle(secondShip));
    System.out.println(firstShip);
    System.out.println(secondShip);
  }
}
