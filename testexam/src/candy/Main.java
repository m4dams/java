package candy;

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    CandyShop candyShop=new CandyShop(6000);
    initShop(candyShop);
    candyShop.raisePrice(200);
    System.out.println(candyShop);
    candyShop.sell(10);
    System.out.println(candyShop);
    candyShop.buySugar(3);
    System.out.println(candyShop);


  }
  public static void initShop(CandyShop candyShop){
    Random random=new Random();
    for (int i = 0; i < random.nextInt(20)+1; i++) {
      candyShop.createCandy(new Lollipop());
    }
    for (int i = 0; i < random.nextInt(20)+1; i++) {
      candyShop.createCandy(new HardCandy());
    }
  }

}
