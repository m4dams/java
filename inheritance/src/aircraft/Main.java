package aircraft;

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Carrier carrier1 = new Carrier(300, 20000);
    Carrier carrier2 = new Carrier(400,15000);
    initCarrier(carrier1);
    initCarrier(carrier2);
    carrier1.fill();
    carrier2.fill();
    carrier1.getStatus();
    carrier2.getStatus();
    carrier1.fight(carrier2);
    carrier2.fight(carrier1);
    carrier1.getStatus();
    carrier2.getStatus();


  }
  public static void initCarrier(Carrier carrier){
    Random random = new Random();
    for (int i = 0; i < random.nextInt(7)+1; i++) {
      carrier.add(new Aircraft(Type.F16));
    }
    for (int i = 0; i < random.nextInt(6)+1; i++) {
      carrier.add(new Aircraft(Type.F35));
    }

  }
}
