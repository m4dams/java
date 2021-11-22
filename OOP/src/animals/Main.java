package animals;

public class Main {
  public static void main(String[] args) {
    Animal dog = new Animal();
    Animal cat = new Animal();

    dog.eat();
    System.out.println(dog.getHunger());
    cat.drink();
    System.out.println(cat.getThirst());
    dog.play();
    System.out.println(dog.getHunger() + "\n" + dog.getThirst());

  }
}
