package sharpie;

public class Main {
  public static final int TEST_CASE_1 = 3;
  public static final int TEST_CASE_2 = 10;

  public static void main(String[] args) {
    Sharpie first = new Sharpie("blue", 5);
    Sharpie second = new Sharpie("red", 3);
    Sharpie third = new Sharpie("blue", 4);
    Sharpie fourth = new Sharpie("yellow", 4);
    SharpieSet set = new SharpieSet();
    SharpieSet set2 = new SharpieSet();
    set.addSharpie(first);
    set.addSharpie(second);
    set.addSharpie(third);
    set.addSharpie(fourth);

    System.out.println(first.getInkAmount());
    for (int i = 0; i < TEST_CASE_1; i++) {
      first.use();
      third.use();
      fourth.use();
    }
    System.out.println(first.getInkAmount());
    System.out.println(second.getInkAmount());
    for (int i = 0; i < TEST_CASE_2; i++) {
      second.use();
    }
    System.out.println(second.getInkAmount());
    System.out.println(set);
    System.out.println(set.countUsable());
    set.removeTrash();
    System.out.println(set);
    System.out.println(set2);
  }
}
